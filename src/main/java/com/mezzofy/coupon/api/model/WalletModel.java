package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.WalletData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletModel {
	private WalletData wallet;

	public WalletData getWallet() {
		return wallet;
	}

	public void setWallet(WalletData wallet) {
		this.wallet = wallet;
	}

}
