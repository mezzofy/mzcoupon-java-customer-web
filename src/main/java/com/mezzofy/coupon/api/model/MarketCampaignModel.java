package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampGrpDetailData;
import com.mezzofy.coupon.data.CampaignMarketData;


@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MarketCampaignModel {
private CampaignMarketData campaign;
private List<CampGrpDetailData> groups;

public CampaignMarketData getCampaign() {
	return campaign;
}

public void setCampaign(CampaignMarketData campaign) {
	this.campaign = campaign;
}

public List<CampGrpDetailData> getGroups() {
	return groups;
}

public void setGroups(List<CampGrpDetailData> groups) {
	this.groups = groups;
}
	
	
}
