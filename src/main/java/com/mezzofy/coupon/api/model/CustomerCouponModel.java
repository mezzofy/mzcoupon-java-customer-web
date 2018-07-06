package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampaignData;
import com.mezzofy.coupon.data.CouponData;
import com.mezzofy.coupon.data.CustomerCouponData;
import com.mezzofy.coupon.data.CustomerData;
import com.mezzofy.coupon.data.ProductData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerCouponModel {
	private CustomerCouponData customercoupon;
	private ProductData product;
	private CampaignData campaign;
	private CouponData coupon;
	private CustomerData customer;
	private Integer size;

	public CustomerCouponData getCustomercoupon() {
		return customercoupon;
	}
	public void setCustomercoupon(CustomerCouponData customercoupon) {
		this.customercoupon = customercoupon;
	}
	public ProductData getProduct() {
		return product;
	}
	public void setProduct(ProductData product) {
		this.product = product;
	}
	public CouponData getCoupon() {
		return coupon;
	}
	public void setCoupon(CouponData coupon) {
		this.coupon = coupon;
	}
	public CustomerData getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerData customer) {
		this.customer = customer;
	}

	public CampaignData getCampaign() {
		return campaign;
	}
	public void setCampaign(CampaignData campaign) {
		this.campaign = campaign;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	
}
