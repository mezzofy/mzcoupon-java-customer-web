package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CategoryData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CategoryModel {
	private CategoryData category;

	public CategoryData getCategory() {
		return category;
	}

	public void setCategory(CategoryData merchant) {
		this.category = merchant;
	}
}
