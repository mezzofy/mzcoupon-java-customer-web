package com.mezzofy.coupon.ws;

import javax.ws.rs.WebApplicationException;

import com.sun.jersey.oauth.server.OAuthServerRequest;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import com.sun.jersey.oauth.signature.OAuthSignature;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

public class AuthRequestFilter implements ContainerRequestFilter {

	public ContainerRequest filter(ContainerRequest arg0) {
		OAuthServerRequest oauthRequest = new OAuthServerRequest(arg0);
		OAuthParameters params = new OAuthParameters();
		params.readRequest(oauthRequest);
		System.out.println("Consumer Key :" + params.getConsumerKey());
		System.out.println("Signature :" + params.getSignature());
		System.out.println("Signature Method :" + params.getSignatureMethod());
		 String sec=null;
		 if(params.getConsumerKey().equals("key1"))
		 sec = "secret1";
		 else if(params.getConsumerKey().equals("key2"))
		 sec = "secret2";


		OAuthSecrets secrets = new OAuthSecrets().consumerSecret(sec);
		try {
			if (!OAuthSignature.verify(oauthRequest, params, secrets)) {
				throw new WebApplicationException(401);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(401);
		}

		return arg0;
	}
}
