package com.mezzofy.coupon.data;

import java.util.Date;

public class PromoData {	
	private String promoId;
	private String merchantId;
	private String promoType;
	private Date updatedOn;
	private String promoCode;
	private String status;
	private int connectCount;
	public String getPromoId() {
		return promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getPromoType() {
		return promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getConnectCount() {
		return connectCount;
	}
	public void setConnectCount(int connectCount) {
		this.connectCount = connectCount;
	}
	
	

}
