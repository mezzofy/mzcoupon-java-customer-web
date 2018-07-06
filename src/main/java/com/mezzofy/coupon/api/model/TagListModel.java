package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TagListModel {
 private List<TagModel> tags;

	public List<TagModel> getTags() {
		return tags;
	}
	
	public void setTags(List<TagModel> tags) {
		this.tags = tags;
	}
 
 
}
