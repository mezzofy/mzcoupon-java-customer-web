package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CouponAllocData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignAllocModel {
	private CouponAllocData couponalloc;
	public CouponAllocData getCouponalloc() {
		return couponalloc;
	}

	public void setCouponalloc(CouponAllocData couponalloc) {
		this.couponalloc = couponalloc;
	}
	
}
