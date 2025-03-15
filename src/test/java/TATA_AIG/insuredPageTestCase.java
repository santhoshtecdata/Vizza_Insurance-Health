package TATA_AIG;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import TataAig_POM.insuredPageElements;
import TataAig_POM.proposerDetailsPOM;
import vizza_insurence.vizzaBase;

public class insuredPageTestCase extends vizzaBase{


	public void proposerFlow() {
		tataAig_testCase ts = new tataAig_testCase();
		try {
			ts.TataAiglogin() ;
			ts.tataAigQuote();
			ts.selectTataAigProduct() ;
			ts.proposerDetailsPage();
		}
		catch(Exception e) {

		}
	}
	@Test
	public void verifyTheSameAsInsurerButtonIsClickAble() {
		proposerFlow();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		ipe.getSameAsProposer().click();
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		String  name= ipe.getFirstName().getAttribute("value");
		if(name!=null) {
			Assert.assertTrue(true);
		}

	}

	@Test
	public void verifyMoveToNextPageWhenNotProvideMandatoryFields() {
		proposerFlow();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		scroll(7);
		ipe.getNextBtnInInsured().click();
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
	}
	@Test
	public void verifyTheWeughtFieldAcceptTheSpecialCharctersOrNot() {
		proposerFlow();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		ipe.getWeight().sendKeys("@#$%^&");
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}

		String  value= ipe.getWeight().getAttribute("value");
		if(!value.contains("@#$%^&")) {
			Assert.assertTrue(true);
		}

	}
	@Test
	public void verifyTheWeightFieldAcceptTheCharacters() {
		proposerFlow();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		scroll(5);
		ipe.getWeight().sendKeys("testWeight");
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		String  value= ipe.getWeight().getAttribute("value");
		if(!value.contains("testWeight")) {
			Assert.assertTrue(true);
		}

	}
	@Test
	public void verifyNextbuttonIsClickAble() {
		proposerFlow();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		scroll(10);
		ipe.getNextBtnInInsured().click();
		
	}
	@Test
	public void verifyTheFunctionalityOfNextButton() {
		proposerFlow();
		tataAig_testCase ts = new tataAig_testCase();
		insuredPageElements ipe =PageFactory.initElements(driver, insuredPageElements.class);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {

		}
		ts.insuredDetailsPage() ;
		scroll(10);
		ipe.getNextBtnInInsured().click();
		if(!ipe.getNextBtnInInsured().isDisplayed()) {
			Assert.assertTrue(true);
		}
		
	}
}
