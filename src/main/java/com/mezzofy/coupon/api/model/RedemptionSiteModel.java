package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.RedemptionSiteData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionSiteModel {
	
	private RedemptionSiteData site;


	public void setSite(RedemptionSiteData site) {
		this.site = site;
	}


	public RedemptionSiteData getSite() {
		return site;
	}

	
	
}
