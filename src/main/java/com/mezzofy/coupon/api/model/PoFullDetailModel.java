package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.mezzofy.coupon.data.CustomerData;
import com.mezzofy.coupon.data.PoData;
import com.mezzofy.coupon.data.PoDetailData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PoFullDetailModel {
	private PoDetailData podetail;
	private PoData poData;
	private CustomerData customerData;
	public PoDetailData getPodetail() {
		return podetail;
	}
	public void setPodetail(PoDetailData podetail) {
		this.podetail = podetail;
	}
	public PoData getPoData() {
		return poData;
	}
	public void setPoData(PoData poData) {
		this.poData = poData;
	}
	public CustomerData getCustomerData() {
		return customerData;
	}
	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}
	
}
