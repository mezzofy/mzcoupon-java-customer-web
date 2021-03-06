package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SubCatListModel {
	private List<SubCatModel> subcategories;
	private SizeModel size;
	
	public List<SubCatModel> getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(List<SubCatModel> subcategories) {
		this.subcategories = subcategories;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	

}
