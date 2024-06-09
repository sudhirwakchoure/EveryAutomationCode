package wait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tp {

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
        //WebElement e1= w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		//e1.click();
		
	    WebElement e1 = driver.findElement(By.xpath("(//div[@class='MGxf'])[2]"));
	    
		e1.click();
		
	    Thread.sleep(3000);
		
		driver.quit();
		
	}

}
