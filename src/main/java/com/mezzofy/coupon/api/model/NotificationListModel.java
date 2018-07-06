package com.mezzofy.coupon.api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class NotificationListModel {
	private List<NotificationModel> notifications;
	
	private SizeModel size;

	public List<NotificationModel> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<NotificationModel> notifications) {
		this.notifications = notifications;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}	
	
}
