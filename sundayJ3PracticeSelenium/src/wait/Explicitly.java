package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.google.co.in/maps/@18.8154265,76.7751434,7z?hl=en&authuser=0";
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get(url);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait o = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement e1 = o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='xoLGzf-T3iPGc-icon']")));
		e1.click();
		
	    Thread.sleep(5000);
		
	    WebElement e2 = driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[1]"));
	    e2.sendKeys("Aurangabad");
	    
		
		
	}
}
