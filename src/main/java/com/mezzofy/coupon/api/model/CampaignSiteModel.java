package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampaignSiteData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignSiteModel {
	private CampaignSiteData site;

	public CampaignSiteData getSite() {
		return site;
	}

	public void setSite(CampaignSiteData site) {
		this.site = site;
	}
	
	
	
}
