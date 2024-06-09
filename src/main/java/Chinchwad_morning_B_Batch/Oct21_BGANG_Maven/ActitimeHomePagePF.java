package Chinchwad_morning_B_Batch.Oct21_BGANG_Maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePagePF {

	@FindBy(xpath = "//img[@width='179']")
	private WebElement actitimelogo;
	
	@FindBy(xpath = "//input[@id='taskSearchControl_field']")
	private WebElement taskbyname;
	
	@FindBy(xpath = "(//img[@height='93'])[4]")
	private WebElement tasks;
	
	@FindBy(xpath = "(//img[@height='93'])[6]")
	private WebElement reports;
	
	@FindBy(xpath ="(//img[@class='sizer'])[3]")
	private WebElement users;
	
	@FindBy(xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[13]")
	private WebElement workschedule;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	
	WebDriver driver;
	
	
	public ActitimeHomePagePF(WebDriver driver) {
		
	PageFactory.initElements(driver , this);
	}
	
	
	
	
	public boolean verifyActitimeLogo() {
		return
		actitimelogo.isDisplayed();
	}
	
	
	public void verifyLogout() {
		logout.click();
	}
	
	
	public void verifyTaskbyname() {
		taskbyname.sendKeys("Hemant");
	}
	
	
	public void verifyTasks() {
		tasks.click();
	}
	
	
	public void verifyReport() {
		reports.click();
	}
	
	
	public void verifyUsers() {
		users.click();
	}
	
	
	public void verifyWorkSchedule() {
		workschedule.click();
	}
}
