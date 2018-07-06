package com.mezzofy.coupon.api.model;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.PoData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PoModel {
	private PoData po;
	private List<PoDetailModel> podetails;
	public PoData getPo() {
		return po;
	}
	public void setPo(PoData po) {
		this.po = po;
	}
	public List<PoDetailModel> getPodetails() {
		return podetails;
	}
	public void setPodetails(List<PoDetailModel> podetails) {
		this.podetails = podetails;
	}
	
	

}
