package it.reply.sytel.adr.dynatraceClient.imp;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.dynatraceClient.DynatraceClient;
import it.reply.sytel.adr.dynatraceClient.RestClient;
import it.reply.sytel.adr.dynatraceClient.exc.BuildMapDynatraceIncidentFromDashboardreportException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;
import noNamespace.DashboardreportDocument;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet.Incidentoverviewrecords.Incidentoverviewrecord;

public class DynatraceClientImpl implements DynatraceClient{

	private RestClient restClient;
	private Logger log = EtlLogger.getLogger(getClass());
	
	@Override
	public Map<DynatraceIncidentKey, DynatraceIncident> getDynatraceIncidents(String dashboardName,String appUrl,String user,String pwd) {
		String dashboardreportBuffer = restClient.invokeRestService(appUrl, user, pwd);
		return buildMapDynatraceIncidentFromDashboardreport(dashboardName,dashboardreportBuffer);
	}
	
	private boolean checkIncidentoverviewrecordToWork(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord) {
		if(incidentoverviewrecord.getName()!=null &&  incidentoverviewrecord.getStart()!=null)
			return true;
		return false;
	}
	
	private void loopOverIncidentoverviewrecordArray(String dashboardName,Map<DynatraceIncidentKey, DynatraceIncident> dynatraceIncidentMap,noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArray) {
		
		//log.debug("loopOverIncidentoverviewrecordArray calling...");
		
		for (int i = 0; i < incidentoverviewrecordArray.length; i++) {
			
			if(checkIncidentoverviewrecordToWork(incidentoverviewrecordArray[i])) {
				if(log.isDebugEnabled())
					log.debug("------ALLARME-----:["+incidentoverviewrecordArray[i].xmlText()+"]");
				DynatraceIncident dynatraceIncident = buildDynatraceIncident(dashboardName,incidentoverviewrecordArray[i]);
				dynatraceIncidentMap.put(dynatraceIncident.getDynatraceIncidentKey(), dynatraceIncident);
			}
			
			noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArrayChildren = incidentoverviewrecordArray[i].getIncidentoverviewrecordArray();

		if(incidentoverviewrecordArrayChildren!=null);
			loopOverIncidentoverviewrecordArray(dashboardName,dynatraceIncidentMap,incidentoverviewrecordArrayChildren);
		}
		
		//log.debug("loopOverIncidentoverviewrecordArray calling... DONE");
	}

	
	private DynatraceIncident buildDynatraceIncident(String dashboardName, noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord) {
		DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
		dynatraceIncidentKey.setName(incidentoverviewrecord.getName());
		dynatraceIncidentKey.setStartEvent(new Timestamp(incidentoverviewrecord.getStart().getTimeInMillis()));
		dynatraceIncidentKey.setDashboarName(dashboardName);
		
		DynatraceIncident dynatraceIncident = new DynatraceIncident();
		dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
		
		dynatraceIncident.setHeatfield(incidentoverviewrecord.getHeatfield());
		dynatraceIncident.setState(incidentoverviewrecord.getState());
		dynatraceIncident.setDuration(incidentoverviewrecord.getDuration());
		if(incidentoverviewrecord.getEnd()!=null)
			dynatraceIncident.setEndEvent(new Timestamp(incidentoverviewrecord.getEnd().getTimeInMillis()));
		dynatraceIncident.setSource(incidentoverviewrecord.getSource());
		dynatraceIncident.setSession(incidentoverviewrecord.getSession());
		dynatraceIncident.setConfimed_by(incidentoverviewrecord.getConfirmedBy());
		dynatraceIncident.setSensitivity(incidentoverviewrecord.getSensitivity());
		dynatraceIncident.setConditions(incidentoverviewrecord.getConditions());
		dynatraceIncident.setThresholds(incidentoverviewrecord.getThresholds());
		dynatraceIncident.setActions(incidentoverviewrecord.getActions());
		dynatraceIncident.setMeasures(incidentoverviewrecord.getMeasures());
		dynatraceIncident.setMeasures(incidentoverviewrecord.getMeasures());
	
		return dynatraceIncident;
	}
	
	private Map<DynatraceIncidentKey, DynatraceIncident> buildMapDynatraceIncidentFromDashboardreport(String dashboardName,String dashboardreportBuffer) {
		try {
			
			Map<DynatraceIncidentKey, DynatraceIncident> dynatraceIncidentMap = new HashMap<DynatraceIncidentKey, DynatraceIncident>();
			DashboardreportDocument dashboardreportDocument = DashboardreportDocument.Factory.parse(dashboardreportBuffer);
			Incidentsoverviewdashlet[] incidentsoverviewdashletsArr= dashboardreportDocument.getDashboardreport().getData().getIncidentsoverviewdashletArray();
			if(incidentsoverviewdashletsArr.length!=0){
				Incidentoverviewrecord[] incidentoverviewrecordArray = incidentsoverviewdashletsArr[0].getIncidentoverviewrecords().getIncidentoverviewrecordArray();
				//devo ciclare opportunamente l'array incidentoverviewrecordArray
				//e prendere tutti i nodi che presentano gli attributi name e start
				//quando li trovo devo popolare la mappa
				loopOverIncidentoverviewrecordArray(dashboardName,dynatraceIncidentMap,incidentoverviewrecordArray[0].getIncidentoverviewrecordArray());
			}

			return dynatraceIncidentMap;
			
		} catch (XmlException e) {
			throw new BuildMapDynatraceIncidentFromDashboardreportException("Exception on building the map from content:["+dashboardreportBuffer+"]");
		}
	}
	
	public RestClient getRestClient() {
		return restClient;
	}

	public void setRestClient(RestClient restClient) {
		this.restClient = restClient;
	}

	//effettuo la chiamata REST
	//faccio il parsing nell'oggetto DashboardreportDocument
	//scorro l'oggetto per prendere tutti gli oggetti incidentoverviewrecord che hanno come proprietà name/start/source valorizzati
	//creare un mappa di java object di tipo DynatraceIncident

//	public static void main(String[] args) {
//		DynatraceClient dynatraceClient = new DynatraceClientImpl();
//		RestClientImpl restClientImpl = new RestClientImpl();
//		dynatraceClient.setRestClient(restClientImpl);
//		Map<DynatraceIncidentKey, DynatraceIncident> map = dynatraceClient.getDynatraceIncidents("https://dynatracereply.adr.it:8021/rest/management/dashboard/IncidentDashboard", "Remedy_Integration", "remedy");
//		Set<DynatraceIncidentKey> keys = map.keySet();
//		for (Iterator<DynatraceIncidentKey> iterator = keys.iterator(); iterator.hasNext();) {
//			DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator.next();
//			System.out.println("dynatraceIncident-->"+ map.get(dynatraceIncidentKey));
//		}
//	}
	
//	public static void main(String[] args) {
//		DynatraceClient dynatraceClient = new DynatraceClientImpl();
//		RestClientImpl restClientImpl = new RestClientImpl();
//		dynatraceClient.setRestClient(restClientImpl);
//		Map<DynatraceIncidentKey, DynatraceIncident> map = dynatraceClient.getDynatraceIncidents("https://dynatrace-sub-CA:8021/rest/management/dashboard/ADBM_TEST_REMEDY_INTEGRATION", "admin", "adradmin01");
//		Set<DynatraceIncidentKey> keys = map.keySet();
//		for (Iterator<DynatraceIncidentKey> iterator = keys.iterator(); iterator.hasNext();) {
//			DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator.next();
//			System.out.println("dynatraceIncident-->"+ map.get(dynatraceIncidentKey));
//		}
//	}
}
