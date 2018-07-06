package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerListModel {
	private List<CustomerModel> customers;
	private SizeModel size;
	public List<CustomerModel> getCustomers() {
		return customers;
	}
	public void setCustomers(List<CustomerModel> customers) {
		this.customers = customers;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}

}
