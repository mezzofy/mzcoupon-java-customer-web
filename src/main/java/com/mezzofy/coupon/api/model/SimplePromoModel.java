package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SimplePromoData;
import com.mezzofy.coupon.data.TagData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SimplePromoModel {
	private SimplePromoData simplepromo;	
	List<TagData> tags;
	public SimplePromoData getSimplepromo() {
		return simplepromo;
	}

	public void setSimplepromo(SimplePromoData simplepromo) {
		this.simplepromo = simplepromo;
	}

	public List<TagData> getTags() {
		return tags;
	}

	public void setTags(List<TagData> tags) {
		this.tags = tags;
	}

	

	
	
}
