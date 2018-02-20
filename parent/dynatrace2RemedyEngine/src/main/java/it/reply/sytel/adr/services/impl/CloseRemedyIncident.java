package it.reply.sytel.adr.services.impl;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.services.exc.CloseRemedyIncidentException;

public class CloseRemedyIncident extends AbstractService {

	public CloseRemedyIncident() {
		super(CloseRemedyIncident.class.getName());
		log = EtlLogger.getLogger(getClass());

	}

	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			
			//prendere dalla tabella tutti gli inc che hanno RemedyInNcidentID
			//prendere tutti i ticket con la data di lastupdate minore dell'ultima datalastupdate
			//cancellare i record
			
			//N.B.
			//eventualemente chiudere il ticket su remedy utilizzando l'id dell'incident
			
			return env;

		
		} catch (Exception e) {
			throw new CloseRemedyIncidentException(
					"Exception on CloseRemedyIncidentException", e);
		}
	}

	
}

