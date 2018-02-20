/*
 * Copyright (c) 2010 Sytel/Reply - All right reserved
 *
 * Created on 21/feb/2011
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
import it.reply.sytel.adr.common.ws.exc.HttpClientException;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author m.pantaleone
 */
public class SharedHTTPClient implements HTTPClient, InitializingBean, DisposableBean {

    
	/**
     * GateSender <i>application logger</i>.
     */
    private Logger appLogger   = EtlLogger.getLogger(SharedHTTPClient.class);
    
    /**
     * Accessor setter method for field contentType
     */
    public void setContentType(String cType) {
        contentType = cType;
    }

    /**
     * Accessor setter method for field httpClientProperties
     */
    public void setHttpClientProperties(HttpClientProperties clientProps) {
        httpClientProperties = clientProps;
    }

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {

        appLogger.debug("Creating shared HTTP client");
        
        URL urlKeyStore   = null;
        URL urlTrustStore = null;
        
        if(httpClientProperties.getKeystoreURLString().length()!=0)
        	urlKeyStore   = new URL(httpClientProperties.getKeystoreURLString());
        
        if(httpClientProperties.getKeystoreURLString().length()!=0)
        	urlTrustStore = new URL(httpClientProperties.getTrustURLString());

        AuthSSLProtocolSocketFactory authSSLProtocolSocketFactory = new AuthSSLProtocolSocketFactory();
        SSLContext sslContext = 
                   authSSLProtocolSocketFactory.createSSLContext(urlKeyStore,
                                                                 httpClientProperties.getKeystorePwd(),
                                                                 httpClientProperties.getKeyPwd(),
                                                                 urlTrustStore,
                                                                 httpClientProperties.getTrustPwd());

        SSLSocketFactory socketFactory = new SSLSocketFactory(sslContext,
                                                              new IgnoreX509HostnameVerifier());

//        Scheme sch = new Scheme("https", 443, socketFactory);
        Scheme sch = new Scheme("https", 8443, socketFactory);
        SchemeRegistry schemeRegistry = SchemeRegistryFactory.createDefault();
        schemeRegistry.register(sch);

        // Create the thread-safe, pooled HTTP connection manager
        ThreadSafeClientConnManager cm = 
            new ThreadSafeClientConnManager(schemeRegistry,
                                            httpClientProperties.getManagedConnLifetime(),
                                            TimeUnit.MILLISECONDS);
        
        // Set the total number of managed connections (to all target hosts)
        cm.setMaxTotal(httpClientProperties.getMaxTotalThread());
        
        // Set the total number of managed connections per target host:
        // We have a SINGLE target host to reach, so...
        cm.setDefaultMaxPerRoute(httpClientProperties.getMaxTotalThread());

        // Create the HTTP client object
        httpClient = new DefaultHttpClient(cm);
        HttpConnectionParams.setConnectionTimeout(httpClient.getParams(),
                                                  httpClientProperties.getConnTimeout());
        HttpConnectionParams.setSoTimeout(httpClient.getParams(),
                                          httpClientProperties.getSoTimeout());
        
        ConnectionReuseStrategy reuseStrategy = httpClientProperties.getConnReuseStrategy();
        if(reuseStrategy != null) {            
            httpClient.setReuseStrategy(reuseStrategy);
        }
        
        ConnectionKeepAliveStrategy connKAStrategy = httpClientProperties.getConnKAStrategy();
        if(connKAStrategy != null) {
            httpClient.setKeepAliveStrategy(connKAStrategy);
        }
        
        HttpRequestRetryHandler retryHandler = httpClientProperties.getRetryHandler();
        if(retryHandler != null) {
            httpClient.setHttpRequestRetryHandler(retryHandler);
        }
        
        connEvictor = new IdleHTTPConnectionEvictor(cm,
                                                    httpClientProperties.getIdleConnEvictorPeriod(),
                                                    httpClientProperties.getConnMaxIdleTime());
        connEvictor.start();
        appLogger.debug("Shared HTTP client created successfully!");
    }

    /**
     * Invoker method for a HTTPS POST request with a binary payload
     * and no specific request headers except for the configured MIME content type.
     * @param soapPayload
     * @param userToken the user token to bind the HTTP request context to this client:
     *                   this is needed for correct reuse of <code>HttpClient</code> persistent connections.
     * @return the HTTPS response entity content as a <code>java.io.InputStream</code>
     * @throws HttpClientException if any error occurs during HTTPS communication
     */
    public InputStream invoke(byte[] soapPayload, String userToken,String soapAction) throws HttpClientException {
        HttpPost httpPost = null;
        try {
        	
            httpPost = new HttpPost(httpClientProperties.getUrlToConnect());

            if(appLogger.isInfoEnabled())
            	appLogger.info("Executing POST request to URL: " + httpPost.getRequestLine());

            ByteArrayEntity reqEntity = new ByteArrayEntity(soapPayload);
            reqEntity.setContentType(contentType);
            reqEntity.setChunked(true);
            httpPost.setEntity(reqEntity);
            
            if(soapAction!=null)
            	httpPost.setHeader("SOAPAction",soapAction);
            
            // Create a new HttpContext and bind it to the passed user token
            HttpContext localContext = null;
            if(userToken != null) {
                localContext = new BasicHttpContext();
                localContext.setAttribute(ClientContext.USER_TOKEN, userToken);
            }

            HttpResponse response = httpClient.execute(httpPost, localContext);          
            int statusCode = response.getStatusLine().getStatusCode();
            
            if(appLogger.isInfoEnabled()) {
                Header[] headers = response.getAllHeaders();
                appLogger.info("SOAP HTTP response headers:");
                for(Header header : headers) {
                    appLogger.info("\tname=" + header.getName() + ", value=" + header.getValue());
                }
            }
            
            if(statusCode == HTTP_RETCODE_OK || statusCode == HTTP_RETCODE_500) {
            	
            	if(appLogger.isInfoEnabled())
            		appLogger.info("HTTP response code received: " + statusCode);
            	
                HttpEntity entity = response.getEntity();
                return entity.getContent();
                
            }else {
                throw new HttpClientException("Returned HTTP error code " + statusCode);
            }
            
        } catch(Exception exc) {
            appLogger.error("Error while invoking URL:[" +
                             httpClientProperties.getUrlToConnect() + "]",
                             exc);
            
            // If possibile, abort the POST request
            // and mark the connection as NOT-reusable
            if(httpPost != null) {
                appLogger.debug("Marking associated HTTP connection as NOT-reusable");
                httpPost.abort();
            }
            
            throw new HttpClientException("Error while invoking URL:[" +
                                           httpClientProperties.getUrlToConnect() + "]",
                                           exc);
        }
    }

    /**
     * @see org.springframework.beans.factory.DisposableBean#destroy()
     */
    @Override
    public void destroy() throws Exception {
        // When HttpClient instance is no longer needed:
        //
        // 1) Shut down the idle connection evictor thread;
        //
        // 2) shut down the connection manager to ensure
        //    immediate deallocation of all system resources
        //
        appLogger.info("Shutting down shared HTTP client connection manager");
        connEvictor.shutdown();
        connEvictor.join();
        httpClient.getConnectionManager().shutdown();
    }
    
    //-----------------------------------
    // PRIVATE SECTION
    //-----------------------------------   
    private final static int          HTTP_RETCODE_OK = 200;
    private final static int          HTTP_RETCODE_500 = 500;
    private DefaultHttpClient         httpClient;
    private IdleHTTPConnectionEvictor connEvictor;
    private String                    contentType;
    private HttpClientProperties      httpClientProperties;
    
}
