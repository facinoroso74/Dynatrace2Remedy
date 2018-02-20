package it.reply.sytel.adr.dynatraceClient;

import java.util.Map;

import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public interface DynatraceClient {

	//metodo per restituire una mappa di oggetti dopo aver scansionato la risposta della chiamata REST
	public Map<DynatraceIncidentKey, DynatraceIncident> getDynatraceIncidents(String appUrl,String user,String pwd);
}
