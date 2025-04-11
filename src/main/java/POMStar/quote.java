package POMStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class quote {



	@FindBy(xpath="(//mat-select-trigger[text()=' All (+ 4 others) '])[1]")
	WebElement filter;

	@FindBy(xpath="//span[text()='Ok']")
	WebElement posOk;
	
	@FindBy(xpath="(//span[text()='5 Lac'])[1]")
	WebElement sum;

	@FindBy(xpath="(//span[text()='Yearly'])[1]")
	WebElement mode;

	@FindBy(xpath="(//span[text()=' Star Health '])[1]")
	WebElement star;

	@FindBy(xpath="(//span[text()='/Yr'])[1]")
	WebElement assure;

	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[3]/div/div[1]/div[4]/div/button/span[2]")
	WebElement com;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[4]/div/div[1]/div[4]/div/button/span[1]/span/span")
	WebElement WomenCareAmount;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[4]/div/div[1]/div[4]/div/button/span[2]")
	WebElement WomenCare;
	
	@FindBy(xpath="(//mat-select-trigger[text()=' Star Health '])[1]")
	WebElement filterArrow;
	
	@FindBy(xpath="//div[contains(text(),'Star Health - Star Comprehensive Individual')]")
	WebElement newIndia;
	
	@FindBy (xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[5]/div/div[1]/div[4]/div/button/span[1]/span/span")
	WebElement comretry;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div[1]/div[4]/div/button/span[2]")
	WebElement floaterPremium;
	
	@FindBy(xpath="(//span[text()='Select All'])[1]")
	WebElement selectAllInFilter;
	
	@FindBy(xpath="/html/body/div[3]/div[1]")
	WebElement dummy;
	
	@FindBy(xpath="")
	WebElement f;
	
	
	public WebElement getPosOk() {
		return posOk;
	}



	public void setPosOk(WebElement posOk) {
		this.posOk = posOk;
	}



	public void setFilterArrow(WebElement filterArrow) {
		this.filterArrow = filterArrow;
	}



	public void setNewIndia(WebElement newIndia) {
		this.newIndia = newIndia;
	}



	public void setComretry(WebElement comretry) {
		this.comretry = comretry;
	}



	public void setFloaterPremium(WebElement floaterPremium) {
		this.floaterPremium = floaterPremium;
	}



	public void setSelectAllInFilter(WebElement selectAllInFilter) {
		this.selectAllInFilter = selectAllInFilter;
	}



	public void setDummy(WebElement dummy) {
		this.dummy = dummy;
	}



	public void setF(WebElement f) {
		this.f = f;
	}



	public WebElement getSelectAllInFilter() {
		return selectAllInFilter;
	}



	public WebElement getDummy() {
		return dummy;
	}



	public WebElement getF() {
		return f;
	}



	public WebElement getFloaterPremium() {
		return floaterPremium;
	}

	

	public WebElement getNewIndia() {
		return newIndia;
	}

	public WebElement getComretry() {
		return comretry;
	}

	public WebElement getFilterArrow() {
		return filterArrow;
	}

	public WebElement getWomenCareAmount() {
		return WomenCareAmount;
	}

	public void setWomenCareAmount(WebElement womenCareAmount) {
		WomenCareAmount = womenCareAmount;
	}

	public WebElement getWomenCare() {
		return WomenCare;
	}

	public void setWomenCare(WebElement womenCare) {
		WomenCare = womenCare;
	}

	public void setCom(WebElement com) {
		this.com = com;
	}

	public WebElement getCom() {
		return com;
	}

	public WebElement getAssure() {
		return assure;
	}

	public void setAssure(WebElement assure) {
		this.assure = assure;
	}

	public WebElement getFilter() {
		return filter;
	}

	public void setFilter(WebElement filter) {
		this.filter = filter;
	}

	public WebElement getSum() {
		return sum;
	}

	public void setSum(WebElement sum) {
		this.sum = sum;
	}

	public WebElement getMode() {
		return mode;
	}

	public void setMode(WebElement mode) {
		this.mode = mode;
	}

	public WebElement getStar() {
		return star;
	}

	public void setStar(WebElement star) {
		this.star = star;
	}



}
