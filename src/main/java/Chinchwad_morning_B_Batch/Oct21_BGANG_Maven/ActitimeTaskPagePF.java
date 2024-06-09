package Chinchwad_morning_B_Batch.Oct21_BGANG_Maven;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTaskPagePF {

	@FindBy(xpath = "//div[@id='ext-gen33']")
	private WebElement createtask;
	
	@FindBy(xpath = "//button[@id='ext-gen41']")
	private WebElement customer;
	
	@FindBy(xpath = "//input[@class='controlBorder']")
	private WebElement filtertaskbyname;
	
	@FindBy(xpath = "//input[@name='searchTasks']")
	private WebElement applyfilter;
	
	@FindBy(xpath = "//img[@class='closeButton']")
	private WebElement close;
	
	@FindBy(xpath= "//a[text()='Completed Tasks']")
	private WebElement completedtask;
	
	@FindBy(xpath = "//ul[@class='x-menu-list']/li")
	private List<WebElement> selectcustomer;
	
	

	WebDriver driver;
	
	
	
	public ActitimeTaskPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void verifyCreateTask() {
		System.out.println("click  on create task");
		createtask.click();
	}
			
	public void setFilterTaskByName() {
		filtertaskbyname.sendKeys("Hemant");
	}
	
	public void verifyApplyFilter() { 
		applyfilter.click();
	}
	
	public void verifyCustomer() {
		customer.click();
	}
	
	
	public void verifyOptionSelectCustomer() {

		int count = selectcustomer.size();
        System.out.println(count);
        
        for(int i =0; i< count; i++) {
       	 WebElement element= selectcustomer.get(i);
       	 
       	 String attri= element.getText();
            System.out.println(attri);    
            if(attri.equals("- New Customer -")) {
           	 element.click();
            }
        }
	}
	
	public void verifyClose() {
		close.click();
		//driver.switchTo().alert().accept();
      	}
	
	public void verifyCompletedTask() {
		completedtask.click();
	}
	
	
}
