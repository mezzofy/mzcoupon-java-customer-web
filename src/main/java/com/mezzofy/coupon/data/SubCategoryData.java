package com.mezzofy.coupon.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SubCategoryData {
	private String subcatId;
	private String merchantId;
	private String categoryId;
	private String subcatName;
	private String subcatStatus;
	private String subcatImageurl;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String updatedBy;
	
	public SubCategoryData() {
		// TODO Auto-generated constructor stub
	}

	public String getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(String subcatId) {
		this.subcatId = subcatId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubcatName() {
		return subcatName;
	}

	public void setSubcatName(String subcatName) {
		this.subcatName = subcatName;
	}

	public String getSubcatStatus() {
		return subcatStatus;
	}

	public void setSubcatStatus(String subcatStatus) {
		this.subcatStatus = subcatStatus;
	}

	public String getSubcatImageurl() {
		return subcatImageurl;
	}

	public void setSubcatImageurl(String subcatImageurl) {
		this.subcatImageurl = subcatImageurl;
	}

	public String getHashCode() {
		return hashCode;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	
}
