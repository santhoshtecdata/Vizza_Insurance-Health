package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	@FindBy(xpath="//div[@class='dropdown h-login']")
	WebElement loginBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/div[2]/div/div/a[1]/i")
	WebElement posLink;
	
	@FindBy(xpath="//input[@data-placeholder='Mobile number']")
	WebElement mobileNumper;
	
	@FindBy(xpath="//input[@data-placeholder='Password']")
	WebElement password ;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement supmitBtn ;
	
	@FindBy(xpath="//mat-icon[@mattooltip='Logout']")
	WebElement logOutBtn ;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPosLink() {
		return posLink;
	}

	public WebElement getMobileNumper() {
		return mobileNumper;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSupmitBtn() {
		return supmitBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
}
