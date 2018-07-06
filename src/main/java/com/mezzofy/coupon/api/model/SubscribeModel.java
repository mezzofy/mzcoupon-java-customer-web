package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SubscribeData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SubscribeModel {
	public SubscribeData subscribe;

	public SubscribeData getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(SubscribeData subscribe) {
		this.subscribe = subscribe;
	}
	

}
