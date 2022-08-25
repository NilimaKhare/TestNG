package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	public static void main(String[] args)  {
		try {
		File path = new File ("C:\\Users\\nilima\\Documents\\SCREENSHOT\\VELOCITY1.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		 
		XSSFSheet Sheet = workbook.getSheetAt(0);
		
		String data  = Sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		FileOutputStream input	= new FileOutputStream(path);
		Sheet.createRow(1).createCell(0).setCellValue("Automation");
		workbook.write(input);
		
		}
		catch(IOException ref) {
			System.out.println(ref.getMessage());
	}

}
}