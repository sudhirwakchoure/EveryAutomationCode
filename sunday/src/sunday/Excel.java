package sunday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream src = new FileInputStream("C:\\Users\\mmc\\Desktop\\testData.xlsx");
		
		Sheet sheet = WorkbookFactory.create(src).getSheet("Sheet1");
		
		String c1 =sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(c1);
		
		String c2 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(c2);
		
		String c3 = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(c3);
		
		double c4 = sheet.getRow(1).getCell(3).getNumericCellValue();
	    long c5 = (long)c4;
	    String c6 = String.valueOf(c5);
	    System.out.println(c6);

	    
	    
	    
	
	}

}
