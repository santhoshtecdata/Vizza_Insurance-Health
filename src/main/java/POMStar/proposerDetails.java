package POMStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class proposerDetails {
	
	@FindBy(xpath="(//span[text()='Title'])[1]")
	WebElement title;
	
	@FindBy(xpath="(//span[text()=' Mr '])[1]")
	WebElement mr;
	
	@FindBy(xpath="(//input[@data-placeholder=\"First Name\"])[1]")
	WebElement firstName;
	
	@FindBy(xpath="(//input[@data-placeholder='Middle Name'])[1]")
	WebElement mitName;
	
	@FindBy(xpath="(//input[@data-placeholder='Last Name'])[1]")
	WebElement lastName;
	
	@FindBy(xpath="(//input[@data-placeholder=\"DOB (DD/MM/YYYY)\"])[1]")
	WebElement DOB;
	
	
	@FindBy(xpath="(//mat-select[@placeholder=\"Occupation\"])[1]")
	WebElement occupation;
	
	@FindBy(xpath="(//span[text()=' BUSINESS/TRADERS '])[1]")
	WebElement business;
	
	
	@FindBy(xpath="(//input[@data-placeholder='Email ID'])[1]")
	WebElement mail;
	
	
	@FindBy(xpath="(//input[@data-placeholder='Mobile Number'])[1]")
	WebElement phone;
	
	@FindBy(xpath="(//input[@data-placeholder='Pincode'])[1]")
	WebElement pincode;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 1'])[1]")
	WebElement address1;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 2'])[1]")
	WebElement address2;
	
	@FindBy(xpath="(//span[text()='City'])[1]")
	WebElement city;
	
	@FindBy(xpath="(//span[text()='Area'])[1]")
	WebElement area;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/mat-option/span")
	WebElement cityvalue;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/mat-option[4]/span")
	WebElement areaValue;
	
	@FindBy(xpath="(//span[text()='Next'])[1]")
	WebElement nextBtn;
	
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[1]/form/mat-accordion/mat-expansion-panel/div/div/div/div[2]/div[2]/div/div[1]/div/mat-checkbox/label/div")
	WebElement sameusAddress;
	
	@FindBy(xpath="//mat-icon[@mattooltip='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//input[@data-placeholder='Policy Start Date (DD/MM/YYYY)']")
     WebElement startDate;
	
	@FindBy(xpath="//input[@data-placeholder='Policy End Date (DD/MM/YYYY)']")
	WebElement policyEndDate;
	
	public WebElement getPolicyEndDate() {
		return policyEndDate;
	}
	
	public WebElement getStartDate() {
		return startDate;
	}
	
	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public WebElement getMitName() {
		return mitName;
	}

	public WebElement getLogOut() {
		return logout;
	}
	
	public WebElement getSameusAddress() {
		return sameusAddress;
	}
	public WebElement getTitle() {
		return title;
	}

	public WebElement getMr() {
		return mr;
	}

	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getBusiness() {
		return business;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getArea() {
		return area;
	}

	public WebElement getCityvalue() {
		return cityvalue;
	}

	public WebElement getAreaValue() {
		return areaValue;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
	

}
