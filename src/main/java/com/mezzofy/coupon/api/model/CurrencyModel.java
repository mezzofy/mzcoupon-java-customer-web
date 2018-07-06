package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CurrencyData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CurrencyModel {
	private CurrencyData currency;

	public CurrencyData getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyData currency) {
		this.currency = currency;
	}

}
