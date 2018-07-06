<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title><s:property value="merchantName"/></title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="../assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        
        <script>
            (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

            ga('create', 'UA-96639441-1', 'auto');
            ga('send', 'pageview');
        </script>
	</head>
	<body>

    <!-- Body -->
    <div id="wrapper" class="inner" style="padding-top: 0em;">
        
        <!-- Message -->
        <div id="centerbox">
            <div class="innerbox" style="background-color: #000000">
                <center>
                 
                    <img src="https://s3-ap-southeast-1.amazonaws.com/mzcoupon/coupon/MerchantlogoImg/974c7a58-0d23-426d-b08d-05d0d82d8c9a28.jpg" height="100px" alt="">
                    <h4 style="font-weight:300; margin-bottom: 0em;">Thank You 謝謝</h4>
                    <h4 style="font-weight:300;">Email Sent Successfully 電郵發送成功</h4>
                    <hr/>
                    <h4 style="font-weight:300;">Redeem Coupon 兌換優惠卷</h4><br>
                    <p class="img" style="margin-bottom: 0em;"><img src='<s:property value="qrcodeUrl"/>' alt="Mezzofy" width="50%"></p><br>
                    <p class="img" style="margin-bottom: 0em;"><img src='<s:property value="barcodeUrl"/>' alt="Mezzofy" width="80%" style="padding:1em 1em 1em 1em; background-color: white;"></p><br>
                    <h5 class="button" style="pointer-events: none;">Coupon No. 優惠券號:<s:property value="couponNo"/> </h5><br>
                    <!-- Passbook -->
                    <a href="#iphone" onclick="window.location='<s:property value="passbookUrl"/>';"><img src="../images/add-apple-wallet.png" width="180px" alt="Mezzofy" /></a>
                    <a href="#android" onclick="window.location='<s:property value="passbookUrl"/>';"><img src="../images/add-mPassbook.png" width="180px" alt="Mezzofy" /></a>
                    <hr id="iphone"/>
                    <!-- iOS User Guide -->
                    <h4 id="iphonez" style="font-weight:300;">iPhone User 用戶</h4>
                    <h5 style="font-weight:300; margin-bottom: 0em;">Find your Coupon in Apple Wallet App</h5>
                    <h5 style="font-weight:300;">在蘋果電子錢包中找您的優惠券</h5>
                    <p class="img"><img src="../images/apple-wallet.png" alt="Mezzofy" width="100%"></p>
                    <hr id="android"/>
                    <!-- Android User Guide -->
                    <h4 id="androidz" style="font-weight:300;">Android User 用戶</h4>
                    <h5 style="font-weight:300; margin-bottom: 0em;">Download mPassbook App</h5>
                    <h5 style="font-weight:300;">下載mPassbook應用程序</h5>
                    <p class="img" style="margin-top: 30px; margin-bottom: 20px;">
                    <a href="https://play.google.com/store/apps/details?id=org.ligi.passbook&hl=en" target='_blank'><img src="../images/mPassbook.png" alt="Mezzofy" width="100px"></a><br>
                    <a href="https://play.google.com/store/apps/details?id=org.ligi.passbook&hl=en" target='_blank'><img src='../images/android-store.jpg' height='50'></a>
                    </p>
                    <h5 style="font-weight:300; margin-bottom: 0em;">Find your Coupon in mPassbook</h5>
                    <h5 style="font-weight:300;">在mPassbook中找您的優惠券</h5>
                    <hr/>
                    <!-- Redeem Guide -->
                    <h4 style="font-weight:300; margin-bottom: 0em;">To Redeem, Show your Coupon to Merchant</h4>
                    <h4 style="font-weight:300;">兌換，將您的優惠券顯示給商家</h4>
                    <!-- Action -->
                    <a href='<s:property value="returnurl"/>' class="button fit">Close 關閉</a>
                    <hr/>
                </center>
                
                <!-- Footer -->
                <center>
                    <p style="font-size: 0.8em; color: #ffffff;">Powered by <a href="http://www.mezzofy.com">Mezzofy</a></p>
                </center>
            </div>
        </div>
        
    <!-- Body -->    
    </div>
        
    <!-- Scripts -->
	<script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/jquery.scrolly.min.js"></script>
    <script src="../assets/js/jquery.scrollex.min.js"></script>
    <script src="../assets/js/skel.min.js"></script>
	<script src="../assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
    <script src="../assets/js/main.js"></script>
        
	</body>
</html>