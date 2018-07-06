package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.mezzofy.coupon.data.CouponData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CouponModel {
	private CouponData coupon;

	public CouponData getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponData coupon) {
		this.coupon = coupon;
	}
	
}
