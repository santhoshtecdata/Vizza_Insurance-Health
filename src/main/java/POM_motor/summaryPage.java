package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class summaryPage {
	
	@FindBy(xpath="//input[@id='invalidCheck']")
	WebElement verifiyedCheckBox;
	
	
	@FindBy(xpath="//button[text()='Confirm & Pay']")
	WebElement payBtn;
	
	@FindBy(xpath="//*[text()='Online Payment']")
	WebElement paymentBtn;

	public WebElement getVerifiyedCheckBox() {
		return verifiyedCheckBox;
	}

	public WebElement getPayBtn() {
		return payBtn;
	}

	public WebElement getPaymentBtn() {
		return paymentBtn;
	}
	

}
