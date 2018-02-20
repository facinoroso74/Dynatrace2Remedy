package it.reply.sytel.adr.core.services.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;


public class CoreServiceException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6702118480851726757L;

	public CoreServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CoreServiceException(String message) {
		super(message);
	}

	public CoreServiceException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
	}

	public CoreServiceException(String message, int errorCode,
			Throwable cause) {
		super(message, errorCode, cause);
	}

	public CoreServiceException(String message, int errorCode) {
		super(message, errorCode);
	}

	
}
