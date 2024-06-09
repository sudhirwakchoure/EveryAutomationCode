package Chinchwad_morning_B_Batch.Oct21_BGANG_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeTestCasesPOMPF {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		
		ActitimeLoginPagePF obj = new ActitimeLoginPagePF(driver);
		obj.setUsername();
		obj.setPassword();
		obj.verifyLoginbutton();
		
		driver.findElement(By.xpath("(//img[@height='93'])[4]")).click();
		
		
		ActitimeTaskPagePF obj2 = new ActitimeTaskPagePF(driver);
		obj2.verifyCreateTask();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
