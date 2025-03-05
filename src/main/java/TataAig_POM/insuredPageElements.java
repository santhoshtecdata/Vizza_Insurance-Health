package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class insuredPageElements {
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-tata-aig-health/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/app-tata-aig-insurer/form/div/div/mat-expansion-panel/div/div/div[1]/div[1]/div[1]/div/mat-checkbox/label/div")
    WebElement sameAsProposer;
	
	@FindBy(xpath="(//span[text()='Height(feet)'])[1]")
	WebElement feet;
	
	@FindBy(xpath="(//span[text()='Height(inch)'])[1]")
	WebElement inch;
	
	@FindBy(xpath="//input[@formcontrolname='weight']")
	WebElement weight;
	
	@FindBy(xpath="(//span[text()='Next'])[2]")
	WebElement nextBtnInInsured;
	
	@FindBy(xpath="(//input[@data-placeholder='First Name'])[2]")
	WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSameAsProposer() {
		return sameAsProposer;
	}

	public WebElement getFeet() {
		return feet;
	}

	public WebElement getInch() {
		return inch;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getNextBtnInInsured() {
		return nextBtnInInsured;
	}
	
	

	@FindBy(xpath="//span[text()=' 5 ']")
	WebElement fiveFeet;
	
	@FindBy(xpath="//span[text()=' 9 ']")
	WebElement nineInch;

	public WebElement getFiveFeet() {
		return fiveFeet;
	}

	public WebElement getNineInch() {
		return nineInch;
	}
	
	
	
}
