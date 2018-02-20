package it.reply.sytel.adr.common.log;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;

public class EtlLogger {

	//private final static String CONFIGURATION_FILE = "etl-log4j.xml";
	private static boolean initialized      = false;
	private static Object  initializedMutex = new Object();
	
	
	public static Logger getLogger(Class cls) {
        return getLogger(cls, null);
    }
	
	public static Logger getLogger(String name) {
        return getLogger(name, null);
    }
	
	@SuppressWarnings("unchecked")
	public static Logger getLogger(Class cls, LoggerFactory loggerFactory) {
		return getLogger(cls.getName(), loggerFactory);
	}
	
	 public static Logger getLogger(String logger, LoggerFactory loggerFactory) {

		 if(!isInitialized()) {
			 System.out.println("getLogger Call init()");
			 init();
	     }
	        
	     return loggerFactory != null ?
	               Logger.getLogger(logger, loggerFactory) :
	               Logger.getLogger(logger);
	 }
	 
	 private static void init() {
		 try{
			 System.out.println("Check isInitialized Log4j ");
			 synchronized(initializedMutex) {
				 if(!isInitialized()) {
					 System.out.println("Initialization Log4j ...");
					 Document document = new LogFile().getDocumentFromLogFile();
					 DOMConfigurator.configure(document.getDocumentElement());
					 setInitialized(true);
					 System.out.println("Initialization Log4j ... Done");
				 }else{
					 System.out.println("Initialization already done Log4j ");
				 }
			 }
			 
		 }catch (Exception e) {
			 e.printStackTrace();
		}
	 }
	 
	 private static boolean isInitialized() {
			 return initialized;
	 }
	 
	 /**
	     * Accessor setter method for field initialized
	     */
	 private static void setInitialized(boolean value) {
			 initialized = value;
	     
	 }
	    
	 
}
