package it.reply.sytel.adr.dynatraceClient.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class RestClientException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5147501738870090948L;

	public RestClientException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public RestClientException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public RestClientException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}

	public RestClientException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RestClientException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
