package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SiteTimeData {	
	private String sitetimeId;
	private String siteId;
	private Character sitetimeType;
	private String siteStartTime;
	private String siteEndTime;
	private String hashCode;
	private Date updatedOn;

	public String getSitetimeId() {
		return sitetimeId;
	}
	public void setSitetimeId(String sitetimeId) {
		this.sitetimeId = sitetimeId;
	}
	
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public Character getSitetimeType() {
		return sitetimeType;
	}
	public void setSitetimeType(Character sitetimeType) {
		this.sitetimeType = sitetimeType;
	}
	public String getSiteStartTime() {
		return siteStartTime;
	}
	public void setSiteStartTime(String siteStartTime) {
		this.siteStartTime = siteStartTime;
	}
	public String getSiteEndTime() {
		return siteEndTime;
	}
	public void setSiteEndTime(String siteEndTime) {
		this.siteEndTime = siteEndTime;
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
	

}
