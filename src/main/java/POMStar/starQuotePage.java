package POMStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class starQuotePage  {
	
	@FindBy (xpath ="//span[text()='Online Insurance']")
	WebElement onlineInsurance;
	
	@FindBy (xpath ="//span[text()='Health Insurance']")
	WebElement healthInsurance;

	@FindBy (xpath ="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[1]/div/div[1]/div[1]/div[1]/div[1]/mat-checkbox/label/div")
	WebElement selfCheckBox;
	
	@FindBy (xpath ="//input[@id='mat-input-16']")
	WebElement ageFiledforSelf;
	
	@FindBy (xpath ="//input[@name='healthPincode']")
	WebElement pincode;

	@FindBy (xpath ="//span[contains(text(),'Proceed')]")
	WebElement proceedBtn;
	
	@FindBy (xpath ="//div[@class='col-md-8']")
	WebElement verifiedPremiumQuotePage;
	
	@FindBy (xpath="(//input[@formcontrolname='name'])[1]")
	WebElement popupNmae;
	
	@FindBy (xpath="(//input[@formcontrolname='phonenumber'])[1]")
	WebElement popupPhoneNumber;
	
	@FindBy (xpath="(//input[@formcontrolname='email'])[1]")
	WebElement popupEmail;
	
	@FindBy (xpath="(//span[text()='Next'])[1]")
	WebElement popupSubmitBtn;
	
	public WebElement getPopupSubmitBtn() {
		return popupSubmitBtn;
	}

	public WebElement getPopupNmae() {
		return popupNmae;
	}

	public WebElement getPopupPhoneNumber() {
		return popupPhoneNumber;
	}

	public WebElement getPopupEmail() {
		return popupEmail;
	}

	public WebElement getOnlineInsurance() {
		return onlineInsurance;
	}

	public WebElement getHealthInsurance() {
		return healthInsurance;
	}

	public WebElement getSelfCheckBox() {
		return selfCheckBox;
	}

	public WebElement getAgeFiledforSelf() {
		return ageFiledforSelf;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	public WebElement getVerifiedPremiumQuotePage() {
		return verifiedPremiumQuotePage;
	}
	
	

}
