package it.reply.sytel.adr.common.exception;

public class ExceptionUtils {

	public static Throwable getCause(Throwable e){
		if(e.getCause()!=null)
			return getCause(e.getCause());
		return e;
	}
	
}
