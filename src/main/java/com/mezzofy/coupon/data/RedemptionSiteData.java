package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionSiteData {
	
	private String redemptionSiteId;
	private String siteId;
	private String redemptionId;
	private String siteName;
	private String siteAddress;
	private Double siteLatitude;
	private Double siteLongitude;
	private String siteLocation;
	private String siteContact;
	private String siteDesc;
	private String siteEmailId;
	private String siteImageurl;
	private String siteStatus;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String updatedBy;
	private String requestStatus;
	public String getRedemptionSiteId() {
		return redemptionSiteId;
	}
	public void setRedemptionSiteId(String redemptionSiteId) {
		this.redemptionSiteId = redemptionSiteId;
	}
	public String getRedemptionId() {
		return redemptionId;
	}
	public void setRedemptionId(String redemptionId) {
		this.redemptionId = redemptionId;
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
	public String getSiteImageurl() {
		return siteImageurl;
	}
	public void setSiteImageurl(String siteImageurl) {
		this.siteImageurl = siteImageurl;
	}
	public String getSiteStatus() {
		return siteStatus;
	}
	public void setSiteStatus(String siteStatus) {
		this.siteStatus = siteStatus;
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
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	
	

}
