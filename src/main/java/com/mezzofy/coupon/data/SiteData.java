package com.mezzofy.coupon.data;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SiteData {
	private String siteId;
	private String merchantId;
	private String siteName;
	private String siteAddress;
	private Double siteLatitude;
	private Double siteLongitude;
	private String siteLocation;
	private String siteContact;
	private String siteDesc;
	private String siteEmailId;
	private String siteDisplayWallet;
	private Integer siteSeqNo;
	private String siteImageurl;
	private String siteOnlineStatus;
	private String siteStatus;
	private String siteRedeemPass;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String updatedBy;
	private String locationId; 
	private String memberGln;
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteAddress() {
		return siteAddress;
	}
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}
	public Double getSiteLatitude() {
		return siteLatitude;
	}
	public void setSiteLatitude(Double siteLatitude) {
		this.siteLatitude = siteLatitude;
	}
	public Double getSiteLongitude() {
		return siteLongitude;
	}
	public void setSiteLongitude(Double siteLongitude) {
		this.siteLongitude = siteLongitude;
	}
	public String getSiteLocation() {
		return siteLocation;
	}
	public void setSiteLocation(String siteLocation) {
		this.siteLocation = siteLocation;
	}
	public String getSiteContact() {
		return siteContact;
	}
	public void setSiteContact(String siteContact) {
		this.siteContact = siteContact;
	}
	public String getSiteDesc() {
		return siteDesc;
	}
	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}
	public String getSiteEmailId() {
		return siteEmailId;
	}
	public void setSiteEmailId(String siteEmailId) {
		this.siteEmailId = siteEmailId;
	}
	public String getSiteDisplayWallet() {
		return siteDisplayWallet;
	}
	public void setSiteDisplayWallet(String siteDisplayWallet) {
		this.siteDisplayWallet = siteDisplayWallet;
	}
	public Integer getSiteSeqNo() {
		return siteSeqNo;
	}
	public void setSiteSeqNo(Integer siteSeqNo) {
		this.siteSeqNo = siteSeqNo;
	}
	public String getSiteImageurl() {
		return siteImageurl;
	}
	public void setSiteImageurl(String siteImageurl) {
		this.siteImageurl = siteImageurl;
	}
	
	public String getSiteOnlineStatus() {
		return siteOnlineStatus;
	}
	public void setSiteOnlineStatus(String siteOnlineStatus) {
		this.siteOnlineStatus = siteOnlineStatus;
	}
	public String getSiteStatus() {
		return siteStatus;
	}
	public void setSiteStatus(String siteStatus) {
		this.siteStatus = siteStatus;
	}
	public String getSiteRedeemPass() {
		return siteRedeemPass;
	}
	public void setSiteRedeemPass(String siteRedeemPass) {
		this.siteRedeemPass = siteRedeemPass;
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
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getMemberGln() {
		return memberGln;
	}
	public void setMemberGln(String memberGln) {
		this.memberGln = memberGln;
	}
	
}
