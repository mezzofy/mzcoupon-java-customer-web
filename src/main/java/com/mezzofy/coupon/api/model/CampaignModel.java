package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampGrpDetailData;
import com.mezzofy.coupon.data.CampaignData;
import com.mezzofy.coupon.data.CampaignImageData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignModel {
	private CampaignData campaign;
	
	private List<CampGrpDetailData> groups;

	public CampaignData getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignData merchant) {
		this.campaign = merchant;
	}

	public List<CampGrpDetailData> getGroups() {
		return groups;
	}

	public void setGroups(List<CampGrpDetailData> groups) {
		this.groups = groups;
	}

	
	
}
