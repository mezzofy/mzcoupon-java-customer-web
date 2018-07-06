package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampaignImageData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignImageModel {
	private CampaignImageData campaignimage;

	public CampaignImageData getCampaignimage() {
		return campaignimage;
	}

	public void setCampaignimage(CampaignImageData campaignimage) {
		this.campaignimage = campaignimage;
	}
	
}
