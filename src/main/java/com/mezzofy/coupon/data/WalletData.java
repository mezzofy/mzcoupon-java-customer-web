package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletData {	
	private String walletId;
	private String customerId;
	private Double walletCredit;
	private String qrCode;
	private Integer qrTime;
	private Double rewardPoint;
	private Date updatedOn;
	public String getWalletId() {
		return walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Double getWalletCredit() {
		return walletCredit;
	}
	public void setWalletCredit(Double walletCredit) {
		this.walletCredit = walletCredit;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public Integer getQrTime() {
		return qrTime;
	}
	public void setQrTime(Integer qrTime) {
		this.qrTime = qrTime;
	}
	public Double getRewardPoint() {
		return rewardPoint;
	}
	public void setRewardPoint(Double rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
}
