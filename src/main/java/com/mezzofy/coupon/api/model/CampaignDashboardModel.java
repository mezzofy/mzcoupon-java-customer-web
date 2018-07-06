package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampaignDashboardData;
import com.mezzofy.coupon.data.MerchantData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignDashboardModel {
	
	private List<MerchantData> merchants;
	private CampaignDashboardData dashboard;

	public CampaignDashboardData getDashboard() {
		return dashboard;
	}

	public void setDashboard(CampaignDashboardData dashboard) {
		this.dashboard = dashboard;
	}

	public List<MerchantData> getMerchants() {
		return merchants;
	}

	public void setMerchants(List<MerchantData> merchants) {
		this.merchants = merchants;
	}

	
	
}
