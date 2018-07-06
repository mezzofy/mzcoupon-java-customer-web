package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.RedemptionDashboardData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionDashboardModel {
	private RedemptionDashboardData dashboard;

	public RedemptionDashboardData getDashboard() {
		return dashboard;
	}

	public void setDashboard(RedemptionDashboardData dashboard) {
		this.dashboard = dashboard;
	}
	
	
}
