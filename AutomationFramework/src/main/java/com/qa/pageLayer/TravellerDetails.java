package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import com.qa.testBase.TestBase;

public class TravellerDetails extends TestBase{

	private WebElement title;
	
	private WebElement nameAndMiddleName;
	
	private WebElement lastName;
	
	private WebElement email;
	
	private WebElement mobile;
	
	public TravellerDetails() {
		title= driver.findElement(By.xpath("//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 evINTo']"));
	    nameAndMiddleName= driver.findElement(By.xpath("//input[@name='givenname']"));
	    lastName =driver.findElement(By.xpath("//input[@name='lastname']"));
        email = driver.findElement(By.xpath("//input[@name='email']"));
        mobile = driver.findElement(By.xpath("//input[@name='mobile']")); 		
	
	}
	
	
	public void setTitle() {
		Select s1 = new Select(title);
		s1.selectByIndex(1);
	}
	
	public void setNameAndMiddleName(String fname) {
		nameAndMiddleName.sendKeys(fname);
	}
	
	
	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void setEmail(String email1) {
		email.sendKeys(email1);
	}
	
	public void setmobile(String mobile1) {
		mobile.sendKeys(mobile1);
	}
	
	
	
}
