package com.qa.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pagelayer.HomePage;
import com.qa.pagelayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	public static WebDriver driver;

    public static HomePage HomePageobj;
	public static LoginPage LoginPageobj;

	@Parameters("Browser")
	@BeforeMethod
	public void setup(String br) {
		
		if(br.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		else if(br.equalsIgnoreCase("Opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Please Enter valid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		HomePageobj = new HomePage();
		LoginPageobj = new LoginPage();
	
		
		
	}
	
	@AfterMethod
	public void tearDown() {
 
		driver.quit();
		
	}
	
	
}
