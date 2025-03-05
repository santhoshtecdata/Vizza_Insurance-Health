package testSatr;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.login;
import POMStar.proposerDetails;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class testCaseOfStar extends starFlow {

	public 	TestStar ts = new TestStar();
	public static POMStar.proposerDetails ps =PageFactory.initElements(driver, POMStar.proposerDetails.class);
	@Test(dataProvider="login")
	public void verifyLoginWithMultipleCrenditials(String username1 ,String password1) throws InterruptedException {
		TestStar ts =new TestStar();
		try {
			ts.loginWithValidCredentials(username1,password1);
		} catch (InterruptedException | IOException e) {

			e.printStackTrace();
		}
		finally {
			driver.close();
		}
	}

	@DataProvider(name="login")
	public Object [][] login() throws IOException{
		FileInputStream fis = new FileInputStream("./testdata/data/health.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet = wb.getSheet("healthLogin");

		int rowlen = sheet.getPhysicalNumberOfRows();
		XSSFRow row1 = sheet.getRow(0);

		int columnCount = row1.getLastCellNum();
		Object [][] data = new Object[rowlen][columnCount];

		for(int i =0;i<rowlen;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell un = row.getCell(0);
			XSSFCell pw = row.getCell(1);

			data [i][0]=un.getStringCellValue();
			data [i][1]=pw.getStringCellValue();
		}
		return data;
	}

	@Test
	public void verifyLoginBtnIfClick100Times() throws IOException {
		options.addArguments("--incognito");
		driver.get(getProperty(incourl));
		driver .get("https://vizzainsurance.com/home");
		login lg= PageFactory.initElements(driver,login.class);
		lg.getLoginBtn().click();
		lg.getPosLink().click();
		lg.getMobileNumper().sendKeys("9988776655");
		lg.getPassword().sendKeys("password@356");
		for (int i=1;i<=100;i++) {
			lg.getSupmitBtn().click();
		}
		until(1);
		Assert.assertTrue(lg.getSupmitBtn().isDisplayed());
	}

	@Test
	public void verifyProposerfiledAcceptTheSpecialCharcterOrNot() throws InterruptedException, IOException {
		try {
			ts.loginWithValidCredentials("9962907312","admin1");
		} catch (InterruptedException | IOException e) {

		}
		ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
		ps.getFirstName().sendKeys("@#$%^");
		until(1);
		String value = ps.getFirstName().getAttribute("value");
		if(value.contains("@#$%^")){
			Assert.assertTrue(false);
		}



	}

	@Test
	public void verifyProposerfiledAcceptTheValidInput() throws InterruptedException, IOException {
		try {
			ts.loginWithValidCredentials("9962907312","admin1");
		} catch (InterruptedException | IOException e) {

		}
		ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
		ps.getFirstName().sendKeys("santh");
		until(1);
		String value = ps.getFirstName().getAttribute("value");
		if(value.contains("santh")){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void verifyProposerLastNamefiledAcceptTheValidInput() throws InterruptedException, IOException {
		try {
			ts.loginWithValidCredentials("9962907312","admin1");
		} catch (InterruptedException | IOException e) {

		}
		ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
		ps.getLastName().sendKeys("Last");
		until(1);
		String value = ps.getLastName().getAttribute("value");
		if(value.contains("Last")){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void verifyTheDOBAcceptTheFutureDates() throws InterruptedException, IOException {

		ts.loginWithValidCredentials("9962907312","admin1");


		ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		p.getDOB().sendKeys(date("dd/mm")+"/2035");
		String value = p.getDOB().getAttribute("value");
		if(value.contains("2035")){
			Assert.assertTrue(true);
		}

	}
	
	@Test
	public void verifyTheDOBAcceptTheCurrentDates() throws InterruptedException, IOException {

		ts.loginWithValidCredentials("9962907312","admin1");


		ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
		p.getDOB().sendKeys(date("dd/mm/yyyy"));until(1);
		String value = p.getDOB().getAttribute("value");
		if(value.contains(date("dd/mm/yyyy"))){
			Assert.assertTrue(true);
		}	
	}
	@Test
public void verifyMobileNumberFieldAcceptTheCharacters() throws InterruptedException, IOException {
		ts.loginWithValidCredentials("9962907312","admin1");
        ts.premiumQuotePage() ;
		ts. quote();
		until(2);
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
		p.getPhone().sendKeys("sdfghjk");until(1);
		String value = p.getPhone().getAttribute("value");
		if(value.contains("sdfghjk")){
			Assert.assertTrue(false);
		}
}
	@Test
public void verifyMobileNumberFieldLimit() throws InterruptedException, IOException {
	ts.loginWithValidCredentials("9962907312","admin1");
    ts.premiumQuotePage() ;
	ts. quote();
	until(2);
	POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
	p.getPhone().sendKeys("98765456776567234");until(1);
	String value = p.getPhone().getAttribute("value");
	if(value.length()==10){
		Assert.assertTrue(true);
	}
}
	@Test
	public void verifyAllOccupationIsClickable() throws InterruptedException, IOException {
		
				ts.loginWithValidCredentials("9962907312","admin1");
			    ts.premiumQuotePage() ;
				ts. quote();
				until(2);
				POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
				for(int limit =1;limit<=17;limit++) {
				p.getOccupation().click();
				Thread.sleep(200);
				 WebElement va=driver.findElement(By.xpath("(//mat-option[@role='option'])["+limit+"]"));
				 va.click();
				
				}
	
	}
}
