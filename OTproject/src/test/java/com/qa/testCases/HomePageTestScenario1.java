package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.HomePage;
import com.qa.testbase.TestBase;


public class HomePageTestScenario1 extends TestBase {

	
	HomePage homepageobj;
	
	@Test
	public void search() {
		
	homepageobj = new HomePage();
	
	homepageobj.setSearchBox();
	homepageobj.setSearchButton();
	
	}
	
	
	@Test
	public void homepagelogo() {
	homepageobj = new HomePage();
	Boolean result = homepageobj.verifyLogo();
	System.out.println(result);
	Assert.assertTrue(result);
	}
	
}
