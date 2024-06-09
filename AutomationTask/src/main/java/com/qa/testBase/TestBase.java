package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;
    String url;
	
    @Parameters("browser")
	@BeforeMethod
	public void setUp(String br) {
		
		if(br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mmc\\Desktop\\WorkSpace\\AutomationTask\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mmc\\Desktop\\WorkSpace\\AutomationTask\\driver\\geckodriver.exe");
		    driver =new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\mmc\\Desktop\\WorkSpace\\AutomationTask\\driver\\msedgedriver.exe");
		}
		
		else {
			System.out.println("Enter valid browser");
		}
		
		
		try {
			Properties p = new Properties();
			FileInputStream src = new FileInputStream("C:\\Users\\mmc\\Desktop\\WorkSpace\\AutomationTask\\src\\main\\java\\com\\qa\\properties\\properties");
		    try {
				p.load(src);
			    url =p.getProperty("url");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		
		
	}
	
	@AfterMethod
    public void close() {
    	
		driver.quit();
    }
    
	
}
