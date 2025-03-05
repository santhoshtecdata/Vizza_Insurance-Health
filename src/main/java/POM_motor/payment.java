package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class payment {

	@FindBy(xpath="//select[@name='txtBankIDBK']")
	WebElement paymentOptions;//Test Bank
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement makePayment;
	
	@FindBy(xpath="//select[@id='BankStatus']")
	WebElement status;//Success
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	WebElement downloadPDF;
	
	
	@FindBy(xpath="//div[@id='main-frame-error']")
	WebElement error;

	public WebElement getError() {
		return error;
	}

	public void setError(WebElement error) {
		this.error = error;
	}

	public WebElement getPaymentOptions() {
		return paymentOptions;
	}

	public WebElement getMakePayment() {
		return makePayment;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getDownloadPDF() {
		return downloadPDF;
	}
	
	
}

