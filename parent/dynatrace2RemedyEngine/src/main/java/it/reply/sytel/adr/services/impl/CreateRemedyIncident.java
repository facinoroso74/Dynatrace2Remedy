package it.reply.sytel.adr.services.impl;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.services.exc.CreateRemedyIncidentException;

public class CreateRemedyIncident extends AbstractService {

	public CreateRemedyIncident() {
		super(CreateRemedyIncident.class.getName());
		log = EtlLogger.getLogger(getClass());

	}

	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			
			//prendere dalla tabella tutti gli inc che non hanno RemedyInNcidentID
			//creare incident su Remedy ed aggiornare la tabella chiamando il WS
			
			return env;

		
		} catch (Exception e) {
			throw new CreateRemedyIncidentException(
					"Exception on CreateRemedyIncident", e);
		}
	}

	
}

