/*
 * Created on 3-ott-2005
 * @author MPantaleone 2005
 */
package it.reply.sytel.adr.core.services.service;

import it.reply.sytel.adr.core.exc.CoreNestedException;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;

/**
 * @author MPantaleone
 * 
 */
public interface CoreService {
    
    /**
     * <b>execute the operation of service</b>
     * @param env Enviromnent of Module
     * @return
     * @throws CoreNestedException is a RuntimeException
     */
    public Enviromnent execute(Enviromnent env);
    
}
