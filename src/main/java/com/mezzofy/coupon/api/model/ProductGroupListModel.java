package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductGroupListModel {
	private List<ProductGroupModel> productgroups;

	public List<ProductGroupModel> getProductgroups() {
		return productgroups;
	}

	public void setProductgroups(List<ProductGroupModel> productgroups) {
		this.productgroups = productgroups;
	}


	
}
