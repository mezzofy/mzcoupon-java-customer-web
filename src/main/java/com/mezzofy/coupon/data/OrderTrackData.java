package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderTrackData {
	private String trackId;
	private String merchantId;
	private String trackName;
	private String trackStatus;
	private Integer trackSeq;
	private String notificationMsg;
	private String notificationStatus;
	private Date updatedOn;
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getTrackStatus() {
		return trackStatus;
	}
	public void setTrackStatus(String trackStatus) {
		this.trackStatus = trackStatus;
	}
	public Integer getTrackSeq() {
		return trackSeq;
	}
	public void setTrackSeq(Integer trackSeq) {
		this.trackSeq = trackSeq;
	}
	public String getNotificationMsg() {
		return notificationMsg;
	}
	public void setNotificationMsg(String notificationMsg) {
		this.notificationMsg = notificationMsg;
	}
	public String getNotificationStatus() {
		return notificationStatus;
	}
	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
