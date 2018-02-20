/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:12 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCore/src/java/it/reply/sytel/xawes/core/serviceXawes/context/ServiceContext.java,v 1.4 2010/07/06 14:12:12 m.pantaleone Exp $
 * $Id: ServiceContext.java,v 1.4 2010/07/06 14:12:12 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.4 $
 * $State: Exp $
 */
package it.reply.sytel.adr.core.services.context;

import it.reply.sytel.adr.core.dao.configuration.ConfigurationService;

import java.util.Map;

public interface ServiceContext {
    
    public  Map<String,Object> getConfigMap();
    public ConfigurationService getDaoConfig();
    public void setDaoConfig(ConfigurationService daoConfig);

}

