package Chinchwad_morning_B_Batch.Oct21_BGANG_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeReportPagePF {

	@FindBy(xpath = "//span[text()='Create Report']")
	private WebElement createreport;
	
	@FindBy(xpath = "//img[@id='closeLightbox']")
	private WebElement close;
	
	WebDriver driver;
	

	public ActitimeReportPagePF(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	
	
	public void verifycreatereport() {
		createreport.click();
	}
	
	public void verifyClose() {
		
		close.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
