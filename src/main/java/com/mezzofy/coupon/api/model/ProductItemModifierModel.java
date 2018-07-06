package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.ProductItemModifierData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductItemModifierModel { 
	private ProductItemModifierData modifier;

	public ProductItemModifierData getModifier() {
		return modifier;
	}

	public void setModifier(ProductItemModifierData modifier) {
		this.modifier = modifier;
	}
	
	
}
