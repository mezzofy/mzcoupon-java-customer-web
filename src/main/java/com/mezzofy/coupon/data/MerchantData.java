package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MerchantData {

	private String countryCode;	
	private String countryName;
	private String merchantId;
	private String merchantCode;
	private String merchantType;
	private String merchantName;
	private String merchantDesc;
	private String merchantLogourl;
	private String merchantImageurl;
	private String merchantEmail;
	private String merchantHotline;
	private String merchantTc;
	private String merchantStatus;
	private String merchantTimezone;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String profileStatus;
	private String channelCode;
	private Date expiryDate;
	private String currency;
	private String websiteUrl;
	private String onlineShopUrl;
	private String youtubeUrl;
	private String facebookUrl;
	private String twitterUrl;
	private String whatsupUrl;
	private String instagramUrl;
	private String couponUrl;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantDesc() {
		return merchantDesc;
	}
	public void setMerchantDesc(String merchantDesc) {
		this.merchantDesc = merchantDesc;
	}
	public String getMerchantLogourl() {
		return merchantLogourl;
	}
	public void setMerchantLogourl(String merchantLogourl) {
		this.merchantLogourl = merchantLogourl;
	}
	public String getMerchantImageurl() {
		return merchantImageurl;
	}
	public void setMerchantImageurl(String merchantImageurl) {
		this.merchantImageurl = merchantImageurl;
	}
	
	public String getMerchantTc() {
		return merchantTc;
	}
	public void setMerchantTc(String merchantTc) {
		this.merchantTc = merchantTc;
	}
	public String getMerchantStatus() {
		return merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	public String getMerchantTimezone() {
		return merchantTimezone;
	}
	public void setMerchantTimezone(String merchantTimezone) {
		this.merchantTimezone = merchantTimezone;
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
	public String getProfileStatus() {
		return profileStatus;
	}
	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMerchantHotline() {
		return merchantHotline;
	}
	public void setMerchantHotline(String merchantHotline) {
		this.merchantHotline = merchantHotline;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getOnlineShopUrl() {
		return onlineShopUrl;
	}
	public void setOnlineShopUrl(String onlineShopUrl) {
		this.onlineShopUrl = onlineShopUrl;
	}
	public String getYoutubeUrl() {
		return youtubeUrl;
	}
	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}
	public String getFacebookUrl() {
		return facebookUrl;
	}
	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}
	public String getTwitterUrl() {
		return twitterUrl;
	}
	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getWhatsupUrl() {
		return whatsupUrl;
	}
	public void setWhatsupUrl(String whatsupUrl) {
		this.whatsupUrl = whatsupUrl;
	}
	public String getInstagramUrl() {
		return instagramUrl;
	}
	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}
	public String getCouponUrl() {
		return couponUrl;
	}
	public void setCouponUrl(String couponUrl) {
		this.couponUrl = couponUrl;
	}
	
	
	
	
	
}
