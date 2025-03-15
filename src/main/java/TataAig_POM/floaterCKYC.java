package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class floaterCKYC {
	
	@FindBy(xpath="(//input[@data-placeholder='PAN Number'])[5]")
	WebElement panNumberField;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement panSubmitBtn;
	
	@FindBy(xpath="(//span[text()='Identity Proof Type'])[1]")
	WebElement idProofType;
	
	@FindBy(xpath="(//span[text()=' AADHAAR '])[1]")
	WebElement selectAadharId;
	
	@FindBy(xpath="//input[@formcontrolname='identityProofDocument_number']")
	WebElement aadharNumber;
	
	@FindBy(xpath="(//span[text()='Gender'])[6]")
	WebElement aadharGender;
	
	@FindBy(xpath="(//span[text()='Male'])[4]")
	WebElement male;
	
	@FindBy(xpath="(//input[@formcontrolname='dob'])[6]")
	WebElement aadharDOB;

	public WebElement getPanNumberField() {
		return panNumberField;
	}

	public WebElement getPanSubmitBtn() {
		return panSubmitBtn;
	}

	public WebElement getIdProofType() {
		return idProofType;
	}

	public WebElement getSelectAadharId() {
		return selectAadharId;
	}

	public WebElement getAadharNumber() {
		return aadharNumber;
	}

	public WebElement getAadharGender() {
		return aadharGender;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getAadharDOB() {
		return aadharDOB;
	}
	

	

}
