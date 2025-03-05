package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class proposerDetailsPOM {
	
	
	@FindBy(xpath="(//span[text()='Title'])[1]")
    WebElement title;
	
	@FindBy(xpath="(//input[@data-placeholder='First Name'])[1]")
    WebElement firstName;
	
	@FindBy(xpath="(//input[@data-placeholder='Middle Name'])[1]")
    WebElement middleName;
	
	@FindBy(xpath="(//input[@data-placeholder='Last Name'])[1]")
    WebElement lastName;
	
	@FindBy(xpath="(//input[@formcontrolname='dob'])[1]")
    WebElement DOB;
	
	@FindBy(xpath="(//span[text()='Married Status'])[1]")
    WebElement marriedStatus;
	
	@FindBy(xpath="(//span[text()='Gender'])[1]")
    WebElement gender;
	
	@FindBy(xpath="(//input[@data-placeholder='Email ID'])[1]")
    WebElement emailId;
	
	@FindBy(xpath="(//input[@data-placeholder='Mobile Number'])[1]")
    WebElement mobileNumber;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 1'])[1]")
    WebElement address1;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 2'])[1]")
    WebElement address2;
	
	@FindBy(xpath="(//input[@data-placeholder='PIN Code'])[1]")
    WebElement pinCode;
	
	@FindBy(xpath="//span[text()=' Mr ']")
    WebElement titleoption;
	
	@FindBy(xpath="//span[text()='Male']")
    WebElement genderMale;
	
	@FindBy(xpath="//span[text()=' Single ']")
    WebElement marriedStatusSingleOption;
	
	@FindBy(xpath="//span[text()=' Married ']")
	WebElement married;
	
	@FindBy(xpath="//span[text()=' Indian ']")
    WebElement nationality;
	
	@FindBy(xpath="(//span[text()='Next'])[1]")
    WebElement nxtBtn;
	
	@FindBy(xpath="//mat-select[@placeholder='Nationality']")
	WebElement nation;
	
	@FindBy(xpath="//div[text()=' Please fill the empty field ']")
	WebElement errorPopup;
	
	public WebElement getErrorPopup() {
		return errorPopup;
	}
	public WebElement getMarried() {
		return married;
	}

	public WebElement getNation() {
		return nation;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getMarriedStatus() {
		return marriedStatus;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getTitleoption() {
		return titleoption;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getMarriedStatusSingleOption() {
		return marriedStatusSingleOption;
	}

	public WebElement getNationality() {
		return nationality;
	}

	public WebElement getNxtBtn() {
		return nxtBtn;
	}
	
	
	
}
