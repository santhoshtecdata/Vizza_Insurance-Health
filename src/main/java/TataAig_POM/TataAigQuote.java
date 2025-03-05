package TataAig_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TataAigQuote {
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/mat-select-trigger")
	WebElement filterfield;

	@FindBy(xpath="//span[text()=' tataAig ']")
	WebElement  tataAigInFilter;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[3]/div/div[1]/div[4]/div/button/span[2]")
	WebElement tataAigPremier;
	
	@FindBy(xpath="(//span[text()='Select All'])[1]")
	WebElement selectAllInFilter;
	
	@FindBy(xpath="/html/body/div[3]/div[1]")
	WebElement dummy;
	
	@FindBy(xpath="")
	WebElement f;
	
	
	public WebElement getSelectAllInFilter() {
		return selectAllInFilter;
	}



	public WebElement getDummy() {
		return dummy;
	}
	
	public WebElement getFilterfield() {
		return filterfield;
	}


	public WebElement getTataAigInFilter() {
		return tataAigInFilter;
	}


	public WebElement getTataAigPremier() {
		return tataAigPremier;
	}


	public WebElement getSumInsured() {
		return sumInsured;
	}


	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")
	WebElement sumInsured;

	@FindBy(xpath="(//span[text()='10 Lac'])[1]")
	WebElement tenLacks;
	
	
	public WebElement getTenLacks() {
		return tenLacks;
	}
	
}


