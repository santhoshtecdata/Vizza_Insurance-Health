package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nomineePage {
	@FindBy(xpath="//input[@formcontrolname='nominee_Name']")
    WebElement nomineeName;
	
	@FindBy(xpath="//input[@formcontrolname='nominee_DOB']")
    WebElement nomineeDOB;
	
	@FindBy(xpath="//select[@formcontrolname='nominee_Relationship']")
    WebElement relation;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement saveBtn;

	
	@FindBy(xpath="//button[text()='Ok']")
    WebElement okBtn;
	
	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getNomineeName() {
		return nomineeName;
	}

	public WebElement getNomineeDOB() {
		return nomineeDOB;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}
