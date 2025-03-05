package com.motor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExceFile {
	
	
	
	
	public static void main(String [] argd) throws IOException {
		String File ="C:\\Users\\Tec Data\\eclipse-workspace\\vizza_insurence\\testdata\\data\\Book1.xlsx";
		 FileInputStream fis= new FileInputStream(File);
		 XSSFWorkbook book = new XSSFWorkbook(fis);
          XSSFSheet sheet = book.getSheet("Sheet3");
          sheet.getRow(2).getCell(1).setCellValue("yessss");
          FileOutputStream fos = new FileOutputStream(File);
          book.write(fos);
          System.out.println("Excel file updated successfully!");

    
}
		
	}
	


