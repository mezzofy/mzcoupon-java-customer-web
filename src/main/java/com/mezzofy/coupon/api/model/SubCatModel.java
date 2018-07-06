package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SubCategoryData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SubCatModel {
	private SubCategoryData subcat;

	public SubCategoryData getSubcat() {
		return subcat;
	}

	public void setSubcat(SubCategoryData subcat) {
		this.subcat = subcat;
	}

	
}
