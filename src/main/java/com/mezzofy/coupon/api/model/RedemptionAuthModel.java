package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.MerchantData;
import com.mezzofy.coupon.data.RedemptionAuthData;
import com.mezzofy.coupon.data.RedemptionData;
import com.mezzofy.coupon.data.RedemptionDeviceData;
import com.mezzofy.coupon.data.UserData;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedemptionAuthModel {
	private UserData  user;
	private RedemptionData redemption;
	private RedemptionAuthData auth;
	private MerchantData merchant;
	private RedemptionDeviceData device;
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public RedemptionData getRedemption() {
		return redemption;
	}
	public void setRedemption(RedemptionData redemption) {
		this.redemption = redemption;
	}
	public RedemptionAuthData getAuth() {
		return auth;
	}
	public void setAuth(RedemptionAuthData auth) {
		this.auth = auth;
	}
	public MerchantData getMerchant() {
		return merchant;
	}
	public void setMerchant(MerchantData merchant) {
		this.merchant = merchant;
	}
	public RedemptionDeviceData getDevice() {
		return device;
	}
	public void setDevice(RedemptionDeviceData device) {
		this.device = device;
	}

	
	
}
