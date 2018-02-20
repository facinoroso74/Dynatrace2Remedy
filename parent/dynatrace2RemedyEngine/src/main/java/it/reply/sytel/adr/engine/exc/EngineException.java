package it.reply.sytel.adr.engine.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class EngineException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 355783849586697349L;

	public EngineException(String message, int errorCode, Throwable cause,
			int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public EngineException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public EngineException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}

	public EngineException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EngineException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
