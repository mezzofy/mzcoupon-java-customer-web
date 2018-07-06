package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductListModel {	
	List<ProductModel> products;	
	private SizeModel size;
	public List<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	
}
