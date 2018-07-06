package com.mezzofy.coupon.api.model;


import com.mezzofy.coupon.data.CampaignData;
import com.mezzofy.coupon.data.MerchantData;

public class CampaignGs1Model {
	private CampaignData campaign;
	private MerchantData merchant;
	public CampaignData getCampaign() {
		return campaign;
	}
	public void setCampaign(CampaignData campaign) {
		this.campaign = campaign;
	}
	public MerchantData getMerchant() {
		return merchant;
	}
	public void setMerchant(MerchantData merchant) {
		this.merchant = merchant;
	}
	
	
}
