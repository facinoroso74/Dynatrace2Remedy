package it.reply.sytel.adr.dynatraceClient.imp;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.dynatraceClient.DynatraceClient;
import it.reply.sytel.adr.dynatraceClient.RestClient;
import it.reply.sytel.adr.dynatraceClient.exc.BuildMapDynatraceIncidentFromDashboardreportException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;
import noNamespace.DashboardreportDocument;

public class DynatraceClientImp implements DynatraceClient{

	private RestClient restClient;
	private Logger log = EtlLogger.getLogger(getClass());
	
	@Override
	public Map<DynatraceIncidentKey, DynatraceIncident> getDynatraceIncidents(String appUrl,String user,String pwd) {
		String dashboardreportBuffer = restClient.invokeRestService(appUrl, user, pwd);
		return buildMapDynatraceIncidentFromDashboardreport(dashboardreportBuffer);
	}

	private Map<DynatraceIncidentKey, DynatraceIncident> buildMapDynatraceIncidentFromDashboardreport(String dashboardreportBuffer) {
		try {
			
			Map<DynatraceIncidentKey, DynatraceIncident> map = new HashMap<DynatraceIncidentKey, DynatraceIncident>();
			DashboardreportDocument dashboardreportDocument = DashboardreportDocument.Factory.parse(dashboardreportBuffer);
			//TODO
			//create the map
			log.debug("dashboardreportDocument.xmlText():[" + dashboardreportDocument.xmlText()+"]");
			
			return map;
			
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
	
}
