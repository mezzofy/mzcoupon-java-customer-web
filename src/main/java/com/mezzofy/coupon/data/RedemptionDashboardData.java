package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@XmlRootElement
public class RedemptionDashboardData {
	private int reqMerchantcount;
	private int reqCouponcount;
	private int allCouponcount;
	private int allMerchantcount;
	public int getReqMerchantcount() {
		return reqMerchantcount;
	}
	public void setReqMerchantcount(int reqMerchantcount) {
		this.reqMerchantcount = reqMerchantcount;
	}
	public int getReqCouponcount() {
		return reqCouponcount;
	}
	public void setReqCouponcount(int reqCouponcount) {
		this.reqCouponcount = reqCouponcount;
	}
	public int getAllCouponcount() {
		return allCouponcount;
	}
	public void setAllCouponcount(int allCouponcount) {
		this.allCouponcount = allCouponcount;
	}
	public int getAllMerchantcount() {
		return allMerchantcount;
	}
	public void setAllMerchantcount(int allMerchantcount) {
		this.allMerchantcount = allMerchantcount;
	}
	

}
