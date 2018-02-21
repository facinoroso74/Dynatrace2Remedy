package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.impl.common.SystemCache;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.remedyAdapter.impl.RemedyWSClientImpl;
import it.reply.sytel.adr.services.exc.CreateRemedyIncidentException;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class CreateRemedyIncident extends AbstractService {

	public CreateRemedyIncident() {
		super(CreateRemedyIncident.class.getName());
		log = EtlLogger.getLogger(getClass());

	}

	private IncidentDAO incidentDAO;
	private RemedyClient remedyClient;
	
	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {

			//probabilmente vanno presi da condigurazione in base all'APP
			String firstName;       //andrebbe preso da DynatraceIncident o da configurazione
			String impact;          //1-Extensive/Widespread,2-Significant/Large,3-Moderate/Limited,4-Minor/Localized
			String lastName;        //andrebbe preso da DynatraceIncident o da configurazione
			String reported_source; //Direct Input,Email,External Escalation,Fax,Self Service,Systems Management,Phone,Voice Mail,Walk In,Web,Other,BMC Impact Manager Event
			String serivceType;     //User Service Restoration,User Service Request,Infrastructure Restoration,Infrastructure Event
			String remedyStatus=null;          //Assigned,In Progress,Pending,Resolved,Closed,Cancelled
			String urgency;         //1-Critical,2-High,3-Medium,4-Low
			String summary;         //andrebbe preso da DynatraceIncident 
			
			//prendere dalla tabella tutti gli inc che non hanno RemedyInNcidentID
			//creare incident su Remedy ed aggiornare la tabella chiamando il WS
			List<DynatraceIncident> dynatraceIncidentList = incidentDAO.getDynatraceIncidentWithoutRemedyTicketID();
			
			for (Iterator<DynatraceIncident> iterator = dynatraceIncidentList.iterator(); iterator.hasNext();) {
				DynatraceIncident dynatraceIncident = (DynatraceIncident) iterator.next();
				//create incident
				String remedyIncidentId = remedyClient.createIncident(dynatraceIncident);
				Timestamp now = new Timestamp(System.currentTimeMillis());
				dynatraceIncident.setRemedyTicketCreateDate(now);
				dynatraceIncident.setRemedyTicketID(remedyIncidentId);
				dynatraceIncident.setRemedyTicketIDStatus(remedyStatus);
				
				incidentDAO.updateDynatraceIncidentAfterRemedyCall(dynatraceIncident);
			}
			
			return env;

		
		} catch (Exception e) {
			throw new CreateRemedyIncidentException(
					"Exception on CreateRemedyIncident", e);
		}
	}

	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}

	public RemedyClient getRemedyClient() {
		return remedyClient;
	}

	public void setRemedyClient(RemedyClient remedyClient) {
		this.remedyClient = remedyClient;
	}
	
}

