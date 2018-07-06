package com.mezzofy.coupon.data;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@XmlRootElement
public class PoDetailData {
	private String podtlId;
	private String productId;
	private String campaignId;
	private String poId;
	private String campaignName;
	private Double campaignPrice;
	private Double campaignQty;
	private Double campaignTotal;
	private String status;
	private Date updatedOn;
	public String getPodtlId() {
		return podtlId;
	}
	public void setPodtlId(String podtlId) {
		this.podtlId = podtlId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getPoId() {
		return poId;
	}
	public void setPoId(String poId) {
		this.poId = poId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public Double getCampaignPrice() {
		return campaignPrice;
	}
	public void setCampaignPrice(Double campaignPrice) {
		this.campaignPrice = campaignPrice;
	}
	public Double getCampaignQty() {
		return campaignQty;
	}
	public void setCampaignQty(Double campaignQty) {
		this.campaignQty = campaignQty;
	}
	public Double getCampaignTotal() {
		return campaignTotal;
	}
	public void setCampaignTotal(Double campaignTotal) {
		this.campaignTotal = campaignTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	
	
}
