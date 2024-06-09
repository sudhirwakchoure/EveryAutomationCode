package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream f = new FileInputStream("C:\\Users\\mmc\\Desktop\\WorkSpace\\APIAutomation\\src\\main\\java\\com\\qa\\configuration\\ConfigProperties");
		    prop.load(f);
		    
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
}
