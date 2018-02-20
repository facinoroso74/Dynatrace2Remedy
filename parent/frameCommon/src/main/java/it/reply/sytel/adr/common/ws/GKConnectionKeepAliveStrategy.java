/*
 * Copyright (c) 2010 Sytel/Reply - All right reserved
 *
 * Created on 26/apr/2011
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

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author m.curcio
 * 
 */
public class GKConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy,
                                                      InitializingBean {

    /**
     * GateSender <i>application logger</i>.
     */
    private static Logger appLogger   = EtlLogger.getLogger(GKConnectionKeepAliveStrategy.class);
    
    /**
     * Accessor getter method for field defaultKADuration
     */
    public long getDefaultKADuration() {
        return defaultKADuration;
    }
    
    /**
     * Accessor setter method for field defaultKADuration.<br>
     * Optional, default is -1 ("infinite")
     */
    public void setDefaultKADuration(long value) {
        defaultKADuration = value;
    }

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        if(appLogger.isInfoEnabled()) {
            appLogger.info("Using a custom ConnectionKeepAliveStrategy with default duration = " +
                            (defaultKADuration > 0 ? defaultKADuration + " ms." : "'infinite'"));
        }
    }
    
    /**
     * @see org.apache.http.conn.ConnectionKeepAliveStrategy#getKeepAliveDuration(org.apache.http.HttpResponse,
     *      org.apache.http.protocol.HttpContext)
     */
    @Override
    public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
        
        if(response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        
        HeaderElementIterator it = 
            new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
        
        long result = defaultKADuration;
        
        while(it.hasNext()) {
            HeaderElement he = it.nextElement();
            String param = he.getName();
            String value = he.getValue();
            if(value != null && param.equalsIgnoreCase("timeout")) {
                try {
                    result = Long.parseLong(value) * 1000;
                    
                    if(appLogger.isInfoEnabled()) {
                        appLogger.info("Remote peer declared keep-alive duration: " + result + " ms.");
                    }
                    
                    break;
                    
                } catch(NumberFormatException ignore) {
                    // We cannot use a malformed value
                }
            }
        }
        
        if(appLogger.isInfoEnabled()) {
            appLogger.info("Current connection will be kept alive " +
                            (result > 0 ? "for " + result + " ms." : "'indefinitely'"));
        }
        
        return result;
    }

    //-----------------------------------
    // PRIVATE SECTION
    //-----------------------------------
    private long defaultKADuration = -1;
}
