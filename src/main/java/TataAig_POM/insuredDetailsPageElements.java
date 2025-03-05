package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class insuredDetailsPageElements {
	@FindBy(xpath="//mat-panel-title[text()='2. INSURED DETAILS']")
	WebElement insured2;

	@FindBy(xpath="//mat-panel-title[text()='3. INSURED DETAILS']")
	WebElement insured3;

	@FindBy(xpath="(//input[@formcontrolname='fname'])[3]")
	WebElement spouseName;
	
	@FindBy(xpath="(//input[@formcontrolname='lname'])[3]")
	WebElement lastName;

	@FindBy(xpath="(//span[text()='Title'])[3]")
	WebElement insured2Title;
	
	@FindBy(xpath="(//span[text()=' Mrs '])[1]")
     WebElement titleMrs;
	
	@FindBy(xpath="(//span[text()='Gender'])[3]")
    WebElement insured2Gender;

	@FindBy(xpath="(//input[@formcontrolname='dob'])[3]")
	WebElement spouseAge;

	@FindBy(xpath="(//span[text()='Height(feet)'])[2]")
	WebElement spouseHeightFeet;

	@FindBy(xpath="(//span[text()='Height(inch)'])[2]")
	WebElement spouseHeightInch;
	
	@FindBy(xpath="//span[text()=' 5 ']")
	WebElement spouseHeightFeetvalue;

	@FindBy(xpath="//span[text()=' 5 ']")
	WebElement spouseHeightInchvalue;

	public WebElement getInsured2() {
		return insured2;
	}

	public WebElement getInsured3() {
		return insured3;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getInsured2Title() {
		return insured2Title;
	}

	public WebElement getTitleMrs() {
		return titleMrs;
	}

	public WebElement getInsured2Gender() {
		return insured2Gender;
	}

	public WebElement getSpouseHeightFeetvalue() {
		return spouseHeightFeetvalue;
	}

	public WebElement getSpouseHeightInchvalue() {
		return spouseHeightInchvalue;
	}

	@FindBy(xpath="(//input[@formcontrolname='weight'])[2]")
	WebElement spouseWeight;

	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/app-tata-aig-insurer/form/div/div[2]/mat-expansion-panel/div/div/div/div[1]/div/div[7]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
	WebElement relatoin2 ;

	@FindBy(xpath="(//span[text()=' Spouse '])[1]")
	WebElement relation2value;
	
	//-------------------------------------------------------------------------
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/app-tata-aig-insurer/form/div/div[3]/mat-expansion-panel/div/div/div[1]/div[1]/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement insured3Title;
	
	@FindBy(xpath="(//span[text()=' Mr '])[1]")
     WebElement titleMr;
	
	

	@FindBy(xpath="(//input[@formcontrolname='fname'])[4]")
	WebElement childName;
	
	@FindBy(xpath="(//input[@formcontrolname='lname'])[4]")
	WebElement childlastName;

	@FindBy(xpath="(//input[@formcontrolname='dob'])[4]")
	WebElement childAge;

	@FindBy(xpath="(//span[text()='Height(feet)'])[3]")
	WebElement childHeightFeet;

	@FindBy(xpath="(//span[text()='Height(inch)'])[3]")
	WebElement childHeightInch;
	
	@FindBy(xpath="//span[text()=' 1 ']")
	WebElement schildHeightFeetvalue;

	@FindBy(xpath="//span[text()=' 9 ']")
	WebElement childHeightInchvalue;

	@FindBy(xpath="(//input[@formcontrolname='weight'])[3]")
	WebElement childWeight;

	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/app-tata-aig-insurer/form/div/div[3]/mat-expansion-panel/div/div/div[1]/div[1]/div/div[7]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
	WebElement childRelation;

	@FindBy(xpath="(//span[text()=' Son1 '])[1]")
	WebElement childValuse;
   
	
	public WebElement getInsured3Title() {
		return insured3Title;
	}

	public WebElement getTitleMr() {
		return titleMr;
	}

	public WebElement getChildlastName() {
		return childlastName;
	}

	public WebElement getSchildHeightFeetvalue() {
		return schildHeightFeetvalue;
	}

	public WebElement getChildHeightInchvalue() {
		return childHeightInchvalue;
	}

	public WebElement getSpouseName() {
		return spouseName;
	}

	public WebElement getSpouseAge() {
		return spouseAge;
	}

	public WebElement getSpouseHeightFeet() {
		return spouseHeightFeet;
	}

	public WebElement getSpouseHeightInch() {
		return spouseHeightInch;
	}

	public WebElement getSpouseWeight() {
		return spouseWeight;
	}

	public WebElement getRelatoin2() {
		return relatoin2;
	}

	public WebElement getRelation2value() {
		return relation2value;
	}

	public WebElement getChildName() {
		return childName;
	}

	public WebElement getChildAge() {
		return childAge;
	}

	public WebElement getChildHeightFeet() {
		return childHeightFeet;
	}

	public WebElement getChildHeightInch() {
		return childHeightInch;
	}

	public WebElement getChildWeight() {
		return childWeight;
	}

	public WebElement getChildRelation() {
		return childRelation;
	}

	public WebElement getChildValuse() {
		return childValuse;
	}




}
