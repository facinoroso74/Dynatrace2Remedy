/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:11 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCore/src/java/it/reply/sytel/xawes/core/dao/configuration/exception/ConfigurationException.java,v 1.4 2010/07/06 14:12:11 m.pantaleone Exp $
 * $Id: ConfigurationException.java,v 1.4 2010/07/06 14:12:11 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.4 $
 * $State: Exp $
 */
package it.reply.sytel.adr.core.dao.exception;

import it.reply.sytel.adr.core.exc.CoreNestedException;

/**
 * 
 * @author M.Pantaleone
 */
public class ConfigurationException extends CoreNestedException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1171912456318695573L;

	public ConfigurationException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ConfigurationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ConfigurationException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public ConfigurationException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}

	
	
}

