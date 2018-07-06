package com.mezzofy.coupon.data;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.api.model.ProductImageModel;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductData {
	private String productId;
	private String merchantId;
	private String categoryId;
	private String subCategoryId;
	private String productCode;
	private String productName;
	private String productDesc;
	private Double sellingPrice;
	private Double orginalPrice;
	private String productTc;
	private String productRemark;
	private String productStatus;
	private String productNote1;
	private String productNote2;
	private String productNote3;
	private String pickup;
	private String delivery;
	private Integer dailyLimit;
	private Integer packQty;
	private String booking;
	private String outcall;
	private String typeService;
	private String reviewUrl;
	private String videoUrl;
	private String rateStatus;
	private Double baseFare;
	private Integer baseHour;
	private Double perhourFare;
	private String hashCode;
	private Date createdOn;
	private Date updatedOn;
	private String updatedBy;
	private List<ProductImageModel> productimages;
	
	public ProductData() {
		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getOrginalPrice() {
		return orginalPrice;
	}

	public void setOrginalPrice(Double orginalPrice) {
		this.orginalPrice = orginalPrice;
	}

	public String getProductTc() {
		return productTc;
	}

	public void setProductTc(String productTc) {
		this.productTc = productTc;
	}

	public String getProductRemark() {
		return productRemark;
	}

	public void setProductRemark(String productRemark) {
		this.productRemark = productRemark;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductNote1() {
		return productNote1;
	}

	public void setProductNote1(String productNote1) {
		this.productNote1 = productNote1;
	}

	public String getProductNote2() {
		return productNote2;
	}

	public void setProductNote2(String productNote2) {
		this.productNote2 = productNote2;
	}

	public String getProductNote3() {
		return productNote3;
	}

	public void setProductNote3(String productNote3) {
		this.productNote3 = productNote3;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public Integer getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(Integer dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public Integer getPackQty() {
		return packQty;
	}

	public void setPackQty(Integer packQty) {
		this.packQty = packQty;
	}

	public String getBooking() {
		return booking;
	}

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public String getOutcall() {
		return outcall;
	}

	public void setOutcall(String outcall) {
		this.outcall = outcall;
	}

	public String getTypeService() {
		return typeService;
	}

	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}

	public String getReviewUrl() {
		return reviewUrl;
	}

	public void setReviewUrl(String reviewUrl) {
		this.reviewUrl = reviewUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getRateStatus() {
		return rateStatus;
	}

	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}

	public Double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(Double baseFare) {
		this.baseFare = baseFare;
	}

	public Integer getBaseHour() {
		return baseHour;
	}

	public void setBaseHour(Integer baseHour) {
		this.baseHour = baseHour;
	}

	public Double getPerhourFare() {
		return perhourFare;
	}

	public void setPerhourFare(Double perhourFare) {
		this.perhourFare = perhourFare;
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

	public List<ProductImageModel> getProductimages() {
		return productimages;
	}

	public void setProductimages(List<ProductImageModel> productimages) {
		this.productimages = productimages;
	}

}
