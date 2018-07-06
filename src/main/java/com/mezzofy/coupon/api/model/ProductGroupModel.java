package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.ProductGroupData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductGroupModel {
	private ProductGroupData productgroup;
	private List<ProductItemModel> items;
	public ProductGroupData getProductgroup() {
		return productgroup;
	}
	public void setProductgroup(ProductGroupData productgroup) {
		this.productgroup = productgroup;
	}
	public List<ProductItemModel> getItems() {
		return items;
	}
	public void setItems(List<ProductItemModel> items) {
		this.items = items;
	}
	
}