package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.OrderTrackData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderTrackModel {
	private OrderTrackData ordertrack;

	public OrderTrackData getOrdertrack() {
		return ordertrack;
	}

	public void setOrdertrack(OrderTrackData ordertrack) {
		this.ordertrack = ordertrack;
	}

}
