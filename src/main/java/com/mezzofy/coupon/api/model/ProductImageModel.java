package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.ProductImageData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductImageModel {
private ProductImageData productimage;

public ProductImageData getProductimage() {
	return productimage;
}

public void setProductimage(ProductImageData productimage) {
	this.productimage = productimage;
}

}
