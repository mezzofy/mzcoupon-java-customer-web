package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SizeModel {
	private Integer pagesize;
	private Integer resultsize;
	private Integer totalsize;
	
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getResultsize() {
		return resultsize;
	}
	public void setResultsize(Integer resultsize) {
		this.resultsize = resultsize;
	}
	public Integer getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
	}

	
}
