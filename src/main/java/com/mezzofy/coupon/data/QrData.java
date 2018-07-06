package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class QrData {
	private String qrId;
	private String qrCode;
	private String qrStatus;
	private String headerImage;
	private String footerImage;
	private String countryCode;
	private String locationDesc;
	private String location;
	private String gpsAddress;
	private String qrUrl;
	private String qrImage;
	private String qrDesc;
	private String targetUrl;
	private Double latitude;
	private Double longitude;
	private String createdBy;
	private Date createdOn;
	private Date updatedOn;
	private String countryName;
	private int connectCount;
	private String timeZone;
	public String getQrId() {
		return qrId;
	}
	public void setQrId(String qrId) {
		this.qrId = qrId;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrStatus() {
		return qrStatus;
	}
	public void setQrStatus(String qrStatus) {
		this.qrStatus = qrStatus;
	}
	public String getHeaderImage() {
		return headerImage;
	}
	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}
	public String getFooterImage() {
		return footerImage;
	}
	public void setFooterImage(String footerImage) {
		this.footerImage = footerImage;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLocationDesc() {
		return locationDesc;
	}
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGpsAddress() {
		return gpsAddress;
	}
	public void setGpsAddress(String gpsAddress) {
		this.gpsAddress = gpsAddress;
	}
	public String getQrUrl() {
		return qrUrl;
	}
	public void setQrUrl(String qrUrl) {
		this.qrUrl = qrUrl;
	}
	public String getQrDesc() {
		return qrDesc;
	}
	public void setQrDesc(String qrDesc) {
		this.qrDesc = qrDesc;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getTargetUrl() {
		return targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getQrImage() {
		return qrImage;
	}
	public void setQrImage(String qrImage) {
		this.qrImage = qrImage;
	}
	public int getConnectCount() {
		return connectCount;
	}
	public void setConnectCount(int connectCount) {
		this.connectCount = connectCount;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	
}
