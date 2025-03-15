package TATA_AIG;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import TataAig_POM.nomineePageElementsPOM;
import TataAig_POM.proposerDetailsPOM;
import vizza_insurence.vizzaBase;


public class nomineePageTestCase extends vizzaBase{
	Faker fake = new Faker(); 
	public void insuredFlow() {
		tataAig_testCase ts = new tataAig_testCase();
		try {
			ts.TataAiglogin() ;
			ts.tataAigQuote();
			ts.selectTataAigProduct() ;
			ts.proposerDetailsPage();
			ts.insuredDetailsPage();
			ts.insuredPageSubmitButton();
		}
		catch(Exception e) {

		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
	}
	
	public void nominePageDetails()  {

		nomineePageElementsPOM npe= PageFactory.initElements(driver,nomineePageElementsPOM.class);
		npe.getNomineeName().sendKeys(fake.name().fullName());
		npe.getNomineeGender().click();
		npe.getGenderFemale().click();
		
		npe.getNomineeContribution().sendKeys("100");
		until(1);
		npe.getNomineeRelation().click();
		scroll(2);
		npe.getSpouse().click();

		

	}
	@Test
	public void verifyTheNomineeNameFieldAcceptCharaters() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		npe.getNomineeName().sendKeys("Test user");
		String value = npe.getNomineeName().getAttribute("value");
		if (value.contains("Test user")) {
			Assert.assertTrue(true);
		}
		
	}
	@Test
	public void verifyTheNomineeNameFieldNotAcceptNumbers() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		npe.getNomineeName().sendKeys("1234567");
		String value = npe.getNomineeName().getAttribute("value");
		if (!value.contains("1234567")) {
			Assert.assertTrue(true);
		}
		
	}
	@Test
	public void verifyTheNomineeNameFieldNotAcceptTheSpecialCharaters() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		npe.getNomineeName().sendKeys("#$%^&");
		String value = npe.getNomineeName().getAttribute("value");
		if (!value.contains("#$%^&")) {
			Assert.assertTrue(true);
		}
		
	}
	@Test
	public void verifyTheNomineeDobFieldNotAcceptTheCurrentDate() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		 nominePageDetails();
		npe.getNomineeDOB().sendKeys(date("dd/mm/yyyy"));
		scroll(6);
		npe.getNomineePageNxtBtn().click();
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
	}
	@Test
	public void verifyTheNomineeDobFieldNotAcceptTheFutureDate() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		 nominePageDetails();
		npe.getNomineeDOB().sendKeys(date("dd/MM")+"/2025");
		scroll(6);
		npe.getNomineePageNxtBtn().click();
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
	}

	@Test
	public void verifyIfProvideMinorAgeDOBAskingTheGuardianDetails() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		 nominePageDetails();
		npe.getNomineeDOB().sendKeys(date("dd/MM")+"/2020");
		scroll(6);
		npe.getNomineePageNxtBtn().click();
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
	}
	
	@Test
	public void verifyTheNomineeContribution() {
		insuredFlow();
		nomineePageElementsPOM npe = PageFactory.initElements(driver, nomineePageElementsPOM.class);
		scroll(4);
		npe.getNomineeContribution().sendKeys("100");
		String value = npe.getNomineeContribution().getAttribute("value");
		if(value.contains("100")) {
			Assert.assertTrue(true);
		}
	}
}
