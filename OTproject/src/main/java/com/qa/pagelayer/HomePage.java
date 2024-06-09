package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchbox;
	
	@FindBy(xpath ="//button[@name='submit_search']")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	
	public HomePage() {
		
	 PageFactory.initElements(driver, this);	
	}
	
	
	public void setSearchBox() {
		searchbox.sendKeys("Printed Summer dress");
	}
	
	public void setSearchButton() {
		searchbutton.click();
	}
	
	public boolean verifyLogo() {
		boolean result=logo.isDisplayed();
		return result;
	}
	
	public void setSignIn() {
		signin.click();
	}
	
}
