package com.motor;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import vizza_insurence.utility;
import vizza_insurence.vizzaBase;

public class testCase extends vizzaBase{

	logInMotorTest l = new logInMotorTest();

	@Test(dataProvider ="sample")
	public void testInMultipleCredtions(String username ,String pas) throws InterruptedException, AWTException, IOException {


		l.login(username,pas);
	}
	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() {

		return new Object[][] {
			{"TESTING1", "2"},
			{"user2", "password2"},
			{"TESTING2", "2"},
			{"TESTING3", "2"},
			{"TESTING4", "2"},
			{"invalidUser", "invalidPass"}
		};
	}

//vehicleData       goDigitvehicleDetails   UniversalvehicleData
	@Test(dataProvider="vehicleData")
	  public void ableToFindProducts(String make,String model ,String sm) throws InterruptedException, AWTException, IOException {
		logInMotorTest l = new logInMotorTest();
		l. login("TESTING2","2");
		l.type("new");
		l. GCVnewBussiness(make,model,sm);
         String str = "chola";//UniversalSompo
		l. getSelectProtect();
		if (str.equals("GoDigit")) {
			
			l.personalDetails();
		
		}
		else {
			l.KYCverificationPage();
			utility u = new utility();
			u.goDigitPersonalDetails();
		}
	
		l.vehicleDetailsPage();
		l.nomineePage();
		l.fileUpload();
		l.summaryPage();
        driver.quit();
	}
	
	@DataProvider(name = "sample")
	public Object[][] sample() throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Tec Data\\eclipse-workspace\\vizza_insurence\\testdata\\data\\Book1.xlsx");

		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet=	wb.getSheet("USERNAME");
		  
		  int len = sheet.getPhysicalNumberOfRows();
		  XSSFRow row1 = sheet.getRow(0);
		  int columnCount = row1.getLastCellNum();
		//  System.out.println("row ="+len+"column ="+columnCount );
		  Object [][] data = new Object[len][columnCount];
		 
		  for(int i =0;i<len;i++) {
			  XSSFRow row = sheet.getRow(i);
			 
	          
			  XSSFCell un = row.getCell(0);
			  XSSFCell pw = row.getCell(1);
			  data [i][0]=un.getStringCellValue();
			  data [i][1]=pw.getStringCellValue();
			  pw = row.createCell(3);
				pw.setCellValue("Hello, Excel!");
		  }
				 return data;
	}
	
	

	@Test(dataProvider="vehicleData")
	  public void ableToFindProductsRollOver(String make,String model ,String sm) throws InterruptedException, AWTException, IOException {
		l.login("TESTING2","2");
		l.type("new");
		
		l.GCVnewBussiness("AP","05",make,model,sm);
          String str = "RSA";//UniversalSompo
		l. getSelectProtect();
		if (str.equals("GoDigit")) {
			
			l.personalDetails();
		
		}
		else {
			l.KYCverificationPage();
			utility u = new utility();
			u.goDigitPersonalDetails();
		}
	
		l.vehicleDetailsPage();
		l.nomineePage();
		l.fileUpload();
		l.summaryPage();
      driver.quit();
	}
	
	

	@DataProvider(name = "vehicleData")
	public Object[][] makeDataProvider() {

		return new Object[][]{
		//	{"ASHOK LEYLAND","DOST","LE BSIII"},

			{"TATA","LPK","1613"}
		};   
	}

	@DataProvider(name = "UniversalvehicleData")
	public Object[][] USDataProvider() {

		return new Object[][]{
			{"ASHOK LEYLAND","DOST","LS"},
			

			{"TATA","ACE","EX"}
		};   
	}
	
	
	@DataProvider(name = "goDigitvehicleDetails")
	public Object[][] godigitDataProvider() {

		return new Object[][]{
			{"ASHOK LEYLAND","DOST","LE"},
			{"TATA","ACE","EX"},
			{"MAHINDRA","BOLERO","PICK UP"},
		         };   
	}
	@Test
public void h() throws InterruptedException, AWTException, IOException {
		
		l.login("TESTING2","2");
		l.type("new");
	    l.GCVnewBussiness("TATA","LPK","1613");
	    
}
	


}
