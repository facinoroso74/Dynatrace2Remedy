/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:06 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCore/src/java/it/reply/sytel/xawes/core/dao/configuration/ConfigurationService.java,v 1.4 2010/07/06 14:12:06 m.pantaleone Exp $
 * $Id: ConfigurationService.java,v 1.4 2010/07/06 14:12:06 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.4 $
 * $State: Exp $
 */
package it.reply.sytel.adr.core.dao.configuration;

import java.util.Map;

import it.reply.sytel.adr.core.dao.exception.ConfigurationException;

/**
 * <b>Configuration of Service </b>
 * @author MPantaleone
 */
public interface ConfigurationService {
	/**
	 * Setta una HashMap con i Campi valorizzati nella configurazione    
	 * @param mapField
	 * @throws ConfigurationException
	 */
    public Map<String,Object> getConfig() throws ConfigurationException;
    
}
