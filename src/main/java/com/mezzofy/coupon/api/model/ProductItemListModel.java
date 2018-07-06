package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductItemListModel {
	private List<ProductItemModel> items;
	public List<ProductItemModel> getItems() {
		return items;
	}

	public void setItems(List<ProductItemModel> items) {
		this.items = items;
	}
	
	
}
