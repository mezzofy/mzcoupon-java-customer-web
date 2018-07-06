package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.OrderData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderModel {
	private OrderData order;
	private List<OrderItemModel> orderitems;
	
	
	public OrderData getOrder() {
		return order;
	}

	public void setOrder(OrderData order) {
		this.order = order;
	}	

	

	public List<OrderItemModel> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<OrderItemModel> orderitems) {
		this.orderitems = orderitems;
	}

	

}
