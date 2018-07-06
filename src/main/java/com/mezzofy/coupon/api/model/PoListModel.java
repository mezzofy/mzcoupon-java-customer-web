package com.mezzofy.coupon.api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PoListModel {
	private List<PoModel> pos;	
	private SizeModel size;
	public List<PoModel> getPos() {
		return pos;
	}
	public void setPos(List<PoModel> pos) {
		this.pos = pos;
	}
	public SizeModel getSize() {
		return size;
	}
	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	
	
}
