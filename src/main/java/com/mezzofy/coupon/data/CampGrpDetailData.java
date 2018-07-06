package com.mezzofy.coupon.data;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampGrpDetailData {
	private String campaignId;
	private String campgrpId;
	private String campgrpdtlStatus;
	private String hashCode;

	private Date updatedOn;
	private String updatedBy;
	
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampgrpId() {
		return campgrpId;
	}
	public void setCampgrpId(String campgrpId) {
		this.campgrpId = campgrpId;
	}
	public String getCampgrpdtlStatus() {
		return campgrpdtlStatus;
	}
	public void setCampgrpdtlStatus(String campgrpdtlStatus) {
		this.campgrpdtlStatus = campgrpdtlStatus;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
}
