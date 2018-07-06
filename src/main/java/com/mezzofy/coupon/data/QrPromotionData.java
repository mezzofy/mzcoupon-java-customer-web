package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class QrPromotionData {
	private String assignId;
	private String playId;
	private String qrType;
	private String simplePromoId;
	private String merchantId;
	private String merchantName;
	private Date fromDate;
	private Date toDate;
	private String simpleCode;
	private String simpleName;
	private String simpleDesc;
	private String simpleImage;
	private Double orginalPrice;
	private Double sellingPrice;
	private String buyUrl;
	private String currency;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String updatedBy;
	private String simpleStatus;
	
	
	public String getQrType() {
		return qrType;
	}
	public void setQrType(String qrType) {
		this.qrType = qrType;
	}
	public String getSimplePromoId() {
		return simplePromoId;
	}
	public void setSimplePromoId(String simplePromoId) {
		this.simplePromoId = simplePromoId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getSimpleCode() {
		return simpleCode;
	}
	public void setSimpleCode(String simpleCode) {
		this.simpleCode = simpleCode;
	}
	public String getSimpleName() {
		return simpleName;
	}
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	public String getSimpleDesc() {
		return simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}
	public String getSimpleImage() {
		return simpleImage;
	}
	public void setSimpleImage(String simpleImage) {
		this.simpleImage = simpleImage;
	}
	public Double getOrginalPrice() {
		return orginalPrice;
	}
	public void setOrginalPrice(Double orginalPrice) {
		this.orginalPrice = orginalPrice;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getBuyUrl() {
		return buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getSimpleStatus() {
		return simpleStatus;
	}
	public void setSimpleStatus(String simpleStatus) {
		this.simpleStatus = simpleStatus;
	}
	public String getAssignId() {
		return assignId;
	}
	public void setAssignId(String assignId) {
		this.assignId = assignId;
	}
	public String getPlayId() {
		return playId;
	}
	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	

}
