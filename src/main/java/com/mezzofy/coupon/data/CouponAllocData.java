package com.mezzofy.coupon.data;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CouponAllocData {
	private String allocationId;
	private String campaignId;
	private Integer allocationCount;
	private String allocationRefer;
	private String allocationRemark;
	private Date updatedOn;
	private int redeemed;
	private int issued;
	private int expired;
	private String allocationStatus;
	
	public String getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public Integer getAllocationCount() {
		return allocationCount;
	}
	public void setAllocationCount(Integer allocationCount) {
		this.allocationCount = allocationCount;
	}
	public String getAllocationRefer() {
		return allocationRefer;
	}
	public void setAllocationRefer(String allocationRefer) {
		this.allocationRefer = allocationRefer;
	}
	public String getAllocationRemark() {
		return allocationRemark;
	}
	public void setAllocationRemark(String allocationRemark) {
		this.allocationRemark = allocationRemark;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	public int getIssued() {
		return issued;
	}
	public void setIssued(int issued) {
		this.issued = issued;
	}
	public int getExpired() {
		return expired;
	}
	public void setExpired(int expired) {
		this.expired = expired;
	}
	public int getRedeemed() {
		return redeemed;
	}
	public void setRedeemed(int redeemed) {
		this.redeemed = redeemed;
	}
	public String getAllocationStatus() {
		return allocationStatus;
	}
	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
	}
	
	
	
}
