package com.mezzofy.coupon.data;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.api.model.PaymentDetailModel;


@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentData {
	private String paymentId;
	private String paymentType;
	private String paymentEnviornment;
	private String paymentStatus;
	List<PaymentDetailModel> paymentdetails;
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
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
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public List<PaymentDetailModel> getPaymentdetails() {
		return paymentdetails;
	}
	public void setPaymentdetails(List<PaymentDetailModel> paymentdetails) {
		this.paymentdetails = paymentdetails;
	}
	
	
	
}