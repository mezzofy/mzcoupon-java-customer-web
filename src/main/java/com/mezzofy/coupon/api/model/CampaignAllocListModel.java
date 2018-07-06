package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignAllocListModel {
	
private List<CampaignAllocModel> campaignallocs;
private SizeModel size;
public List<CampaignAllocModel> getCampaignallocs() {
	return campaignallocs;
}

public void setCampaignallocs(List<CampaignAllocModel> campaignallocs) {
	this.campaignallocs = campaignallocs;
}

public SizeModel getSize() {
	return size;
}

public void setSize(SizeModel size) {
	this.size = size;
}

}
