package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class LocationListModel {
	private List<LocationModel> locations;
	private SizeModel size;
	public List<LocationModel> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationModel> locations) {
		this.locations = locations;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
	
}
