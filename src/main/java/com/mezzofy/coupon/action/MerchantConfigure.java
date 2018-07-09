package com.mezzofy.coupon.action;

public class MerchantConfigure {
	
 private static final String MERCHANT_CODE="dmha";
 private static final String AUTH_KEY="NPNN10";
 private static final String MERCHANT_URL="dmha";
 private static final String SERVER_URL=".uat.mezzofy.com";


 public static String getMerchantCode() {
	return MERCHANT_CODE;
 }

 public static String getAuthKey() {
	return AUTH_KEY;
 }

public static String getMerchantUrl() {
	return MERCHANT_URL;
}

 public static String getServerUrl(){
	 return SERVER_URL;
 }
 
 
 
}
