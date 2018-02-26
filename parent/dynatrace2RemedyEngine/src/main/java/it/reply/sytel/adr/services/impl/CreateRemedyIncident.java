package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.xmlbeans.impl.common.SystemCache;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyBadValueFieldException;
import it.reply.sytel.adr.remedyAdapter.impl.RemedyWSClientImpl;
import it.reply.sytel.adr.services.exc.CreateRemedyIncidentException;
import it.reply.sytel.adr.vo.AppProperty;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.RemedyAutenticationInfo;

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
			
			Map<String , Object> configMap = (Map<String , Object>)getContext().getConfigMap();
			Map<String,Map<String,AppProperty>> dashboardAppPropertyMap= (Map<String,Map<String,AppProperty>>)configMap.get(ADRConstants.DASHBOARD_NAMES);
			Map<String, Object> map = (Map<String , Object>)getContext().getConfigMap();
			
			RemedyAutenticationInfo remedyAutenticationInfo = (RemedyAutenticationInfo)map.get(ADRConstants.REMEDY_AUTHENTICATION_INFO);
			
			List<DynatraceIncident> dynatraceIncidentList = incidentDAO.getDynatraceIncidentWithoutRemedyTicketID();
			
			log.info("Number of incident to create on Remedy:["+dynatraceIncidentList.size()+"]");
			
			for (Iterator<DynatraceIncident> iterator = dynatraceIncidentList.iterator(); iterator.hasNext();) {
				
				DynatraceIncident dynatraceIncident = (DynatraceIncident) iterator.next();
				AppProperty appProperty=((AppProperty)dashboardAppPropertyMap.get(dynatraceIncident.getDynatraceIncidentKey().getDashboarName()));
				
				//create incident
				createTicketRemedy(dynatraceIncident, remedyAutenticationInfo, appProperty);
				
//				String remedyIncidentId = remedyClient.createIncident(dynatraceIncident,remedyAutenticationInfo,appProperty);
//				
//
//				Timestamp now = new Timestamp(System.currentTimeMillis());
//				dynatraceIncident.setRemedyTicketCreateDate(now);
//				dynatraceIncident.setRemedyTicketID(remedyIncidentId);
//				dynatraceIncident.setRemedyTicketIDStatus(appProperty.getTicketStatus());
//				
//				log.debug("Response from Remedy ----> remedyIncidentId:["+remedyIncidentId+"]");
//				
//				incidentDAO.updateDynatraceIncidentAfterRemedyCall(dynatraceIncident);
			}
			
			return env;

		
		} catch (Exception e) {
			throw new CreateRemedyIncidentException(
					"Exception on CreateRemedyIncident", e);
		}
	}
	
	

	private void createTicketRemedy(DynatraceIncident dynatraceIncident,RemedyAutenticationInfo remedyAutenticationInfo,AppProperty appProperty) {
		//create incident
		try {
			String remedyIncidentId = remedyClient.createIncident(dynatraceIncident,remedyAutenticationInfo,appProperty);
	
			Timestamp now = new Timestamp(System.currentTimeMillis());
			dynatraceIncident.setRemedyTicketCreateDate(now);
			dynatraceIncident.setRemedyTicketID(remedyIncidentId);
			dynatraceIncident.setRemedyTicketIDStatus(appProperty.getTicketStatus());
			
			if(log.isDebugEnabled())
				log.debug("Response from Remedy ----> remedyIncidentId:["+remedyIncidentId+"]");
			
			incidentDAO.updateDynatraceIncidentAfterRemedyCall(dynatraceIncident);
		
		}catch (RemedyBadValueFieldException e) {
			log.error("exception on create the ticket remedy for DynatraceIncident:["+dynatraceIncident+"]",e);
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

