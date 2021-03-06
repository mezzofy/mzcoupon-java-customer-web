package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignGs1ListModel {
	private List<CampaignGs1Model> campaigns;	
	private SizeModel size;

	public List<CampaignGs1Model> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<CampaignGs1Model> campaigns) {
		this.campaigns = campaigns;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	
}
