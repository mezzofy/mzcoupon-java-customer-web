package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.PaymentData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentModel {
	private PaymentData payment;

	public PaymentData getPayment() {
		return payment;
	}

	public void setPayment(PaymentData payment) {
		this.payment = payment;
	}

}
