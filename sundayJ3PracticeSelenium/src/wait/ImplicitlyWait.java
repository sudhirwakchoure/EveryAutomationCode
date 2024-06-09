package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		 
		String url = "http://www.instagram.com";
		String url2 = "http://www.facebook.com/signup";
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		WebDriverWait o1 = new WebDriverWait(driver,5);
		WebDriverWait o = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement e1 = o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		e1.sendKeys("hemantahire333000@gmail.com");
		
	
		
	
		
		
//  	driver.findElement(By.name("username")).sendKeys("hemantahire148@gmil.com");
//		
//		driver.navigate().to(url2);
//		
//		WebElement e1 = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
//  
//		boolean ans =e1.isSelected();
//		System.out.println(ans);
//		
//		Thread.sleep(3000);
//	   
//		WebElement e2 =driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']"));
//	
//		boolean ans2 = e2.isDisplayed();
//		
//		System.out.println(ans2);
//
//		Thread.sleep(3000);
//		
//		WebElement e3 = driver.findElement(By.id("password_step_input"));
//		
//		boolean ans3 = e3.isEnabled();
//		System.out.println(ans3);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
