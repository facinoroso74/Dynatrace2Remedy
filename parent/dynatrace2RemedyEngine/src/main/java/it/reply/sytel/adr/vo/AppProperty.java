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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + ((appPwd == null) ? 0 : appPwd.hashCode());
		result = prime * result + ((appUrl == null) ? 0 : appUrl.hashCode());
		result = prime * result + ((appUsr == null) ? 0 : appUsr.hashCode());
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
		return true;
	}
	
	@Override
	public String toString() {
		return "AppProperty [appName=" + appName + ", appUrl=" + appUrl + ", appUsr=" + appUsr + ", appPwd=" + appPwd
				+ "]";
	}
	
	
}
