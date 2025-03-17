package testSatr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import POM.Quotepage;
import POM.login;
import POMStar.insuredPage;
import POMStar.starQuotePage;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import vizza_insurence.vizzaBase;



public class TestStar extends vizzaBase {
	Faker fake=new Faker();
	public String name=fake.name().firstName();
	public String womenCarePremiumAmount=null;
	public int quotePageWomenCarePremiumAmount=0;
	public int womenCareproposalPremium=0;
	public String proposerPhoneNumber="9"+fake.number().digits(9);
	public String proposerEmailID=fake.internet().emailAddress().replace("@.*","@gmail.com" );


	public void loginWithValidCredentials(String userName ,String passWord) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		options.addArguments("--incognito");
		driver.get(getProperty(incourl));
		driver .get("https://vizzainsurance.com/home");
		login lg= PageFactory.initElements(driver,login.class);
		lg.getLoginBtn().click();
		lg.getPosLink().click();
		lg.getMobileNumper().sendKeys(userName);
		lg.getPassword().sendKeys(passWord);
		lg.getSupmitBtn().click();
		Thread.sleep(3000);
		boolean loginHomePage=lg.getLogOutBtn().isDisplayed();
		Thread.sleep(3000);

		//Assert.assertTrue(loginHomePage);

	}

	public void premiumQuotePage() throws InterruptedException, IOException {

		starQuotePage sq=PageFactory.initElements(driver,starQuotePage.class);
		sq.getOnlineInsurance().click();
		sq.getHealthInsurance().click();

		Thread.sleep(1000);quotePagePopupDetails();
		driver.findElement(By.tagName("html")).click();
		sq.getAgeFiledforSelf().sendKeys("06/06/2002");Thread.sleep(1000);
		for(int n=0;n<=8;n++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(2000);
		sq.getPincode().click();
		sq.getPincode().sendKeys("600001");
		driver.findElement(By.tagName("html")).click();
		sq.getProceedBtn().click();
		//	Assert.assertTrue(sq.getVerifiedPremiumQuotePage().isDisplayed());

	}


	public void quote() throws InterruptedException, IOException {

		POMStar.quote q= PageFactory.initElements(driver,POMStar.quote.class);
		q.getFilter().click();Thread.sleep(1000);
		q.getSelectAllInFilter().click();Thread.sleep(300);
		q.getStar().click();
		Thread.sleep(3000);
		q.getDummy().click();
		Thread.sleep(1000);

		q.getAssure().click();

		Thread.sleep(2000);
	}

	public void floaterAssureQuote() throws InterruptedException, IOException {

		POMStar.quote q= PageFactory.initElements(driver,POMStar.quote.class);
		q.getFilter().click();Thread.sleep(1000);
		q.getSelectAllInFilter().click();Thread.sleep(300);
		q.getStar().click();
		Thread.sleep(4000);
		q.getDummy().click();
		Thread.sleep(1000);

		q.getFloaterPremium().click();
		Thread.sleep(2000);
	}

	public void proposerDetails() throws InterruptedException, IOException {

		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);

		//	p.getFirstName().sendKeys(name);
		char initial = name.charAt(2);
		p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("TEST");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		//	p.getMail().sendKeys(proposerEmailID);
		//	p.getPhone().sendKeys("9025939106");
		scroll(5);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys(fake.address().city());scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();Thread.sleep(1000);
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();Thread.sleep(1000);
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getStartDate().sendKeys(date("dd/MM/yyyy"));
		p.getNextBtn().click();
	}

	public void ckyc() throws InterruptedException, AWTException, IOException {

		POMStar.ckyc c=PageFactory.initElements(driver, POMStar.ckyc.class);
		c.getCkycNO().click();
		c.getPanNumber().sendKeys("DIKPD3849H");
		scroll(6);
		c.getSubmitbtn().click();Thread.sleep(2000);

		c.getAddressProf().click();
		c.getAadhar().click();
		c.getAdharNum().sendKeys("3245");
		c.getDoc1().click();

		file();

		c.getIdproof().click();
		c.getIdAadhar().click();
		c.getAadharNumber2().sendKeys("3245");
		c.getDoc2().click();

		file();

		scroll(3);Thread.sleep(2000);
		c.getDoc3().click();

		file();
		scroll(8);
		c.getCkycAddress().click();
		Thread.sleep(2000);
		scroll(3);
		c.getSubmitBtn().click();

	}
	public void file() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		String invoiceBill ="‪myaadhar.jpg";
		StringSelection str = new StringSelection(invoiceBill);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public  void nom() throws InterruptedException, AWTException, IOException {

		insuredPage i= PageFactory.initElements(driver, insuredPage.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		i.getSameUs().click();
		i.getHeight().sendKeys("165");
		i.getWeight().sendKeys("65");
		scroll(8);
		i.getInssubmitBtn().click();
		Thread.sleep(3000);
		i.getNomname().sendKeys("user");
		i.getAge().sendKeys("27");
		i.getRelaton().click();
		i.getBro().click();
		i.getPer().sendKeys("100");
		Thread.sleep(1000);
		i.getNomSubmitBtn().click();
	}

	public void insured1() throws InterruptedException {
		insuredPage i= PageFactory.initElements(driver, insuredPage.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		i.getSameUs().click();
		i.getHeight().sendKeys("165");
		i.getWeight().sendKeys("65");
		scroll(8);
	}
	public void insured2() {

	}
	public void insured3() {

	}
	public  void comnom() throws InterruptedException, AWTException, IOException {

		insuredPage i= PageFactory.initElements(driver, insuredPage.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		i.getSameUs().click();
		i.getHeight().sendKeys("165");
		i.getWeight().sendKeys("65");
		scroll(8);
		i.getPersonalAccitent().click();
		scroll(5);
		i.getInssubmitBtn().click();
		Thread.sleep(3000);
		i.getNomname().sendKeys("user");
		i.getAge().sendKeys("27");
		i.getRelaton().click();
		i.getBro().click();
		i.getPer().sendKeys("100");
		Thread.sleep(1000);
		i.getNomSubmitBtn().click();
	}

	public void comquote() throws InterruptedException, IOException {

		POMStar.quote q= PageFactory.initElements(driver,POMStar.quote.class);
		q.getFilter().click();Thread.sleep(1000);
		q.getSelectAllInFilter().click();Thread.sleep(300);
		q.getStar().click();
		Thread.sleep(5000);
		q.getDummy().click();

		scroll(5);
		q.getCom().click();
		Thread.sleep(2000);
		String comprehensive =q.getNewIndia().getText();
		System.out.println(comprehensive);
		try {
			if (!comprehensive.contains("Comprehensive")) {
				driver.navigate().back();
				Thread.sleep(2000);
				scroll(15);
				q.getComretry().click();
				Thread.sleep(1000);
			}
		}
		catch(NoSuchElementException e) {

		}
	}


	public void womenquote() throws InterruptedException, IOException {
		premiumQuotePage();
		POMStar.quote q= PageFactory.initElements(driver,POMStar.quote.class);
		q.getFilter().click();Thread.sleep(1000);
		q.getStar().click();
		until(5);
		q.getFilterArrow().click();Thread.sleep(1000);
		q.getStar().click();Thread.sleep(4000);
		q.getFilterArrow().click();Thread.sleep(1000);
		q.getStar().click();Thread.sleep(4000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(3000);
		scroll(25);

		womenCarePremiumAmount=q.getWomenCareAmount().getText();
		quotePageWomenCarePremiumAmount=Integer.parseInt(womenCarePremiumAmount.substring(2));
		pri(womenCarePremiumAmount) ;
		Thread.sleep(2000);
		q.getWomenCare().click();
	}


	public void assure() throws InterruptedException, IOException, AWTException {
		TestStar ts = new TestStar();
		ts.loginWithValidCredentials("9962907312","admin1");
		ts.premiumQuotePage() ;
		ts. quote();
		ts.proposerDetails();
		ts.ckyc();
		ts.nom();

	}

	public void com() throws InterruptedException, IOException, AWTException {
		TestStar ts = new TestStar();
		loginWithValidCredentials("9962907312","admin1");

		ts.premiumQuotePage() ;

		ts. comquote();
		ts.proposerDetails();
		ts.ckyc();
		ts.comnom();


	}
	public void logout() {

		POMStar.proposerDetails p= PageFactory.initElements(driver, POMStar.proposerDetails.class);
		until(1);
		Dimension newSize = new Dimension(800, 600);
		driver.manage().window().setSize(newSize);
		p.getLogOut().click();
		until(1);
		driver.manage().window().maximize();

	}

	public void copy() {
		insuredPage i= PageFactory.initElements(driver, insuredPage.class);
		driver.findElement(By.tagName("html")).click();
		scroll(60);
		i.getCopyLink().click();
	}


	public void womenCarePremiumAmountCompare() throws InterruptedException, IOException {

		if(quotePageWomenCarePremiumAmount== womenCareproposalPremium) {
			Assert.assertTrue(true);
		}
		pri("premium amount in quote page = "+quotePageWomenCarePremiumAmount);

	}

	public void quotePagePopupDetails() {
		starQuotePage sqp = PageFactory.initElements(driver, starQuotePage.class);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		sqp.getPopupNmae().sendKeys(name);
		sqp.getPopupPhoneNumber().sendKeys("9025939106");
		sqp.getPopupEmail().sendKeys(proposerEmailID);
		until(1);scroll(2);
		sqp.getPopupSubmitBtn().click();
	}

	public void floaterQuote() throws InterruptedException, IOException {
		Thread.sleep(1000);
		starQuotePage sq=PageFactory.initElements(driver,starQuotePage.class);
		Quotepage qp=PageFactory.initElements(driver,Quotepage.class);
		sq.getOnlineInsurance().click();
		sq.getHealthInsurance().click();

		Thread.sleep(1000);
		quotePagePopupDetails();
		driver.findElement(By.tagName("html")).click();
		sq.getAgeFiledforSelf().sendKeys("06/06/2002");Thread.sleep(1000);
		qp.getSpouseDOB().sendKeys("06/06/2003");Thread.sleep(1000);
		qp.getSon().sendKeys("06/06/2022");Thread.sleep(1000);
		for(int n=0;n<=8;n++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(2000);
		sq.getPincode().click();
		sq.getPincode().sendKeys("600001");
		driver.findElement(By.tagName("html")).click();
		sq.getProceedBtn().click();
	}


	public void verifyCopyLink() throws AWTException {
		until(2);
		Robot  r1=new Robot(); 
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_T);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		window(1);
		until(1);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		insuredPage i= PageFactory.initElements(driver, insuredPage.class);
		until(5);
		scroll(60);
		i.getCopyLinkSubmitButton().click();

	}

	public void floaterComprehensivePlan() throws InterruptedException, IOException, AWTException {
		TestStar ts = new TestStar();
		loginWithValidCredentials("9962907312","admin1");

		floaterQuote();
		until(2);
		ts. comquote();
		ts.proposerDetails();
		ts.ckyc();
		ts.comnom();


	}
	@Test
	public void floaterAssurePlan2A1C() throws InterruptedException, IOException, AWTException {
		TestStar ts = new TestStar();
		ts.loginWithValidCredentials("9962907312","admin1");
		floaterQuote();until(3);

		floaterAssureQuote() ;
		proposerDetails();
		ckyc();

	}

	public void response() {


		String proposalApiUrl = driver.getCurrentUrl(); 
        Response response = RestAssured.get(proposalApiUrl);
        
        System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Response Body: " + response.getBody().asPrettyString());
	}


}
