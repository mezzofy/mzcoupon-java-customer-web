package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.MasscouponDetailData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MassCouponDetailModel {
	private MasscouponDetailData masscoupondetail;

	public MasscouponDetailData getMasscoupondetail() {
		return masscoupondetail;
	}

	public void setMasscoupondetail(MasscouponDetailData masscoupondetail) {
		this.masscoupondetail = masscoupondetail;
	}
	
	
}
