package com.mezzofy.coupon.data;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@XmlRootElement
public class PoData {

	private String poId;
	private String merchantId;
	private String mechantName;
	private String customerId;
	private String customerName;
	private Date poDate;
	private String poNo;
	private Double poTotal;
	private String poStatus;
	private String payReceipt;
	private String payResponse;
	private String transferTo;
	private String transferFrom;
	private String payToken;
	private Double rewardPoint;
	private String hashCode;
	private Date updatedOn;
	private String couponType;
	private String paymentDetailId;
	List<CustomerCouponData> customercoupons;
	
	public String getPoId() {
		return poId;
	}
	public void setPoId(String poId) {
		this.poId = poId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Date getPoDate() {
		return poDate;
	}
	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Double getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(Double poTotal) {
		this.poTotal = poTotal;
	}
	public String getPoStatus() {
		return poStatus;
	}
	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
	}
	public String getPayReceipt() {
		return payReceipt;
	}
	public void setPayReceipt(String payReceipt) {
		this.payReceipt = payReceipt;
	}
	public String getPayResponse() {
		return payResponse;
	}
	public void setPayResponse(String payResponse) {
		this.payResponse = payResponse;
	}
	public String getTransferTo() {
		return transferTo;
	}
	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo;
	}
	public String getTransferFrom() {
		return transferFrom;
	}
	public void setTransferFrom(String transferFrom) {
		this.transferFrom = transferFrom;
	}
	public String getPayToken() {
		return payToken;
	}
	public void setPayToken(String payToken) {
		this.payToken = payToken;
	}
	public Double getRewardPoint() {
		return rewardPoint;
	}
	public void setRewardPoint(Double rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getCouponType() {
		return couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	public String getPaymentDetailId() {
		return paymentDetailId;
	}
	public void setPaymentDetailId(String paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getMechantName() {
		return mechantName;
	}
	public void setMechantName(String mechantName) {
		this.mechantName = mechantName;
	}
	public List<CustomerCouponData> getCustomercoupons() {
		return customercoupons;
	}
	public void setCustomercoupons(List<CustomerCouponData> customercoupons) {
		this.customercoupons = customercoupons;
	}

	
	
}
