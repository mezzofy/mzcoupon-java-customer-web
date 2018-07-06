package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PromoBasicData {
	private String simplePromoId;
	private String merchantId;
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
	private String videoUrl;
	private String dayFilter;
	private Integer expiryDays;
	private String email;
	private String mobile;
	private String firstName;
	private String country;
	private String lastName;
	private String address;
	private String gender;
	private String image;
	private String allField;
	private String actionText;
	private String userName;
	private String customerParticipate;
	private String campaignUrl;
	private String qrUrl;
	private String dob;
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
	public String getSimpleStatus() {
		return simpleStatus;
	}
	public void setSimpleStatus(String simpleStatus) {
		this.simpleStatus = simpleStatus;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAllField() {
		return allField;
	}
	public void setAllField(String allField) {
		this.allField = allField;
	}
	public String getActionText() {
		return actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDayFilter() {
		return dayFilter;
	}
	public void setDayFilter(String dayFilter) {
		this.dayFilter = dayFilter;
	}
	public Integer getExpiryDays() {
		return expiryDays;
	}
	public void setExpiryDays(Integer expiryDays) {
		this.expiryDays = expiryDays;
	}
	public String getCustomerParticipate() {
		return customerParticipate;
	}
	public void setCustomerParticipate(String customerParticipate) {
		this.customerParticipate = customerParticipate;
	}
	public String getCampaignUrl() {
		return campaignUrl;
	}
	public void setCampaignUrl(String campaignUrl) {
		this.campaignUrl = campaignUrl;
	}
	public String getQrUrl() {
		return qrUrl;
	}
	public void setQrUrl(String qrUrl) {
		this.qrUrl = qrUrl;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	



}
