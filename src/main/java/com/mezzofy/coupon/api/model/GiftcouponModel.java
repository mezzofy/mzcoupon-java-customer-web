package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.GiftcouponData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GiftcouponModel {
	private GiftcouponData sharecoupon;

	public GiftcouponData getSharecoupon() {
		return sharecoupon;
	}

	public void setSharecoupon(GiftcouponData sharecoupon) {
		this.sharecoupon = sharecoupon;
	}


}
