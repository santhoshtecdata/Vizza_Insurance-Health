package com.motor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import POM_motor.CKYC;
import POM_motor.GCV;
import POM_motor.logInMotor;
import POM_motor.vehicle_details;
import vizza_insurence.utility;
import vizza_insurence.vizzaBase;

public class logInMotorTest extends vizzaBase {

	Faker fake = new Faker();
	String Sheet = "NewIndaia";
	@Test	(dataProvider = "loginData")

	public void login(String username , String password) throws InterruptedException, AWTException, IOException {


		driver.get(getProperty("url"));

		logInMotor lm = PageFactory.initElements(driver, logInMotor.class);
		driver.findElement(By.tagName("html")).click();
		scroll(15);
		Thread.sleep(1000);
		lm.getCommercial_Vehicle().click();
		highlighert(lm.getUserName());
		lm.getUserName().sendKeys(username);//getData("USERNAME",1,0)
		lm.getPassword().sendKeys(password);//String.valueOf(getData("USERNAME",1,1).toString())
		scroll(6);
		lm.getSupmitBtn().click();
		boolean loginSuccessful = false;
		try {
			loginSuccessful=lm.getWelCome().isDisplayed();
		}
		catch(NoSuchElementException e) {
			Assert.fail();
		}
		if(loginSuccessful==true) {
			Assert.assertTrue(lm.getWelCome().isDisplayed());
		}

	}

	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() {

		return new Object[][] {
			{"TESTING1", "2"},
			{"user2", "password2"},
			{"TESTING2", "2"},
			{"invalidUser", "invalidPass"},
			{"TESTING4","2"}
		};
	}
	@DataProvider(name = "vehicleData")
	public Object[][] makeDataProvider() {

		return new Object[][]{
			{"AP","01","ASHOK LEYLAND","DOST","LE BSIII"},

			{"AP","01","TATA","LPK","1613"}
		};   
	}

	@Test(dataProvider ="vehicleData")
	public void GCVnewBussiness(String state,String number ,String make , String model , String sm) throws InterruptedException , AWTException, IOException{
		pri(make);
        pri(model);
        pri(sm);
		GCV gcv = PageFactory.initElements(driver, GCV.class);
		
		list(gcv.getCustomer(), "INDIVIDUAL");
		gcv.getRegisterNumperState().sendKeys(state);
		gcv.getRegisternumper().sendKeys(number);
		list(gcv.getSubCategory(), "PUBLIC");
		gcv.getCustomerName().sendKeys(fake.name().fullName());
		gcv.getPhoneNumper().sendKeys("9"+fake.number().digits(9));
		gcv.getEmail().sendKeys(fake.internet().emailAddress().replaceAll("@.*", "@gmail.com"));
		list(gcv.getManufacturingYear(),"2025");
		gcv.getMake().sendKeys(" BAXY");

		gcv.getModel().click();
		list(gcv.getModel(),"SUPER KING");
		//list(gcv.getMake(), make);
		list(gcv.getMake(),getData(Sheet,1,2));

		Thread.sleep(5000);
		list(gcv.getModel(),getData(Sheet,1,3));
		Actions ac = new Actions(driver);
		ac.moveToElement(gcv.getRegistrationDate()).perform();

		list(gcv.getSubModel(),getData(Sheet,1,4));//1613  EX
		ac.moveToElement(gcv.getAgreeCheckBox()).perform();scroll(10);
		gcv.getAddress1().sendKeys(fake.number().digits(2));Thread.sleep(1000);
		gcv.getAddress2().sendKeys(fake.address().cityName());
		select(gcv.getCity(),"MADURAI");
		select(gcv.getPincode(),"624202");

		gcv.getAgreeCheckBox().click();
		gcv.getSubmitBtn().click();
		Assert.assertTrue(gcv.getPremiumQuotePage().isDisplayed());

	}  

	public void type(String type) {
		GCV gcv = PageFactory.initElements(driver, GCV.class);
		String type1= "new";
		if(type1.equals(type)) {
			gcv.getGcvHome().click();
			gcv.getNewBussiness().click();
		}
		else {
			gcv.getGcvHome().click();
			gcv.getRollOver().click();
		}
	}

	public void rollOver(String state,String number ,String rs,String num,String make , String model , String sm) throws InterruptedException, AWTException, IOException {

		GCV gcv = PageFactory.initElements(driver, GCV.class);
		Actions ac = new Actions(driver);



		list(gcv.getCustomer(), "INDIVIDUAL");
		gcv.getRegisterNumperState().sendKeys(state);
		gcv.getRegisternumper().sendKeys(number);
		gcv.getChr().sendKeys(rs);
		gcv.getFourDigit().sendKeys(num);
		list(gcv.getSubCategory(), "PUBLIC");
		Thread.sleep(5000);
		boolean pop = false;
		try {
			pop =gcv.getFailurepopup().isDisplayed();
		}
		catch (NoSuchElementException e ) {

			if (pop) {
				Thread.sleep(2000);
				gcv.getVahanOk().click();

				gcv.getCustomerName().sendKeys(fake.name().fullName());
				gcv.getPhoneNumper().sendKeys("9"+fake.number().digits(9));
				gcv.getEmail().sendKeys(fake.internet().emailAddress().replaceAll("@.*", "@gmail.com"));Thread.sleep(2000);
				list(gcv.getManufacturingYear(),"2022");
				list(gcv.getMake(), make);//ASHOK LEYLAND

				Thread.sleep(2000);
				gcv.getModel().click();
				list(gcv.getModel(),model);//LPK  ACE
				Thread.sleep(2000); 
				ac.moveToElement(gcv.getRegistrationDate()).perform();
				Thread.sleep(5000);
				list(gcv.getSubModel(),sm);   }  //1613  EX
			else {
				gcv.getPhoneNumper().sendKeys("9"+fake.number().digits(9));
				gcv.getEmail().sendKeys(fake.internet().emailAddress().replace("@.*", "@gmail.com"));
				ac.moveToElement(gcv.getPriviousPolicyType()).perform();

				list(gcv.getPriviousPolicyType(),"COMPREHENSIVE");
				gcv.getPriviousInsurer().click();
				list(gcv.getPriviousInsurer(),"HDFC ERGO GENERAL INSURANCE CO. LTD.");scroll(14);Thread.sleep(1000);
				//	gcv.getPriviousPolicyExpDate().sendKeys(date("DD/MM/YYYY"));
				gcv.getAddress1().sendKeys(fake.address().cityName());Thread.sleep(1000);
				gcv.getAddress2().sendKeys(fake.address().city());
				select(gcv.getCity(),"MADURAI");
				select(gcv.getPincode(),"624202");
				list(gcv.getNCBamount(),"20");scroll(10);
				gcv.getAgreeCheckBox().click();

				gcv.getSubmitBtn().click();
				Assert.assertTrue(gcv.getPremiumQuotePage().isDisplayed());

			}

		}

	}
	public void registrationNumber(String state,String number ,String rs,String num) {
		GCV gcv = PageFactory.initElements(driver, GCV.class);
		gcv.getRegisterNumperState().sendKeys(state);
		gcv.getRegisternumper().sendKeys(number);
		gcv.getChr().sendKeys(rs);
		gcv.getFourDigit().sendKeys(num);

	}
	@Test
	public void getSelectProtect() throws InterruptedException  {
		String name=null;
		try {
			name = getData("VEHICLE",7,1);
		} catch (IOException e) {

			e.printStackTrace();
		}
		utility u = new utility ();
		Thread.sleep(5000);
		u.selectProtect(name);

	}


	@Test
	public void KYCverificationPage() throws InterruptedException, AWTException, IOException {
		Actions a = new  Actions(driver);
		Thread.sleep(2000);
		String sheet="USERNAME";
		CKYC c = PageFactory.initElements(driver,CKYC.class);
		list(c.getIdType(),getData(sheet,1,2));
		Thread.sleep(2000);
		c.getPanNumber().sendKeys(getData(sheet,1,3));
		Thread.sleep(2000);scroll(5);
		c.getName().sendKeys(getData(sheet,1,4));

		c.getGender().click();
		list(c.getGender(),getData(sheet,1,5));
		a.moveToElement(c.getDob());
		c.getDob().click();
		c.getDob().sendKeys(getData(sheet,1,6));
		Thread.sleep(2000);


		//Thread.sleep(2000);

		a.moveToElement(c.getSaveBtn()).build().perform();
		c.getSaveBtn().click();
		Thread.sleep(2000);
		c.getPanVerified().click();

	}

	public void comprehensive() throws InterruptedException {
		utility u = new utility ();
		u.goDigitPersonalDetails();
	}

	@Test
	public void personalDetails() throws InterruptedException, AWTException, IOException {

		POM_motor.personalDetails pd = PageFactory.initElements(driver,POM_motor.personalDetails.class);
		Thread.sleep(10000);
		list(pd.getTittle(),"MR");
		Thread.sleep(2000);
		pd.getFirstName().sendKeys(fake.name().firstName());
		pd.getLastName().sendKeys("B");
		pd.getDOB().sendKeys(fake.date().birthday(18, 50).toString());
		pd.getAddress1().sendKeys(fake.address().city());
		pd.getAddress2().sendKeys(fake.address().cityName());
		Actions ac = new Actions(driver);
		ac.moveToElement(pd.getCity());
		pd.getCity().sendKeys("CHENNAI");
		pd.getPicode().sendKeys("600018");
		scroll(10);
		list(pd.getOccupation(),"IT Profession");
		pd.getPannumber().sendKeys("GLBPB9031Q");
		pd.getSameAsAbove().click();
		pd.getSubmitBtn().click();

	}
	@Test
	public void vehicleDetailsPage() {
		vehicle_details vd = PageFactory.initElements(driver, vehicle_details.class);
		scroll(7);
		vd.getEngineNo().sendKeys("ENG"+fake.number().numberBetween(245425, 5465465));
		vd.getChassicNo().sendKeys("CHA"+fake.number().numberBetween(786487,98638));
		vd.getSaveBtn().click();
	}

	public void rollOvervehicleDetailsPage() {
		vehicle_details vd = PageFactory.initElements(driver, vehicle_details.class);
		scroll(7);
		vd.getEngineNo().sendKeys("ENG"+fake.number().numberBetween(245425, 5465465));
		vd.getChassicNo().sendKeys("CHA"+fake.number().numberBetween(786487,98638));
		vd.getPriviousInsurerName().sendKeys("PRE"+fake.number().numberBetween(786487,98638));
		vd.getSaveBtn().click();
	}

	@Test
	public void nomineePage() {
		POM_motor.nomineePage np = PageFactory.initElements(driver,POM_motor.nomineePage.class);
		np.getNomineeName().sendKeys(fake.name().fullName());
		np.getNomineeDOB().sendKeys(fake.date().birthday(20, 40).toString());
		list(np.getRelation(),"FATHER");
		scroll(7);
		np.getSaveBtn().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		np.getOkBtn().click();
	}
	@Test
	public void fileUpload() throws AWTException, InterruptedException, IOException {

		driver.findElement(By.tagName("html")).click();
		POM_motor.fileUpload fu = PageFactory.initElements(driver,POM_motor.fileUpload.class);
		Thread.sleep(2000);
		fu.getInvoice().click();
		Thread.sleep(3000);
		String invoiceBill ="C:\\Users\\Tec Data\\Downloads\\87112b57-d714-40ac-8754-c037fd2cf5d2.pdf";
		StringSelection str = new StringSelection(invoiceBill);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		fu.getSumpitBtn().click();
	}

	public void rollOverfileUpload() throws AWTException, InterruptedException, IOException {

		driver.findElement(By.tagName("html")).click();
		POM_motor.fileUpload fu = PageFactory.initElements(driver,POM_motor.fileUpload.class);
		Thread.sleep(2000);
		fu.getInvoice().click();
		Thread.sleep(2000);
		String invoiceBill ="C:\\Users\\Tec Data\\Downloads\\87112b57-d714-40ac-8754-c037fd2cf5d2.pdf";
		StringSelection str = new StringSelection(invoiceBill);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		fu.getRcBook().click();
		Thread.sleep(2000);
		String rc ="‪C:\\Users\\Tec Data\\Downloads\\87112b57-d714-40ac-8754-c037fd2cf5d2.pdf";
		StringSelection str1 = new StringSelection(rc);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		scroll(5);
		fu.getSumpitBtn().click();
	}





	@Test 
	public void summaryPage() throws AWTException, InterruptedException, IOException {

		POM_motor.summaryPage sp = PageFactory.initElements(driver, POM_motor.summaryPage.class);
		scroll(40);
		sp.getVerifiyedCheckBox().click();
		sp.getPayBtn().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scroll(30);
		sp.getPaymentBtn().click();
	}

	public void payment() throws InterruptedException {
		POM_motor.payment pay= PageFactory.initElements(driver, POM_motor.payment.class);
		boolean err =false;
		try {
			err=pay.getError().isDisplayed();

		}
		catch (NoSuchElementException e)
		{
			if(err) {

				Thread.sleep(2000);
				driver.navigate().refresh();
				list(pay.getPaymentOptions(),"Test Bank");
				Thread.sleep(2000);scroll(10);
				pay.getMakePayment().click();
				Thread.sleep(2000);
				list(pay.getStatus(),"Success");
				Thread.sleep(2000);scroll(10);
				pay.getSubmitBtn().click();
				Thread.sleep(10000);
				pay.getDownloadPDF().click();
			}
			else 
			{
				list(pay.getPaymentOptions(),"Test Bank");
				Thread.sleep(2000);scroll(10);
				pay.getMakePayment().click();
				Thread.sleep(2000);
				list(pay.getStatus(),"Success");
				Thread.sleep(2000);scroll(10);
				pay.getSubmitBtn().click();
				Thread.sleep(10000);
				pay.getDownloadPDF().click();Thread.sleep(2000);
			}
		}
	}

	@Test 
	public void i() throws IOException, InterruptedException {


		String url = getProperty("url");
		driver .get(url);
		// Create an HttpClient
		HttpClient client = HttpClient.newHttpClient();

		// Create a request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();


		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


		System.out.println("Response Code: " + response.statusCode());
		System.out.println("Response Body: " + response.request());
	}
	@Test

	public void j() throws IOException {
		driver.get(getProperty("url"));
		int count=0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) ;
	}
}




