package it.reply.sytel.adr.services.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class GetDynatraceIncidentException extends CoreNestedException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3433343014453717570L;

	public GetDynatraceIncidentException(String message, int errorCode,
			Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		
	}

	public GetDynatraceIncidentException(String message, int errorCode,
			Throwable cause) {
		super(message, errorCode, cause);
		
	}

	public GetDynatraceIncidentException(String message, int errorCode) {
		super(message, errorCode);
		
	}

	public GetDynatraceIncidentException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public GetDynatraceIncidentException(String message) {
		super(message);
		
	}

}
