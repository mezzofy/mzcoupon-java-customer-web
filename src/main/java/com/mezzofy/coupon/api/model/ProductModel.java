package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.ProductData;
import com.mezzofy.coupon.data.ProductImageData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductModel {
	private ProductData product;

	private List<ProductGroupModel> productgroups;
	public ProductData getProduct() {
		return product;
	}
	public void setProduct(ProductData product) {
		this.product = product;
	}
	
	public List<ProductGroupModel> getProductgroups() {
		return productgroups;
	}
	public void setProductgroups(List<ProductGroupModel> productgroups) {
		this.productgroups = productgroups;
	}
	
}
