/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2012/03/28 16:40:47 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/Queuer/src/java/it/reply/sytel/xawes/queuer/engine/QueuerEngine.java,v 1.13 2012/03/28 16:40:47 f.romano Exp $
 * $Id: QueuerEngine.java,v 1.13 2012/03/28 16:40:47 f.romano Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.13 $
 * $State: Exp $
 */
package it.reply.sytel.adr.engine;

import java.util.Date;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.CoreService;
import it.reply.sytel.adr.engine.exc.EngineException;
import it.reply.sytel.flowapp.data.TID;
import it.reply.sytel.flowapp.logging.NMDC;


/**
 * 
 * 
 * @author M.Pantaleone
 */
public class RemedyIncidetBuilderEngine {
    
    
	private Logger log = EtlLogger.getLogger(getClass());
    private CoreService getDynatraceIncident;
    private CoreService createRemedyIncident;
    private CoreService closeRemedyIncident;
     
    public Enviromnent executeFlow(Enviromnent env) throws EngineException{
    	
    	NMDC.push();
    	
    	try{

    		TID tid = new TID();
			NMDC.put(ADRConstants.TID, tid);
			
    		Date begin=new Date();
	    	
	    	if(log.isInfoEnabled())
	    		log.info("Flow RemedyIncidentdBuilder Engine Called...");
	 	    	

	    	getDynatraceIncident.execute(env);
	    	

	    	createRemedyIncident.execute(env);
	    	
	    	
	    	closeRemedyIncident.execute(env);

	    	
	    	if(log.isInfoEnabled()){
	    		Date end=new Date();
	        	long executionTime=end.getTime()-begin.getTime();
	        	log.info("Flow RemedyIncidentdBuilder Engine executed with ExecutionTime ("+executionTime+")");
	    	}
	        
	        return env;
	        
    	}catch (Exception e) {
			
    		log.error("Exception on Flow Flow TestBuilder Engine",e);
			//throw new EngineException("Exception on Flow Engine Aggiornamneto Clienti ASSET",e);
			return env;
			
		}finally{
			NMDC.pop();
		}
    }

	


	public CoreService getGetDynatraceIncident() {
		return getDynatraceIncident;
	}




	public void setGetDynatraceIncident(CoreService getDynatraceIncident) {
		this.getDynatraceIncident = getDynatraceIncident;
	}




	public CoreService getCreateRemedyIncident() {
		return createRemedyIncident;
	}




	public void setCreateRemedyIncident(CoreService createRemedyIncident) {
		this.createRemedyIncident = createRemedyIncident;
	}




	public CoreService getCloseRemedyIncident() {
		return closeRemedyIncident;
	}




	public void setCloseRemedyIncident(CoreService closeRemedyIncident) {
		this.closeRemedyIncident = closeRemedyIncident;
	}

}

