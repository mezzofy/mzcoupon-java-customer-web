package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.UserPasswordData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserPasswordModel {	
	private UserPasswordData user;
	public UserPasswordData getUser() {
		return user;
	}

	public void setUser(UserPasswordData user) {
		this.user = user;
	}
	
	
}
