package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SimplePromoListModel {
	
	private List<SimplePromoModel> simplepromos;

	public List<SimplePromoModel> getSimplepromos() {
		return simplepromos;
	}

	public void setSimplepromos(List<SimplePromoModel> simplepromos) {
		this.simplepromos = simplepromos;
	}
	
	
	
}
