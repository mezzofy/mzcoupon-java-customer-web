package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionRequestListModel {
	List<RedemptionRequestModel> requests=null;
	SizeModel size;
	public List<RedemptionRequestModel> getRequests() {
		return requests;
	}
	public void setRequests(List<RedemptionRequestModel> requests) {
		this.requests = requests;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	
}
