package com.mezzofy.coupon.data;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.api.model.CampaignImageModel;
import com.mezzofy.coupon.api.model.CampaignSiteModel;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignMarketData {
private String countryCode;
private String countryName;
private String merchantName;
private String campaignId;
private String merchantId;
private String productId;
private String productmerchantId;
private String campaignCode;
private String campaignType;
private String brand;	
private String campaignName;
private String campaignDesc;
private Double sellingPrice;
private Double orginalPrice;
private String campaignTc;
private String campaignStatus;
private Integer dailyLimit;
private String dailyLimitType;
private Integer packQty;	
private Integer totalRedeem;	
private Integer allocationCount;
private String startDate;
private String endDate;
private String couponUrl;
private String passbookUrl;
private String dayFilter;
private int page;
private String currency;
private Integer expiryDays;
private Date fromDate;
private Date toDate;
private int issuedcoupon;
private int redeemcoupon;
private int allocationcoupon;
private int ratecoupon;
private String hashCode;	
private Date createdOn;
private int distance;
private String outletDistance;	
private String expirydue; 
private String expiryname;	
private String txBrand;
private String campaignNote1;
private String campaignNote2;
private String campaignNote3;	
private String campaignRemark;
private String pickup;
private String delivery;
private String booking;
private String outcall;
private String typeService;
private String youtubeUrl;
private String videoUrl;
private String emailStaff;
private String couponOver;
private String campaignUuid;
private int redemptionQuota;
private String onlineRedeem;
private String onlineShopUrl;
private int availableCoupon;
private String qrUrl;
private String openTime;
private String closeTime;
private String monday;
private String tuesday;
private String wednesday;
private String thursday;
private String friday;
private String saturday;
private String sunday;
private String mondayOpen;
private String mondayClose;
private String tuesdayOpen;
private String tuesdayClose;
private String wednesdayOpen;
private String wednesdayClose;
private String thursdayOpen;
private String thursdayClose;
private String fridayOpen;
private String fridayClose;
private String saturdayOpen;
private String saturdayClose;
private String sundayOpen;
private String sundayClose;
private String gtin;
private String publish;
private String reviewUrl;

private List<CampaignImageModel> campaignimages;
private List<CampaignSiteModel> sites;

public String getCampaignId() {
	return campaignId;
}

public void setCampaignId(String campaignId) {
	this.campaignId = campaignId;
}

public String getMerchantId() {
	return merchantId;
}

public void setMerchantId(String merchantId) {
	this.merchantId = merchantId;
}

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public String getProductmerchantId() {
	return productmerchantId;
}

public void setProductmerchantId(String productmerchantId) {
	this.productmerchantId = productmerchantId;
}

public String getCampaignCode() {
	return campaignCode;
}

public void setCampaignCode(String campaignCode) {
	this.campaignCode = campaignCode;
}

public String getCampaignType() {
	return campaignType;
}

public void setCampaignType(String campaignType) {
	this.campaignType = campaignType;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getCampaignName() {
	return campaignName;
}

public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}

public String getCampaignDesc() {
	return campaignDesc;
}

public void setCampaignDesc(String campaignDesc) {
	this.campaignDesc = campaignDesc;
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

public String getCampaignTc() {
	return campaignTc;
}

public void setCampaignTc(String campaignTc) {
	this.campaignTc = campaignTc;
}

public String getCampaignStatus() {
	return campaignStatus;
}

public void setCampaignStatus(String campaignStatus) {
	this.campaignStatus = campaignStatus;
}

public Integer getDailyLimit() {
	return dailyLimit;
}

public void setDailyLimit(Integer dailyLimit) {
	this.dailyLimit = dailyLimit;
}

public Integer getPackQty() {
	return packQty;
}

public void setPackQty(Integer packQty) {
	this.packQty = packQty;
}

public String getEmailStaff() {
	return emailStaff;
}

public void setEmailStaff(String emailStaff) {
	this.emailStaff = emailStaff;
}

public String getCouponOver() {
	return couponOver;
}

public void setCouponOver(String couponOver) {
	this.couponOver = couponOver;
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



public String getExpirydue() {
	return expirydue;
}

public void setExpirydue(String expirydue) {
	this.expirydue = expirydue;
}

public String getExpiryname() {
	return expiryname;
}

public void setExpiryname(String expiryname) {
	this.expiryname = expiryname;
}

public Integer getTotalRedeem() {
	return totalRedeem;
}

public void setTotalRedeem(Integer totalRedeem) {
	this.totalRedeem = totalRedeem;
}

public Integer getAllocationCount() {
	return allocationCount;
}

public void setAllocationCount(Integer allocationCount) {
	this.allocationCount = allocationCount;
}



public String getHashCode() {
	return hashCode;
}

public void setHashCode(String hashCode) {
	this.hashCode = hashCode;
}

public String getCampaignRemark() {
	return campaignRemark;
}

public void setCampaignRemark(String campaignRemark) {
	this.campaignRemark = campaignRemark;
}

public String getOpenTime() {
	return openTime;
}

public void setOpenTime(String openTime) {
	this.openTime = openTime;
}

public String getCloseTime() {
	return closeTime;
}

public void setCloseTime(String closeTime) {
	this.closeTime = closeTime;
}

public String getMonday() {
	return monday;
}

public void setMonday(String monday) {
	this.monday = monday;
}

public String getTuesday() {
	return tuesday;
}

public void setTuesday(String tuesday) {
	this.tuesday = tuesday;
}

public String getWednesday() {
	return wednesday;
}

public void setWednesday(String wednesday) {
	this.wednesday = wednesday;
}

public String getThursday() {
	return thursday;
}

public void setThursday(String thursday) {
	this.thursday = thursday;
}

public String getFriday() {
	return friday;
}

public void setFriday(String friday) {
	this.friday = friday;
}

public String getSaturday() {
	return saturday;
}

public void setSaturday(String saturday) {
	this.saturday = saturday;
}

public String getSunday() {
	return sunday;
}

public void setSunday(String sunday) {
	this.sunday = sunday;
}

public String getTxBrand() {
	return txBrand;
}

public void setTxBrand(String txBrand) {
	this.txBrand = txBrand;
}

public String getCampaignNote1() {
	return campaignNote1;
}

public void setCampaignNote1(String campaignNote1) {
	this.campaignNote1 = campaignNote1;
}

public String getCampaignNote2() {
	return campaignNote2;
}

public void setCampaignNote2(String campaignNote2) {
	this.campaignNote2 = campaignNote2;
}

public String getCampaignNote3() {
	return campaignNote3;
}

public void setCampaignNote3(String campaignNote3) {
	this.campaignNote3 = campaignNote3;
}

public Date getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}

public String getMondayOpen() {
	return mondayOpen;
}

public void setMondayOpen(String mondayOpen) {
	this.mondayOpen = mondayOpen;
}

public String getMondayClose() {
	return mondayClose;
}

public void setMondayClose(String mondayClose) {
	this.mondayClose = mondayClose;
}

public String getTuesdayOpen() {
	return tuesdayOpen;
}

public void setTuesdayOpen(String tuesdayOpen) {
	this.tuesdayOpen = tuesdayOpen;
}

public String getTuesdayClose() {
	return tuesdayClose;
}

public void setTuesdayClose(String tuesdayClose) {
	this.tuesdayClose = tuesdayClose;
}

public String getWednesdayOpen() {
	return wednesdayOpen;
}

public void setWednesdayOpen(String wednesdayOpen) {
	this.wednesdayOpen = wednesdayOpen;
}

public String getWednesdayClose() {
	return wednesdayClose;
}

public void setWednesdayClose(String wednesdayClose) {
	this.wednesdayClose = wednesdayClose;
}

public String getThursdayOpen() {
	return thursdayOpen;
}

public void setThursdayOpen(String thursdayOpen) {
	this.thursdayOpen = thursdayOpen;
}

public String getThursdayClose() {
	return thursdayClose;
}

public void setThursdayClose(String thursdayClose) {
	this.thursdayClose = thursdayClose;
}

public String getFridayOpen() {
	return fridayOpen;
}

public void setFridayOpen(String fridayOpen) {
	this.fridayOpen = fridayOpen;
}

public String getFridayClose() {
	return fridayClose;
}

public void setFridayClose(String fridayClose) {
	this.fridayClose = fridayClose;
}

public String getSaturdayOpen() {
	return saturdayOpen;
}

public void setSaturdayOpen(String saturdayOpen) {
	this.saturdayOpen = saturdayOpen;
}

public String getSaturdayClose() {
	return saturdayClose;
}

public void setSaturdayClose(String saturdayClose) {
	this.saturdayClose = saturdayClose;
}

public String getSundayOpen() {
	return sundayOpen;
}

public void setSundayOpen(String sundayOpen) {
	this.sundayOpen = sundayOpen;
}

public String getSundayClose() {
	return sundayClose;
}

public void setSundayClose(String sundayClose) {
	this.sundayClose = sundayClose;
}

public String getCampaignUuid() {
	return campaignUuid;
}

public void setCampaignUuid(String campaignUuid) {
	this.campaignUuid = campaignUuid;
}

public String getPickup() {
	return pickup;
}

public void setPickup(String pickup) {
	this.pickup = pickup;
}

public String getDelivery() {
	return delivery;
}

public void setDelivery(String delivery) {
	this.delivery = delivery;
}

public String getBooking() {
	return booking;
}

public void setBooking(String booking) {
	this.booking = booking;
}

public String getOutcall() {
	return outcall;
}

public void setOutcall(String outcall) {
	this.outcall = outcall;
}

public String getTypeService() {
	return typeService;
}

public void setTypeService(String typeService) {
	this.typeService = typeService;
}

public String getReviewUrl() {
	return reviewUrl;
}

public void setReviewUrl(String reviewUrl) {
	this.reviewUrl = reviewUrl;
}

public String getVideoUrl() {
	return videoUrl;
}

public void setVideoUrl(String videoUrl) {
	this.videoUrl = videoUrl;
}

public List<CampaignImageModel> getCampaignimages() {
	return campaignimages;
}

public void setCampaignimages(List<CampaignImageModel> campaignimages) {
	this.campaignimages = campaignimages;
}

public List<CampaignSiteModel> getSites() {
	return sites;
}

public void setSites(List<CampaignSiteModel> sites) {
	this.sites = sites;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public String getCouponUrl() {
	return couponUrl;
}

public void setCouponUrl(String couponUrl) {
	this.couponUrl = couponUrl;
}

public String getPassbookUrl() {
	return passbookUrl;
}

public void setPassbookUrl(String passbookUrl) {
	this.passbookUrl = passbookUrl;
}

public int getRatecoupon() {
	return ratecoupon;
}

public void setRatecoupon(int ratecoupon) {
	this.ratecoupon = ratecoupon;
}

public int getIssuedcoupon() {
	return issuedcoupon;
}

public void setIssuedcoupon(int issuedcoupon) {
	this.issuedcoupon = issuedcoupon;
}

public int getRedeemcoupon() {
	return redeemcoupon;
}

public void setRedeemcoupon(int redeemcoupon) {
	this.redeemcoupon = redeemcoupon;
}

public int getAllocationcoupon() {
	return allocationcoupon;
}

public void setAllocationcoupon(int allocationcoupon) {
	this.allocationcoupon = allocationcoupon;
}

public int getDistance() {
	return distance;
}

public void setDistance(int distance) {
	this.distance = distance;
}

public String getOutletDistance() {
	return outletDistance;
}

public void setOutletDistance(String outletDistance) {
	this.outletDistance = outletDistance;
}

public String getDailyLimitType() {
	return dailyLimitType;
}

public void setDailyLimitType(String dailyLimitType) {
	this.dailyLimitType = dailyLimitType;
}

public int getRedemptionQuota() {
	return redemptionQuota;
}

public void setRedemptionQuota(int redemptionQuota) {
	this.redemptionQuota = redemptionQuota;
}

public String getOnlineRedeem() {
	return onlineRedeem;
}

public void setOnlineRedeem(String onlineRedeem) {
	this.onlineRedeem = onlineRedeem;
}

public String getOnlineShopUrl() {
	return onlineShopUrl;
}

public void setOnlineShopUrl(String onlineShopUrl) {
	this.onlineShopUrl = onlineShopUrl;
}

public int getAvailableCoupon() {
	return availableCoupon;
}

public void setAvailableCoupon(int availableCoupon) {
	this.availableCoupon = availableCoupon;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}

public String getCountryName() {
	return countryName;
}

public void setCountryName(String countryName) {
	this.countryName = countryName;
}

public String getMerchantName() {
	return merchantName;
}

public void setMerchantName(String merchantName) {
	this.merchantName = merchantName;
}

public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}

public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}

public String getYoutubeUrl() {
	return youtubeUrl;
}

public void setYoutubeUrl(String youtubeUrl) {
	this.youtubeUrl = youtubeUrl;
}

public String getQrUrl() {
	return qrUrl;
}

public void setQrUrl(String qrUrl) {
	this.qrUrl = qrUrl;
}

public String getGtin() {
	return gtin;
}

public void setGtin(String gtin) {
	this.gtin = gtin;
}

public String getPublish() {
	return publish;
}

public void setPublish(String publish) {
	this.publish = publish;
}


}
