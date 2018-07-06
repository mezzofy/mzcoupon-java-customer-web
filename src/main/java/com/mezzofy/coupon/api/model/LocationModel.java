package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.LocationData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class LocationModel {
	private LocationData location;
	public LocationData getLocation() {
		return location;
	}

	public void setLocation(LocationData location) {
		this.location = location;
	}
	
}
