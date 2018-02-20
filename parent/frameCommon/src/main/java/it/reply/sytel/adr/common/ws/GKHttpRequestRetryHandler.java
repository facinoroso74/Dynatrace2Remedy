/*
 * Copyright (c) 2010 Sytel/Reply - All right reserved
 *
 * Created on 06/mag/2011
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

import java.io.IOException;

import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author m.curcio
 *
 */
public class GKHttpRequestRetryHandler implements HttpRequestRetryHandler,
                                                  InitializingBean {

    /**
     * GateSender <i>application logger</i>.
     */
    private static Logger appLogger   = EtlLogger.getLogger(GKHttpRequestRetryHandler.class);
    
    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        if(appLogger.isInfoEnabled()) {
            appLogger.info("Using a custom HttpRequestRetryHandler to delegate retry logic to JMS redelivery mechanism");
        }
    }

    /**
     * @see org.apache.http.client.HttpRequestRetryHandler#retryRequest(java.io.IOException, int, org.apache.http.protocol.HttpContext)
     */
    @Override
    public boolean retryRequest(IOException exception,
                                int executionCount,
                                HttpContext context) {
        // Retries will be handled by WebLogic JMS redelivery system 
        return false;
    }
}
