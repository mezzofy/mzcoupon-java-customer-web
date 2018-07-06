package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.TagData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TagModel {
 private TagData tag;

public TagData getTag() {
	return tag;
}

public void setTag(TagData tag) {
	this.tag = tag;
}
 
}
