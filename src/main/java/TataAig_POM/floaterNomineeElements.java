package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class floaterNomineeElements {
	

	@FindBy(xpath="//input[@data-placeholder='Name of Nominee']")
	WebElement nomineeName;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[3]/mat-accordion/mat-expansion-panel/div/div/app-tata-aig-nominee/form/div/div/mat-card/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement gender;
	
	@FindBy(xpath="(//span[text()='Female'])[2]")
	WebElement female;
	
	@FindBy(xpath="(//input[@formcontrolname='dob'])[5]")
	WebElement dob;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[3]/mat-accordion/mat-expansion-panel/div/div/app-tata-aig-nominee/form/div/div/mat-card/div/div[4]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
	WebElement relation;
	
	@FindBy(xpath="//span[text()=' Spouse ']")
	WebElement spouse;
	
	@FindBy(xpath="//input[@data-placeholder='% Of the Claim']")
	WebElement contribution;
	
	@FindBy(xpath="(//span[text()='Next'])[3]")
	WebElement nomineePageNxtBtn;

	public WebElement getNomineeName() {
		return nomineeName;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getSpouse() {
		return spouse;
	}

	public WebElement getContribution() {
		return contribution;
	}

	public WebElement getNomineePageNxtBtn() {
		return nomineePageNxtBtn;
	}
	
	
	

}
