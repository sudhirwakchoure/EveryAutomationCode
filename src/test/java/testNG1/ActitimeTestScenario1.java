package testNG1;

import org.testng.annotations.Test;

import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeHomePagePF;
import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeLoginPagePF;
import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeReportPagePF;
import Chinchwad_morning_B_Batch.Oct21_BGANG_Maven.ActitimeTaskPagePF;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;




public class ActitimeTestScenario1 {

	
  WebDriver driver;	
  ActitimeLoginPagePF loginobj;
  ActitimeHomePagePF homeobj;
  ActitimeTaskPagePF taskobj;	
  ActitimeReportPagePF reportobj;
  
	
  @BeforeClass
  public void beforeClass() {
	System.out.println("opening browser");
	  
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("http://localhost/login.do");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
  
    loginobj = new ActitimeLoginPagePF(driver);
    
    homeobj = new ActitimeHomePagePF(driver);
    
    taskobj = new ActitimeTaskPagePF(driver);
    
    reportobj = new ActitimeReportPagePF(driver);
  }
	
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	loginobj.setUsername();
	loginobj.setPassword();
	loginobj.verifyLoginbutton();
	
	  
  }
	
  
  
  
  @Test(priority=1)
  public void test1() {

	  System.out.println("Test Scenario1 started executing");

	  boolean result =homeobj.verifyActitimeLogo();
	  if(result == true) {
		  System.out.println("logo is visible");
	  }
	  else
	  {
		System.out.println("logo is not visible");  
	  }
	  
	  
	  System.out.println("Test Scenario1 execution end");
  
  
  }
  
  @Test(priority=2)
  public void test2() {
	  System.out.println("Test Scenario2 execution start");
	  
	  homeobj.verifyTaskbyname();
	  
	  System.out.println("Test Scenario2 execution end ");
  }
  
  @Test(invocationCount=2,priority=3)
  public void test3() {
	  System.out.println("Test Scenario3 execution start");
	  
	  homeobj.verifyTasks();
	  
	  taskobj.setFilterTaskByName();
	  
	  taskobj.verifyApplyFilter();
	  
	  System.out.println("Test Scenario3 execution end");
  }
  
  @Test(invocationCount=2,priority=4)
  public void test4() {
	  System.out.println("Test Scenario 4 execution start");
	  
	  homeobj.verifyReport();
	  
	  reportobj.verifycreatereport();
	  
	  reportobj.verifyClose();
	  
	  System.out.println("Test Scenario 4 execution end");
  }
  
  @Test(priority=5,enabled=false)
  public void test5() {
	  System.out.println("Test Scenario 5 execution start");
	    
	   homeobj.verifyTasks();
	   
	   taskobj.verifyCompletedTask();
	   
	  System.out.println("Test Scenario 5 execution start");
  }
  

  @Test(priority=6)
  public void test6() {
	  System.out.println("Test Scenario3 execution start");
	  
	  homeobj.verifyTasks();
	  
	  taskobj.setFilterTaskByName();
	  
	  taskobj.verifyApplyFilter();
	  
	  System.out.println("Test Scenario3 execution end");
	  Assert.fail();
  
  }
  

  @Test(priority=7)
  public void test7() {
	  System.out.println("Test Scenario3 execution start");
	  
	  homeobj.verifyTasks();
	  
	  taskobj.setFilterTaskByName();
	  
	  taskobj.verifyApplyFilter();
	  
	  System.out.println("Test Scenario3 execution end");
  }
  

  @Test(priority=8,dependsOnMethods ="test6")
  public void test8() {
	  System.out.println("Test Scenario3 execution start");
	  
	  homeobj.verifyTasks();
	  
	  taskobj.setFilterTaskByName();
	  
	  taskobj.verifyApplyFilter();
	  
	  System.out.println("Test Scenario3 execution end");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout to the application");
	  homeobj.verifyLogout();
  }

  

  @AfterClass
  public void afterClass() throws InterruptedException {
  System.out.println("closing browser");
  
  Thread.sleep(3000);
  driver.quit();
  
  }

  

}
