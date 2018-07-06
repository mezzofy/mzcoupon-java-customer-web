package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MarketCampaignListModel {
	private List<MarketCampaignModel> campaigns;
	private List<CampaignGroupModel> campaigngroups;
	private SizeModel size;
	
	public List<MarketCampaignModel> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<MarketCampaignModel> campaigns) {
		this.campaigns = campaigns;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}

	public List<CampaignGroupModel> getCampaigngroups() {
		return campaigngroups;
	}

	public void setCampaigngroups(List<CampaignGroupModel> campaigngroups) {
		this.campaigngroups = campaigngroups;
	}
	
}
