package it.reply.sytel.adr.services.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class CloseRemedyIncidentException extends CoreNestedException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2755229322756867111L;

	public CloseRemedyIncidentException(String message, int errorCode,
			Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		
	}

	public CloseRemedyIncidentException(String message, int errorCode,
			Throwable cause) {
		super(message, errorCode, cause);
		
	}

	public CloseRemedyIncidentException(String message, int errorCode) {
		super(message, errorCode);
		
	}

	public CloseRemedyIncidentException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CloseRemedyIncidentException(String message) {
		super(message);
		
	}

}
