package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BranchIOData {
	
	public String branch_key;
	public String feature;
	public String campaign;
	public String url;
	public BranchIODtlData data;
	
	
	public String getBranch_key() {
		return branch_key;
	}
	public void setBranch_key(String branch_key) {
		this.branch_key = branch_key;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public BranchIODtlData getData() {
		return data;
	}
	public void setData(BranchIODtlData data) {
		this.data = data;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
