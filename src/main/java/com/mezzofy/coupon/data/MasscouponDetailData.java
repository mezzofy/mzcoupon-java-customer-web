package com.mezzofy.coupon.data;


import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MasscouponDetailData {

	private String massId;
	private String campaignId;
	private Integer qty;
	public String getMassId() {
		return massId;
	}
	public void setMassId(String massId) {
		this.massId = massId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
