package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignImageData {

	private String pimageId;
	private String campaignId;
	private String campaignImage;
	private Integer imageSeq;
	private String imageStatus;
	private Date updatedOn;
	
	public String getPimageId() {
		return pimageId;
	}
	public void setPimageId(String pimageId) {
		this.pimageId = pimageId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignImage() {
		return campaignImage;
	}
	public void setCampaignImage(String campaignImage) {
		this.campaignImage = campaignImage;
	}
	public Integer getImageSeq() {
		return imageSeq;
	}
	public void setImageSeq(Integer imageSeq) {
		this.imageSeq = imageSeq;
	}
	
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getImageStatus() {
		return imageStatus;
	}
	public void setImageStatus(String imageStatus) {
		this.imageStatus = imageStatus;
	}
	
	
}
