package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SiteData;
import com.mezzofy.coupon.data.SiteDeviceData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SiteDeviceModel {
	private SiteDeviceData device;
	private SiteData site;

	public SiteDeviceData getDevice() {
		return device;
	}

	public void setDevice(SiteDeviceData device) {
		this.device = device;
	}

	public SiteData getSite() {
		return site;
	}

	public void setSite(SiteData site) {
		this.site = site;
	}

	
}
