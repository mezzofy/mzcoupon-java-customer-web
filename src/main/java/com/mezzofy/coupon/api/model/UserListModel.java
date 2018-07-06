package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserListModel {
	private List<UserModel> users;
	private SizeModel size;
	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}


}
