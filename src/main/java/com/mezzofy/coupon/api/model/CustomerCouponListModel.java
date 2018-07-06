package com.mezzofy.coupon.api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerCouponListModel {
	private List<CustomerCouponModel> customercoupons;
	private SizeModel size;
	public List<CustomerCouponModel> getCustomercoupons() {
		return customercoupons;
	}
	public void setCustomercoupons(List<CustomerCouponModel> customercoupons) {
		this.customercoupons = customercoupons;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}


}
