package it.reply.sytel.adr.services.enviromnent;

import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;

import java.util.HashMap;
import java.util.Map;

public class ADREnvironment implements Enviromnent {

	public static final Integer GP01KT00MAP = new Integer(1);
	
	private Map<Integer,Object> map=new HashMap<Integer,Object>();
	
	public void put(Integer intField, Object obj) {
		map.put(intField, obj);
	}

	public Object get(Integer intField) {
		return map.get(intField);
	}

	public void remove(Integer intField) {
		map.remove(intField);
	}

	//Enviromnent
	//public static final Integer LIST_DLR_SEGNALAZIONI=new Integer(1);
		
		
}
