package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderListModel {
	private List<OrderModel> orders;	
	private SizeModel size;
	
	public List<OrderModel> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
}
