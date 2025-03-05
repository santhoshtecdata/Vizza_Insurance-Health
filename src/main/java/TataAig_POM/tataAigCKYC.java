package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tataAigCKYC {
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-tata-aig-kyc/form/div[1]/div/div/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
    WebElement docType;
	
	@FindBy(xpath="//span[text()=' PAN ']")
	WebElement selectPan;

	@FindBy(xpath="(//input[@data-placeholder='PAN Number'])[3]")
	WebElement panNumberField;

	@FindBy(xpath="//span[text()='Submit']")
	WebElement submitBtn;

	@FindBy(xpath="//input[@id='file']")
	WebElement file;
	
	@FindBy(xpath="//mat-select[@formcontrolname='idProofType']")
	WebElement idType;
	
	@FindBy(xpath="//span[text()=' AADHAAR ']")
	WebElement Aadhar;
	
	@FindBy(xpath="//input[@data-placeholder='AADHAAR Number']")
	WebElement aadharNumber;
	
	@FindBy(xpath="//input[@data-placeholder='DOB (DD/MM/YYYY) *']")
	WebElement DOB;
	
	@FindBy(xpath="(//span[text()='Gender'])[4]")
	WebElement gender;
	
	@FindBy(xpath="(//span[text()='Male'])[3]")
	WebElement male;
	

	public WebElement getIdType() {
		return idType;
	}

	public WebElement getAadhar() {
		return Aadhar;
	}

	public WebElement getAadharNumber() {
		return aadharNumber;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getDocType() {
		return docType;
	}

	public WebElement getSelectPan() {
		return selectPan;
	}

	public WebElement getPanNumberField() {
		return panNumberField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getFile() {
		return file;
	}

	
}
