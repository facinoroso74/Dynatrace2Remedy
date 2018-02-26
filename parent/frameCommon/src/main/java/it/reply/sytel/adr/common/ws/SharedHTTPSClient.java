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
import org.apache.http.client.methods.HttpGet;
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
import org.jboss.security.Base64Encoder;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author m.pantaleone
 */
public class SharedHTTPSClient implements HTTPClient, InitializingBean, DisposableBean {

    /**
     * GateSender <i>application logger</i>.
     */
    private Logger log   = Logger.getLogger(getClass());
    /**
     * Accessor setter method for field contentType
     */
    public void setContentType(String cType) {
        contentType = cType;
    }

    
    /**
     * Accessor setter method for field httpsClientProperties
     */
    public void setHttpsClientProperties(HttpsClientProperties clientProps) {
        httpsClientProperties = clientProps;
    }

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {

        log.debug("Creating shared HTTP client");
        
        URL urlKeyStore=null;
        if(httpsClientProperties.getKeystoreURLString().length()!=0)
        	urlKeyStore   = new URL(httpsClientProperties.getKeystoreURLString());
        
        log.debug("httpsClientProperties.getTrustURLString():["+httpsClientProperties.getTrustURLString()+"]");
        
        URL urlTrustStore = new URL(httpsClientProperties.getTrustURLString());

        AuthSSLProtocolSocketFactory authSSLProtocolSocketFactory = 
                                    new AuthSSLProtocolSocketFactory();
        
        
        SSLContext sslContext = 
                   authSSLProtocolSocketFactory.createSSLContext(urlKeyStore,
                                                                 httpsClientProperties.getKeystorePwd(),
                                                                 httpsClientProperties.getKeyPwd(),
                                                                 urlTrustStore,
                                                                 httpsClientProperties.getTrustPwd());

        SSLSocketFactory socketFactory = new SSLSocketFactory(sslContext,
                                                              new IgnoreX509HostnameVerifier());

        Scheme sch = new Scheme("https", 443, socketFactory);
        SchemeRegistry schemeRegistry = SchemeRegistryFactory.createDefault();
        schemeRegistry.register(sch);

        // Create the thread-safe, pooled HTTP connection manager
        ThreadSafeClientConnManager cm = 
            new ThreadSafeClientConnManager(schemeRegistry,
                                            httpsClientProperties.getManagedConnLifetime(),
                                            TimeUnit.MILLISECONDS);
        
        // Set the total number of managed connections (to all target hosts)
        cm.setMaxTotal(httpsClientProperties.getMaxTotalThread());
        
        // Set the total number of managed connections per target host:
        // We have a SINGLE target host to reach, so...
        cm.setDefaultMaxPerRoute(httpsClientProperties.getMaxTotalThread());

        // Create the HTTP client object
        httpClient = new DefaultHttpClient(cm);
        HttpConnectionParams.setConnectionTimeout(httpClient.getParams(),
                                                  httpsClientProperties.getConnTimeout());
        HttpConnectionParams.setSoTimeout(httpClient.getParams(),
                                          httpsClientProperties.getSoTimeout());
        
        ConnectionReuseStrategy reuseStrategy = httpsClientProperties.getConnReuseStrategy();
        if(reuseStrategy != null) {            
            httpClient.setReuseStrategy(reuseStrategy);
        }
        
        ConnectionKeepAliveStrategy connKAStrategy = httpsClientProperties.getConnKAStrategy();
        if(connKAStrategy != null) {
            httpClient.setKeepAliveStrategy(connKAStrategy);
        }
        
        HttpRequestRetryHandler retryHandler = httpsClientProperties.getRetryHandler();
        if(retryHandler != null) {
            httpClient.setHttpRequestRetryHandler(retryHandler);
        }
        
        connEvictor = new IdleHTTPConnectionEvictor(cm,
                                                    httpsClientProperties.getIdleConnEvictorPeriod(),
                                                    httpsClientProperties.getConnMaxIdleTime());
        connEvictor.start();
        log.debug("Shared HTTP client created successfully!");
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
            httpPost = new HttpPost(httpsClientProperties.getUrlToConnect());

            log.info("Executing POST request to URL: " + httpPost.getRequestLine());

            ByteArrayEntity reqEntity = new ByteArrayEntity(soapPayload);
            reqEntity.setContentType(contentType);
            reqEntity.setChunked(true);
            httpPost.setEntity(reqEntity);
            
            if(soapAction!=null)
            	httpPost.setHeader("SOAPAction", soapAction);
            
            // Create a new HttpContext and bind it to the passed user token
            HttpContext localContext = null;
            if(userToken != null) {
                localContext = new BasicHttpContext();
                localContext.setAttribute(ClientContext.USER_TOKEN, userToken);
            }

            HttpResponse response = httpClient.execute(httpPost, localContext);          
            int statusCode = response.getStatusLine().getStatusCode();
            
            if(log.isInfoEnabled()) {
                Header[] headers = response.getAllHeaders();
                log.info("SOAP HTTP response headers:");
                for(Header header : headers) {
                    log.info("\tname=" + header.getName() + ", value=" + header.getValue());
                }
            }
            
            if(statusCode == HTTP_RETCODE_OK  || statusCode == HTTP_RETCODE_500) {
                log.info("HTTP response code received: " + statusCode);
                HttpEntity entity = response.getEntity();
                return entity.getContent();
                
            } else {
                throw new HttpClientException("Returned HTTP error code " + statusCode);
            }
            
        } catch(Exception exc) {
            log.error("Error while invoking URL:[" +
                             httpsClientProperties.getUrlToConnect() + "]",
                             exc);
            
            // If possibile, abort the POST request
            // and mark the connection as NOT-reusable
            if(httpPost != null) {
                log.debug("Marking associated HTTP connection as NOT-reusable");
                httpPost.abort();
            }
            
            throw new HttpClientException("Error while invoking URL:[" +
                                           httpsClientProperties.getUrlToConnect() + "]",
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
        log.info("Shutting down shared HTTP client connection manager");
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
    private HttpsClientProperties      httpsClientProperties;
	
    
    
    @Override
	public InputStream invokeGet(String user, String password)
			throws HttpClientException {
    	
    	HttpGet httpPost = null;
    	
        try {
            httpPost = new HttpGet(httpsClientProperties.getUrlToConnect());

            log.debug("Executing POST with basic authentication");
            if(user!=null && password!=null) {
            	String encoding = Base64Encoder.encode (user+":"+password);
            	httpPost.setHeader("Authorization", "Basic " + encoding);
            }
           
            if(log.isDebugEnabled()) {
	            log.debug("SOAP HTTP request headers:");
	            Header[] headers1 = httpPost.getAllHeaders();
	            for(Header header : headers1) {
	                log.info("\tname=" + header.getName() + ", value=" + header.getValue());
	            }
            }
            
            // Create a new HttpContext and bind it to the passed user token
            HttpContext localContext = null;
          

            HttpResponse response = httpClient.execute(httpPost, localContext);          
            int statusCode = response.getStatusLine().getStatusCode();
            
            if(log.isInfoEnabled()) {
                Header[] headers = response.getAllHeaders();
                log.info("SOAP HTTP response headers:");
                for(Header header : headers) {
                    log.info("\tname=" + header.getName() + ", value=" + header.getValue());
                }
            }
            
            if(statusCode == HTTP_RETCODE_OK  || statusCode == HTTP_RETCODE_500) {
                log.info("HTTP response code received: " + statusCode);
                HttpEntity entity = response.getEntity();
                return entity.getContent();
                
            } else {
                throw new HttpClientException("Returned HTTP error code " + statusCode);
            }
            
        } catch(Exception exc) {
            log.error("Error while invoking URL:[" +
                             httpsClientProperties.getUrlToConnect() + "]",
                             exc);
            
            // If possibile, abort the POST request
            // and mark the connection as NOT-reusable
            if(httpPost != null) {
                log.debug("Marking associated HTTP connection as NOT-reusable");
                httpPost.abort();
            }
            
            throw new HttpClientException("Error while invoking URL:[" +
                                           httpsClientProperties.getUrlToConnect() + "]",
                                           exc);
        }
	}


	@Override
	public InputStream invokeGet(String user, String pwd, String urlToConnect) throws HttpClientException {
HttpGet httpPost = null;
    	
        try {
            httpPost = new HttpGet(urlToConnect);

            log.debug("Executing POST with basic authentication");
            if(user!=null && pwd!=null) {
            	String encoding = Base64Encoder.encode (user+":"+pwd);
            	httpPost.setHeader("Authorization", "Basic " + encoding);
            }
           
            if(log.isDebugEnabled()) {
	            log.debug("SOAP HTTP request headers:");
	            Header[] headers1 = httpPost.getAllHeaders();
	            for(Header header : headers1) {
	                log.info("\tname=" + header.getName() + ", value=" + header.getValue());
	            }
            }
            
            // Create a new HttpContext and bind it to the passed user token
            HttpContext localContext = null;
          

            HttpResponse response = httpClient.execute(httpPost, localContext);          
            int statusCode = response.getStatusLine().getStatusCode();
            
            if(log.isInfoEnabled()) {
                Header[] headers = response.getAllHeaders();
                log.info("SOAP HTTP response headers:");
                for(Header header : headers) {
                    log.info("\tname=" + header.getName() + ", value=" + header.getValue());
                }
            }
            
            if(statusCode == HTTP_RETCODE_OK  || statusCode == HTTP_RETCODE_500) {
                log.info("HTTP response code received: " + statusCode);
                HttpEntity entity = response.getEntity();
                return entity.getContent();
                
            } else {
                throw new HttpClientException("Returned HTTP error code " + statusCode);
            }
            
        } catch(Exception exc) {
            log.error("Error while invoking URL:[" +
                             httpsClientProperties.getUrlToConnect() + "]",
                             exc);
            
            // If possibile, abort the POST request
            // and mark the connection as NOT-reusable
            if(httpPost != null) {
                log.debug("Marking associated HTTP connection as NOT-reusable");
                httpPost.abort();
            }
            
            throw new HttpClientException("Error while invoking URL:[" +
                                           httpsClientProperties.getUrlToConnect() + "]",
                                           exc);
        }
	}
	
  
    
}
