package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CouponListModel {
	private List<CouponModel> coupons;
	private SizeModel size;
	public List<CouponModel> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<CouponModel> coupons) {
		this.coupons = coupons;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
	
}
