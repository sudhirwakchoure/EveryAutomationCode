package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class A {

public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://www.makemytrip.com/flights/");
     WebElement e1=driver.findElement(By.xpath("//input[@id='departure']"));
 
     Actions a1 = new Actions(driver);
     
     a1.click(e1).perform();
     a1.click(e1).perform();
     
//     WebDriverWait w = new WebDriverWait(driver,10);
//     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")))
      
     driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	
     driver.findElement(By.xpath("//div[@aria-label='Fri Apr 01 2022']")).click();
     
     driver.findElement(By.xpath("//div[@class='fsw_inputBox flightTravllers inactiveWidget ']")).click();
     
     driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
     
     driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
     
     driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
     
     driver.findElement(By.xpath("//button[text()='APPLY']")).click();
     
     driver.findElement(By.xpath("//a[text()='Search']")).click();
     
     Thread.sleep(10000);
     
     WebElement e2 =driver.findElement(By.xpath("//div[@class='multiDropDownVal']"));
     String Trip =e2.getText();
     System.out.println(Trip);
     
     WebElement e3= driver.findElement(By.xpath("//input[@id='fromCity']"));
     String from = e3.getAttribute("value");
     System.out.println(from);
     
     WebElement e4 = driver.findElement(By.xpath("//input[@id='toCity']"));
     String to = e4.getAttribute("value");
     System.out.println(to);
     
     WebElement e5 = driver.findElement(By.xpath("//input[@id='departure']"));
     String  depart = e5.getDomAttribute("value");
     System.out.println(depart);
     
     WebElement e6 = driver.findElement(By.xpath("//input[@id='travellerAndClass']"));
     String traveller = e6.getAttribute("value");
     System.out.println(traveller);
     
     
	}

}
