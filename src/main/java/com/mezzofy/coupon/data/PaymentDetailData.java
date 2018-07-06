package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentDetailData {

	private String paymentDetailId;
	private String merchantId;
	private String paymentId;
	private String paymentName;
	private String paymentLogourl;
	private String paymentMerchantId;
	private String paymentKey;
	private String paymentToken;
	private String paymentUrl;
	private String paymentStatus;
	private String hashCode;
	private Date updatedOn;
	private String paymentType;
	private String paymentEnviornment;
	private String currency;

	public String getPaymentDetailId() {
		return paymentDetailId;
	}
	public void setPaymentDetailId(String paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentName() {
		return paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
	public String getPaymentLogourl() {
		return paymentLogourl;
	}
	public void setPaymentLogourl(String paymentLogourl) {
		this.paymentLogourl = paymentLogourl;
	}
	public String getPaymentMerchantId() {
		return paymentMerchantId;
	}
	public void setPaymentMerchantId(String paymentMerchantId) {
		this.paymentMerchantId = paymentMerchantId;
	}
	public String getPaymentKey() {
		return paymentKey;
	}
	public void setPaymentKey(String paymentKey) {
		this.paymentKey = paymentKey;
	}
	public String getPaymentToken() {
		return paymentToken;
	}
	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}
	public String getPaymentUrl() {
		return paymentUrl;
	}
	public void setPaymentUrl(String paymentUrl) {
		this.paymentUrl = paymentUrl;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentEnviornment() {
		return paymentEnviornment;
	}
	public void setPaymentEnviornment(String paymentEnviornment) {
		this.paymentEnviornment = paymentEnviornment;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
