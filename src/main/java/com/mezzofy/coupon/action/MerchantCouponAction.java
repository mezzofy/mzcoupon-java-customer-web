package com.mezzofy.coupon.action;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.mezzofy.coupon.api.model.CampaignGroupListModel;
import com.mezzofy.coupon.api.model.CampaignGroupModel;
import com.mezzofy.coupon.api.model.CampaignImageModel;
import com.mezzofy.coupon.api.model.CampaignListModel;
import com.mezzofy.coupon.api.model.CampaignModel;
import com.mezzofy.coupon.api.model.CustomerCouponListModel;
import com.mezzofy.coupon.api.model.CustomerModel;
import com.mezzofy.coupon.api.model.MerchantModel;
import com.mezzofy.coupon.api.model.PaymentDetailModel;
import com.mezzofy.coupon.api.model.SiteListModel;
import com.mezzofy.coupon.api.model.SiteModel;
import com.mezzofy.coupon.data.CampaignImageData;
import com.mezzofy.coupon.data.CustomerCouponData;
import com.mezzofy.coupon.data.CustomerData;
import com.mezzofy.coupon.data.MerchantData;
import com.mezzofy.coupon.data.PoData;
import com.mezzofy.coupon.data.SiteData;
import com.mezzofy.coupon.ws.JerseyRESTClient;
import com.sun.jersey.api.client.UniformInterfaceException;

import net.sf.json.JSONArray;

@SuppressWarnings("serial")
public class MerchantCouponAction extends BaseAction {

	private String merchant;
	private String merchantId;
	private String merchantCode;
	private String merchantName;
	private String merchantDesc;
	private String merchantLogourl;
	private String merchantImageurl;
	private String merchantHotline;
	private String merchantEmail;
	private String campaignId;
	private String campaignName;
	private String campaignDesc;
	private String campaignTc;
	private Double sellingPrice;
	private Integer expiryDays;
	private String fromDate;
	private String toDate;
	private String campaignImage;
	private String campgrpId;
	private int soldcoupon;
	private int leftcoupon;
	private String expirydue;
	private String expiryname;
	private String campaignCode;
	MerchantModel objmerchant;
	private String passbookUrl;	
	private int redeemcoupon;
	private int issuedcoupon;
	private int allocationcoupon;
	private String email;
	private String returnurl;
	private String couponNo;
	private String couponUrl;
	private String campaignType;
	private double saleprice;
	private double orginalprice;
	private String payurl;
	private String paypal;
	private String currency;
	private String barcodeUrl;
	private String qrcodeUrl;
	private String poId;
    private String customerFirstName;
    private String customerGender;
    private String customerDOB;
    private String customerCountry;
    private String customerMobile;
	private int availableCoupon;
    private String customerDate;
    private String customerMonth;
    private List<CampaignImageModel> campaignimages;
    private String merchantTimezone;
    private String couponlistUrl;
	public String list() {
		getMerchantDetail();
		return "merchantcouponlist";
	}

	private void getMerchantDetail() {
		MerchantModel objmerchant;		
		try {
			merchantTimezone="GMT0";
			if (merchantCode == null) {
				HttpServletRequest request = ServletActionContext.getRequest();
		/*		String urlpath = request.getServerName().toString().toString().replace(".", "@");
				String[] splits = urlpath.split("@");
				merchantCode = splits[0];*/					
				objmerchant = JerseyRESTClient.objectFromGET(MerchantModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns/merchant/"+MerchantConfigure.getMerchantCode() , MerchantConfigure.getAuthKey());
			} else {
				objmerchant = JerseyRESTClient.objectFromGET(MerchantModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns/merchant/" + MerchantConfigure.getMerchantCode(), MerchantConfigure.getAuthKey());
			}
			if (objmerchant != null) {
				MerchantData objdata = objmerchant.getMerchant();
				if (objdata != null) {
					merchantName = objdata.getMerchantName();
					merchantDesc = objdata.getMerchantDesc();
					merchantLogourl = objdata.getMerchantLogourl();
					merchantImageurl = objdata.getMerchantImageurl();	
					merchantEmail = objdata.getMerchantEmail();
					merchantHotline = objdata.getMerchantHotline();
				}
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String view() {
		String retval = "merchantsinglecoupon";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		try {
			
			HttpServletRequest request = ServletActionContext.getRequest();
		/*	String urlpath = request.getServerName().toString().toString().replace(".", "@");
			String[] splits = urlpath.split("@");
			merchantCode = splits[0];*/			
			currency="USD";
			if(objmerchant==null)
			objmerchant = JerseyRESTClient.objectFromGET(MerchantModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns/merchant/" + MerchantConfigure.getMerchantCode(), MerchantConfigure.getAuthKey());
		
		if (objmerchant != null) {
			MerchantData objdata = objmerchant.getMerchant();
			if (objdata != null) {
				merchantName = objdata.getMerchantName();
				merchantDesc = objdata.getMerchantDesc();
				if(objdata.getMerchantLogourl()!=null){
					merchantLogourl = objdata.getMerchantLogourl();
				}else{
						merchantLogourl="https://s3-ap-southeast-1.amazonaws.com/mzcoupon/logo/thumnail.png";
				}
				merchantImageurl = objdata.getMerchantImageurl();
				merchantEmail = objdata.getMerchantEmail();
				merchantHotline = objdata.getMerchantHotline();
			}
		}
			
		//	PaymentDetailModel paydtl = (PaymentDetailModel)JerseyRESTClient.objectFromGET(PaymentDetailModel.class, "http://" +getHostname(merchantCode)+ MerchantConfigure.getServerUrl()+"/api/v1/payments/paypal", objbase.getBasic().getOauthKey());
			CampaignModel objcmpmod = JerseyRESTClient.objectFromGET(CampaignModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns/code/" + campaignCode, MerchantConfigure.getAuthKey());
			campaignId=objcmpmod.getCampaign().getCampaignId();
			campaignName = objcmpmod.getCampaign().getCampaignName();
			campaignDesc = objcmpmod.getCampaign().getCampaignDesc();
			campaignType = objcmpmod.getCampaign().getBrand();
			if(objcmpmod.getCampaign().getBrand().equals("C")){
			sellingPrice=objcmpmod.getCampaign().getSellingPrice();
			orginalprice=objcmpmod.getCampaign().getOrginalPrice();
			}
			if(objcmpmod.getCampaign().getDayFilter().equals("D")){
				
			fromDate = sdf.format(objcmpmod.getCampaign().getFromDate());
			toDate = sdf.format(objcmpmod.getCampaign().getToDate());
			expirydue=fromDate+"-"+toDate;
			}else{
			expiryDays = objcmpmod.getCampaign().getExpiryDays();
			expirydue=expiryDays+" days";
			}
//			 if ((paydtl != null) && (paydtl.getPaymentdetail() != null) && (paydtl.getPaymentdetail().getPaymentDetailId() != null)) {
//			        this.currency = paydtl.getPaymentdetail().getCurrency();
//			  }
			
			redeemcoupon = objcmpmod.getCampaign().getRedeemcoupon();
			issuedcoupon = objcmpmod.getCampaign().getIssuedcoupon();
			allocationcoupon=objcmpmod.getCampaign().getAllocationcoupon();
			availableCoupon=objcmpmod.getCampaign().getAvailableCoupon();
		//	expirydue = objcmpmod.getCampaign().getExpirydue();
			expiryname = objcmpmod.getCampaign().getExpiryname();
			campaignTc = objcmpmod.getCampaign().getCampaignTc();
			merchantId = objcmpmod.getCampaign().getMerchantId();
			passbookUrl="http://"+MerchantConfigure.getMerchantUrl()+MerchantConfigure.getServerUrl()+"/"+objcmpmod.getCampaign().getCampaignCode()+"/download";
		//	passbookUrl="http://localhost:8080/coupons/"+objcmpmod.getCampaign().getCampaignCode()+"/download";
			couponUrl="http://"+MerchantConfigure.getMerchantUrl()+MerchantConfigure.getServerUrl()+"/"+objcmpmod.getCampaign().getCampaignCode();
			couponlistUrl="http://"+MerchantConfigure.getMerchantUrl()+MerchantConfigure.getServerUrl()+"";
			request.getSession().setAttribute("url", passbookUrl);
			
			//passbookUrl="http://localhost:8080/coupons/"+objcmpmod.getCampaign().getCampaignCode()+"/download";
			if (objcmpmod.getCampaign().getCampaignimages() != null && objcmpmod.getCampaign().getCampaignimages().size() > 0){
				campaignImage = objcmpmod.getCampaign().getCampaignimages().get(0).getCampaignimage().getCampaignImage();
				campaignimages=objcmpmod.getCampaign().getCampaignimages();
			}else{
				CampaignImageModel img=new CampaignImageModel();
				List<CampaignImageModel> lst=new ArrayList<CampaignImageModel>();
				CampaignImageData imgdata=new CampaignImageData();
				imgdata.setCampaignImage("images/default-coupon.png");
				img.setCampaignimage(imgdata);
				lst.add(img);
				campaignimages=lst;
			}
		//	getMerchantDetail();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retval;
	}
	
	public String download(){
		String retval="failure";
     try{
    	 merchantTimezone="GMT0";
    	 HttpServletRequest request = ServletActionContext.getRequest();

		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		// returnurl="http://localhost:8080/";
		returnurl="http://"+MerchantConfigure.getMerchantUrl()+MerchantConfigure.getServerUrl()+"";
		 Date custdate=null;
		if(customerDate!=null && customerMonth!= null){
			 customerDOB=customerDate+"-"+customerMonth+"-0000";
			 custdate=sdf.parse(customerDOB);
		}
			
		
			
		 PoData podata = null;
		 //passbookUrl=(String)request.getSession().getAttribute("url");
		 couponUrl=returnurl+"/"+campaignCode;
		 passbookUrl=couponUrl+"/download";
		if(paypal.equals("download")){
		 
         CampaignModel objcmpmod = JerseyRESTClient.objectFromGET(CampaignModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns/code/" + campaignCode, MerchantConfigure.getAuthKey());
	         if(email!=null && email.length()>2){}else{
				  email="guest@mezzofy.com";
			  }
    			
    			 if(email!=null && email.length()>2){
    	    		 if(objcmpmod.getCampaign().getBrand().equals("F")){
    		    		// podata=JerseyRESTClient.objectFromGET(PoData.class, "http://"+merchantCode+MerchantConfigure.getServerUrl()+"/api/v1/pos/passbookemail/" + campaignCode+"?email="+email, objbase.getBasic().getOauthKey());
    		    		CustomerModel custmodel=new CustomerModel();
    		    		CustomerData dataobj=new CustomerData();
    		    		if(customerCountry!=null)
    		    		dataobj.setCountryCode(customerCountry);
    		       		if(custdate!=null)
    			    		dataobj.setCustomerDob(custdate);
    		       		if(customerFirstName!=null)
    			    		dataobj.setCustomerFirstName(customerFirstName);
    		       		if(customerGender!=null)
    			    		dataobj.setCustomerGender(customerGender);
    		       		if(customerMobile!=null)
    			    		dataobj.setCustomerMobile(customerMobile);
    		       		if(email!=null)
    			    		dataobj.setCustomerEmail(email);
    		       		    custmodel.setCustomer(dataobj);
    		       		    podata=JerseyRESTClient.objectFromPOST(custmodel,PoData.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/pos/pofree/"+campaignCode, MerchantConfigure.getAuthKey());
    	  
    			 
    			/* podata = JerseyRESTClient.objectFromGET(
							PoData.class, "http://" + MerchantConfigure.getMerchantCode()
									+ MerchantConfigure.getServerUrl()+"/api/v1/pos/passbookemail/" + campaignCode + "?email=" + email+"&name="+customerFirstName+"&customerDOB="+customerDOB+
									"&countrycode="+customerCountry+"&mobile="+customerMobile+"&gender="+customerGender,MerchantConfigure.getAuthKey());*/
	    		 if(podata!=null ){
	    			
	    			 List<CustomerCouponData> lstcoupons=podata.getCustomercoupons();
	    			// request.getSession().setAttribute("passbook", podata.getPayResponse());
	    			 couponNo= podata.getPayToken();
	    			 if(lstcoupons!=null && lstcoupons.size()>0){
	    				 CustomerCouponData customerdata=lstcoupons.get(0);
	    					 request.getSession().setAttribute("passbook", customerdata.getPassbookUrl());
	    					 request.getSession().setAttribute("barcode", customerdata.getBarcodeUrl());
	    					 barcodeUrl=customerdata.getBarcodeUrl();
	    					 couponNo= customerdata.getCouponNo();
	    					 qrcodeUrl=customerdata.getQrcodeUrl();
	    				 
	    			 }
	    			
	    			
	    			
	    			 passbookUrl=passbookUrl+"/passbook";
	    			
	    			 couponUrl=couponUrl+"/paysucess?poId="+podata.getPoId();
	    		 }
	    		 retval="couponemail";
    		 }else{
    			 PaymentDetailModel paydtl=JerseyRESTClient.objectFromGET(PaymentDetailModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/payments/paypal", MerchantConfigure.getAuthKey());
    			if(paydtl!=null && paydtl.getPaymentdetail()!=null && paydtl.getPaymentdetail().getPaymentDetailId()!=null){
    			 podata=JerseyRESTClient.objectFromGET(PoData.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/pos/paypalemail/" + campaignCode+"?email="+email, MerchantConfigure.getAuthKey());
	    		 if(podata!=null && podata.getPayResponse()!=null){
	    		
	    			 request.getSession().setAttribute("passbook", podata.getPayResponse());
	    			 request.getSession().setAttribute("poId", podata.getPoId());
	    			 couponNo= podata.getPayToken();
	    			 passbookUrl=passbookUrl+"/passbook";
	    			 payurl="http://platform.mezzofy.com/paypal_process.do?poId="+podata.getPoId()+"&paymentDetailId="+paydtl.getPaymentdetail().getPaymentDetailId();
	    			 CustomerCouponListModel  customerCouponListModel=JerseyRESTClient.objectFromGET(CustomerCouponListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/customercoupons/poscoupons?poId="+podata.getPoId(), MerchantConfigure.getAuthKey());
	    			if(customerCouponListModel!=null && customerCouponListModel.getCustomercoupons()!=null && customerCouponListModel.getCustomercoupons().size()>0 ){
	    				couponNo=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getCouponId();
	    				barcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getBarcodeUrl();
	    				qrcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getQrcodeUrl();
	    				request.getSession().setAttribute("passbook", customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getPassbookUrl());
	    			}
	    			
	    		 }
	    		
    			}else{
    				payurl="http://"+MerchantConfigure.getMerchantUrl()+MerchantConfigure.getServerUrl()+"/"+campaignCode;
    			}
    			 retval="paypal";
    		 }
    		
    	 }else{
    		 podata=JerseyRESTClient.objectFromGET(PoData.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/pos/passbook/" + campaignCode, MerchantConfigure.getAuthKey());
    		 if(podata!=null && podata.getPayResponse()!=null){
    			
    			 request.getSession().setAttribute("passbook", podata.getPayResponse());
    			 passbookUrl=passbookUrl+"/passbook";
    			 retval="passbook";
    		 }
    		 
    	 }
    	 if(podata!=null){
 			
 		 }else{
 			 retval="failure";
 		 }
		}else{
			//paypal success
			
			 passbookUrl=(String)request.getSession().getAttribute("url");
			 
		     poId=request.getAttribute("poId").toString();
	
			 CustomerCouponListModel  customerCouponListModel=JerseyRESTClient.objectFromGET(CustomerCouponListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/customercoupons/poscoupons?poId="+poId, MerchantConfigure.getAuthKey());
				if(customerCouponListModel!=null && customerCouponListModel.getCustomercoupons()!=null && customerCouponListModel.getCustomercoupons().size()>0 ){
					 couponNo=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getCouponId();
					 barcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getBarcodeUrl();
					 qrcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getQrcodeUrl();
					 request.getSession().setAttribute("passbook", customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getPassbookUrl());
					 passbookUrl=passbookUrl+"/passbook";
				}
	    	 
			retval="couponemail";
		}
    	 
    
	/*} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();*/
	}catch (Exception e) {
		// TODO: handle exception
	}
     return retval;
	}
	
	
	
	
	
	public String paysucess(){
		String retval="couponemail";
		try{
		 
		 HttpServletRequest request = ServletActionContext.getRequest();
		 
	     poId=request.getAttribute("poId").toString();
		 
		 CustomerCouponListModel  customerCouponListModel=JerseyRESTClient.objectFromGET(CustomerCouponListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/customercoupons/poscoupons?poId="+poId, MerchantConfigure.getAuthKey());
			if(customerCouponListModel!=null && customerCouponListModel.getCustomercoupons()!=null && customerCouponListModel.getCustomercoupons().size()>0 ){
				 couponNo=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getCouponId();
				 barcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getBarcodeUrl();
				 qrcodeUrl=customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getQrcodeUrl();
				 request.getSession().setAttribute("passbook", customerCouponListModel.getCustomercoupons().get(0).getCustomercoupon().getPassbookUrl());
				 passbookUrl=passbookUrl+"/passbook";
			}
    	 
    	
	}catch (Exception e) {
		// TODO: handle exception
	}
	
     return retval;
	}
	
	
	public void passbook(){
		 try{
	    	 HttpServletRequest request = ServletActionContext.getRequest();
			 
			 String passbookurl=(String)request.getSession().getAttribute("passbook");
	    	
	 		 File file=new File(passbookurl);
		     URL url = new URL(passbookurl); 	     
		     URLConnection connection = url.openConnection();	   
		     InputStream stream = connection.getInputStream(); 	    
		 	  HttpServletResponse response = ServletActionContext.getResponse();
		 	  response.setHeader("Pragma", "no-cache");
			  response.setHeader("Content-type", "application/vnd.apple.pkpass");
			  response.setHeader("Content-Disposition",
			                         "attachment; filename="+file.getName());		  
		     BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());
		     int len;               
		     byte[] buf = new byte[1024]; 
		     while ((len = stream.read(buf)) > 0)   
		           {  
		      outs.write(buf, 0, len);    
		           }                  
		     outs.close();
	 		 
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public List<CampaignGroupModel> getCampaignGrouplist() {
		List<CampaignGroupModel> camgrplist = null;
		try {
			
			
			CampaignGroupListModel campaigngrpmodel = JerseyRESTClient.objectFromGET(CampaignGroupListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigngroups", MerchantConfigure.getAuthKey());
			camgrplist = campaigngrpmodel.getCampaigngroups();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return camgrplist;
	}
	
	public List<CampaignModel> getCampaignlist() {
		List<CampaignModel> campaignlist = null;
		try {
			
			
			CampaignListModel campaignmodel = null;
			if (campgrpId != null && campgrpId.length() > 0) {
				campaignmodel = JerseyRESTClient.objectFromGET(CampaignListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigngroups/" + campgrpId + "/campaigns", MerchantConfigure.getAuthKey());
			} else {
				campaignmodel = JerseyRESTClient.objectFromGET(CampaignListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/campaigns?status=A", MerchantConfigure.getAuthKey());
			}
			if (campaignmodel != null)
				campaignlist = campaignmodel.getCampaigns();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return campaignlist;
	}
	
	public List<SiteModel> getSiteslist() {
		List<SiteModel> siteslist = null;
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
/*			String urlpath = request.getServerName().toString().toString().replace(".", "@");
			String[] splits = urlpath.split("@");
			merchantCode = splits[0];*/	
			
			if(campaignCode!=null){
				 request.getSession().setAttribute("campaignCode", campaignCode);
			}else{
				campaignCode=(String)request.getSession().getAttribute("campaignCode");
			}
			
			SiteListModel objsite =null;
			if(campaignCode!=null)
			 objsite = JerseyRESTClient.objectFromGET(SiteListModel.class, "http://"+MerchantConfigure.getMerchantCode()+MerchantConfigure.getServerUrl()+"/api/v1/sites/campaignsites/"+campaignCode,MerchantConfigure.getAuthKey());
			if(objsite!=null)
			siteslist = objsite.getSites();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return siteslist;
	}
	
	public String sitelocations() {
		String retval;
		JSONArray list = new JSONArray();
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		for (SiteModel objsite : getSiteslist()) {
			SiteData objdata = objsite.getSite();
			if (objdata.getSiteLatitude() !=null && objdata.getSiteLatitude() > 0.0 && objdata.getSiteLongitude() !=null && objdata.getSiteLongitude() > 0.0) {
				hashmap.put("lat", objdata.getSiteLatitude());
				hashmap.put("lng", objdata.getSiteLongitude());
				hashmap.put("sitelocation", objdata.getSiteAddress());
				hashmap.put("sitename", objdata.getSiteName());
				list.add(hashmap);
			}
		}

		retval = list.toString();
		try {
			inputStream = new ByteArrayInputStream(retval.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	

	
	
	private InputStream inputStream;
	public InputStream getInputStream() {
		return inputStream;
	}
	
	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantDesc() {
		return merchantDesc;
	}

	public void setMerchantDesc(String merchantDesc) {
		this.merchantDesc = merchantDesc;
	}

	public String getMerchantLogourl() {
		return merchantLogourl;
	}

	public void setMerchantLogourl(String merchantLogourl) {
		this.merchantLogourl = merchantLogourl;
	}

	public String getMerchantImageurl() {
		return merchantImageurl;
	}

	public void setMerchantImageurl(String merchantImageurl) {
		this.merchantImageurl = merchantImageurl;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}


	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDesc() {
		return campaignDesc;
	}

	public void setCampaignDesc(String campaignDesc) {
		this.campaignDesc = campaignDesc;
	}

	public String getCampaignTc() {
		return campaignTc;
	}

	public void setCampaignTc(String campaignTc) {
		this.campaignTc = campaignTc;
	}

	public Integer getExpiryDays() {
		return expiryDays;
	}

	public void setExpiryDays(Integer expiryDays) {
		this.expiryDays = expiryDays;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getCampaignImage() {
		return campaignImage;
	}

	public void setCampaignImage(String campaignImage) {
		this.campaignImage = campaignImage;
	}

	public String getMerchantHotline() {
		return merchantHotline;
	}

	public void setMerchantHotline(String merchantHotline) {
		this.merchantHotline = merchantHotline;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getCampgrpId() {
		return campgrpId;
	}

	public void setCampgrpId(String campgrpId) {
		this.campgrpId = campgrpId;
	}

	public int getSoldcoupon() {
		return soldcoupon;
	}

	public void setSoldcoupon(int soldcoupon) {
		this.soldcoupon = soldcoupon;
	}

	public int getLeftcoupon() {
		return leftcoupon;
	}

	public void setLeftcoupon(int leftcoupon) {
		this.leftcoupon = leftcoupon;
	}

	public String getExpirydue() {
		return expirydue;
	}

	public void setExpirydue(String expirydue) {
		this.expirydue = expirydue;
	}

	public String getExpiryname() {
		return expiryname;
	}

	public void setExpiryname(String expiryname) {
		this.expiryname = expiryname;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getPassbookUrl() {
		return passbookUrl;
	}

	public void setPassbookUrl(String passbookUrl) {
		this.passbookUrl = passbookUrl;
	}

	public int getRedeemcoupon() {
		return redeemcoupon;
	}

	public void setRedeemcoupon(int redeemcoupon) {
		this.redeemcoupon = redeemcoupon;
	}

	public int getIssuedcoupon() {
		return issuedcoupon;
	}

	public void setIssuedcoupon(int issuedcoupon) {
		this.issuedcoupon = issuedcoupon;
	}

	public int getAllocationcoupon() {
		return allocationcoupon;
	}

	public void setAllocationcoupon(int allocationcoupon) {
		this.allocationcoupon = allocationcoupon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReturnurl() {
		return returnurl;
	}

	public void setReturnurl(String returnurl) {
		this.returnurl = returnurl;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponUrl() {
		return couponUrl;
	}

	public void setCouponUrl(String couponUrl) {
		this.couponUrl = couponUrl;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	public double getOrginalprice() {
		return orginalprice;
	}

	public void setOrginalprice(double orginalprice) {
		this.orginalprice = orginalprice;
	}

	public String getPayurl() {
		return payurl;
	}

	public void setPayurl(String payurl) {
		this.payurl = payurl;
	}

	public String getPaypal() {
		return paypal;
	}

	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBarcodeUrl() {
		return barcodeUrl;
	}

	public void setBarcodeUrl(String barcodeUrl) {
		this.barcodeUrl = barcodeUrl;
	}

	public String getPoId() {
		return poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public List<CampaignImageModel> getCampaignimages() {
		return campaignimages;
	}

	public void setCampaignimages(List<CampaignImageModel> campaignimages) {
		this.campaignimages = campaignimages;
	}

	public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public int getAvailableCoupon() {
		return availableCoupon;
	}

	public void setAvailableCoupon(int availableCoupon) {
		this.availableCoupon = availableCoupon;
	}

	public String getCustomerDate() {
		return customerDate;
	}

	public void setCustomerDate(String customerDate) {
		this.customerDate = customerDate;
	}

	public String getCustomerMonth() {
		return customerMonth;
	}

	public void setCustomerMonth(String customerMonth) {
		this.customerMonth = customerMonth;
	}

	public String getMerchantTimezone() {
		return merchantTimezone;
	}

	public void setMerchantTimezone(String merchantTimezone) {
		this.merchantTimezone = merchantTimezone;
	}

	public String getCouponlistUrl() {
		return couponlistUrl;
	}

	public void setCouponlistUrl(String couponlistUrl) {
		this.couponlistUrl = couponlistUrl;
	}

	

	
	
	
	
}
