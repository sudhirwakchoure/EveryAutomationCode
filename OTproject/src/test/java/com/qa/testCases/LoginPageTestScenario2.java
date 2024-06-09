package com.qa.testCases;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;

@Listeners(Listener.Listenrs.class)

public class LoginPageTestScenario2 extends TestBase {

	@Test(priority = 1)
	public void loginWithCorrectIDPass() {

		HomePageobj.setSignIn();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(0,400)");

		LoginPageobj.setEmail("hemantahire148@gmail.com");
		LoginPageobj.setPass("Hemant@123");
		LoginPageobj.setButton();

	}

	@Test(priority = 2)
	public void loginWithIncorrectID() throws InterruptedException {

		HomePageobj.setSignIn();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(0,400)");

		LoginPageobj.setEmail("hemantahire143@gmail.com");
		LoginPageobj.setPass("Hemant@143");

		LoginPageobj.setButton();

		boolean result = LoginPageobj.verifyError();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Assert.assertFalse(result);
       	}

}
