package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionSiteListModel {

	private List<RedemptionSiteModel> sites;
	private SizeModel size;

	public List<RedemptionSiteModel> getSites() {
		return sites;
	}

	public void setSites(List<RedemptionSiteModel> sites) {
		this.sites = sites;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	
}
