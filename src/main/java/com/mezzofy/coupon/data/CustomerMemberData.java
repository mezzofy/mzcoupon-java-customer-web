package com.mezzofy.coupon.data;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.api.model.CustomerMemberCouponModel;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CustomerMemberData {	
	private String memberId;
	private String merchantId;
	private String merchantName;
	private String name;
	private String gender;
	private String address;
	private String email;
	private String dob;
	private String mobile;
	private String groupImage;
	private String termUrl;
	private String signupUrl;
	private String groupDesc;

	List<CustomerMemberCouponModel> coupons;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getTermUrl() {
		return termUrl;
	}
	public void setTermUrl(String termUrl) {
		this.termUrl = termUrl;
	}
	public List<CustomerMemberCouponModel> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<CustomerMemberCouponModel> coupons) {
		this.coupons = coupons;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getGroupImage() {
		return groupImage;
	}
	public void setGroupImage(String groupImage) {
		this.groupImage = groupImage;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	public String getSignupUrl() {
		return signupUrl;
	}
	public void setSignupUrl(String signupUrl) {
		this.signupUrl = signupUrl;
	}
	
	

}
