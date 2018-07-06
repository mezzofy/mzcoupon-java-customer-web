package com.mezzofy.coupon.api.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.StockData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class StockModel {
 private StockData stock;

	public StockData getStock() {
		return stock;
	}
	
	public void setStock(StockData stock) {
		this.stock = stock;
	}
 
}
