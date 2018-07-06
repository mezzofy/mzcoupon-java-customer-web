package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MassCouponListModel {
	private List<MassCouponModel> masscoupons;

	public List<MassCouponModel> getMasscoupons() {
		return masscoupons;
	}

	public void setMasscoupons(List<MassCouponModel> masscoupons) {
		this.masscoupons = masscoupons;
	}
	
}
