package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.SettingData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SettingModel {
	private SettingData setting;

	public SettingData getSetting() {
		return setting;
	}

	public void setSetting(SettingData setting) {
		this.setting = setting;
	}
	
	
}
