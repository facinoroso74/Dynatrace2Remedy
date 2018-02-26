package it.reply.sytel.adr.remedyAdapter;

import it.reply.sytel.adr.vo.AppProperty;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.RemedyAutenticationInfo;

public interface RemedyClient {

	public String createIncident(DynatraceIncident dynatraceIncident,RemedyAutenticationInfo remedyAutenticationInfo,AppProperty appProperty);
	
}
