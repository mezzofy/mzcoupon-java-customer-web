package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.WalletTxnData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletTxnModel {
	private WalletTxnData wallettxn;
	
	public WalletTxnData getWallettxn() {
		return wallettxn;
	}

	public void setWallettxn(WalletTxnData wallettxn) {
		this.wallettxn = wallettxn;
	}
	
}
