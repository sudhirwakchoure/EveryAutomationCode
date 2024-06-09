package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.utility.UtilClass;



public class TestBase {

	public static WebDriver driver; 
	public static WebDriverWait w;
	public static Actions a;
	public static JavascriptExecutor j;
	@BeforeMethod
	public void setUp() throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
	//config file
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\mmc\\Desktop\\New folder\\AutomationFramework\\src\\main\\java\\com\\qa\\config\\PropertiesFile");
	prop.load(ip);
	String url =prop.getProperty("url");
	
	driver.get(url);
	
	w = new WebDriverWait(driver,5);
    a = new Actions(driver);
	
    j = (JavascriptExecutor)driver;
	
   
	
		
		
		
	}
	
	@AfterMethod
	public void close() {
		
	driver.quit();	
	}
	
}
