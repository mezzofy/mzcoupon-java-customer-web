package com.mezzofy.coupon.api.model;

import java.util.List;

import com.mezzofy.coupon.data.DashboardData;

public class DashboardModel {
 private List<DashboardData> charts;

public List<DashboardData> getCharts() {
	return charts;
}

public void setCharts(List<DashboardData> charts) {
	this.charts = charts;
}
 
}
