package com.mezzofy.coupon.data;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductItemData {
	private String itemId;
	private String productId;
	private String groupId;
	private String itemName;
	private String itemStatus;
	private Integer maxModifier;
	private String itemImageurl;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public Integer getMaxModifier() {
		return maxModifier;
	}
	public void setMaxModifier(Integer maxModifier) {
		this.maxModifier = maxModifier;
	}
	public String getItemImageurl() {
		return itemImageurl;
	}
	public void setItemImageurl(String itemImageurl) {
		this.itemImageurl = itemImageurl;
	}
	

}
