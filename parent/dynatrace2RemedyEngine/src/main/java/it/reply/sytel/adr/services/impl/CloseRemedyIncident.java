package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.services.exc.CloseRemedyIncidentException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class CloseRemedyIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	
	public CloseRemedyIncident() {
		super(CloseRemedyIncident.class.getName());
		log = EtlLogger.getLogger(getClass());

	}

	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			Timestamp now = (Timestamp)env.get(ADRConstants.SYSDATE);
			
			//prendere tutti i ticket con la data di lastupdate minore dell'ultima datalastupdate
			//cancellare i record
			List<DynatraceIncidentKey> dynatraceIncidentKeyList = incidentDAO.getAllDynatraceIncidentNotMoreExist(now);
			
			for (Iterator<DynatraceIncidentKey> iterator = dynatraceIncidentKeyList.iterator(); iterator.hasNext();) {
				
				DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator.next();
				
				log.info("dynatraceIncident not more exist:["+dynatraceIncidentKey+"]");
				
				incidentDAO.deleteDynaraceIncident(dynatraceIncidentKey);
				
			}
			
			//N.B.
			//eventualemente chiudere il ticket su remedy utilizzando l'id dell'incident
			
			return env;

		
		} catch (Exception e) {
			throw new CloseRemedyIncidentException(
					"Exception on CloseRemedyIncidentException", e);
		}
	}
	

	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}

	
}

