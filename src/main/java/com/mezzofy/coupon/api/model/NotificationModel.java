package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.NotificationData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class NotificationModel {
	
	private NotificationData notification;

	public NotificationData getNotification() {
		return notification;
	}

	public void setNotification(NotificationData notification) {
		this.notification = notification;
	}
	
}
