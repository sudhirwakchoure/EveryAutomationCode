package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testbase.TestBase;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class UtilClass extends TestBase {

	public static void ScreenShot() {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File des = new File(
					"D:\\hemant\\EclipseWorkspace_2021_09\\OTproject\\screenshots\\"+System.currentTimeMillis()+driver.getTitle()+".png");

			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
