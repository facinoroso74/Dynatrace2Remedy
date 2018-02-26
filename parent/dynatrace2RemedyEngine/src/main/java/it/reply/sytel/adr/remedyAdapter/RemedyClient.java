package it.reply.sytel.adr.remedyAdapter;

import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.RemedyAutenticationInfo;

public interface RemedyClient {

	public String createIncident(DynatraceIncident dynatraceIncident,
						RemedyAutenticationInfo remedyAutenticationInfo,
						String firstName,
						String impact,
						String lastName,
						String reported_source,
						String serviceType, 
						String ticketStatus,
						String urgency);
	
}
