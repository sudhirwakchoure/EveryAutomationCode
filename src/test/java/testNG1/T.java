package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	
	
}
