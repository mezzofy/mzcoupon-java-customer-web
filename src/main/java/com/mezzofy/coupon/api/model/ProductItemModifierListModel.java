package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductItemModifierListModel {
	
	private List<ProductItemModifierModel> modifiers;

	public List<ProductItemModifierModel> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<ProductItemModifierModel> modifiers) {
		this.modifiers = modifiers;
	}

	

}
