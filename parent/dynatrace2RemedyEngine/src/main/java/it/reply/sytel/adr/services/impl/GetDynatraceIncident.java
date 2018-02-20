package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.services.exc.GetDynatraceIncidentException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class GetDynatraceIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	
	
	public GetDynatraceIncident() {
		super(GetDynatraceIncident.class.getName());
		log = EtlLogger.getLogger(getClass());
	}
	
	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			
			//scheda parametro begin
			Map<String , Object> configMap = (Map<String , Object>)getContext().getConfigMap();
			Map<String,String> dashboardUrlMap = (Map<String,String>)configMap.get(ADRConstants.DASHBOARD_URLS_MAP);
			Set<String> appName = dashboardUrlMap.keySet();
			
			for (Iterator<String> iterator = appName.iterator(); iterator.hasNext();) {
				String appUrl = (String) iterator.next();
				log.debug("the URL for app:["+appUrl+"] is ["+dashboardUrlMap.get(appUrl)+"]");
			}
			
			//Per ogni APP DashBoard
			//1-get XML buffer from Dynatrace 
			//IncidentType
			//			Incident1
			//			InNcident2
			//2- Popola Mappa con JavaBean incident
			//
			//3-select per Incident1 
			//          se non è presente 
			//						inserisci con data ins e data lastupdate
			//          altrimenti 
			//                      aggiorna data lastupdate
			//						
			//
			
//Tabella
//DynatraceIncidentID - name - source - start - end - duration - RemedyIncidentID - DataIns - DataLastUpdate - RemedyDataIncident
//
			
			
			//get the xml dashboard from REST Service 
			
			
			DynatraceIncident dynatraceIncident = buildDynatraceMock();
			
			if( !incidentDAO.alreadyExistsDynatraceIncident(dynatraceIncident.getDynatraceIncidentKey())) {
				incidentDAO.insertDynatraceIncident(dynatraceIncident);
				log.debug("Incident inserted");
			}else
				log.debug("Incident alreay Exists");
			
			return env;

		
		} catch (Exception e) {
			throw new GetDynatraceIncidentException(
					"Exception on GetDynatraceIncident", e);
		}
	}

	
	private void buildVOFromIncidentDynatrace(){
		//DashboardreportDocument
	}

	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}

	private DynatraceIncident buildDynatraceMock() {
		
		String name="prova";
		
		DynatraceIncident dynatraceIncident = new DynatraceIncident();
		
		DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
		dynatraceIncidentKey.setName(name);
		dynatraceIncidentKey.setStartEvent(new Timestamp(System.currentTimeMillis()));
		dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
		
		Timestamp now = new Timestamp(System.currentTimeMillis());
		dynatraceIncident.setDataIns(now);
		dynatraceIncident.setDataUpdate(now);
		
		return dynatraceIncident;
	}
	
	
}

