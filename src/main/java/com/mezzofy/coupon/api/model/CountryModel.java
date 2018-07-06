package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CountryData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CountryModel {
	private CountryData country;

	public CountryData getCountry() {
		return country;
	}

	public void setCountry(CountryData country) {
		this.country = country;
	}

}
