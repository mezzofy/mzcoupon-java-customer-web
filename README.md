# mzcoupon-java-customer-web

# 

![](http://www.mezzofy.com/images/logoz.png)


#### Installation Guide for MZCoupon
###### You want to add pod 'MZCoupon', '~> 1.0' similar to the following to your project:

``` objc
target 'MyApp' do
pod 'MZCoupon', '~> 1.0'
end
```
Then run a pod install inside your terminal, or from CocoaPods.app.

###### Alternatively to give it a test run, run the command:

pod try MZCoupon
## Initialize MZCoupon
``` objc
package com.mezzofy.coupon.action;

public class MerchantConfigure {
 private static final String MERCHANT_CODE="6ZYT";
 private static final String AUTH_KEY="ZJWUWQ";
 private static final String MERCHANT_URL="optical88";

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

### End
