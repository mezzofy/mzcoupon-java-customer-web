package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentListModel {
	private List<PaymentModel> payments;
	private List<PaymentDetailModel> paymentdetails;
	private SizeModel size;
	public List<PaymentModel> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentModel> payments) {
		this.payments = payments;
	}

	public List<PaymentDetailModel> getPaymentdetails() {
		return paymentdetails;
	}

	public void setPaymentdetails(List<PaymentDetailModel> paymentdetails) {
		this.paymentdetails = paymentdetails;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}

}
