package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampGrpDetailData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignGroupDtlModel {
	private CampGrpDetailData campGrpDetail;

	public CampGrpDetailData getCampGrpDetail() {
		return campGrpDetail;
	}

	public void setCampGrpDetail(CampGrpDetailData campGrpDetail) {
		this.campGrpDetail = campGrpDetail;
	}
	
	
}
