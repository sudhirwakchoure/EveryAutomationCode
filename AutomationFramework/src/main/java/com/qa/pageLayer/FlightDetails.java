package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.testBase.TestBase;

public class FlightDetails extends TestBase {

	
	private WebElement priceDepartureFlight;
    
	private WebElement book;
	
	public FlightDetails() {
	   	priceDepartureFlight = driver.findElement(By.xpath("(//span[text()='PRICE'])[1]"));
		book = driver.findElement(By.xpath("//input[@type='button']"));
	}
	
	public void setDepartureFlight() {
		priceDepartureFlight.click();
		driver.findElement(By.xpath("(//label[@class='lh1-5'])[1]")).click();
	}
	
	public void setBook() {
		book.click();
	}
	
	
	
}
