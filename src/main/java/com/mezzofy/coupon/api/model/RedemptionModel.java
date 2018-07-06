package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.RedemptionData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionModel {
	private RedemptionData redemption;

	public RedemptionData getRedemption() {
		return redemption;
	}

	public void setRedemption(RedemptionData redemption) {
		this.redemption = redemption;
	}

}
