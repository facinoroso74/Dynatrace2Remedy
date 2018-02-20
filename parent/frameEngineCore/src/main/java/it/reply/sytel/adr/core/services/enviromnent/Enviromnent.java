/*
 * Created on 3-ott-2005
 * @author MPantaleone 2005
 */
package it.reply.sytel.adr.core.services.enviromnent;


/**
 * <b>Enviromnent of Module</b>
 * 
 * @author M.Pantaleone
 */
public interface Enviromnent {
    
	
    /**
     * put the object into Enviromnent
     * @param intField
     * @param value
     */
    public void put(Integer intField,Object obj);
    
    /**
     * get the object from the Enviromnent
     * @param intField
     * @return
     */
    public Object get(Integer intField);
    
    /**
     * remove the object from enviromnent
     * @param intField
     */
    public void remove(Integer intField); 
    
}
