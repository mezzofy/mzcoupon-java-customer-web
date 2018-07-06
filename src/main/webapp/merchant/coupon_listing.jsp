<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>${merchantName }</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
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
		<script type="text/javascript">
			function fnRefresh() {
				document.forms['campaignlist'].action = "campaign_list.do";
				document.forms['campaignlist'].submit();
			}
		</script>
	</head>
	<body>
        
    <!-- Body -->
    <s:form method="post" id="campaignlist" theme="simple">
    <div id="wrapper">

        <!-- Header -->
        <header id="header" class="alt style2">
            <a href="campaign_list.do" class="logo"><strong><s:property value="merchantName"/></strong></a>
        </header>

        <!-- Banner -->
        <section id="banner" class="style2">
            <div class="inner">
                <span class="image">
				    <img src="${merchantImageurl }" alt="" />
				</span>
                <img src="${merchantLogourl }" height="100px" alt="" />
                <header class="major">
                    <h1> <s:property value="merchantName"/></h1>
                </header>
                <div class="content">
				    <p> <s:property value="merchantDesc"/> </p>
				</div>
                          
                <!-- Shop By Category -->
                <!-- <form method="post" action="#"> -->
                    <%-- <div id="selectbox">
                    	<s:select list="campaignGrouplist" listKey="campaigngroup.campgrpId" listValue="campaigngroup.campgrpName" headerKey="" headerValue="-- Shop by Category --" name="campgrpId" id="campgrpId" onchange="fnRefresh()" />
                    </div> --%>
               <!--  </form> -->
            </div>
        </section>

        <!-- Main -->
        <div id="main">
            <section id="One" class="spotlights">
                        
                <!-- Coupon Listing Top -->
                <section id="listing" style="padding: 1em 1em 0 1em; background-color: white;">
                <s:iterator value="campaignlist" status="cmplst">
                    <div class="4u 12u$(medium)" style="padding: 0.5em;">
                        <center class="boxCoupon" style="border: solid 1px #000000;">
                        <s:iterator value="campaign.campaignimages" begin="0" end="0">
	                        <img src="${campaignimage.campaignImage }" alt="" data-position="center center" style="width: 100%; height: 300px; object-fit: cover;"/> 
                        </s:iterator>
                            <h4 style=" padding-left: 1em; padding-right: 1em; color: #000000;"> <s:property value="campaign.campaignName"/></h4>
                            <p style="color: #000000; padding-left: 1.5em; padding-right: 1.5em; margin-bottom: 0em;"><s:property value="campaign.campaignDesc"/></p>
                            <br />
                            <p style="color: #000000; padding-left: 1.5em; padding-right: 1.5em; margin-bottom: 0em;">Expiry 有效期:</p>
                            <p style="color: #000000; padding-left: 1.5em; padding-right: 1.5em;"><s:if test="%{campaign.expiryDays != null}"> ${campaign.expiryDays } Days 天 </s:if>  <s:else>  <s:date name="campaign.fromDate" format="dd-MMM-yyyy" /> To 至 <s:date name="campaign.toDate" format="dd-MMM-yyyy" /> </s:else></p>
                           
                          <a href="/${campaign.campaignCode }" class="button" style="color: #000000; border: solid 1px #000000;">Details 顯示詳細</a>
                            <br />
                              <h4 style="color: #000000; padding-top: 0.5em; padding-bottom: 0.5em;"> <s:if test="%{campaign.brand == \"F\"}"> Free Coupon 免費優惠券 </s:if><s:else> <s:property value="getText('{0, number, $ ##0.00}', {campaign.sellingPrice })"/> </s:else> </h4>
                        </center>
                    </div>
                    
                    <s:if test="%{#cmplst.count%3 == 0}">
                    	</section>
                    	<section id="listing" style="padding: 1em 1em 0 1em; background-color: white;">
                    </s:if>
                </s:iterator>
                </section>
            </section>
        
            <!-- Main -->
        </div>

        <!-- Footer -->
        <footer id="footer" style="background-color: #000000;">
            <div class="inner">
                <ul class="copyright">
                    <li style="color: #ffffff;">&copy;  <s:property value="merchantName"/></li>
                    <li style="color: #ffffff;">Powered by <a href="http://www.mezzofy.com">Mezzofy</a></li>
                </ul>
            </div>
        </footer>
                    
    <!-- Body -->
    </div>
	</s:form>
    <!-- Scripts -->    
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery.scrolly.min.js"></script>
    <script src="assets/js/jquery.scrollex.min.js"></script>
    <script src="assets/js/skel.min.js"></script>
    <script src="assets/js/util.js"></script>
    <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
    <script src="assets/js/main.js"></script>

	</body>
</html>