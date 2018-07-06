<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title><s:property value="merchantName"/> | <s:property value="campaignName"/></title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!-- start tag  -->
        <meta name="description" content='<s:property value="campaignName"/>' />
        <meta name="author" content='<s:property value="merchantName"/>' />
        <meta name="language" content="English">
        <!-- ogp-->
        <meta property="og:site_name" content='<s:property value="merchantName"/>' />
        <meta property="og:url"  content='<s:property value="couponUrl"/>' />
        <meta property="og:type"  content="website" />
        <meta property="og:title" content='<s:property value="campaignName"/>' />
        <meta property="og:description" content='<s:property value="campaignDesc"/>' />
        <meta property="og:image" content='<s:property value="campaignImage"/>' />
        <!-- end tag -->
        <script>
            (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

            ga('create', 'UA-96639441-1', 'auto');
            ga('send', 'pageview');
        </script>
		<script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=true"></script>
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
		
		function loadmap() {
			var map = null;
			// Create the map 
			// No need to specify zoom and center as we fit the map further down.
			var url = "Ajax_sitelocations.do";
			
			var mypath = new Array();
			$.getJSON(url).done(function(locations) {
								for (index in locations) {
									map = new google.maps.Map(document.getElementById('sitesmap'),
											{
												zoom : 12,
												center : new google.maps.LatLng(locations[index].lat, locations[index].lng),
												mapTypeId : google.maps.MapTypeId.ROADMAP
											});
									
									addMarker(locations[index]);
								}
							});
			$.getJSON(url).done(function(locations) {
				for (index in locations) {
					addMarker(locations[index]);
				}
			});
			
			function addMarker(data) {
				// Create the marker
				var icon = "images/location_marker.png";
				var marker = new google.maps.Marker({
					position : new google.maps.LatLng(data.lat, data.lng),
					map : map,
					title : data.sitelocation,
					animation : google.maps.Animation.DROP
				});
				marker.setIcon(icon);
				google.maps.event.trigger(map, 'resize');
				var infowindow = new google.maps.InfoWindow({
					content: '<div style="color:black;"><strong style="color:black;">' + data.sitename + '</strong><br>' + data.sitelocation + '</div>'
				});
				// Open the infowindow on marker click
				var myLatlng = new google.maps.LatLng(data.lat, data.lng);
				google.maps.event.addListener(marker, 'mouseover',
						function() {
							infowindow.open(map, marker);
						});
				google.maps.event.addListener(marker, 'mouseout',
						function() {
							infowindow.close();
						});
				google.maps.event.addListenerOnce(map, 'idle', function() {
					google.maps.event.trigger(map, 'resize');
					map.setCenter(myLatlng);
				});
			}
		}
		
		function getCoupon(){
		
			var validchk = true;
			var mainchek = true;
			var available=document.getElementById("availableCoupon").value;
			
			var passurl=document.getElementById("passbookUrl").value;
		
			var terms1 = document.getElementById("accpet-terms-1").checked;
			
			var terms2 = document.getElementById("accpet-terms-2").checked;
			if(terms1 && terms2){
				
			}else{
				mainchek=false;
				validchk=false;
				alert("Please check the terms");
			}
			var email=document.getElementById("email").value;
			var customerFirstName=document.getElementById("customerFirstName").value;
			var customerDate=document.getElementById("customerDate").value;
			var customerMonth=document.getElementById("customerMonth").value;
			var customerGender=document.getElementById("customerGender").value;
			var customerMobile=document.getElementById("customerMobile").value;		
			if(available==0){
				mainchek=false;
				validchk=false;
				alert("No Coupon Available");
			}
			if(email=="Enter Email 輸入電郵"){
				validchk=false
			}	
			
			if(email=="Name 名稱"){
				validchk=false
			}
			
			if(customerFirstName=="Name 名稱"){
				
				validchk=false
			}
			
			if(customerDate=="0"){
				
				validchk=false
			}
			
			if(customerMonth=="0"){
				
				validchk=false
			}
			
			if(customerMobile=="Mobile 手機號碼"){
				
				validchk=false
			}
			
			if(customerGender=="0"){
				
				validchk=false
			}
			
			/* if(customerCountry=="0"){
				
				validchk=false
			} */
		
			if(mainchek){
			if(validchk){	
				
				document.forms[0].action =passurl;
				document.forms[0].submit();
			}else{
				alert("Please fill all the field");
			}}
		}
		$(document).keypress(function(e) {
		    if(e.which == 13) {
		    	getCoupon();
		    }
		});
		</script>
	</head>
    
    <!-- Body -->
	<body onload="loadmap()">
    <s:form theme="simple" method="post" style="margin-bottom: 0em;" >
    <div id="wrapper" style="padding-top: 0em; background-color: white;">
   	<input type="hidden" id="availableCoupon" name="availableCoupon" value='<s:property value="availableCoupon" />'/>
   	<input type="hidden" id="customerDOB" name="customerDOB" />

	
	<input type="hidden" name="passbookUrl" id="passbookUrl" value='<s:property value="%{#session.url}"/>' />
        <!-- Header -->
        <Center style="padding-left: 0.5em; padding-right: 0.5em; margin-top: -0.5em;">
            <br/>
            <img src="${merchantLogourl }" style="max-width: 80px; height: auto; width: auto; padding-top: 0em;" alt="Mezzofy Coupon"/>
            <h5 style="color: #2e3450"><s:property value="merchantName"/></h5>
        </Center>
		<s:iterator value="campaignimages">
        <!-- Image/Video -->
        <img src="<s:property value='campaignimage.campaignImage'/>" alt="Mezzofy Coupon" style="width: 100%;" />
        </s:iterator>
        <!-- Coupon Name -->
        <center>
            <h3 style="color: #2e3450; background-color: white; margin-top: 0em; margin-bottom: -0.5em; padding: 0.8em;"><s:property value="campaignName"/></h3>
           <s:if test="%{campaignType == \"C\"}">
            <p style="color: #2e3450; background-color: white; height:1px;font-size: 22px;font-weight: bold;"><s:property value="currency"/><s:property value="getText('{0, number, $ ##0.00}', {sellingPrice })"/></p>
            <p style="color: #2e3450; background-color: white;  height:1px;font-size: 16px;font-weight: bold;"><s:property value="currency"/><strike><s:property value="getText('{0, number, $ ##0.00}', {orginalprice})"/></strike></p>
          </s:if>
        </center>
        <!-- Coupon Border -->
        <img src="images/border.png" style="width: 100%; background-color: #2e3450; margin-bottom: -1em;">
        

        <!-- Main -->
        <div id="main" style="background-color: #2e3450;">

            <!-- Coupon -->
            <section id="coupon">
                
                <!-- Coupon Details -->
				<div class="inner" style="padding: 1.5em 0 1em 0;">
                    
                    <br>
                    
                    <!-- Customer Informations -->
                    <input type="text" name="customerFirstName" id="customerFirstName" placeholder="Name 名稱" style="background-color: white; color: black !important; text-align: left;" value="Name 名稱" onfocus="if(this.value  == 'Name 名稱') { this.value = ''; } " onblur="if(this.value == '') { this.value = 'Name 名稱'; } ">
                    <br>
                    <select name="customerDate" id="customerDate" style="background-color: white;color: black !important;text-align: center;margin-bottom: 0.5em;">
						<option value="0">Birthday - Day</option>
						<option value="1">01</option>
						<option value="2">02</option>
						
						<option value="31">31</option>
					</select>
				<select name="customerMonth" id="customerMonth" style="background-color: white;color: black !important;text-align: center;">
						<option value="0">Birthday - Month</option>
						<option value="1">01</option>
						<option value="2">02</option>
					   <option value="12">12</option>
				</select>
                    <input type="text" name="customerDOB" id="customerDOB" placeholder="YYYY-MM Birth Year/Month 出生年和月份" style="background-color: white; color: black !important; text-align: left;" value="YYYY-MM Birth Year/Month 出生年和月份" onfocus="if(this.value  == 'YYYY-MM Birth Year/Month 出生年和月份') { this.value = ''; } " onblur="if(this.value == '') { this.value = 'YYYY-MM Birth Year/Month 出生年和月份'; } " required pattern="[0-9]{4}-[0-9]{2}">
                    <br>
                    <select name="customerGender" id="customerGender" style="background-color: white; color: black !important; text-align: center;">
                        <option value="0">Gender 性別</option>
                        <option value="M">Male 男</option>
                        <option value="F">Female 女</option>
                    </select>
                    <br>
                    <input type="tel" name="customerMobile" id="customerMobile" placeholder="Mobile 手機號碼" style="background-color: white; color: black !important; text-align: left; height: 45px;" value="Mobile 手機號碼" onfocus="if(this.value  == 'Mobile 手機號碼') { this.value = ''; } " onblur="if(this.value == '') { this.value = 'Mobile 手機號碼'; } ">
          <%--           <br>
                    <select name="customerCountry" id="customerCountry" style="background-color: white; color: black !important; text-align: left;">
                                        <option value="0">Nationality 國籍</option>
                
                                        <option value="AD">Andorra</option>
                
                                        <option value="AE">United Arab Emirates</option>
                
                                        <option value="AF">Afghanistan</option>
                
                                        <option value="AG">Antigua and Barbuda</option>
                
                                        <option value="AI">Anguilla</option>
                
                                        <option value="AL">Albania</option>
                
                                        <option value="AM">Armenia</option>
                
                                        <option value="AO">Angola</option>
                
                                        <option value="AQ">Antarctica</option>
                                    
                                        <option value="AR">Argentina</option>
                                    
                                        <option value="AS">American Samoa</option>
                                    
                                        <option value="AT">Austria</option>
                                    
                                        <option value="AU">Australia</option>
                                    
                                        <option value="AW">Aruba</option>
                                    
                                        <option value="AX">Åland Islands</option>
                                    
                                        <option value="AZ">Azerbaijan</option>
                                    
                                        <option value="BA">Bosnia and Herzegovina</option>
                                    
                                        <option value="BB">Barbados</option>
                                    
                                        <option value="BD">Bangladesh</option>
                                    
                                        <option value="BE">Belgium</option>
                                    
                                        <option value="BF">Burkina Faso</option>
                                    
                                        <option value="BG">Bulgaria</option>
                                    
                                        <option value="BH">Bahrain</option>
                                    
                                        <option value="BI">Burundi</option>
                                    
                                        <option value="BJ">Benin</option>
                                    
                                        <option value="BL">Saint Barthélemy</option>
                                    
                                        <option value="BM">Bermuda</option>
                                    
                                        <option value="BN">Brunei Darussalam</option>
                                    
                                        <option value="BO">Bolivia</option>
                                    
                                        <option value="BQ">Caribbean Netherlands </option>
                                    
                                        <option value="BR">Brazil</option>
                                    
                                        <option value="BS">Bahamas</option>
                                    
                                        <option value="BT">Bhutan</option>
                                    
                                        <option value="BV">Bouvet Island</option>
                                    
                                        <option value="BW">Botswana</option>
                                    
                                        <option value="BY">Belarus</option>
                                    
                                        <option value="BZ">Belize</option>
                                    
                                        <option value="CA">Canada</option>
                                    
                                        <option value="CC">Cocos (Keeling) Islands</option>
                                    
                                        <option value="CD">Congo, Democratic Republic of</option>
                                    
                                        <option value="CF">Central African Republic</option>
                                    
                                        <option value="CG">Congo</option>
                                    
                                        <option value="CH">Switzerland</option>
                                    
                                        <option value="CI">Côte d'Ivoire</option>
                                    
                                        <option value="CK">Cook Islands</option>
                                    
                                        <option value="CL">Chile</option>
                                    
                                        <option value="CM">Cameroon</option>
                                    
                                        <option value="CN">China</option>
                                    
                                        <option value="CO">Colombia</option>
                                    
                                        <option value="CR">Costa Rica</option>
                                    
                                        <option value="CU">Cuba</option>
                                    
                                        <option value="CV">Cape Verde</option>
                                    
                                        <option value="CW">Curaçao</option>
                                    
                                        <option value="CX">Christmas Island</option>
                                    
                                        <option value="CY">Cyprus</option>
                                    
                                        <option value="CZ">Czech Republic</option>
                                    
                                        <option value="DE">Germany</option>
                                    
                                        <option value="DJ">Djibouti</option>
                                    
                                        <option value="DK">Denmark</option>
                                    
                                        <option value="DM">Dominica</option>
                                    
                                        <option value="DO">Dominican Republic</option>
                                    
                                        <option value="DZ">Algeria</option>
                                    
                                        <option value="EC">Ecuador</option>
                                    
                                        <option value="EE">Estonia</option>
                                    
                                        <option value="EG">Egypt</option>
                                    
                                        <option value="EH">Western Sahara</option>
                                    
                                        <option value="ER">Eritrea</option>
                                    
                                        <option value="ES">Spain</option>
                                    
                                        <option value="ET">Ethiopia</option>
                                    
                                        <option value="FI">Finland</option>
                                    
                                        <option value="FJ">Fiji</option>
                                    
                                        <option value="FK">Falkland Islands</option>
                                    
                                        <option value="FM">Micronesia, Federated States of</option>
                                    
                                        <option value="FO">Faroe Islands</option>
                                    
                                        <option value="FR">France</option>
                                    
                                        <option value="GA">Gabon</option>
                                    
                                        <option value="GB">United Kingdom</option>
                                    
                                        <option value="GD">Grenada</option>
                                    
                                        <option value="GE">Georgia</option>
                                    
                                        <option value="GF">French Guiana</option>
                                    
                                        <option value="GG">Guernsey</option>
                                    
                                        <option value="GH">Ghana</option>
                                    
                                        <option value="GI">Gibraltar</option>
                                    
                                        <option value="GL">Greenland</option>
                                    
                                        <option value="GM">Gambia</option>
                                    
                                        <option value="GN">Guinea</option>
                                    
                                        <option value="GP">Guadeloupe</option>
                                    
                                        <option value="GQ">Equatorial Guinea</option>
                                    
                                        <option value="GR">Greece</option>
                                    
                                        <option value="GS">South Georgia and the South Sandwich Islands</option>
                                    
                                        <option value="GT">Guatemala</option>
                                    
                                        <option value="GU">Guam</option>
                                    
                                        <option value="GW">Guinea-Bissau</option>
                                    
                                        <option value="GY">Guyana</option>
                                    
                                        <option value="HK">Hong Kong</option>
                                    
                                        <option value="HM">Heard and McDonald Islands</option>
                                    
                                        <option value="HN">Honduras</option>
                                    
                                        <option value="HR">Croatia</option>
                                    
                                        <option value="HT">Haiti</option>
                                    
                                        <option value="HU">Hungary</option>
                                    
                                        <option value="ID">Indonesia</option>
                                    
                                        <option value="IE">Ireland</option>
                                    
                                        <option value="IL">Israel</option>
                                    
                                        <option value="IM">Isle of Man</option>
                                    
                                        <option value="IN">India</option>
                                    
                                        <option value="IO">British Indian Ocean Territory</option>
                                    
                                        <option value="IQ">Iraq</option>
                                    
                                        <option value="IR">Iran</option>
                                    
                                        <option value="IS">Iceland</option>
                                    
                                        <option value="IT">Italy</option>
                                    
                                        <option value="JE">Jersey</option>
                                    
                                        <option value="JM">Jamaica</option>
                                    
                                        <option value="JO">Jordan</option>
                                    
                                        <option value="JP">Japan</option>
                                    
                                        <option value="KE">Kenya</option>
                                    
                                        <option value="KG">Kyrgyzstan</option>
                                    
                                        <option value="KH">Cambodia</option>
                                    
                                        <option value="KI">Kiribati</option>
                                    
                                        <option value="KM">Comoros</option>
                                    
                                        <option value="KN">Saint Kitts and Nevis</option>
                                    
                                        <option value="KP">North Korea</option>
                                    
                                        <option value="KR">South Korea</option>
                                    
                                        <option value="KW">Kuwait</option>
                                    
                                        <option value="KY">Cayman Islands</option>
                                    
                                        <option value="KZ">Kazakhstan</option>
                                    
                                        <option value="LA">Lao People's Democratic Republic</option>
                                    
                                        <option value="LB">Lebanon</option>
                                    
                                        <option value="LC">Saint Lucia</option>
                                    
                                        <option value="LI">Liechtenstein</option>
                                    
                                        <option value="LK">Sri Lanka</option>
                                    
                                        <option value="LR">Liberia</option>
                                    
                                        <option value="LS">Lesotho</option>
                                    
                                        <option value="LT">Lithuania</option>
                                    
                                        <option value="LU">Luxembourg</option>
                                    
                                        <option value="LV">Latvia</option>
                                    
                                        <option value="LY">Libya</option>
                                    
                                        <option value="MA">Morocco</option>
                                    
                                        <option value="MC">Monaco</option>
                                    
                                        <option value="MD">Moldova</option>
                                    
                                        <option value="ME">Montenegro</option>
                                    
                                        <option value="MF">Saint-Martin (France)</option>
                                    
                                        <option value="MG">Madagascar</option>
                                    
                                        <option value="MH">Marshall Islands</option>
                                    
                                        <option value="MK">Macedonia</option>
                                    
                                        <option value="ML">Mali</option>
                                    
                                        <option value="MM">Myanmar</option>
                                    
                                        <option value="MN">Mongolia</option>
                                    
                                        <option value="MO">Macau</option>
                                    
                                        <option value="MP">Northern Mariana Islands</option>
                                    
                                        <option value="MQ">Martinique</option>
                                    
                                        <option value="MR">Mauritania</option>
                                    
                                        <option value="MS">Montserrat</option>
                                    
                                        <option value="MT">Malta</option>
                                    
                                        <option value="MU">Mauritius</option>
                                    
                                        <option value="MV">Maldives</option>
                                    
                                        <option value="MW">Malawi</option>
                                    
                                        <option value="MX">Mexico</option>
                                    
                                        <option value="MY">Malaysia</option>
                                    
                                        <option value="MZ">Mozambique</option>
                                    
                                        <option value="NA">Namibia</option>
                                    
                                        <option value="NC">New Caledonia</option>
                                    
                                        <option value="NE">Niger</option>
                                    
                                        <option value="NF">Norfolk Island</option>
                                    
                                        <option value="NG">Nigeria</option>
                                    
                                        <option value="NI">Nicaragua</option>
                                    
                                        <option value="NL">The Netherlands</option>
                                    
                                        <option value="NO">Norway</option>
                                    
                                        <option value="NP">Nepal</option>
                                    
                                        <option value="NR">Nauru</option>
                                    
                                        <option value="NU">Niue</option>
                                    
                                        <option value="NZ">New Zealand</option>
                                    
                                        <option value="OM">Oman</option>
                                    
                                        <option value="PA">Panama</option>
                                    
                                        <option value="PE">Peru</option>
                                    
                                        <option value="PF">French Polynesia</option>
                                    
                                        <option value="PG">Papua New Guinea</option>
                                    
                                        <option value="PH">Philippines</option>
                                    
                                        <option value="PK">Pakistan</option>
                                    
                                        <option value="PL">Poland</option>
                                    
                                        <option value="PM">St. Pierre and Miquelon</option>
                                    
                                        <option value="PN">Pitcairn</option>
                                    
                                        <option value="PR">Puerto Rico</option>
                                    
                                        <option value="PS">Palestine, State of</option>
                                    
                                        <option value="PT">Portugal</option>
                                    
                                        <option value="PW">Palau</option>
                                    
                                        <option value="PY">Paraguay</option>
                                    
                                        <option value="QA">Qatar</option>
                                    
                                        <option value="RE">Réunion</option>
                                    
                                        <option value="RO">Romania</option>
                                    
                                        <option value="RS">Serbia</option>
                                    
                                        <option value="RU">Russian Federation</option>
                                    
                                        <option value="RW">Rwanda</option>
                                    
                                        <option value="SA">Saudi Arabia</option>
                                    
                                        <option value="SB">Solomon Islands</option>
                                    
                                        <option value="SC">Seychelles</option>
                                    
                                        <option value="SD">Sudan</option>
                                    
                                        <option value="SE">Sweden</option>
                                    
                                        <option value="SG">Singapore</option>
                                    
                                        <option value="SH">Saint Helena</option>
                                    
                                        <option value="SI">Slovenia</option>
                                    
                                        <option value="SJ">Svalbard and Jan Mayen Islands</option>
                                    
                                        <option value="SK">Slovakia</option>
                                    
                                        <option value="SL">Sierra Leone</option>
                                    
                                        <option value="SM">San Marino</option>
                                    
                                        <option value="SN">Senegal</option>
                                    
                                        <option value="SO">Somalia</option>
                                    
                                        <option value="SR">Suriname</option>
                                    
                                        <option value="SS">South Sudan</option>
                                    
                                        <option value="ST">Sao Tome and Principe</option>
                                    
                                        <option value="SV">El Salvador</option>
                                    
                                        <option value="SX">Sint Maarten (Dutch part)</option>
                                    
                                        <option value="SY">Syria</option>
                                    
                                        <option value="SZ">Swaziland</option>
                                    
                                        <option value="TC">Turks and Caicos Islands</option>
                                    
                                        <option value="TD">Chad</option>
                                    
                                        <option value="TF">French Southern Territories</option>
                                    
                                        <option value="TG">Togo</option>
                                    
                                        <option value="TH">Thailand</option>
                                    
                                        <option value="TJ">Tajikistan</option>
                                    
                                        <option value="TK">Tokelau</option>
                                    
                                        <option value="TL">Timor-Leste</option>
                                    
                                        <option value="TM">Turkmenistan</option>
                                    
                                        <option value="TN">Tunisia</option>
                                    
                                        <option value="TO">Tonga</option>
                                    
                                        <option value="TR">Turkey</option>
                                    
                                        <option value="TT">Trinidad and Tobago</option>
                                    
                                        <option value="TV">Tuvalu</option>
                                    
                                        <option value="TW">Taiwan</option>
                                    
                                        <option value="TZ">Tanzania</option>
                                    
                                        <option value="UA">Ukraine</option>
                                    
                                        <option value="UG">Uganda</option>
                                    
                                        <option value="UM">United States Minor Outlying Islands</option>
                                    
                                        <option value="US">United States</option>
                                    
                                        <option value="UY">Uruguay</option>
                                    
                                        <option value="UZ">Uzbekistan</option>
                                    
                                        <option value="VA">Vatican</option>
                                    
                                        <option value="VC">Saint Vincent and the Grenadines</option>
                                    
                                        <option value="VE">Venezuela</option>
                                    
                                        <option value="VG">Virgin Islands (British)</option>
                                    
                                        <option value="VI">Virgin Islands (U.S.)</option>
                                    
                                        <option value="VN">Vietnam</option>
                                    
                                        <option value="VU">Vanuatu</option>
                                    
                                        <option value="WF">Wallis and Futuna Islands</option>
                                    
                                        <option value="WS">Samoa</option>
                                    
                                        <option value="YE">Yemen</option>
                                    
                                        <option value="YT">Mayotte</option>
                                    
                                        <option value="ZA">South Africa</option>
                                    
                                        <option value="ZM">Zambia</option>
                                    
                                        <option value="ZW">Zimbabwe</option>
                                    
                    </select> --%>
                    <br>
                    
                    <!-- Email Action -->
                    <center><label for="email" id="emaillbl">Coupon via Email 電郵獲取優惠卷</label></center>
                    <input type="button" value="Submit 提交" style="float: right" onclick="getCoupon()" />
                    <div style="overflow: hidden; padding-right: .5em;">
                    <input type="email" name="email" id="email" placeholder="Email Address" style="background-color: white; color: black !important; text-align: center;" value="Enter Email 輸入電郵" onfocus="if(this.value  == 'Enter Email 輸入電郵') { this.value = ''; } " onblur="if(this.value == '') { this.value = 'Enter Email 輸入電郵'; } ">
                    </div> 
                    
                    <!-- Checkbox -->
                    <div style="padding-top: 10px;">
                        <input type="checkbox" id="accpet-terms-1" name="accpet-terms-1">
                        <label for="accpet-terms-1">
                            <span class="label">
                                本人已閲讀及同意此優惠之條款及細則，及<a href="privacy-zh.html" target="_blank">私人隱政策</a>聲明。
                            </span>
                        </label><br>
                        <input type="checkbox" id="accpet-terms-2" name="accpet-terms-2">
                        <label for="accpet-terms-2">
                            <span class="label">
                                本人同意OPTlCAL88使用本人的個人資料進行其私隱政策聲明內所載的直接促銷用途。OPTlCAL88可向本人寄送通訊、市場營銷和推廣宣傳資料，直至本人另行通知。
                            </span>
                        </label>
                    </div>

                    <hr/>
                    
                    <!-- Header -->
                    <header class="major">
                    	<h4> <s:property value="availableCoupon"/>  Available 已剩下 | <s:property value="issuedcoupon"/> Issued 已下載</h4>
                        <h4>Expiry 有效期: ${expirydue }</h4>
                    </header>
                     	<h3><s:property value="campaignName"/></h3>
						<p> <s:property value="campaignDesc"/> </p>
                    
                    <!-- Terms and Conditions -->
                    <details>
                        <summary><h4 style="display: inline; vertical-align: middle;"> Terms and Conditions 條款和條件</h4></summary>
                        
                        <textarea id="campaignTc" name="campaignTc"	rows="5" class="form-control" readonly="true" style="background-color: #2e3450;"><s:property value="campaignTc" /></textarea>
                    </details>
                                  
                    <!-- Locations -->
                    <hr />
                    <details>
                        <summary><h4 style="display: inline; vertical-align: middle;"> Redeem Locations 兌換地點</h4></summary>
                        <section class="spotlights">
                            <br />
                            <section id="listing" style="background-color: #2e3450;">
                            <s:iterator value="siteslist" status="sitelst" >
                            
                                <div class="4u 12u$(medium)" style="padding: 0.5em;">
                                    <center class="box">
                                        <h4><s:property value="site.siteName"/></h4>
                                        <s:property value="site.siteAddress"/>
                                        <br />
                                        <br />
                                        <a href="tel:${site.siteContact }" class="button">Call 電話  <s:property value="site.siteContact"/></a>
                                    </center>
                                </div>
                                
                                <s:if test="%{#sitelst.count%3 == 0}">
			                    	</section>
			                    	<section id="listing" style="background-color: #2e3450;">
			                    </s:if>
                            </s:iterator>
                            </section>
                        </section>
                    </details>
                    <br />
                    
                    <!-- Google Map -->
                    <center class="box">
                        <div id="sitesmap" style="border:0; width: 100%; height: 300px;"></div>
                    </center>
                                    
                    <!-- Contact -->
                    <hr />
                    <section>
                        <div class="contact-method">
                            <span class="icon alt fa-envelope"></span>
                            <h4>Email 電郵</h4>
                            <a href="mailto:${merchantEmail }?subject=Enquiry"><s:property value="merchantEmail"/></a>
                        </div>
                    </section>
              <%--       <section>
                        <div class="contact-method">
                            <span class="icon alt fa-phone"></span>
                            <h4>Phone 電話</h4>
                            <span><a href="tel:${merchantHotline }"><s:property value="merchantHotline"/></a></span>
                        </div>
                    </section> --%>
                    <hr />
                    
                </div>
            </section>
					
        <!-- Main -->
        </div>

        <!-- Footer -->
        <footer id="footer" style="background-color: #2e3450;">
            <div class="inner" style=" padding-top: 0em; padding-bottom: 1em;">
                <ul class="copyright">
                    <li>&copy; <s:property value="merchantName"/></li>
                    <li>Powered by <a href="http://www.mezzofy.com">Mezzofy</a></li>
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