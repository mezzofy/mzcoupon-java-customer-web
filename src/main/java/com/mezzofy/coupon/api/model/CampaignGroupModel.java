package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampGrpData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignGroupModel {
	private CampGrpData campaigngroup;
	private List<CampaignGroupDtlModel>  campGrpDetails;
	
	public CampGrpData getCampaigngroup() {
		return campaigngroup;
	}

	public void setCampaigngroup(CampGrpData campaigngroup) {
		this.campaigngroup = campaigngroup;
	}

	public List<CampaignGroupDtlModel> getCampGrpDetails() {
		return campGrpDetails;
	}

	public void setCampGrpDetails(List<CampaignGroupDtlModel> campGrpDetails) {
		this.campGrpDetails = campGrpDetails;
	}

	

	
}
