package com.mezzofy.coupon.api.model;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.mezzofy.coupon.data.CampGrpData;
import com.mezzofy.coupon.data.SiteData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignSearchModel {
	private int page;
	private double latitude;
	private double longitude;
	List<SiteData> sites=null;
	List<CampGrpData> groups=null;
	public List<SiteData> getSites() {
		return sites;
	}
	public void setSites(List<SiteData> sites) {
		this.sites = sites;
	}
	public List<CampGrpData> getGroups() {
		return groups;
	}
	public void setGroups(List<CampGrpData> groups) {
		this.groups = groups;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
