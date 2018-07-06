package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.QrData;
import com.mezzofy.coupon.data.QrPromotionData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class QrModel {
 private QrData qr;
 private List<QrPromotionData> campaigns;
	public QrData getQr() {
		return qr;
	}
	public void setQr(QrData qr) {
		this.qr = qr;
	}
	public List<QrPromotionData> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<QrPromotionData> campaigns) {
		this.campaigns = campaigns;
	}
	
 
 
}
