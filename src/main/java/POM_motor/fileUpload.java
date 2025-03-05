package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fileUpload {
	
	@FindBy(xpath="(//mat-icon[text()='note_add'])[1]")
	WebElement invoice;
	
	@FindBy(xpath="(//mat-icon[text()='note_add'])[2]")
	WebElement rcBook;
	
	public WebElement getRcBook() {
		return rcBook;
	}

	@FindBy(xpath="//button[@type='submit']")
	WebElement sumpitBtn;

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getSumpitBtn() {
		return sumpitBtn;
	}

}
