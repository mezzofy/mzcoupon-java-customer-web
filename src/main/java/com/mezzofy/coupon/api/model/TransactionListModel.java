package com.mezzofy.coupon.api.model;

import java.util.List;

public class TransactionListModel {
	List<TransactionModel> transactions;
	private SizeModel size;
	public List<TransactionModel> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionModel> transactions) {
		this.transactions = transactions;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}

	
	
}
