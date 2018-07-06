package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.OrderItemData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderItemModel {
private OrderItemData orderitem;
private List<OrderModifierModel> ordermodifiers;
public OrderItemData getOrderitem() {
	return orderitem;
}

public void setOrderitem(OrderItemData orderitem) {
	this.orderitem = orderitem;
}

public List<OrderModifierModel> getOrdermodifiers() {
	return ordermodifiers;
}

public void setOrdermodifiers(List<OrderModifierModel> ordermodifiers) {
	this.ordermodifiers = ordermodifiers;
}

}
