package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletListModel {
private List<WalletModel> wallets;
private SizeModel size;
public List<WalletModel> getWallets() {
	return wallets;
}

public void setWallets(List<WalletModel> wallets) {
	this.wallets = wallets;
}

public SizeModel getSize() {
	return size;
}

public void setSize(SizeModel size) {
	this.size = size;
}




}
