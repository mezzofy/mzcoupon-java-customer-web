package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class WalletTxnData {	
	private String transactionReference;
	private String userId;
	private String merchantId;
	private String siteId;
	private String customerId;
	private String walletId;
	private Integer transactionType;
	private Double transactionAmount;
	private String transactionPayRef;
	private Date paidOn;
	private String processBy;
	private String status;
	private String transactionNotes;
	private String hashCode;
	private Date transactionDate;
	private Integer paymentResponse;
	private Double rewardPoint;
	private Date updatedOn;
	private String approvalCode;
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getWalletId() {
		return walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public Integer getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionPayRef() {
		return transactionPayRef;
	}
	public void setTransactionPayRef(String transactionPayRef) {
		this.transactionPayRef = transactionPayRef;
	}
	public Date getPaidOn() {
		return paidOn;
	}
	public void setPaidOn(Date paidOn) {
		this.paidOn = paidOn;
	}
	public String getProcessBy() {
		return processBy;
	}
	public void setProcessBy(String processBy) {
		this.processBy = processBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransactionNotes() {
		return transactionNotes;
	}
	public void setTransactionNotes(String transactionNotes) {
		this.transactionNotes = transactionNotes;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Integer getPaymentResponse() {
		return paymentResponse;
	}
	public void setPaymentResponse(Integer paymentResponse) {
		this.paymentResponse = paymentResponse;
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
	public String getApprovalCode() {
		return approvalCode;
	}
	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}


}
