package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SiteData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SiteModel {
	
	private SiteData site;
	private List<SiteTimeModel> sitetimes;
	public SiteData getSite() {
		return site;
	}
	public void setSite(SiteData site) {
		this.site = site;
	}
	public List<SiteTimeModel> getSitetimes() {
		return sitetimes;
	}
	public void setSitetimes(List<SiteTimeModel> sitetimes) {
		this.sitetimes = sitetimes;
	}
	
}
