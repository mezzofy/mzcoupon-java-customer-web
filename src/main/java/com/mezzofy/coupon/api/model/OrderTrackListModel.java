package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderTrackListModel {
	private List<OrderTrackModel> ordertracks;

	public List<OrderTrackModel> getOrdertracks() {
		return ordertracks;
	}

	public void setOrdertracks(List<OrderTrackModel> ordertracks) {
		this.ordertracks = ordertracks;
	}
	
	
}
