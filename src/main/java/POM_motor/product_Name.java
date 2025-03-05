package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class product_Name {
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")
	WebElement ICICI;
	
	public WebElement getICICI() {
		return ICICI;
	}
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[2]/div[1]/div[1]/img")
	WebElement Royal_sundaram;
	
	public WebElement getRoyal_sundaram() {
		return Royal_sundaram;
	}
	
	@FindBy (xpath ="(//div[@class='pcc-details'])[5]")
	WebElement goDigit;

	public WebElement getGoDigit() {
		return goDigit;
	}
	
			@FindBy (xpath ="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[5]/div[1]")
	WebElement universal;

	public WebElement getUniversal() {
		return universal;
	}
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[1]/div[1]/div[4]/div/button")
	WebElement chola ;
	 
	public WebElement getChola () {
		
		return chola; 
	}
}
