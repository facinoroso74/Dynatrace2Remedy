/*
 * Copyright (c) 2010 Sytel/Reply - All right reserved
 *
 * Created on 20/set/2011
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

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.log4j.Logger;

/**
 * @author m.curcio
 *
 */
public class IdleHTTPConnectionEvictor extends Thread {

    /**
     * GateSender <i>application logger</i>.
     */
    private Logger appLogger   = EtlLogger.getLogger(IdleHTTPConnectionEvictor.class);

    /**
     * Package-protected constructor
     */
    IdleHTTPConnectionEvictor(ClientConnectionManager mgr,
                              long                    interval,
                              long                    maxIdleTime) {
        super();
        connMgr         = mgr;
        evictionPeriod  = interval;
        connMaxIdleTime = maxIdleTime;
    }
    
    /**
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        if(appLogger.isInfoEnabled()) {
            appLogger.info("Starting IdleHTTPConnectionEvictor task (evictionPeriod=" + evictionPeriod + 
                            (connMaxIdleTime > 0 ? ", connMaxIdleTime=" + connMaxIdleTime : "") + 
                            ")");
        }
        
        running = true;
        
        while(running) {
            try {
                synchronized(this) {
                    wait(evictionPeriod);
                    
                    // Close expired connections
                    connMgr.closeExpiredConnections();
                    
                    if(connMaxIdleTime > 0) {
                    // Close connections that have been idle
                    // longer than 'connMaxIdleTime' ms.
                    connMgr.closeIdleConnections(connMaxIdleTime, TimeUnit.MILLISECONDS);
                    }
                }
                
            } catch(InterruptedException exc) {
                if(appLogger.isInfoEnabled()) {
                    appLogger.info("Stopping IdleHTTPConnectionEvictor task");
                }
            }
        }
        
        if(appLogger.isInfoEnabled()) {
            appLogger.info("IdleHTTPConnectionEvictor task stopped");
        }
    }

    /**
     * IdleHTTPConnectionEvictor task shutdown method
     */
    public void shutdown() {
        running = false;
        synchronized(this) {
            notifyAll();
        }
    }
    
    //-----------------------------------
    // PROTECTED SECTION
    //-----------------------------------
    protected ClientConnectionManager connMgr;
    protected volatile boolean        running;
    protected long                    evictionPeriod;
    protected long                    connMaxIdleTime;
}
