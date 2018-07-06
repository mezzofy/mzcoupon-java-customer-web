package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MerchantListModel {
	private List<MerchantModel> merchants;
	private SizeModel size;

	public List<MerchantModel> getMerchants() {
		return merchants;
	}

	public void setMerchants(List<MerchantModel> merchants) {
		this.merchants = merchants;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
}
