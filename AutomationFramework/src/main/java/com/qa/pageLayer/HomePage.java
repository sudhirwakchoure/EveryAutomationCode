package com.qa.pageLayer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	//WebElement declared as a private because We provided encapsulation concept
	private WebElement from;
	
	private WebElement to;
	
	private WebElement searchFlight;
	
	private WebElement roundTrip;
	
	//constructor is used to initialized the WebElement
	public HomePage() {
	
		from = driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[1]"));
		to = driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[2]"));
	    searchFlight = driver.findElement(By.xpath("//span[contains(text(),'SEARCH FLIGHTS')]"));
	    roundTrip = driver.findElement(By.xpath("//span[text()='Round-trip']"));
	    
	}
	
	//usage

	public void setRoundTrip() {
		roundTrip.click();
	}
	
	public void setFrom(String city1) {
		a.click(from).perform();;
		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
		e1.sendKeys(city1);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		for(int i=0;i<elements.size();i++) {
			WebElement element =elements.get(i);
			element.click();
		    break;	
		
			
		}
		
		
	}
	
	
	public void setTo(String city2)  {	
	a.click(to).perform();	
	WebElement e3 = driver.findElement(By.xpath("//input[@type='text']"));
	e3.sendKeys(city2);
	List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
	for(int i=0;i<elements.size();i++) {
		WebElement element =elements.get(i);
		element.click();
	    break;		
	}
	
	driver.findElement(By.xpath("//span[text()='Done']")).click();
	}
	
	public void setSearchFlight() {
		searchFlight.click();
	}
	
	
}
