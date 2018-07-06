package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerGroupListModel {
	
	private List<CustomerGroupModel> customergroups;
	private SizeModel size;
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	public List<CustomerGroupModel> getCustomergroups() {
		return customergroups;
	}
	public void setCustomergroups(List<CustomerGroupModel> customergroups) {
		this.customergroups = customergroups;
	}
	


}
