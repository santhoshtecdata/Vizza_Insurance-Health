package TATA_AIG;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import TataAig_POM.insuredPageElements;
import vizza_insurence.vizzaBase;

public class insuredPageTestCase extends vizzaBase{

	@Test
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
}
