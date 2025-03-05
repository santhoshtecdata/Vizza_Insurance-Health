package TATA_AIG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import POM.Quotepage;
import POMStar.starQuotePage;
import TataAig_POM.TataAigQuote;
import TataAig_POM.floaterNomineeElements;
import TataAig_POM.insuredDetailsPageElements;
import TataAig_POM.insuredPageElements;
import TataAig_POM.nomineePageElementsPOM;
import TataAig_POM.proposerDetailsPOM;
import TataAig_POM.tataAigCKYC;
import testSatr.TestStar;

public class tataAig_testCase extends vizza_insurence.vizzaBase {
	TestStar ts = new TestStar();
	Faker fake=new Faker();
	@Test
	public void TataAiglogin()  throws InterruptedException, IOException {
		ts.loginWithValidCredentials("9962907312","admin1");
	}
	@Test
	public void tataAigQuote() throws InterruptedException, IOException {
		ts.premiumQuotePage();
	}

	@Test
	public void floaterQuote() throws InterruptedException, IOException {
		Thread.sleep(1000);
		starQuotePage sq=PageFactory.initElements(driver,starQuotePage.class);
		Quotepage qp=PageFactory.initElements(driver,Quotepage.class);
		sq.getOnlineInsurance().click();
		sq.getHealthInsurance().click();

		Thread.sleep(1000);
		ts.quotePagePopupDetails();
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

	@Test
	public void selectTataAigProduct() throws InterruptedException {

		TataAigQuote taq = PageFactory.initElements(driver,TataAigQuote.class);

		taq.getFilterfield().click();
		until(4);
		taq.getSelectAllInFilter().click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		
		}
		
		taq.getTataAigInFilter().click();
		until(5);
		
		taq.getDummy().click();
		scroll(5);until(5);
		taq.getSumInsured().click();
		until(5);
		taq.getTenLacks().click();
		until(10);

		taq.getTataAigPremier().click();
	}
	
	public void proposerDetailsPage() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		pd.getFirstName().sendKeys(fake.name().firstName());
		pd.getLastName().sendKeys("Test");
		until(1);

		pd.getDOB().sendKeys("06/06/2002");
		pd.getMarriedStatus().click();
		until(1);
		pd.getMarriedStatusSingleOption().click();
		scroll(5);
		pd.getEmailId().sendKeys(fake.internet().emailAddress());
		pd.getMobileNumber().sendKeys("9"+fake.number().digits(9));
		pd.getNation().click();
		pd.getNationality().click();
		scroll(5);
		pd.getAddress1().sendKeys(fake.address().cityName());
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
	}

	public void proposerDetailsPageFloater() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		pd.getFirstName().sendKeys(fake.name().firstName());
		pd.getLastName().sendKeys("Test");
		until(1);

		pd.getDOB().sendKeys("06/06/2002");
		pd.getMarriedStatus().click();
		until(1);
		pd.getMarried().click();
		scroll(5);
		pd.getEmailId().sendKeys(fake.internet().emailAddress());
		pd.getMobileNumber().sendKeys("9"+fake.number().digits(9));
		pd.getNation().click();
		pd.getNationality().click();
		scroll(5);
		pd.getAddress1().sendKeys(fake.address().cityName());
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
	}

	
	public void insuredDetailsPage() {


		insuredPageElements ip=PageFactory.initElements(driver, insuredPageElements.class);
		until(1);
		ip.getSameAsProposer().click();
		ip.getFeet().click();
		ip.getFiveFeet().click();

		ip.getInch().click();
		scroll(4);
		ip.getNineInch().click();
		ip.getWeight().sendKeys("66");
		until(1);
		scroll(3);
	}
	
	public void insuredPageSubmitButton() {
		insuredPageElements ip=PageFactory.initElements(driver, insuredPageElements.class);
		scroll(5);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		ip.getNextBtnInInsured().click();
	}

	
	public void nominePageDetails()  {

		nomineePageElementsPOM npe= PageFactory.initElements(driver,nomineePageElementsPOM.class);
		npe.getNomineeName().sendKeys(fake.name().fullName());
		npe.getNomineeGender().click();
		npe.getGenderFemale().click();
		npe.getNomineeDOB().sendKeys("08/08/1987");until(1);
		npe.getNomineeContribution().sendKeys("100");
		until(1);
		npe.getNomineeRelation().click();
		scroll(2);
		npe.getSpouse().click();

		npe.getNomineePageNxtBtn().click();

	}
	public void floaterNomineePage() {
		floaterNomineeElements np =PageFactory.initElements(driver, floaterNomineeElements.class);
		np.getNomineeName().sendKeys(fake.name().firstName());
		np.getGender().click();	
		np.getFemale().click();
		np.getDob().sendKeys("06/06/2002");
		until(1);
		np.getRelation().click();
		scroll(2);
		np.getSpouse().click();
		np.getContribution().sendKeys("100");
		scroll(2);
		until(1);
		np.getNomineePageNxtBtn().click();
		
	}
	@Test
	public void CKYCpage() throws InterruptedException, IOException {
		TataAiglogin() ;
		tataAigQuote();
		selectTataAigProduct() ;
		proposerDetailsPage();
		insuredDetailsPage();
		insuredPageSubmitButton();
		nominePageDetails();
		TestStar ts =new TestStar();
		tataAigCKYC ck =PageFactory.initElements(driver,tataAigCKYC.class);
		until(5);
	//	ck.getDocType().click();
	//	ck.getSelectPan().click();
		ck.getPanNumberField().sendKeys("GLKPM3190G");
		ck.getSubmitBtn().click();
		until(1);
		ck.getIdType().click();
		ck.getAadhar().click();
		ck.getAadharNumber().sendKeys("236745678790");
		ck.getGender().click();
		ck.getMale().click();
		ck.getDOB().sendKeys("06/06/2002");
		until(1);
		
		ck.getSubmitBtn().click();
		until(3);

		ts.copy();

	}

	@Test
	public void floater2A1C () throws InterruptedException, IOException {
		TataAiglogin() ;
		floaterQuote();
		selectTataAigProduct() ;
		proposerDetailsPageFloater();
		insuredDetailsPage();
	
		insured2();
		
		insured3();
		insuredPageSubmitButton();
		 floaterNomineePage();
		
		 TestStar ts =new TestStar();
			tataAigCKYC ck =PageFactory.initElements(driver,tataAigCKYC.class);
			until(5);
		//	ck.getDocType().click();
		//	ck.getSelectPan().click();
			ck.getPanNumberField().sendKeys("GLKPM3190G");
			ck.getSubmitBtn().click();
			until(1);
			ck.getIdType().click();
			ck.getAadhar().click();
			ck.getAadharNumber().sendKeys("236745678790");
			ck.getGender().click();
			ck.getMale().click();
			ck.getDOB().sendKeys("06/06/2002");
			until(1);
			
			ck.getSubmitBtn().click();
			until(3);

			ts.copy();

	}

	public void insured2() {
		
		insuredPageElements ip=PageFactory.initElements(driver, insuredPageElements.class);
		insuredDetailsPageElements id =PageFactory.initElements(driver, insuredDetailsPageElements.class);
		scroll(3);
		id.getInsured2().click();
		until(1);
		for(int i =1;i<=3;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);}
		id.getInsured2Title().click();
		id.getTitleMrs().click();
		id.getSpouseName().sendKeys(fake.name().firstName());
		id.getLastName().sendKeys("T");
		id.getSpouseAge().sendKeys("06/06/2003");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		
		id.getSpouseHeightFeet().click();
		ip.getFiveFeet().click();
		id.getSpouseHeightInch().click();
		scroll(2);
		ip.getNineInch().click();
		id.getSpouseWeight().sendKeys("62");
		id.getRelatoin2().click();
		id.getRelation2value().click();
	}

	public void insured3() {
		insuredPageElements ip=PageFactory.initElements(driver, insuredPageElements.class);
		insuredDetailsPageElements id =PageFactory.initElements(driver, insuredDetailsPageElements.class);
		scroll(5);
		id.getInsured3().click();
		until(1);
		for(int i =1;i<=3;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);}
		until(1);
		id.getInsured3Title().click();
		id.getTitleMr().click();
		id.getChildName().sendKeys(fake.name().firstName());	
		id.getChildlastName().sendKeys("T");
		id.getChildAge().sendKeys("06/06/2022");
		id.getChildRelation().click();
		id.getChildValuse().click();
		id.getChildHeightFeet().click();
		id.getSchildHeightFeetvalue().click();
		id.getChildHeightInch().click();
		scroll(2);
		id.getChildHeightInchvalue().click();
		id.getChildWeight().sendKeys("12");
		until(1);


	}

}
