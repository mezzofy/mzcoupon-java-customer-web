package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CustomerGroupData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerGroupModel {
	private CustomerGroupData customergroup;

	public CustomerGroupData getCustomergroup() {
		return customergroup;
	}

	public void setCustomergroup(CustomerGroupData customergroup) {
		this.customergroup = customergroup;
	}
	

}
