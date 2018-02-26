package it.reply.sytel.adr.vo;

import java.io.Serializable;

public class AppProperty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6536970156057711767L;
	private String appName;
	private String appUrl;
	private String appUsr;
	private String appPwd;
	
	private String firstName;
	private String impact;
	private String lastName;
	private String reportedSource;
	private String serviceType;
	private String ticketStatus;
	private String urgency;
	
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public String getAppUsr() {
		return appUsr;
	}
	public void setAppUsr(String appUsr) {
		this.appUsr = appUsr;
	}
	public String getAppPwd() {
		return appPwd;
	}
	public void setAppPwd(String appPwd) {
		this.appPwd = appPwd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getReportedSource() {
		return reportedSource;
	}
	public void setReportedSource(String reportedSource) {
		this.reportedSource = reportedSource;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + ((appPwd == null) ? 0 : appPwd.hashCode());
		result = prime * result + ((appUrl == null) ? 0 : appUrl.hashCode());
		result = prime * result + ((appUsr == null) ? 0 : appUsr.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((impact == null) ? 0 : impact.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((reportedSource == null) ? 0 : reportedSource.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((ticketStatus == null) ? 0 : ticketStatus.hashCode());
		result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
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
		AppProperty other = (AppProperty) obj;
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (appPwd == null) {
			if (other.appPwd != null)
				return false;
		} else if (!appPwd.equals(other.appPwd))
			return false;
		if (appUrl == null) {
			if (other.appUrl != null)
				return false;
		} else if (!appUrl.equals(other.appUrl))
			return false;
		if (appUsr == null) {
			if (other.appUsr != null)
				return false;
		} else if (!appUsr.equals(other.appUsr))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (impact == null) {
			if (other.impact != null)
				return false;
		} else if (!impact.equals(other.impact))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (reportedSource == null) {
			if (other.reportedSource != null)
				return false;
		} else if (!reportedSource.equals(other.reportedSource))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (ticketStatus == null) {
			if (other.ticketStatus != null)
				return false;
		} else if (!ticketStatus.equals(other.ticketStatus))
			return false;
		if (urgency == null) {
			if (other.urgency != null)
				return false;
		} else if (!urgency.equals(other.urgency))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AppProperty [appName=" + appName + ", appUrl=" + appUrl + ", appUsr=" + appUsr + ", appPwd=" + appPwd
				+ ", firstName=" + firstName + ", impact=" + impact + ", lastName=" + lastName + ", reportedSource="
				+ reportedSource + ", serviceType=" + serviceType + ", ticketStatus=" + ticketStatus + ", urgency="
				+ urgency + "]";
	}
	
	
	
	
}
