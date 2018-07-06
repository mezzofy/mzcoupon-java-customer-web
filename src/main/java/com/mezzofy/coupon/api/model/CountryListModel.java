package com.mezzofy.coupon.api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CountryListModel {
	private List<CountryModel> countries;
	private SizeModel size;
	public List<CountryModel> getCountries() {
		return countries;
	}
	public void setCountries(List<CountryModel> countries) {
		this.countries = countries;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
}
