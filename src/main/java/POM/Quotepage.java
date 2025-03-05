package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quotepage {
	
	@FindBy(xpath="//span[text()='Online Insurance']")
	WebElement onLineInsurence;
	
	@FindBy(xpath="//span[text()='Travel Insurance']")
	WebElement travelInsuernce;
	
	@FindBy(xpath="//mat-select[@placeholder='SUM INSURED (USD-$)']")
	WebElement sumAmount;
	
	
	@FindBy(xpath="//span[text()=' 500000 ']")
	WebElement sumAmount500000;
	
	

	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-travel-insurance/div[1]/div/div[3]/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[1]/div/div[1]/div[1]/mat-checkbox/label/div")
	WebElement selfCheckBox;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-travel-insurance/div[1]/div/div[3]/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[1]/div/div[1]/div[3]/mat-checkbox/label/div")
	WebElement areYouStudentCheckBox;
	
	@FindBy(xpath="//input[@data-placeholder='DOB (DD/MM/YYYY)']")
	WebElement dob;
	
	@FindBy(xpath="//input[@data-placeholder='Passport Number']")
	WebElement passPortNumper;
	
	@FindBy(xpath="//input[@data-placeholder='Start date(DD/MM/YYYY)']")
	WebElement startDate;
	
	@FindBy(xpath="//input[@data-placeholder='End date(DD/MM/YYYY)']")
	WebElement endDate;
	
	
	public WebElement getEndDate() {
		return endDate;
	}

	public void setEndDate(WebElement endDate) {
		this.endDate = endDate;
	}
	@FindBy(xpath="(//span[text()='Travel plans'])[1]")
	WebElement travelPlan;
	
	public WebElement getTravelPlan() {
		return travelPlan;
	}

	public void setTravelPlan(WebElement travelPlan) {
		this.travelPlan = travelPlan;
	}
	@FindBy(xpath="(//span[@class='mat-option-text'])[1]")
	WebElement country;
	
	@FindBy(xpath="(//span[text()='Types of Travel'])[1]")
	WebElement tripType;
	
	@FindBy(xpath="//span[text()=' Holiday ']")
	WebElement holidayTripyype;
	
	@FindBy(xpath="//div[text()='No']")
	WebElement anyMedicalContionsNo;
	
	@FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[6]")
	WebElement anyMedicalConditionsYes;
	
	@FindBy(xpath="//input[@data-placeholder='Pincode']")
	WebElement pincode ;
	
	@FindBy(xpath="//span[text()='Proceed']")
	WebElement proceedBtn ;
	
	@FindBy(xpath="//h4[text()=' Travel Insurance']")
	WebElement travelInsurence;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input")
	WebElement spouseDOB;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div[1]/div[3]/div[3]/mat-form-field/div/div[1]/div[1]/input")
	WebElement son;
	
	

	public WebElement getSpouseDOB() {
		return spouseDOB;
	}

	public WebElement getSon() {
		return son;
	}

	public WebElement getOnLineInsurence() {
		return onLineInsurence;
	}
	
	public WebElement getTravelInsurence() {
		return travelInsurence;
	}

	public WebElement getTravelInsuernce() {
		return travelInsuernce;
	}

	public WebElement getSumAmount() {
		return sumAmount;
	}

	public WebElement getSelfCheckBox() {
		return selfCheckBox;
	}

	public WebElement getAreYouStudentCheckBox() {
		return areYouStudentCheckBox;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getPassPortNumper() {
		return passPortNumper;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getTripType() {
		return tripType;
	}

	public WebElement getHolidayTripyype() {
		return holidayTripyype;
	}

	public WebElement getAnyMedicalContionsNo() {
		return anyMedicalContionsNo;
	}

	public WebElement getAnyMedicalConditionsYes() {
		return anyMedicalConditionsYes;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	public WebElement getSumAmount500000() {
		return sumAmount500000;
	}
	
	
}
