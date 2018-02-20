/*
 * Created on 3-ott-2005
 * @author MPantaleone 2005
 */
package it.reply.sytel.adr.core.services.service;


import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.core.services.context.ServiceContext;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;

import java.util.Date;

import org.apache.log4j.Logger;



/**
 * @author MPantaleone
 * 
 */
public abstract class AbstractService implements CoreService{
  
	protected Logger log = null;
	protected ServiceContext context;
    private String serviceName;
    
    public AbstractService(String serviceName){
    	this.serviceName=serviceName;
    	//log= EtlLogger.getLogger(getClass());
    }
    
	/**
	 * @return Returns the log.
	 */
	public Logger getLog() {
		return log;
	}
	
	/**
	 * @param log The log to set.
	 */
	public void setLog(Logger log) {
		this.log = log;
	}
	
    public ServiceContext getContext() {
        return context;
    }
    
    /**
     * <b>set the Service Context and load the configuration</b>
     * @param context
     */
    public void setContext(ServiceContext context) {
        this.context = context;
    }
    
    public Enviromnent execute(Enviromnent env){
    	
    	Date begin =new Date();
    	
    	if(log.isInfoEnabled())
    		log.info("service:["+serviceName+"] called ... ");

    	;
    	Enviromnent envOut = perform(env);
    	
     	
    	if(log.isInfoEnabled()){
    		Date end=new Date();
        	long executionTime=end.getTime()-begin.getTime();
        	log.info("Service:["+serviceName+"] called ... DONE with ServiceExecutionTime:["+executionTime+"]");
    	}
    	
    	return envOut;
    }

	protected abstract Enviromnent perform(Enviromnent env);

	public String getServiceName() {
		return serviceName;
	}

	
	
}
