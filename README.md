# MZCoupon Java Web

# 

![](http://www.mezzofy.com/images/logoz.png)


#### Installation Guide for MZCoupon



## Initialize MZCoupon
``` objc
package com.mezzofy.coupon.action;

public class MerchantConfigure {
 private static final String MERCHANT_CODE="A123";
 private static final String AUTH_KEY="ZJWUWQ";
 private static final String MERCHANT_URL="demo";

 public static String getMerchantCode() {
	return MERCHANT_CODE;
 }

 public static String getAuthKey() {
	return AUTH_KEY;
 }

public static String getMerchantUrl() {
	return MERCHANT_URL;
}

 
}

```
***Hints:*** 

*1. Where "MERCHANT_CODE" Merchant Code
*2. AUTH_KEY ("XXXXX") API-Oauth Key
*3. MERCHANT_URL is your Project URL


##### How to get Company Code & AccessToken
Login to Merchant Account 
![](https://s3-ap-southeast-1.amazonaws.com/mzcouponuat/email/merchant_profile.jpg)

##### Click here for [Full Implementation Guide](https://github.com/mezzofy/mzcoupon-java-customer-web)
### End
