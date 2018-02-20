/*
 * Copyright (c) 2010 Sytel/Reply - All right reserved
 *
 * Created on 27/apr/2011
 *
 * $Date  $
 * $Header $
 * $Id $
 * $Name $
 * $Locker $
 * $Revision $
 * $State $
 */
package it.reply.sytel.adr.common.ws;

import it.reply.sytel.adr.common.log.EtlLogger;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.TokenIterator;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author m.curcio
 *
 */
public class GKConnectionReuseStrategy implements ConnectionReuseStrategy,
                                                  InitializingBean {

    /**
     * GateSender <i>application logger</i>.
     */
    private static Logger appLogger   = EtlLogger.getLogger(GKConnectionReuseStrategy.class);
    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        if(appLogger.isInfoEnabled()) {
            appLogger.info("Using a custom ConnectionReuseStrategy based on peer HTTP headers/version");
        }
    }
    
    /**
     * @see org.apache.http.ConnectionReuseStrategy#keepAlive(org.apache.http.HttpResponse, org.apache.http.protocol.HttpContext)
     */
    @Override
    public boolean keepAlive(final HttpResponse response,
                             final HttpContext context) {
        if(response == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        
        if(context == null) {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }

        HttpConnection conn = (HttpConnection)
            context.getAttribute(ExecutionContext.HTTP_CONNECTION);

        if(conn != null && !conn.isOpen()) {
            if(appLogger.isInfoEnabled()) {
                appLogger.info("HTTP connection NULL or already closed --> keep-alive=false");
            }
            
            return false;
        }
        
        // Do NOT check for stale connection, that is an expensive operation

        // Check for a self-terminating entity. If the end of the entity will
        // be indicated by closing the connection, there is no keep-alive.
        HttpEntity entity = response.getEntity();
        ProtocolVersion ver = response.getStatusLine().getProtocolVersion();
        if(entity != null) {
            if(entity.getContentLength() < 0) {
                if(!entity.isChunked() || ver.lessEquals(HttpVersion.HTTP_1_0)) {
                    
                    // If the content length is not known and is not chunk encoded,
                    // the connection cannot be reused
                    
                    if(appLogger.isInfoEnabled()) {
                        appLogger.info("Content-length NOT known or NOT chunk-encoded --> keep-alive=false");
                    }
                    
                    return false;
                }
            }
        }

        // Check for the "Connection" header. If that is absent, check for
        // the "Proxy-Connection" header. The latter is an unspecified and
        // broken but unfortunately common extension of HTTP.
        String targetHeaderName = HTTP.CONN_DIRECTIVE;
        HeaderIterator hit = response.headerIterator(targetHeaderName);
        
        if(!hit.hasNext()) {
            targetHeaderName = "Proxy-Connection";
            hit = response.headerIterator(targetHeaderName);
        }

        // Experimental usage of the "Connection" header in HTTP/1.0 is
        // documented in RFC 2068, section 19.7.1. A token "keep-alive" is
        // used to indicate that the connection should be persistent.
        // Note that the final specification of HTTP/1.1 in RFC 2616 does not
        // include this information. Neither is the "Connection" header
        // mentioned in RFC 1945, which informally describes HTTP/1.0.
        //
        // RFC 2616 specifies "close" as the only connection token with a
        // specific meaning: it disables persistent connections.
        //
        // The "Proxy-Connection" header is not formally specified anywhere,
        // but is commonly used to carry one token, "close" or "keep-alive".
        // The "Connection" header, on the other hand, is defined as a
        // sequence of tokens, where each token is a header name, and the
        // token "close" has the above-mentioned additional meaning.
        //
        // To get through this mess, we treat the "Proxy-Connection" header
        // in exactly the same way as the "Connection" header, but only if
        // the latter is missing. We scan the sequence of tokens for both
        // "close" and "keep-alive". As "close" is specified by RFC 2068,
        // it takes precedence and indicates a non-persistent connection.
        // If there is no "close" but a "keep-alive", we take the hint.

        if(hit.hasNext()) {
            try {
                TokenIterator ti = createTokenIterator(hit);
                boolean keepalive = false;
                
                while(ti.hasNext()) {
                    final String token = ti.nextToken();
                    
                    if(HTTP.CONN_CLOSE.equalsIgnoreCase(token)) {
                        if(appLogger.isInfoEnabled()) {
                            appLogger.info("Server returned '" + targetHeaderName + ": close' header --> keep-alive=false");
                        }
                        
                        return false;
                        
                    } else if(HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(token)) {
                        // Continue the loop, there may be a "close" afterwards
                        keepalive = true;
                    }
                }
                
                if(keepalive) {
                    if(appLogger.isInfoEnabled()) {
                        appLogger.info("Server returned '" + targetHeaderName + ": keep-alive' header --> keep-alive=true");
                    }
                    
                    return true;
                }
                
                // Neither "close" nor "keep-alive", use default policy

            } catch(ParseException px) {
                // Invalid connection header means no persistent connection
                // we don't have logging in HttpCore, so the exception is lost
                if(appLogger.isInfoEnabled()) {
                    appLogger.info("Invalid connection header --> keep-alive=false");
                }
                
                return false;
            }
        }

        // Default policy:
        // keep-alive=true if peer protocol is HTTP 1.1 or higher
                boolean lessOrEqualHTTP10 = ver.lessEquals(HttpVersion.HTTP_1_0);
                if(appLogger.isInfoEnabled()) {
            appLogger.info("Remote peer HTTP version " + (lessOrEqualHTTP10 ? "<=" : ">") + " 1.0 --> keep-alive=" + (!lessOrEqualHTTP10));
                }
                
        return !lessOrEqualHTTP10;
    }

    /**
     * Creates a token iterator from a header iterator.
     * This method can be overridden to replace the implementation of
     * the token iterator.
     *
     * @param hit       the header iterator
     *
     * @return  the token iterator
     */
    protected TokenIterator createTokenIterator(HeaderIterator hit) {
        return new BasicTokenIterator(hit);
    }
}
