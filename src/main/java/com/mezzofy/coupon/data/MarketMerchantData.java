package com.mezzofy.coupon.data;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MarketMerchantData {

	private String merchantId;
	private String submerchantId;
	private String activateStatus;
	private String hashCode;
	private Date updatedOn;
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getSubmerchantId() {
		return submerchantId;
	}
	public void setSubmerchantId(String submerchantId) {
		this.submerchantId = submerchantId;
	}
	public String getActivateStatus() {
		return activateStatus;
	}
	public void setActivateStatus(String activateStatus) {
		this.activateStatus = activateStatus;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
}
