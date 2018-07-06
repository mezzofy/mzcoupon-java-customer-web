package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionData {
	private String redemptionId;
	private String redemptionName;
	private String redemptionEmail;
	private String redemptionPassword;
	private String redemptionLocation;
	private String redemptionAddress;
	private String redemptionMobile;
	private Double redemptionLatitude;
	private Double redemptionLongitude;
	private String redemptionStatus;
	private String siteId;
	public String getRedemptionId() {
		return redemptionId;
	}
	public void setRedemptionId(String redemptionId) {
		this.redemptionId = redemptionId;
	}
	public String getRedemptionName() {
		return redemptionName;
	}
	public void setRedemptionName(String redemptionName) {
		this.redemptionName = redemptionName;
	}
	public String getRedemptionEmail() {
		return redemptionEmail;
	}
	public void setRedemptionEmail(String redemptionEmail) {
		this.redemptionEmail = redemptionEmail;
	}
	public String getRedemptionPassword() {
		return redemptionPassword;
	}
	public void setRedemptionPassword(String redemptionPassword) {
		this.redemptionPassword = redemptionPassword;
	}
	public String getRedemptionAddress() {
		return redemptionAddress;
	}
	public void setRedemptionAddress(String redemptionAddress) {
		this.redemptionAddress = redemptionAddress;
	}
	public String getRedemptionMobile() {
		return redemptionMobile;
	}
	public void setRedemptionMobile(String redemptionMobile) {
		this.redemptionMobile = redemptionMobile;
	}
	public Double getRedemptionLatitude() {
		return redemptionLatitude;
	}
	public void setRedemptionLatitude(Double redemptionLatitude) {
		this.redemptionLatitude = redemptionLatitude;
	}
	public Double getRedemptionLongitude() {
		return redemptionLongitude;
	}
	public void setRedemptionLongitude(Double redemptionLongitude) {
		this.redemptionLongitude = redemptionLongitude;
	}
	public String getRedemptionStatus() {
		return redemptionStatus;
	}
	public void setRedemptionStatus(String redemptionStatus) {
		this.redemptionStatus = redemptionStatus;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getRedemptionLocation() {
		return redemptionLocation;
	}
	public void setRedemptionLocation(String redemptionLocation) {
		this.redemptionLocation = redemptionLocation;
	}
	
	
}
