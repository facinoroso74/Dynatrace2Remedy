package it.reply.sytel.adr.springContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.reply.sytel.adr.common.log.EtlLogger;

public class SpringContext {

	private Map<String,ApplicationContext> cache = Collections.synchronizedMap(new HashMap<String,ApplicationContext>());
	private static final String SPRING_CTX_FILE="applicationContextADR.xml";
	private static SpringContext instance = new SpringContext();
	
	private boolean toReload = false;
	private Logger log = EtlLogger.getLogger(getClass());
	
	public static SpringContext getInstance() {
		return instance;
	}
	 
	public ApplicationContext getSpringContext() {
			ApplicationContext ctx=null;
			if(!toReload){
				ctx = (ApplicationContext)cache.get("SPRING_CTX");
				if(ctx==null){
					ctx = new ClassPathXmlApplicationContext(SPRING_CTX_FILE);
					cache.put("SPRING_CTX", ctx);		
				}
			}else{
				//nel caso del reload creo un ctx nuovo 
				//e lo metto in mappa al posto di quello di prima
				//quello in uso dovrebbe essere distrutto in quanto
				//il Thread termina il suo ciclo di vita e 
				//la mappa non fa più riferimento all'instanza 
				log.debug("reloading of context");
				ctx = new ClassPathXmlApplicationContext(SPRING_CTX_FILE);
				cache.put("SPRING_CTX", ctx);
				setToReload(false);
			}
			return ctx;
	}

	public boolean isToReload() {
		return toReload;
	}

	public void setToReload(boolean toReload) {
		log.info("reloading the configuration toReload:["+toReload+"]");
		this.toReload = toReload;
	}
	
}
