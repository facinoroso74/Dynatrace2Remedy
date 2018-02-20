/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:09 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCore/src/java/it/reply/sytel/xawes/core/serviceXawes/context/impl/ServiceContextImpl.java,v 1.2 2010/07/06 14:12:09 m.pantaleone Exp $
 * $Id: ServiceContextImpl.java,v 1.2 2010/07/06 14:12:09 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.2 $
 * $State: Exp $
 */
package it.reply.sytel.adr.core.services.context.impl;

import java.util.Map;

import it.reply.sytel.adr.core.dao.configuration.ConfigurationService;
import it.reply.sytel.adr.core.services.context.ServiceContext;

public class ServiceContextImpl implements ServiceContext{
    
    public ConfigurationService daoConfig;  
   
    
    public ConfigurationService getDaoConfig() {
        return daoConfig;
    }

    public void setDaoConfig(ConfigurationService daoConfig) {
        this.daoConfig = daoConfig;
    }

    public Map<String,Object> getConfigMap(){
    	
    	return daoConfig.getConfig();
    }

   
    
}

