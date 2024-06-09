package multipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		String parentID = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		Set<String> parentChildID = driver.getWindowHandles();
		
		for(String i : parentChildID) {
			if(!i.equals(parentID)) {
				driver.switchTo().window(i);
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SRK", Keys.ENTER );
				Thread.sleep(3000);
				
				driver.close();
			}	
		}
		
		driver.switchTo().window(parentID);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'2022')]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[1]")).click();
		
		Set<String> parentChildID2 = driver.getWindowHandles();
		Thread.sleep(3000);
		
		
		for(String i : parentChildID2) {
			if(!i.equals(parentID)) {
				driver.switchTo().window(i);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hemantahire333000@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("DubaraMatPuchna");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@name='login']")).click();
				Thread.sleep(10000);
				
				driver.close();
			}
			
			
		}
		
		driver.switchTo().window(parentID);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'2019')]")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
