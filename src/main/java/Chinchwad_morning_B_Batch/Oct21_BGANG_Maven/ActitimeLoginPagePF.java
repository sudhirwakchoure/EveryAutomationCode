package Chinchwad_morning_B_Batch.Oct21_BGANG_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPagePF {

	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginbutton;
	
	WebDriver driver;
	
	
	public ActitimeLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername() {
		username.sendKeys("admin");
	}
	
	public void setPassword() {
		password.sendKeys("manager");
	}
	
	public void verifyLoginbutton() {
		loginbutton.click();
	}
	
}
