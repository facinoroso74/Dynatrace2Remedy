/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/26 09:06:39 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/Deliver/src/java/it/reply/sytel/xawes/deliver/dao/configuration/impl/ConfigServicesFile.java,v 1.7 2010/07/26 09:06:39 m.pantaleone Exp $
 * $Id: ConfigServicesFile.java,v 1.7 2010/07/26 09:06:39 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.7 $
 * $State: Exp $
 */
package it.reply.sytel.adr.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.resource.Resource;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.dao.configuration.ConfigurationService;
import it.reply.sytel.adr.core.dao.exception.ConfigurationException;

/**
 * @author MPantaleone
 *
 * carico il file di configurazione config.xml
 * e setto la HashMap
 */
public class ConfigServicesFile implements ConfigurationService {
	
    private Logger log=EtlLogger.getLogger(getClass());
    private Resource resource;
	private Map<String,Object> map;
    
	
	private Map<String,String> loadAPPWithUrl(Properties prop,String dashBoardUrls) {
		String[] dashBoardUrlsArr = dashBoardUrls.split(ADRConstants.DELIMITER);
		Map<String , String> coupleDashBoardWithUrlMap= new HashMap<String,String>();
		
		for (int i = 0; i < dashBoardUrlsArr.length; i++) {
			coupleDashBoardWithUrlMap.put(dashBoardUrlsArr[i], prop.getProperty(dashBoardUrlsArr[i]));
		}
		return coupleDashBoardWithUrlMap;
		
	}
	
    public void init() {
    	
    	InputStream is =null;
    	
    	try{
    		is= resource.getConfFromClassLoader();
    		
	        this.map= new HashMap<String,Object>();
			/*
			 * load the configuration file
			 */
	        Properties prop = new Properties();
	        prop.load(is);
	        
	        String dashBoardUrls = prop.getProperty(ADRConstants.DASHBOARD_URLS);
	        Map<String, String> coupleDashBoardWithUrlMap = loadAPPWithUrl(prop,dashBoardUrls);
	        map.put(ADRConstants.DASHBOARD_URLS_MAP,coupleDashBoardWithUrlMap);
	        
	        if(log.isDebugEnabled())
	        	log.debug("Configuration DONE");
	    
		}catch (Exception e) {
			throw new ConfigurationException("Exception into loading configuration",e);
		}finally{
			
			try {
				if(is!=null)
					is.close();
			} catch (IOException e) {
				log.error("Exception into closing the inputStream for configuration file",e);
				throw new ConfigurationException("Exception into closing the inputStream for configuration file",e);
			}
		}
    }
  
   
   
	/* (non-Javadoc)
     * @see it.reply.sytel.xawes.shunter.dao.configuration.DaoConfig#getConfig()
     */
    public Map<String,Object> getConfig() throws ConfigurationException {
    	return this.map;
    }

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	
}

