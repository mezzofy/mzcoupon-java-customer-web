package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CustomerMemberCouponData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerMemberCouponModel {
	
	private CustomerMemberCouponData coupon;

	public CustomerMemberCouponData getCoupon() {
		return coupon;
	}

	public void setCoupon(CustomerMemberCouponData coupon) {
		this.coupon = coupon;
	}

}
