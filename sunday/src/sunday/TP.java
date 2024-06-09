package sunday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TP {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen47")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='x-form-radio'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen133")).click();
		driver.quit();
	
	
	}
}
