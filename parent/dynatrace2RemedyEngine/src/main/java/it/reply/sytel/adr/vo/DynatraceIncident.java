package it.reply.sytel.adr.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class DynatraceIncident implements Serializable{
//	ID                     INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
//	name                   VARCHAR(250),
//	heatfield              VARCHAR(250),
//	state                  VARCHAR(250),
//	startEvent             TIMESTAMP,
//	duration               VARCHAR(250),
//	endEvent               TIMESTAMP,
//	source                 VARCHAR(250),
//	session                VARCHAR(250),
//	confirmed_by           VARCHAR(250),
//	confirmation           VARCHAR(250),
//	sensitivity            VARCHAR(250),
//	conditions             VARCHAR(250),
//	thresholds             VARCHAR(250),
//	actions                VARCHAR(250),
//	measures               VARCHAR(250),
//	dataIns                TIMESTAMP,
//	dataUpdate             TIMESTAMP,
//	remedyTicketID         VARCHAR(250),
//	remedyTicketIDStatus   VARCHAR(250),
//	remedyTicketIDStatus   TIMESTAMP,	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 368213996196622701L;
	
	int id;
	private DynatraceIncidentKey dynatraceIncidentKey;
	
	private String heatfield;
	private String state;
	private String duration;
	private Timestamp endEvent;
	private String source;
	private String session;
	private String confimed_by;
	private String confirmation;
	private String sensitivity;
	private String conditions;
	private String thresholds;
	private String actions;
	private String measures;
	private Timestamp dataIns;
	private Timestamp dataUpdate;
	private String remedyTicketID;
	private String remedyTicketIDStatus;
	private Timestamp remedyTicketCreateDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public DynatraceIncidentKey getDynatraceIncidentKey() {
		return dynatraceIncidentKey;
	}
	public void setDynatraceIncidentKey(DynatraceIncidentKey dynatraceIncidentKey) {
		this.dynatraceIncidentKey = dynatraceIncidentKey;
	}
	
	public String getHeatfield() {
		return heatfield;
	}
	public void setHeatfield(String heatfield) {
		this.heatfield = heatfield;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Timestamp getEndEvent() {
		return endEvent;
	}
	public void setEndEvent(Timestamp endEvent) {
		this.endEvent = endEvent;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getConfimed_by() {
		return confimed_by;
	}
	public void setConfimed_by(String confimed_by) {
		this.confimed_by = confimed_by;
	}
	public String getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	public String getSensitivity() {
		return sensitivity;
	}
	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getThresholds() {
		return thresholds;
	}
	public void setThresholds(String thresholds) {
		this.thresholds = thresholds;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public String getMeasures() {
		return measures;
	}
	public void setMeasures(String measures) {
		this.measures = measures;
	}
	public Timestamp getDataIns() {
		return dataIns;
	}
	public void setDataIns(Timestamp dataIns) {
		this.dataIns = dataIns;
	}
	public Timestamp getDataUpdate() {
		return dataUpdate;
	}
	public void setDataUpdate(Timestamp dataUpdate) {
		this.dataUpdate = dataUpdate;
	}
	public String getRemedyTicketID() {
		return remedyTicketID;
	}
	public void setRemedyTicketID(String remedyTicketID) {
		this.remedyTicketID = remedyTicketID;
	}
	public String getRemedyTicketIDStatus() {
		return remedyTicketIDStatus;
	}
	public void setRemedyTicketIDStatus(String remedyTicketIDStatus) {
		this.remedyTicketIDStatus = remedyTicketIDStatus;
	}
	public Timestamp getRemedyTicketCreateDate() {
		return remedyTicketCreateDate;
	}
	public void setRemedyTicketCreateDate(Timestamp remedyTicketCreateDate) {
		this.remedyTicketCreateDate = remedyTicketCreateDate;
	}
	@Override
	public String toString() {
		return "DynatraceIncident [id=" + id + ", dynatraceIncidentKey=" + dynatraceIncidentKey + ", heatfield="
				+ heatfield + ", state=" + state + ", duration=" + duration + ", endEvent=" + endEvent + ", source="
				+ source + ", session=" + session + ", confimed_by=" + confimed_by + ", confirmation=" + confirmation
				+ ", sensitivity=" + sensitivity + ", conditions=" + conditions + ", thresholds=" + thresholds
				+ ", actions=" + actions + ", measures=" + measures + ", dataIns=" + dataIns + ", dataUpdate="
				+ dataUpdate + ", remedyTicketID=" + remedyTicketID + ", remedyTicketIDStatus=" + remedyTicketIDStatus
				+ ", remedyTicketCreateDate=" + remedyTicketCreateDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + ((conditions == null) ? 0 : conditions.hashCode());
		result = prime * result + ((confimed_by == null) ? 0 : confimed_by.hashCode());
		result = prime * result + ((confirmation == null) ? 0 : confirmation.hashCode());
		result = prime * result + ((dataIns == null) ? 0 : dataIns.hashCode());
		result = prime * result + ((dataUpdate == null) ? 0 : dataUpdate.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((dynatraceIncidentKey == null) ? 0 : dynatraceIncidentKey.hashCode());
		result = prime * result + ((endEvent == null) ? 0 : endEvent.hashCode());
		result = prime * result + ((heatfield == null) ? 0 : heatfield.hashCode());
		result = prime * result + id;
		result = prime * result + ((measures == null) ? 0 : measures.hashCode());
		result = prime * result + ((remedyTicketCreateDate == null) ? 0 : remedyTicketCreateDate.hashCode());
		result = prime * result + ((remedyTicketID == null) ? 0 : remedyTicketID.hashCode());
		result = prime * result + ((remedyTicketIDStatus == null) ? 0 : remedyTicketIDStatus.hashCode());
		result = prime * result + ((sensitivity == null) ? 0 : sensitivity.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((thresholds == null) ? 0 : thresholds.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DynatraceIncident other = (DynatraceIncident) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (conditions == null) {
			if (other.conditions != null)
				return false;
		} else if (!conditions.equals(other.conditions))
			return false;
		if (confimed_by == null) {
			if (other.confimed_by != null)
				return false;
		} else if (!confimed_by.equals(other.confimed_by))
			return false;
		if (confirmation == null) {
			if (other.confirmation != null)
				return false;
		} else if (!confirmation.equals(other.confirmation))
			return false;
		if (dataIns == null) {
			if (other.dataIns != null)
				return false;
		} else if (!dataIns.equals(other.dataIns))
			return false;
		if (dataUpdate == null) {
			if (other.dataUpdate != null)
				return false;
		} else if (!dataUpdate.equals(other.dataUpdate))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (dynatraceIncidentKey == null) {
			if (other.dynatraceIncidentKey != null)
				return false;
		} else if (!dynatraceIncidentKey.equals(other.dynatraceIncidentKey))
			return false;
		if (endEvent == null) {
			if (other.endEvent != null)
				return false;
		} else if (!endEvent.equals(other.endEvent))
			return false;
		if (heatfield == null) {
			if (other.heatfield != null)
				return false;
		} else if (!heatfield.equals(other.heatfield))
			return false;
		if (id != other.id)
			return false;
		if (measures == null) {
			if (other.measures != null)
				return false;
		} else if (!measures.equals(other.measures))
			return false;
		if (remedyTicketCreateDate == null) {
			if (other.remedyTicketCreateDate != null)
				return false;
		} else if (!remedyTicketCreateDate.equals(other.remedyTicketCreateDate))
			return false;
		if (remedyTicketID == null) {
			if (other.remedyTicketID != null)
				return false;
		} else if (!remedyTicketID.equals(other.remedyTicketID))
			return false;
		if (remedyTicketIDStatus == null) {
			if (other.remedyTicketIDStatus != null)
				return false;
		} else if (!remedyTicketIDStatus.equals(other.remedyTicketIDStatus))
			return false;
		if (sensitivity == null) {
			if (other.sensitivity != null)
				return false;
		} else if (!sensitivity.equals(other.sensitivity))
			return false;
		if (session == null) {
			if (other.session != null)
				return false;
		} else if (!session.equals(other.session))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (thresholds == null) {
			if (other.thresholds != null)
				return false;
		} else if (!thresholds.equals(other.thresholds))
			return false;
		return true;
	}
	
	
	
}
