package com.qa.apiTest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;
import com.qa.testBase.TestBase;

public class GetAPITest extends TestBase {
	String url; 
	String serviceURL;
	String actURL;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp() {
		
	url = prop.getProperty("URL");
	serviceURL= prop.getProperty("serviceURL");
	
	actURL = url + serviceURL;
	
	}
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
	

		restClient = new RestClient();
		restClient.get(actURL);
		
	}
	
	
}
