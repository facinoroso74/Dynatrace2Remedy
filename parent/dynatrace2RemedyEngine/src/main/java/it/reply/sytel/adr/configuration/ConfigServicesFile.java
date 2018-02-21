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
import it.reply.sytel.adr.vo.AppProperty;

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
    
	
	private Map<String,AppProperty> loadAppProperty(Properties prop,String appNames) {
		String[] appNameArray = appNames.split(ADRConstants.DELIMITER);
		Map<String , AppProperty> coupleDashBoardWithUrlMap= new HashMap<String,AppProperty>();
		
		for (int i = 0; i < appNameArray.length; i++) {
			AppProperty appProperty  =new AppProperty();
			appProperty.setAppName(appNameArray[i]);
			appProperty.setAppUrl(prop.getProperty(appNameArray[i]+"_URL"));
			appProperty.setAppUsr(prop.getProperty(appNameArray[i]+"_USER"));
			appProperty.setAppPwd(prop.getProperty(appNameArray[i]+"_PWD"));
			
			coupleDashBoardWithUrlMap.put(appNameArray[i], appProperty);
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
	        
	        String appNames = prop.getProperty(ADRConstants.DASHBOARD_NAMES);
	      
	        map.put(ADRConstants.DASHBOARD_NAMES,loadAppProperty(prop, appNames));
	        
	        
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

