package sunday;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SundayPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

//		driver.get("https://demo.guru99.com/test/guru99home/");

//		Thread.sleep(3000);
//		
//		driver.navigate().to("http://www.instagram.com");
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
//		
//		Thread.sleep(3000);
//		

//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.instagram.com");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.facebook.com");
//		
//		driver.findElement(By.id("email")).sendKeys("hemantahire28@gmail.com");
//		

//		String url= driver.getCurrentUrl();
//		System.out.println(url);
//		
//		String title= driver.getTitle();
//		System.out.println(title);
//		
//		String src = driver.getPageSource();
//		System.out.println(src);
//		
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.name(""));
//		driver.findElement(By.id(""));   // fastest //unique
//		driver.findElement(By.className(""));
//		driver.findElement(By.linkText(""));
//		driver.findElement(By.partialLinkText(""));
//		driver.findElement(By.xpath(""));   //slowest  //give correct result

		// html/body/div/webelementTagNAme

		// html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input

		// tagname
		// tagName[i]/tagName
		// tagName[i]/tagName[i]
		// (//xpath)/[i]
		// tagName[@AttributeName='AttributeValue']
		// tagName[text()='textValue']
		// tagName[contains(@tagName,'attributeValue')]
		// tagName[contains(text(),'textValue')]

//		Dimension size =driver.manage().window().getSize();
//		int h=size.getHeight();
//		int w=size.getWidth();
//		System.out.println("H:"+h+" W:"+ w);
//		
//		Dimension setSize = new Dimension(692,372);
//		driver.manage().window().setSize(setSize);
//		
//		Point pos= driver.manage().window().getPosition();
//		System.out.println(pos.getX()+ " " + pos.getY());
//		
//		Point setPoint = new Point(692,372);
//		driver.manage().window().setPosition(setPoint);

//		String parentID=driver.getWindowHandle();
//		
//		WebElement e1= driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
//		e1.click();
//		
//		Set<String> parentChildID= driver.getWindowHandles();
//		
//		for(String i:parentChildID) {
//			
//			if(!i.equals(parentID)) {
//				driver.switchTo().window(i);
//
//				WebElement e2 = driver.findElement(By.xpath("//input[@title='Search']"));
//				e2.sendKeys("SRK",Keys.ENTER);
//				
//				Thread.sleep(3000);
//				
//				driver.close();
//			}
//			
//		}
//		
//		driver.switchTo().window(parentID);
//		
//		driver.findElement(By.xpath("//a[@href='http://www.facebook.com'][1]")).click();
//		
//		
//		Set<String> parentChildID2 = driver.getWindowHandles();
//		
//		for(String i: parentChildID2) {
//			if(!i.equals(parentID)) {
//				driver.switchTo().window(i);
//                driver.findElement(By.id("email")).sendKeys("hemantahire26@gmail.com");
//                Thread.sleep(3000);
//                
//			}
//		}
//		
//        		
//		WebElement e1= driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
//		e1.click();
//		
//		
//		Set<String> ids= driver.getWindowHandles();
//		
//		ArrayList<String> indexid = new ArrayList<String>(ids);
//		String pid= indexid.get(0);
//		String cid= indexid.get(1);
//		
//		driver.switchTo().window(cid);
//		
//		WebElement e2 = driver.findElement(By.xpath("//input[@title='Search']"));
//		e2.sendKeys("SRK",Keys.ENTER);
//						
//		Thread.sleep(3000);

//		TakesScreenshot ss =(TakesScreenshot)driver;
//		File src = ss.getScreenshotAs(OutputType.FILE);
//		File des = new File("D:\\SM\\hemant1.png");
//		FileHandler.copy(src, des);
//		
//		
//		WebElement e1 = driver.findElement(By.xpath("//button[@name='login']"));
//		File src1 = e1.getScreenshotAs(OutputType.FILE);
//		File des1 = new File("D:\\SM\\hemant3.png");
//		FileHandler.copy(src1, des1);

//		WebElement e1 = driver.findElement(By.id("day"));
//		Select s1 = new Select(e1);
//		s1.selectByIndex(25);
//		
//		WebElement e2 = driver.findElement(By.id("month"));
//		Select s2 = new Select(e2);
//		s2.selectByValue("9");
//		
//		WebElement e3 = driver.findElement(By.id("year"));
//		Select s3 = new Select(e3);
//		s3.selectByVisibleText("1997");
//		
////		
////		List<WebElement> elements = s3.getOptions();
////		
////		int size= elements.size();
////		System.out.println(size);
////		
////		for(int i=0;i<size;i++) {
////			WebElement element =elements.get(i);
////			String Text = element.getText();
////		    System.out.println(Text);
////		}
////		
//		
//		List<WebElement> elements =s3.getOptions();
//		for(int i=0;i<elements.size();i++) {
//			WebElement element =elements.get(i);
//			String Text= element.getText();
//		    System.out.println(Text); 
//		}

//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("scroll(0,2100)");

//		WebElement e1= driver.findElement(By.xpath("//label[text()='Email']"));
//		
//		j.executeScript("arguments[0].scrollIntoView(true);", e1);
//		
//		WebElement e2 = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
//		
//		j.executeScript("arguments[0].setAttribute('value','Hemant')",e2);
//		j.executeScript("arguments[0].scrollIntoView(true);", e1);
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().frame("a077aa5e");
//		
//		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
//		
//		Set<String>id =driver.getWindowHandles();
//		ArrayList<String> id2 = new ArrayList<String>(id);
//		String pid= id2.get(0);
//		String chID= id2.get(1);
//		driver.switchTo().window(chID);
//		driver.close();
//		
//	//	driver.switchTo().parentFrame();
//	//	driver.switchTo().defaultContent();
//		
//        
//		driver.switchTo().window(pid);
//		WebElement e2 = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
//		j.executeScript("arguments[0].setAttribute('value','Hemant')", e2);
//		j.executeScript("arguments[0].scrollIntoView(true);", e2)
////		
//		driver.navigate().to("https://jqueryui.com/droppable/");
//		
//		Actions a1 =new Actions(driver);
//		
//		driver.switchTo().frame(0);
//		
//		WebElement e1= driver.findElement(By.id("draggable"));
//		WebElement e2 =driver.findElement(By.id("droppable"));
//		
//		//a1.clickAndHold(e1).moveToElement(e2).release().build().perform();
//		
//	    a1.dragAndDrop(e1, e2).perform();	
//		
//		driver.switchTo().defaultContent();
//		
//		WebElement e3 = driver.findElement(By.xpath("//input[@aria-label='search input']"));
//		
//		a1.sendKeys(e3, "hemant").perform();
//		
//		WebElement e4 = driver.findElement(By.xpath("//a[text()='Themes']"));
//		
//		//a1.click(e4).perform();
//		
//		a1.doubleClick(e4).perform();
//		
//		//a1.contextClick(e4).perform();
////		
//		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
//		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
//		
//		Actions a1 = new Actions(driver);
//		
//		WebElement e1= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
//		a1.moveToElement(e1).perform();
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
//		
//		for(int i=0;i<elements.size();i++) {
//			WebElement element =elements.get(i);
//			String Text= element.getText();
//			if(Text.equals("Appium")) {
//			   element.click();
////			}
////			
//			
////         }
//
//		driver.get("https://demoqa.com/alerts");
//		
//		WebElement e1 =driver.findElement(By.xpath("//button[@id='alertButton']"));
//		e1.click();
//		
//		driver.switchTo().alert().accept();
////		driver.switchTo().alert().dismiss();
//	    
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		
////		driver.switchTo().alert().dismiss();
//	    driver.switchTo().alert().accept();
//	    
//	    
//	    Thread.sleep(3000);
//	    
//	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
//	    String text =driver.switchTo().alert().getText();
//	    System.out.println(text);
//	    driver.switchTo().alert().sendKeys("Hemant");
//	    driver.switchTo().alert().accept();
//	    
//	    driver.switchTo().alert().
////		
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://tathya.uidai.gov.in/login");

//		driver.findElement(By.name("username")).sendKeys("hemantahire26");
//		
//		WebDriverWait wait = new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Hemanat@123");
////		
//		WebElement e1= driver.findElement(By.name("username"));		
//		WebElement e2= driver.findElement(By.name("password"));
//		
//		boolean r1= e1.isDisplayed();
//		System.out.println(r1);
//		
//		boolean r2 =e2.isEnabled();
//		System.out.println(r2);
//		
//		WebElement e3 =driver.findElement(By.xpath("//div[text()='Log In']"));
////		boolean r3 =e3.isEnabled();
////		System.out.println(r3);
////		
////		
////		WebElement e1=driver.findElement(By.id("otp"));
////		boolean r1 =e1.isEnabled();
////		System.out.println(r1);
////		Thread.sleep(3000);
////		driver.quit();
////		
//
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.get("https://ui.cogmento.com/");
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hemantahire2609@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hemant@123");
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//
//		Thread.sleep(3000);
//
//		Actions a1 = new Actions(driver);
//		WebElement e1 = driver.findElement(By.xpath("//div[@id='main-nav']"));
//		a1.moveToElement(e1).perform();

//		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
//
//		WebElement e2 = driver.findElement(By.xpath("//div[@id='dashboard-toolbar']"));
//		a1.moveToElement(e2).perform();
//
//		Thread.sleep(3000);
//		
//		String before = "//table[@class='ui celled sortable striped table custom-grid']/tbody/tr[";
//		String after = "]/td[2]";
//		
//		for(int i=1;i<=5;i++) {
//			WebElement element = driver.findElement(By.xpath(before+i+after));
//			String Text = element.getText();
//			if(Text.equals("Niraj Wankhede")) {
//				element.click();
//			}
//		}
//		//path+tr[
//		//]+td[]
//		for() {
//			WebElement e1= driver.findElement(By.xpath(b+i+a);
//		    e1.getText();
//		    if(text.equals("  ")) {
//		    	e1.click();
//		    }
//		    
		}

	}


