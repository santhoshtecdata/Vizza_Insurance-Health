package com.motor;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_motor.GCV;
import vizza_insurence.utility;
import vizza_insurence.vizzaBase;

public class flowOfWork extends vizzaBase {
	logInMotorTest l = new logInMotorTest();
	GCV gcv = PageFactory.initElements(driver, GCV.class);
	
	@DataProvider(name = "cholavehicleData")
	public Object[][] makeDataProvider() {

		return new Object[][]{
			{ "AP", "05", "TE", "3146", "MAHINDRA", "BOLERO", "PICK UP FB" },
			{ "AP", "05", "TM", "1098", "ASHOK LEYLAND", "DOST PLUS", "RLS" },
			{ "AP", "07", "TE", "7226", "ASHOK LEYLAND", "DOST", "LE BSIII" },
			{ "AP", "16", "TG", "4369", "TATA", "LPT", "3118/TC BSIII (8X2) COWL" },
			{ "AP", "16", "TM", "0197", "MAHINDRA", "BOLERO", "PICK UP FB PS" }
		};   
	}
	
	
	@Test(dataProvider="cholavehicleData")
	  public void ableToFindProductsRollOver(String state,String number ,String rs,String num,String make,String model ,String sm) throws InterruptedException, AWTException, IOException {
			l.login("TESTING3","2");
			String type ="new";
			
			GCV gcv = PageFactory.initElements(driver, GCV.class);
			gcv.getGcvHome().click();
			Thread.sleep(5000);
			if(type.equals("new")) {
				
				        
				gcv.getNewBussiness().click();
				
				l.GCVnewBussiness(state,number,make,model,sm); 
				}
				else {
					
					gcv.getRollOver().click();
					l. rollOver(state,number,rs,num,make,model,sm);
						}
			
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
		    if(type.equals("new")) {
		    	l.vehicleDetailsPage();
		    }
		    else {
		    	
		    	l.rollOvervehicleDetailsPage();
		    }
			l.nomineePage();
			 if(type.equals("new")) {
				 l.fileUpload();
			    }
			    else {
			    	
			    	l.rollOverfileUpload();
			    }
			
			l.summaryPage();
			l.payment() ;
	      driver.quit();
		}
	
	
 @DataProvider(name="xl")
 public Object[][] samplevehicle() throws IOException {
	 
	// FileInputStream fis = new FileInputStream("C:\\Users\\Tec Data\\eclipse-workspace\\vizza_insurence\\testdata\\data\\Book1.xlsx");
	 FileInputStream fis = new FileInputStream("testdata/data/Book1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet=	wb.getSheet("VEHICLE");
	  
	  int len = sheet.getPhysicalNumberOfRows();
	  XSSFRow row1 = sheet.getRow(0);
	  int columnCount = row1.getLastCellNum();
	  Object [][] data = new Object[len][columnCount];//8
	 
	  for(int i =0;i<len;i++) {
		  XSSFRow row = sheet.getRow(i);
		  XSSFCell un = row.getCell(0);
		  XSSFCell pw = row.getCell(1);
		  XSSFCell tn = row.getCell(2);
		  data [i][0]=un.getStringCellValue();
		  data [i][1]=pw.getStringCellValue();
		
 }
	return data;
	
}

 }