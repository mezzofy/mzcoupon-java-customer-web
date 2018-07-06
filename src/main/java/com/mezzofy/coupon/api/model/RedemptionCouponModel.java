package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.RedemptionCouponData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionCouponModel {
	
	private RedemptionCouponData coupon;
	public RedemptionCouponData getCoupon() {
		return coupon;
	}

	public void setCoupon(RedemptionCouponData coupon) {
		this.coupon = coupon;
	}
	
	

}
