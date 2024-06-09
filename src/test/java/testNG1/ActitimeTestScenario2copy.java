package testNG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeHomePagePF;
import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeLoginPagePF;
import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeTaskPagePF;

public class ActitimeTestScenario2copy {

	
	
	WebDriver driver;
	
	ActitimeLoginPagePF loginobj;
	
	ActitimeHomePagePF homeobj;
	
	ActitimeTaskPagePF taskobj;
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("opening browser");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 loginobj = new ActitimeLoginPagePF(driver);
		
		 homeobj = new ActitimeHomePagePF(driver);
		
		 taskobj = new ActitimeTaskPagePF(driver);
		
	}
	
	
	@BeforeMethod
	public void beforemethod() {
        System.out.println("Login to application");
		loginobj.setUsername();
		loginobj.setPassword();
		loginobj.verifyLoginbutton();
		
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test Scenario1 started execution");
		
		homeobj.verifyTasks();
		
		taskobj.verifyCreateTask();
		
		taskobj.verifyCustomer();
		
		taskobj.verifyOptionSelectCustomer();
		
		taskobj.verifyClose();
		
		driver.switchTo().alert().accept();
		
		System.out.println("Test Scenario2 execution end");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("logout application");
		
		homeobj.verifyLogout();
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("closing browser");
	driver.quit();
		
		
	}

}
