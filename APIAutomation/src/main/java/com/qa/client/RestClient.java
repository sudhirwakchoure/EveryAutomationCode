package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	//get method
	public void get(String url) throws ClientProtocolException, IOException
	{
	   CloseableHttpClient httpClient = HttpClients.createDefault();//
	   HttpGet get = new HttpGet(url);	//http get request
	   CloseableHttpResponse httpResponse = httpClient.execute(get);  //hit the get url
		
	   //status code
	   int statusCode = httpResponse.getStatusLine().getStatusCode();
	   System.out.println("Staus Code: "+ statusCode);
	   
	   
	   //for response(payload) 
	   String responseString =EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
	
	   JSONObject responseJson = new JSONObject(responseString);
	   System.out.println("Response JSON from API:"+ responseJson);
	   
	   //for all header 
	   
	   Header[] headerArray = httpResponse.getAllHeaders();
	   
	   HashMap<String,String> allHeader = new HashMap<String,String>();
	   
	   for(Header header : headerArray) {
		   allHeader.put(header.getName(), header.getValue());
		   
	   }
	   
	   System.out.println("headers"+ allHeader);
	   
	   
	}
	   
	
	
	
	
	
	
}
