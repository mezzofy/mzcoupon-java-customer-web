package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;


import com.mezzofy.coupon.data.CampaignMaterialData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CampaignMaterialModel {
	private CampaignMaterialData material;

	public CampaignMaterialData getMaterial() {
		return material;
	}

	public void setMaterial(CampaignMaterialData material) {
		this.material = material;
	}

	
	
}
