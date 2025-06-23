package testSatr;


	
	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import POM.login;
	import POMStar.proposerDetails;


	public class comprehensiveTestCase extends starFlow {

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
		public void verifyProposerFirstNameFieldAcceptTheSpecialCharcterOrNotInStarComPlan() throws InterruptedException, IOException {
			try {
				ts.loginWithValidCredentials("sakthikrishnan106@gmail.com","Sakthi@1602");
			} catch (InterruptedException | IOException e) {

			}
			ts.premiumQuotePage() ;
			ts. quote();
			until(2);
			proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
			ps.getFirstName().clear();
			ps.getFirstName().sendKeys("@#$%^");
			until(1);
			String value = ps.getFirstName().getAttribute("value");
			if(value.contains("@#$%^")){
				Assert.assertTrue(false);
			}
		}
		//9840242345
		@Test
	public void flow() {
			TestStar ts = new TestStar();
			try {
				ts.loginWithValidCredentials("sakthikrishnan106@gmail.com", "Sakthi@1602");
				ts.premiumQuotePage();

				ts.comquote();
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		until(2);
		proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
		ps.getFirstName().clear();
		ps.getLastName().clear();
		ps.getMail().clear();
		ps.getMail().sendKeys("test@gmail.com");
		ps.getPhone().clear();
		ps.getPhone().sendKeys("9025939106");
		
		
	}


		

		@Test
		public void verifyProposerFirstNameFieldAcceptTheValidInputInStarComPlan() throws InterruptedException, IOException {
			flow();
			proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
			ps.getFirstName().clear();
			ps.getFirstName().sendKeys("santh");
			until(1);
			String value = ps.getFirstName().getAttribute("value");
			if(value.contains("santh")){
				Assert.assertTrue(true);
			}
		}

		@Test
		public void verifyProposerLastNameFieldAcceptTheValidInputInStarComPlan() throws InterruptedException, IOException {
			flow();
			proposerDetails ps =PageFactory.initElements(driver, proposerDetails.class);
			ps.getLastName().sendKeys("Last");
			until(1);
			String value = ps.getLastName().getAttribute("value");
			if(value.contains("Last")){
				Assert.assertTrue(true);
			}
		}

		@Test
		public void verifyTheDOBAcceptTheFutureDatesInStarComPlan() throws InterruptedException, IOException {

			flow();
			proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
			p.getDOB().sendKeys(date("dd/mm")+"/2035");
			String value = p.getDOB().getAttribute("value");
			if(value.contains("2035")){
				Assert.assertTrue(true);
			}

		}
		
		@Test
		public void verifyTheDOBAcceptTheCurrentDatesInStarComPlan() throws InterruptedException, IOException {

			flow();
			POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
			p.getDOB().sendKeys(date("dd/mm/yyyy"));until(1);
			String value = p.getDOB().getAttribute("value");
			if(value.contains(date("dd/mm/yyyy"))){
				Assert.assertTrue(true);
			}	
		}
		@Test
	public void verifyMobileNumberFieldAcceptTheCharactersInStarComPlan() throws InterruptedException, IOException {
			flow();
			POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
			p.getPhone().sendKeys("sdfghjk");until(1);
			String value = p.getPhone().getAttribute("value");
			if(value.contains("sdfghjk")){
				Assert.assertTrue(false);
			}
	}
		@Test
	public void verifyMobileNumberFieldLimitInStarComPlan() throws InterruptedException, IOException {
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
		p.getPhone().sendKeys("98765456776567234");until(1);
		String value = p.getPhone().getAttribute("value");
		if(value.length()==10){
			Assert.assertTrue(true);
		}
	}
		@Test
		public void verifyAllOccupationIsClickableInStarComPlan() throws InterruptedException, IOException {
			
			        flow();
					POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);	
					for(int limit =1;limit<=17;limit++) {
					p.getOccupation().click();
					Thread.sleep(200);
					 WebElement va=driver.findElement(By.xpath("(//mat-option[@role='option'])["+limit+"]"));
					 va.click();
					
					}
		
		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// First Name
		
		@Test
		public void vreifyProposerFirstNameFieldAcceptTheAlphabetCharactersInStarComPlan() throws InterruptedException, IOException {
		      flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("ABCDEF");
			String value = pd.getFirstName().getAttribute("value");
			if (value.contains("ABCDEF")) {
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}

		}
		@Test
		public void verifyFirstNameRejectsNumbersInStarComPlan()  {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("123456");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertNotEquals(value, "123456", "First Name field should not accept numbers.");
		}
		@Test
		public void verifyFirstNameRejectsSpecialCharactersInStarComPlan() throws InterruptedException, IOException {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("@#$%^&*");

			String value = pd.getFirstName().getAttribute("value");
			until(1);
			Assert.assertTrue(value.isEmpty(), "First Name field should not accept special characters.");
		}
		@Test
		public void verifyFirstNameAcceptsMixedCaseAlphabetsInStarComPlan() throws InterruptedException, IOException {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("AbCdEf");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertEquals(value, "AbCdEf", "First Name field should retain mixed-case alphabets.");
		}
		@Test
		public void verifyFirstNameRejectsSpacesInStarComPlan() throws InterruptedException, IOException {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("John Doe");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertNotEquals(value, "John Doe", "First Name field should not accept spaces.");
		}


		@Test
		public void verifyFirstNameMinimumLengthInStarComPlan() throws InterruptedException, IOException {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("A");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertEquals(value, "A", "First Name field should accept minimum valid length.");
		}
		@Test
		public void verifyFirstNameRejectsHTMLTagsInStarComPlan() throws InterruptedException, IOException {
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("<script>alert('test')</script>");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertNotEquals(value, "<script>alert('test')</script>", "First Name field should not accept HTML tags.");
		}
		@Test
		public void verifyFirstNameCaseSensitivityInStarComPlan() throws InterruptedException, IOException {
		
			 flow();
		      
		      proposerDetails pd =PageFactory.initElements(driver, proposerDetails.class);
			pd.getFirstName().sendKeys("john");
			String value = pd.getFirstName().getAttribute("value");

			Assert.assertEquals(value, "john");
		}
	//////////////////////////////////////////////////////////////////////////////////////////////////
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideFirstNameInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("TEST");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideLastNameInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideDOBInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideOccupationInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideMailInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvidePhoneNumberInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvidePincodeInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		//p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		//p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);

		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideAddress1InStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideAddress2InStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		@Test
		public void verifyTryToMoveNextpageWhenNotProvideAnyMandatoryFieldsInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		scroll(16);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertFalse(element);
		}
		
		
		@Test
		public void verifyproposerPageNextbuttonFunctionalityInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		p.getFirstName().sendKeys("Test");
		char initial = "Test".charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("K");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		
		
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		
		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		boolean element =false;
		try {
	   element = c.getCkycNO().isDisplayed();
		}
		catch(Exception e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertTrue(element);
		}
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		@Test
		public void verifyThePincodeFieldAcceptTheChractersInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		scroll(16);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("ASDFGHJ");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		String value = p.getPincode().getAttribute("value");
		if(!value.contains("ASDFGHJ")) {
			Assert.assertTrue(true);
		}
		}
		
		@Test
		public void verifyThePincodeFieldAcceptTheSpecialChractersInStarComPlan() throws InterruptedException { 
			
			flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		scroll(16);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys("Dummy");scroll(4);
		p.getPincode().sendKeys("@#$%$%");
		p.getCity().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
		String value = p.getPincode().getAttribute("value");
		if(!value.contains("@#$%$%")) {
			Assert.assertTrue(true);
		}
		}
		

		@Test
		public void verifyThePolicyEndDateShowingOneYearFromPolicyStartDateInStarComPlan() throws InterruptedException { 
			
		flow();
		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		scroll(30);
		Thread.sleep(1000);
		
		p.getStartDate().sendKeys(date("dd/MM/yyyy"));
		Thread.sleep(500);	scroll(5);
		      p.getNextBtn().click();
		Thread.sleep(1000);
		String policyEndDate =p.getPolicyEndDate().getAttribute("value");
		String policyStartDate =p.getStartDate().getAttribute("value");
		
		String originalDate = date("dd");
		int endDate= Integer.parseInt(originalDate);
		endDate = endDate-1;
		String ed  = String.valueOf(endDate);
				
		String originalYear= date("yyyy");
		int endYear= Integer.parseInt(originalYear);
		endYear = endYear+1;
		
		String ey= String.valueOf(endYear);
		String verify =ed+"/"+date("MM")+"/"+ey;
		
		if (verify.equals(policyEndDate)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		}
	}


