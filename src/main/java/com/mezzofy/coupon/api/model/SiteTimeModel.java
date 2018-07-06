package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SiteTimeData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SiteTimeModel {
	private SiteTimeData sitetime;
	public SiteTimeData getSitetime() {
		return sitetime;
	}
	public void setSitetime(SiteTimeData sitetime) {
		this.sitetime = sitetime;
	}
	
	
}
