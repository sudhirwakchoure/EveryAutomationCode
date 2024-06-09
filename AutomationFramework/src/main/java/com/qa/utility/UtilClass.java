package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {

	String path = "C:\\Users\\mmc\\Desktop\\New folder\\AutomationFramework\\src\\main\\java\\com\\qa\\testData\\testData.xlsx";
	public static Sheet s;
	
	public void excelSheet() throws EncryptedDocumentException, IOException {
		FileInputStream src = new FileInputStream(path);
		
		s= WorkbookFactory.create(src).getSheet("Sheet1");
		
	}
	
	public String name() {
		String name = s.getRow(1).getCell(0).getStringCellValue();
		return name;
	}
	
	public String lastname() {
		String lastName = s.getRow(1).getCell(1).getStringCellValue();
		return lastName;		
	}
	public String email() {
		String email = s.getRow(1).getCell(2).getStringCellValue();
		return email;		
	}
	public double mobile() {
		double mobile = s.getRow(1).getCell(3).getNumericCellValue();
		return mobile;		
	}
	
	
}
