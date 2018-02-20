package it.reply.sytel.adr.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class DynatraceIncidentKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7645669701405133864L;

	private String name;
	private Timestamp startEvent;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getStartEvent() {
		return startEvent;
	}
	public void setStartEvent(Timestamp startEvent) {
		this.startEvent = startEvent;
	}
	@Override
	public String toString() {
		return "DynatraceIncidentKey [name=" + name + ", startEvent=" + startEvent + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startEvent == null) ? 0 : startEvent.hashCode());
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
		DynatraceIncidentKey other = (DynatraceIncidentKey) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startEvent == null) {
			if (other.startEvent != null)
				return false;
		} else if (!startEvent.equals(other.startEvent))
			return false;
		return true;
	}
	
}
