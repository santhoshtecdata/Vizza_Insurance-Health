package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nomineePageElementsPOM {
	
	
	@FindBy(xpath="//input[@data-placeholder='Name of Nominee']")
	WebElement nomineeName;
	
	@FindBy(xpath="//input[@data-placeholder='% Of the Claim']")
	WebElement nomineeContribution;
	
	@FindBy(xpath="(//span[text()='Gender'])[3]")
	WebElement nomineeGender;
	
	@FindBy(xpath="(//span[text()='Gender'])[5]")
	WebElement floaterNomineegender;
	
	@FindBy(xpath="(//span[text()='Female'])[2]")
	WebElement floaterFemale;
	
	@FindBy(xpath="(//span[text()='Male'])[3]")
	WebElement genderMale;
	
	@FindBy(xpath="(//span[text()='Female'])[1]")
	WebElement genderFemale;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[3]")
	WebElement nomineeDOB;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[5]")
	WebElement floaterNomineeDOB;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[3]/mat-accordion/mat-expansion-panel/div/div/app-tata-aig-nominee/form/div/div/mat-card/div/div[4]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
	WebElement nomineeRelation ;
	
	@FindBy(xpath="//span[text()=' Spouse ']")
	WebElement spouse;
	
	@FindBy(xpath="(//span[text()='Next'])[3]")
	WebElement nomineePageNxtBtn;


	

	
	


	public WebElement getNomineeGender() {
		return nomineeGender;
	}


	public WebElement getFloaterNomineegender() {
		return floaterNomineegender;
	}


	public WebElement getFloaterFemale() {
		return floaterFemale;
	}


	public WebElement getFloaterNomineeDOB() {
		return floaterNomineeDOB;
	}


	public WebElement getNomineeName() {
		return nomineeName;
	}


	public WebElement getNomineeContribution() {
		return nomineeContribution;
	}



	public WebElement getGenderMale() {
		return genderMale;
	}


	public WebElement getGenderFemale() {
		return genderFemale;
	}


	public WebElement getNomineeDOB() {
		return nomineeDOB;
	}


	public WebElement getNomineeRelation() {
		return nomineeRelation;
	}


	public WebElement getSpouse() {
		return spouse;
	}


	public WebElement getNomineePageNxtBtn() {
		return nomineePageNxtBtn;
	}




}
