package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletTxnListModel {
	private List<WalletTxnModel> wallettxns;
	private SizeModel size;

	public List<WalletTxnModel> getWallettxns() {
		return wallettxns;
	}

	public void setWallettxns(List<WalletTxnModel> wallettxns) {
		this.wallettxns = wallettxns;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}
	
	

}
