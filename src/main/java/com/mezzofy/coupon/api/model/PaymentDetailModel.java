package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.PaymentDetailData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentDetailModel {
	private PaymentDetailData paymentdetail;

	public PaymentDetailData getPaymentdetail() {
		return paymentdetail;
	}

	public void setPaymentdetail(PaymentDetailData paymentdetail) {
		this.paymentdetail = paymentdetail;
	}
	
}
