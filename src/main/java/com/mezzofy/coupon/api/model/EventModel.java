package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.EventData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class EventModel {

	private EventData event;
	
	public EventData getEvent() {
		return event;
	}
	public void setEvent(EventData event) {
		this.event = event;
	}
	

}
