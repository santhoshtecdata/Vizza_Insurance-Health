package POMStar;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;


public class floaterInsuredPageElements {
	
	@FindBy(xpath="//mat-panel-title[text()='2.INSURED DETAILS']")
	WebElement insured2Container ;
	
	@FindBy(xpath="(//input[@data-placeholder='Name'])[2]")
	WebElement spouseName;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[3]")
	WebElement spouseDOB;
	
	@FindBy(xpath="(//input[@data-placeholder='Weight(kgs)'])[2]")
	WebElement spouseWeight;
	
	@FindBy(xpath="(//input[@data-placeholder='Height(cms)'])[2]")
	WebElement spouseHeight;
	
	@FindBy(xpath="(//span[text()='Gender'])[3]")
	WebElement spouseGender;
	
	@FindBy(xpath="(//span[text()=' Female '])[1]")
	WebElement spouseFemale;
	
	@FindBy(xpath="(//span[text()='Occupation'])[3]")
	WebElement spouseOccupation;
	
	@FindBy(xpath="(//span[text()=' PROFESSIONAL-ENGINEER '])[1]")
	WebElement spouseWork;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div[2]/mat-expansion-panel/div/div/div/div/div[7]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement spouseRelation;
	
	@FindBy(xpath="(//span[text()=' SPOUSE '])[1]")
	WebElement spouseRel;
	
	///////////////////////////////////////////////////////////////////////////////////////
	//son
	
	@FindBy(xpath="//mat-panel-title[text()='3.INSURED DETAILS']")
	WebElement insured3Container;
	
	@FindBy(xpath="(//input[@data-placeholder='Name'])[3]")
	WebElement childName;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[4]")
	WebElement childDOB;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div[3]/mat-expansion-panel/div/div/div/div[1]/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement childGender;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")
	WebElement childMale;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div[3]/mat-expansion-panel/div/div/div/div[1]/div[6]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement childOccupation;
	
	@FindBy(xpath="(//span[text()=' STUDENTS-SCHOOL AND COLLEGE '])[1]")
	WebElement childWork;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div[3]/mat-expansion-panel/div/div/div/div[1]/div[7]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement childRelation;
	
	@FindBy(xpath="(//span[text()=' DEPENDENT CHILD '])[1]")
	WebElement relChild;
	
	@FindBy(xpath="(//span[text()='Next'])[2]")
	WebElement floaterNxtBtn;

	public WebElement getInsured2Container() {
		return insured2Container;
	}

	public WebElement getSpouseName() {
		return spouseName;
	}

	public WebElement getSpouseDOB() {
		return spouseDOB;
	}

	public WebElement getSpouseWeight() {
		return spouseWeight;
	}

	public WebElement getSpouseHeight() {
		return spouseHeight;
	}

	public WebElement getSpouseGender() {
		return spouseGender;
	}

	public WebElement getSpouseFemale() {
		return spouseFemale;
	}

	public WebElement getSpouseOccupation() {
		return spouseOccupation;
	}

	public WebElement getSpouseWork() {
		return spouseWork;
	}

	public WebElement getSpouseRelation() {
		return spouseRelation;
	}

	public WebElement getSpouseRel() {
		return spouseRel;
	}

	public WebElement getInsured3Container() {
		return insured3Container;
	}

	public WebElement getChildName() {
		return childName;
	}

	public WebElement getChildDOB() {
		return childDOB;
	}

	public WebElement getChildGender() {
		return childGender;
	}

	public WebElement getChildMale() {
		return childMale;
	}

	public WebElement getChildOccupation() {
		return childOccupation;
	}

	public WebElement getChildWork() {
		return childWork;
	}

	public WebElement getChildRelation() {
		return childRelation;
	}

	public WebElement getRelChild() {
		return relChild;
	}

	public WebElement getFloaterNxtBtn() {
		return floaterNxtBtn;
	}
	
	

}
