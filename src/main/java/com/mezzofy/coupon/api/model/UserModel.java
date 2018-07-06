package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.UserData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserModel {
	private UserData user;
	private List<UserData> users;
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public List<UserData> getUsers() {
		return users;
	}
	public void setUsers(List<UserData> users) {
		this.users = users;
	}
	
	
	
}
