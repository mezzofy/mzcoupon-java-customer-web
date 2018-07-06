package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.ProductItemData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductItemModel {
	private ProductItemData item;
	private List<ProductItemModifierModel>  modifiers;
	public ProductItemData getItem() {
		return item;
	}
	public void setItem(ProductItemData item) {
		this.item = item;
	}
	public List<ProductItemModifierModel> getModifiers() {
		return modifiers;
	}
	public void setModifiers(List<ProductItemModifierModel> modifiers) {
		this.modifiers = modifiers;
	}
	
	

}
