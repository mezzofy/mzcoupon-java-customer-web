package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductImageListModel {
	private List<ProductImageModel> productimages;
	private SizeModel size;

	public List<ProductImageModel> getProductimages() {
		return productimages;
	}

	public void setProductimages(List<ProductImageModel> productimages) {
		this.productimages = productimages;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	} 

}
