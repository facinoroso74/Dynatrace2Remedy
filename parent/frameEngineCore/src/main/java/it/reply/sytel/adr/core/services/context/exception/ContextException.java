
package it.reply.sytel.adr.core.services.context.exception;

import it.reply.sytel.adr.core.exc.CoreNestedException;

/**
 * <b>FREContextException</b><br>
 * @author <b>Michele Pantaleone</b> 
 */
public class ContextException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3550273439598149715L;

	public ContextException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public ContextException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ContextException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

    
}
