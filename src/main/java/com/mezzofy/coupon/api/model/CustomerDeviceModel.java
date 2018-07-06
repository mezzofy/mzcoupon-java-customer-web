package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;


import com.mezzofy.coupon.data.CustomerData;
import com.mezzofy.coupon.data.CustomerDeviceData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerDeviceModel {
	CustomerDeviceData device;
	CustomerData customer;
	
	public CustomerData getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerData customer) {
		this.customer = customer;
	}
	public CustomerDeviceData getDevice() {
		return device;
	}
	public void setDevice(CustomerDeviceData device) {
		this.device = device;
	}
	
	
}
