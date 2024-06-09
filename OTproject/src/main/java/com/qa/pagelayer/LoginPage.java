package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
    private WebElement pass;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "(//div[@class='alert alert-danger'])[1]")
    private WebElement error;	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void setPass(String password) {
		pass.sendKeys(password);
	}
	
	public void setButton() {
		loginbutton.click();
	}
	
	public boolean verifyError() {
		boolean result = error.isDisplayed();
		return result;
	}
	
}
