package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CouponData {	
	private String couponId;
	private String productId;
	private String allocationId;
	private String campaignId;
	private String customerId;
	private String campaignCode;
	private String couponNo;
	private Date purchaseDate;
	private Date redeemDate;
	private Date startDate;
	private Date endDate;
	private String couponName;
	private String couponStatus;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String productNote1;
	private String productNote2;
	private String productNote3;
	private Double sellingPrice;
	private Double orginalPrice;
	private String productDesc;
	private String productImageurl;
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCouponNo() {
		return couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getRedeemDate() {
		return redeemDate;
	}
	public void setRedeemDate(Date redeemDate) {
		this.redeemDate = redeemDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponStatus() {
		return couponStatus;
	}
	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getProductNote1() {
		return productNote1;
	}
	public void setProductNote1(String productNote1) {
		this.productNote1 = productNote1;
	}
	public String getProductNote2() {
		return productNote2;
	}
	public void setProductNote2(String productNote2) {
		this.productNote2 = productNote2;
	}
	public String getProductNote3() {
		return productNote3;
	}
	public void setProductNote3(String productNote3) {
		this.productNote3 = productNote3;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public Double getOrginalPrice() {
		return orginalPrice;
	}
	public void setOrginalPrice(Double orginalPrice) {
		this.orginalPrice = orginalPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductImageurl() {
		return productImageurl;
	}
	public void setProductImageurl(String productImageurl) {
		this.productImageurl = productImageurl;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	
	
}
