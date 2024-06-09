package testScenario;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;
import com.qa.utility.UtilClass;
import com.qa.pageLayer.FlightDetails;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.TravellerDetails;
public class TestScenario extends TestBase {

	
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
       HomePage homeobj =new HomePage();
		
		homeobj.setRoundTrip();
		
		homeobj.setFrom("New Delhi");
		
		homeobj.setTo("Mumbai");
		
		homeobj.setSearchFlight();
		
	   FlightDetails flightdetailobj =new FlightDetails();
	   
	    j.executeScript("scroll(0,200)");
	    
	    flightdetailobj.setDepartureFlight();
	    
	    flightdetailobj.setBook();
	    
		j.executeScript("scroll(0,10000)");
		
		for(int i=0;i<=7;i++) {
		a.sendKeys(Keys.PAGE_DOWN).perform();
		
		}
		
		TravellerDetails travelerdetailobj = new TravellerDetails();
		
		travelerdetailobj.setTitle();
		
		UtilClass utilobj = new UtilClass();
		utilobj.excelSheet();
		String name = utilobj.name();
		
		travelerdetailobj.setNameAndMiddleName(name);
		
		utilobj.excelSheet();
		String lastname = utilobj.lastname();
		
		travelerdetailobj.setLastName(lastname);
		
		utilobj.excelSheet();
		String email = utilobj.email();
		
		travelerdetailobj.setEmail(email);
		
		utilobj.excelSheet();
		long mobile = (long) utilobj.mobile();
		
		
		travelerdetailobj.setmobile(Long.toString(mobile)); 
		
		
		
		
	}
	
	
	
}
