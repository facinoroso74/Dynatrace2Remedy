package it.reply.sytel.adr.dao;

import java.sql.Timestamp;
import java.util.List;

import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public interface IncidentDAO {

	public void insertDynatraceIncident(DynatraceIncident dynatraceIncident);
	
	public DynatraceIncident getDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey);
	
	public List<DynatraceIncident> getDynatraceIncidentToClose(Timestamp startToCompare);
	
	public boolean alreadyExistsDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey);
	
	public void updateDynatraceIncident(DynatraceIncident dynatraceIncident);
	
	public void updateDynatraceIncidentAfterRemedyCall(DynatraceIncidentKey dynatraceIncidentKey,String remedyIncidentID,Timestamp remedyIncidentIDCreateDate,String remedyIncidentStatus);
}
