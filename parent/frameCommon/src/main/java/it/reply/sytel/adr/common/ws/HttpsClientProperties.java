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


import it.reply.sytel.adr.common.crypto.CryptoUtility;

import java.util.Map;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author m.pantaleone, g.serra
 */
public class HttpsClientProperties implements InitializingBean {
	
//    private CryptoService cryptoService;

	private boolean pwdCrypted=false;
	
	private String keystoreURLString;
	private String trustURLString;
	
	private String keystorePwd;
	private String keyPwd;
	private String trustPwd;
	private String urlToConnect;
	private int    maxTotalThread      =  100;
	private int    soTimeout           =  0;
	private int    connTimeout         =  0;
	
    private long                        managedConnLifetime   = -1;
    private long                        idleConnEvictorPeriod = 5000;
    private long                        connMaxIdleTime       = -1;

    private ConnectionReuseStrategy     connReuseStrategy;
    private ConnectionKeepAliveStrategy connKAStrategy;
    private HttpRequestRetryHandler     retryHandler;
	
    
    @Required
	public void setSuperMap(Map<String, Map<String, String>> superMap)
	                        throws Exception {
	    
	    // Retrieve current server name
	    //String serverName = System.getProperty("weblogic.Name");
    	String serverName = "communication_A1";
    	
        // Set field values according to the server we're on
	    Map<String, String> paramValues = superMap.get(serverName);
	    if(paramValues != null) {
	        
	        String maxTotalThreadStr = paramValues.get("maxTotalThread");
	        String soTimeoutStr      = paramValues.get("soTimeout");
            String connTimeoutStr    = paramValues.get("connTimeout");
	        
            keystoreURLString = paramValues.get("keystoreURLString");
            trustURLString    = paramValues.get("trustURLString");
            keystorePwd       = paramValues.get("keystorePwd");
            keyPwd            = paramValues.get("keyPwd");
            trustPwd          = paramValues.get("trustPwd");
            urlToConnect      = paramValues.get("urlToConnect");
            
            if(maxTotalThreadStr != null) {
                maxTotalThread = Integer.parseInt(maxTotalThreadStr);
            }
            if(soTimeoutStr != null) {
                soTimeout = Integer.parseInt(soTimeoutStr);
            }
            if(connTimeoutStr != null) {
                connTimeout = Integer.parseInt(connTimeoutStr);
            }
            
	    } else {
            throw new Exception("HttpClientProperties configuration missing for WLS server " + serverName);
	    }
	}
	

    public void setManagedConnLifetime(long value) {
        managedConnLifetime = value;
    }

    public void setIdleConnEvictorPeriod(long value) {
        idleConnEvictorPeriod = value;
    }

    public void setConnMaxIdleTime(long value) {
        connMaxIdleTime = value;
    }

    public void setConnReuseStrategy(ConnectionReuseStrategy crs) {
        connReuseStrategy = crs;
    }
    
    public void setConnKAStrategy(ConnectionKeepAliveStrategy ckaStrategy) {
        connKAStrategy = ckaStrategy;
    }

    public void setRetryHandler(HttpRequestRetryHandler handler) {
        retryHandler = handler;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    	// Decrypt passwords
    	if(isPwdCrypted() && keystorePwd!=null && keystorePwd.length()!=0){
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
//    		System.out.println("DECRYPTING the KEYSTORE PWD");
    		
    		keystorePwd = CryptoUtility.decrypt(keystorePwd);
    		
    	}
    	if(isPwdCrypted() && trustPwd!=null && trustPwd.length()!=0){
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD :["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD :["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD ["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD ["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD ["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD ["+trustPwd+"]");
    		
    		trustPwd = CryptoUtility.decrypt(trustPwd);
    		
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD["+trustPwd+"]");
//    		System.out.println("DECRYPTING the TRUSTSTORE PWD["+trustPwd+"]");
    		
    	}
    }

	public String getKeystoreURLString() {
		return keystoreURLString;
	}
	
	public String getTrustURLString() {
		return trustURLString;
	}
	
	public String getKeystorePwd() {
		return keystorePwd;
	}
	
	public String getKeyPwd() {
		return keyPwd;
	}
	
	public String getTrustPwd() {
		return trustPwd;
	}
	
	public String getUrlToConnect() {
		return urlToConnect;
	}
	
	public int getMaxTotalThread() {
		return maxTotalThread;
	}
	
	public int getSoTimeout() {
        return soTimeout;
    }

    public int getConnTimeout() {
        return connTimeout;
    }

    public long getManagedConnLifetime() {
        return managedConnLifetime;
    }

    public long getIdleConnEvictorPeriod() {
        return idleConnEvictorPeriod;
    }
    
    public long getConnMaxIdleTime() {
        return connMaxIdleTime;
    }

    public ConnectionReuseStrategy getConnReuseStrategy() {
        return connReuseStrategy;
    }

    public ConnectionKeepAliveStrategy getConnKAStrategy() {
        return connKAStrategy;
    }

    public HttpRequestRetryHandler getRetryHandler() {
        return retryHandler;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    		
        return "HttpClientProperties [urlToConnect=" + urlToConnect + ", maxTotalThread=" + maxTotalThread
                + ", managedConnLifetime=" + managedConnLifetime + ", idleConnEvictorPeriod=" + idleConnEvictorPeriod
                + ", connMaxIdleTime=" + connMaxIdleTime + ", connTimeout=" + connTimeout + ", soTimeout=" + soTimeout
                + ", connKAStrategy=" + connKAStrategy + ", connReuseStrategy=" + connReuseStrategy
                + ", retryHandler=" + retryHandler + ", keyPwd=" + keyPwd
                + ", keystorePwd=" + keystorePwd + ", keystoreURLString=" + keystoreURLString
                + ", trustPwd=" + trustPwd + ", trustURLString=" + trustURLString + "]";
    }


	public boolean isPwdCrypted() {
		return pwdCrypted;
	}


	public void setPwdCrypted(boolean pwdCrypted) {
		this.pwdCrypted = pwdCrypted;
	}
    
}
