package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.RedemptionRequestData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionRequestModel {	
		private RedemptionRequestData request;

		public RedemptionRequestData getRequest() {
			return request;
		}

		public void setRequest(RedemptionRequestData request) {
			this.request = request;
		}
		
		
}
