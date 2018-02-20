package it.reply.sytel.adr.services.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class CreateRemedyIncidentException extends CoreNestedException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2755229322756867111L;

	public CreateRemedyIncidentException(String message, int errorCode,
			Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		
	}

	public CreateRemedyIncidentException(String message, int errorCode,
			Throwable cause) {
		super(message, errorCode, cause);
		
	}

	public CreateRemedyIncidentException(String message, int errorCode) {
		super(message, errorCode);
		
	}

	public CreateRemedyIncidentException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CreateRemedyIncidentException(String message) {
		super(message);
		
	}

}
