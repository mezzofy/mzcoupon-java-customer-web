package com.mezzofy.coupon.api.model;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CustomerData;
import com.mezzofy.coupon.data.PoDetailData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PoDetailModel {
	private PoDetailData podetail;
	
	public PoDetailData getPodetail() {
		return podetail;
	}

	public void setPodetail(PoDetailData podetail) {
		this.podetail = podetail;
	}
	
	
}
