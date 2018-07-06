package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.OrderModifierData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)	
public class OrderModifierModel {
	private  OrderModifierData ordermodifier;

	public OrderModifierData getOrdermodifier() {
		return ordermodifier;
	}

	public void setOrdermodifier(OrderModifierData ordermodifier) {
		this.ordermodifier = ordermodifier;
	}
	
	
}
