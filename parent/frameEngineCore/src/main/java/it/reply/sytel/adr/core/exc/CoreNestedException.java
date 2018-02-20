/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:02 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCommon/src/java/it/reply/sytel/xawes/exception/XAwesCoreNestedException.java,v 1.4 2010/07/06 14:12:02 m.pantaleone Exp $
 * $Id: XAwesCoreNestedException.java,v 1.4 2010/07/06 14:12:02 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.4 $
 * $State: Exp $
 */
package it.reply.sytel.adr.core.exc;

import java.io.PrintStream;
import java.io.PrintWriter;

public abstract class CoreNestedException extends RuntimeException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 4872481899115000500L;
	private Throwable rootCause;
    
   
    public void setRootCause(Throwable rootCause) {
        this.rootCause = rootCause;
    }

    /**
     * @param message
     * @param cause
     */
    public CoreNestedException(String message, Throwable cause) {
        super(message, cause);
        setRootCause(cause);
    }

    /**
     * @param message
     */
    public CoreNestedException(String message) {
        super(message);
        
    }
    
    public void printStackTrace(PrintStream ps) {
        if (rootCause == null) {
            super.printStackTrace(ps);
        } else {
            ps.println(this);
            rootCause.printStackTrace(ps);
        }
    }
    
    public void printStackTrace(PrintWriter pw) {
        if (rootCause == null) {
            super.printStackTrace(pw);
        } else {
            pw.println(this);
            rootCause.printStackTrace(pw);
        }
    }
    
    public void printStackTrace() {
        printStackTrace(System.err);
    }
    
    public String getMessage() {
        if (rootCause == null) {
            return super.getMessage();
        } else {
            return super.getMessage() + "; nested exception is: \n\t" +
            rootCause.toString();
        }
    }

 
    private int code;
    
    public Throwable getRootCause() {
        return rootCause;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
   	
	public CoreNestedException(String message, int errorCode,Throwable cause,int errorCodeThrowable) {
		super(message, cause);
		if(errorCodeThrowable==0)
			setCode(errorCode);
		else
			setCode(errorCodeThrowable);
	}
	
	public CoreNestedException(String message, int errorCode,Throwable cause) {
		super(message, cause);
		setCode(errorCode);
	}
	
	public CoreNestedException(String message, int errorCode) {
		super(message);
		setCode(errorCode);
	}
}

