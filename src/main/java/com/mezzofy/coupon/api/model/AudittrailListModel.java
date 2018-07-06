package com.mezzofy.coupon.api.model;

import java.util.List;

public class AudittrailListModel {
	private List<AudittrailModel> auditrails;
	private SizeModel size;
	public List<AudittrailModel> getAuditrails() {
		return auditrails;
	}
	
	public void setAuditrails(List<AudittrailModel> auditrails) {
		this.auditrails = auditrails;
	}

	public SizeModel getSize() {
		return size;
	}

	public void setSize(SizeModel size) {
		this.size = size;
	}

	
   
}
