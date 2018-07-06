package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductImageData {
	private String primageId;
	private String productId;
	private String productImage;
	private Integer imageSeq;
	
	public String getPrimageId() {
		return primageId;
	}
	public void setPrimageId(String primageId) {
		this.primageId = primageId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public Integer getImageSeq() {
		return imageSeq;
	}
	public void setImageSeq(Integer imageSeq) {
		this.imageSeq = imageSeq;
	}
}
