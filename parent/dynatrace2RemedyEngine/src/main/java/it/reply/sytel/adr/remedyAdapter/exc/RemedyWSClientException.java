package it.reply.sytel.adr.remedyAdapter.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class RemedyWSClientException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2741161614621186272L;

	public RemedyWSClientException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public RemedyWSClientException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public RemedyWSClientException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}

	public RemedyWSClientException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RemedyWSClientException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
