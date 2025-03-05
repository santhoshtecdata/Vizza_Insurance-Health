package POMStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ckyc {
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[1]/mat-radio-group/mat-radio-button[2]/label/div[2]")
	WebElement ckycNO;
	
	@FindBy(xpath="(//input[@data-placeholder='PAN Number'])[3]")
	WebElement panNumber;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submitbtn ;
	
	@FindBy(xpath="(//span[text()='Identity Proof Document Type'])[1]")
	WebElement addressProf;
	
	@FindBy(xpath="(//span[text()=' Aadhaar Card '])[1]")
	WebElement aadhar ;
	
	@FindBy(xpath="(//input[@data-placeholder='Aadhaar Card Number'])[1]")
	WebElement adharNum;
	
	@FindBy(xpath="(//input[@data-placeholder='Aadhaar Card Number'])[2]")
	WebElement aadharNumber2 ;

	
	@FindBy(xpath="(//span[text()='Address Proof Document Type'])[1]")
	WebElement idproof;
	
	@FindBy(xpath="(//span[text()=' Aadhaar Card '])[1]")
	WebElement idAadhar;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[2]/div[4]/button")
	WebElement Doc1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[2]/div[8]/button/span[1]")
	WebElement doc2;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[2]/div[9]/button/span[1]")
	WebElement doc3 ;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[3]/button")
	WebElement submitBtn ;

	public WebElement getCkycNO() {
		return ckycNO;
	}

	public WebElement getPanNumber() {
		return panNumber;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getAddressProf() {
		return addressProf;
	}

	public WebElement getAadhar() {
		return aadhar;
	}

	public WebElement getAdharNum() {
		return adharNum;
	}

	public WebElement getAadharNumber2() {
		return aadharNumber2;
	}

	public WebElement getIdproof() {
		return idproof;
	}

	public WebElement getIdAadhar() {
		return idAadhar;
	}

	public WebElement getDoc1() {
		return Doc1;
	}

	public WebElement getDoc2() {
		return doc2;
	}

	public WebElement getDoc3() {
		return doc3;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
   
}
