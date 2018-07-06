package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.MerchantData;
import com.mezzofy.coupon.data.UserData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MerchantModel {
	private MerchantData merchant;
	private UserData user;

	public MerchantData getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantData merchant) {
		this.merchant = merchant;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	
	
	
}
