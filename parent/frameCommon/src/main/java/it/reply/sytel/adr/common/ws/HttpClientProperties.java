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

import java.util.Map;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author m.pantaleone, g.serra
 */
public class HttpClientProperties implements InitializingBean {
	
    
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
	
//    @Required
//    public void setCryptoService(CryptoService cs) {
//        cryptoService = cs;
//    }

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
    	//se proprio devo utilizzarla devo usare la CryptoUtils di Jboss
//    	if(cryptoService!=null){
//	        // Decrypt passwords
//	        if(keystorePwd != null) {
//	            keystorePwd = cryptoService.decrypt(keystorePwd);
//	        }
//	        
//	        if(keyPwd != null) {
//	            keyPwd = cryptoService.decrypt(keyPwd);
//	        }
//	        
//	        if(trustPwd != null) {
//	            trustPwd = cryptoService.decrypt(trustPwd);
//	        } 
//        }       
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
//    	if(cryptoService==null)
//        	
//    		cryptoService=new CryptoService() {
//			
//			@Override
//			public String encrypt(String str) throws CryptoServiceException {
//					// TODO Auto-generated method stub
//				return null;
//			}
//				
//			@Override
//			public String decrypt(String str) throws CryptoServiceException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public String toString(){
//				return "CryptoService not selected";
//			}
//    	};
        return "HttpClientProperties [urlToConnect=" + urlToConnect + ", maxTotalThread=" + maxTotalThread
                + ", managedConnLifetime=" + managedConnLifetime + ", idleConnEvictorPeriod=" + idleConnEvictorPeriod
                + ", connMaxIdleTime=" + connMaxIdleTime + ", connTimeout=" + connTimeout + ", soTimeout=" + soTimeout
                + ", connKAStrategy=" + connKAStrategy + ", connReuseStrategy=" + connReuseStrategy +
                //+ ", cryptoService=" + cryptoService + 
                ", retryHandler=" + retryHandler + ", keyPwd=" + keyPwd
                + ", keystorePwd=" + keystorePwd + ", keystoreURLString=" + keystoreURLString
                + ", trustPwd=" + trustPwd + ", trustURLString=" + trustURLString + "]";
    }

}
