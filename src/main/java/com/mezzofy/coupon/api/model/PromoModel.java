package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.CampaignData;
import com.mezzofy.coupon.data.MerchantData;
import com.mezzofy.coupon.data.PromoBasicData;
import com.mezzofy.coupon.data.PromoData;
import com.mezzofy.coupon.data.PromoUrlData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PromoModel {
	private PromoData promo;
	private PromoUrlData url;
	private PromoBasicData basic;
	private MerchantData merchant;
	private List<CampaignData> campaigns;
	public PromoData getPromo() {
		return promo;
	}
	public void setPromo(PromoData promo) {
		this.promo = promo;
	}
	public PromoUrlData getUrl() {
		return url;
	}
	public void setUrl(PromoUrlData url) {
		this.url = url;
	}
	public PromoBasicData getBasic() {
		return basic;
	}
	public void setBasic(PromoBasicData basic) {
		this.basic = basic;
	}
	public List<CampaignData> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<CampaignData> campaigns) {
		this.campaigns = campaigns;
	}
	public MerchantData getMerchant() {
		return merchant;
	}
	public void setMerchant(MerchantData merchant) {
		this.merchant = merchant;
	}
	
	
	
	
	
	
}
