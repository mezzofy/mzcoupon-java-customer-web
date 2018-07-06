package com.mezzofy.coupon.ws;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.mezzofy.coupon.api.model.CampaignListModel;
import com.mezzofy.coupon.data.CustomerData;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;

public class JerseyRESTClient {
	
	private static final String KEY = "";
	private static final String SECRET = "";

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException, URISyntaxException {

		Gson gson = new Gson();		
		CustomerData reqobject = new CustomerData();
		reqobject.setCustomerEmail("first@gmail.com");
		reqobject.setCustomerPassword("12345678");		
		CampaignListModel datacust = JerseyRESTClient.objectFromGET(CampaignListModel.class, "http://agg.dev.com:8080/alidriver_getso/api/v1/campaigns", KEY);
		
	}

	public static <T> T objectFromGET(Class<T> outputclass, String path, String key) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		Gson gson = new Gson();

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		client.addFilter(new HTTPBasicAuthFilter(key, "X"));
		WebResource webResource = client.resource(path);
		T response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(outputclass);
		return response;
	}
	
	public static <T> List<T> listFromGET(Type collectionType, String path, String key) {
		Gson gson = new Gson();
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		client.addFilter(new HTTPBasicAuthFilter(key, "X"));

		WebResource webResource = client.resource(path);
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
		String jsonstr = response.getEntity(String.class);
		List<T> reslist = gson.fromJson(jsonstr, collectionType);
		return reslist;
	}

	public static <T> T objectFromPOST(Object reqobject, Class<T> outputclass, String path,String key) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		Gson gson = new Gson();

		

//		ObjectMapper objectMapper = new ObjectMapper();
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
	
		client.addFilter(new HTTPBasicAuthFilter(key, "X"));


		WebResource webResource = client.resource(path);
		T response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(outputclass, reqobject);  // objectMapper.writeValueAsString(reqobject)

		
		return response;
	}
	
	public static int statusFromPOST(Object reqobject, String path) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		Gson gson = new Gson();
		

		ObjectMapper objectMapper = new ObjectMapper();
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);		
		OAuthParameters params = new OAuthParameters().signature("HAMC-SHA1").consumerKey("key1");
		OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret1");
		OAuthClientFilter filter = new OAuthClientFilter(client.getProviders(), params, secrets);
		
		client.addFilter(filter);

		WebResource webResource = client.resource(path);
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, objectMapper.writeValueAsString(reqobject));

		return response.getStatus();
	}
	
	public static int statusforattachFromPOST(Object reqobject, String path) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		Gson gson = new Gson();
		

		ObjectMapper objectMapper = new ObjectMapper();
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		
		OAuthParameters params = new OAuthParameters().signature("HAMC-SHA1").consumerKey("key1");
		OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret1");
		OAuthClientFilter filter = new OAuthClientFilter(client.getProviders(), params, secrets);
		
		client.addFilter(filter);

		WebResource webResource = client.resource(path);
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, objectMapper.writeValueAsString(reqobject));

	
		return response.getStatus();
	}
	
	public static int statusFromPUT(String path) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		
		OAuthParameters params = new OAuthParameters().signature("HAMC-SHA1").consumerKey("key1");
		OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret1");
		OAuthClientFilter filter = new OAuthClientFilter(client.getProviders(), params, secrets);
		
		client.addFilter(filter);

		WebResource webResource = client.resource(path);
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).put(ClientResponse.class);

		return response.getStatus();
	}
	
	public static int statusFromDELETE(String path) throws JsonGenerationException, JsonMappingException, UniformInterfaceException, IOException {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		
		OAuthParameters params = new OAuthParameters().signature("HAMC-SHA1").consumerKey("key1");
		OAuthSecrets secrets = new OAuthSecrets().consumerSecret("secret1");
		OAuthClientFilter filter = new OAuthClientFilter(client.getProviders(), params, secrets);
		
		client.addFilter(filter);

		WebResource webResource = client.resource(path);
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).delete(ClientResponse.class);


		return response.getStatus();
	}
}
