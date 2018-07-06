package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignDashboardData {
	
	private int totalSize;
	private int activeSize;
	private int inactiveSize;
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public int getActiveSize() {
		return activeSize;
	}
	public void setActiveSize(int activeSize) {
		this.activeSize = activeSize;
	}
	public int getInactiveSize() {
		return inactiveSize;
	}
	public void setInactiveSize(int inactiveSize) {
		this.inactiveSize = inactiveSize;
	}
	
	

}
