package TATA_AIG;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import TataAig_POM.proposerDetailsPOM;

public class proposerPageTestCase extends  vizza_insurence.vizzaBase {
	
	tataAig_testCase ta = new tataAig_testCase();
	Faker fake =new Faker();
	
	@Test
	public void vreifyProposerFirstNameFieldAcceptTheAlphabetCharacters() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
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
	public void verifyFirstNameRejectsNumbers()  {
		try {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
		}
		catch(Exception e) {
			
		}
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("123456");
	    String value = pd.getFirstName().getAttribute("value");
	    
	    Assert.assertNotEquals(value, "123456", "First Name field should not accept numbers.");
	}
	@Test
	public void verifyFirstNameRejectsSpecialCharacters() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("@#$%^&*");
	    
	    String value = pd.getFirstName().getAttribute("value");
        until(1);
	    Assert.assertTrue(value.isEmpty(), "First Name field should not accept special characters.");
	}
	@Test
	public void verifyFirstNameAcceptsMixedCaseAlphabets() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("AbCdEf");
	    String value = pd.getFirstName().getAttribute("value");

	    Assert.assertEquals(value, "AbCdEf", "First Name field should retain mixed-case alphabets.");
	}
	@Test
	public void verifyFirstNameRejectsSpaces() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("John Doe");
	    String value = pd.getFirstName().getAttribute("value");

	    Assert.assertNotEquals(value, "John Doe", "First Name field should not accept spaces.");
	}

	
	@Test
	public void verifyFirstNameMinimumLength() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("A");
	    String value = pd.getFirstName().getAttribute("value");

	    Assert.assertEquals(value, "A", "First Name field should accept minimum valid length.");
	}
	@Test
	public void verifyFirstNameRejectsHTMLTags() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("<script>alert('test')</script>");
	    String value = pd.getFirstName().getAttribute("value");

	    Assert.assertNotEquals(value, "<script>alert('test')</script>", "First Name field should not accept HTML tags.");
	}
	@Test
	public void verifyFirstNameCaseSensitivity() throws InterruptedException, IOException {
		ta.TataAiglogin() ;
		ta.tataAigQuote();
		ta.selectTataAigProduct();
	    proposerDetailsPOM pd = PageFactory.initElements(driver, proposerDetailsPOM.class);
	    pd.getFirstName().sendKeys("john");
	    String value = pd.getFirstName().getAttribute("value");

	    Assert.assertEquals(value, "john", "First Name field should retain the case sensitivity.");
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void verifyTryToMoveNextPageWhenNotProvideFirstName() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		
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
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	
	@Test
	public void verifyTryToMoveNextPageWhenNotProvideLastName() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		pd.getFirstName().sendKeys(fake.name().firstName());
		
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
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	
	@Test
	public void verifyTryToMoveNextPageWhenNotProvideDOB() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		pd.getFirstName().sendKeys(fake.name().firstName());
		pd.getLastName().sendKeys("Test");
		until(1);

		
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
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	@Test
	public void verifyTryToMoveNextPageWhenNotProvideMailID() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
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
		
		pd.getMobileNumber().sendKeys("9"+fake.number().digits(9));
		pd.getNation().click();
		pd.getNationality().click();
		scroll(5);
		pd.getAddress1().sendKeys(fake.address().cityName());
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}

	@Test
	public void verifyTryToMoveNextPageWhenNotProvidePhoneNumber() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
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
		
		pd.getNation().click();
		pd.getNationality().click();
		scroll(5);
		pd.getAddress1().sendKeys(fake.address().cityName());
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	
	@Test
	public void verifyTryToMoveNextPageWhenNotProvidePinCode() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
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
		
		scroll(10);
		pd.getNxtBtn().click();
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	@Test
	public void verifyTryToMoveNextPageWhenNotProvideAddress() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
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
	
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}

	@Test
	public void verifyTryToMoveNextPageWhenNotProvideMarreiedStatus() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
		proposerDetailsPOM pd =PageFactory.initElements(driver, proposerDetailsPOM.class);
		pd.getTitle().click();
		pd.getTitleoption().click();
		pd.getFirstName().sendKeys(fake.name().firstName());
		pd.getLastName().sendKeys("Test");
		until(1);

		pd.getDOB().sendKeys("06/06/2002");
		
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
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}

	@Test
	public void verifyTryToMoveNextPageWhenNotProvideNationlity() {
		try {
			ta.TataAiglogin() ;
			ta.tataAigQuote();
			ta.selectTataAigProduct();
			}
			catch(Exception e) {
				
			}
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
		
		scroll(5);
		pd.getAddress1().sendKeys(fake.address().cityName());
		pd.getPinCode().sendKeys("600001");
		scroll(10);
		pd.getNxtBtn().click();
		boolean errorMsg = pd.getErrorPopup().isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}


}
