package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logInMotor {
	
	
	@FindBy(xpath="//b[text()='Commercial Vehicle']")
	WebElement commercial_Vehicle;
	
	@FindBy(xpath="//input[@data-placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@data-placeholder='Password']")
	WebElement password;
	
	public WebElement getCommercial_Vehicle() {
		return commercial_Vehicle;
	}



	public WebElement getUserName() {
		return userName;
	}

	

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getSupmitBtn() {
		return supmitBtn;
	}

	

	public WebElement getWelCome() {
		return welCome;
	}

	

	@FindBy(xpath="//button[@type='submit']")
	WebElement supmitBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-commercial")
	WebElement welCome;
}
