package com.new_india_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.nidriver;

public class typeOfVehicle {
	private typeOfVehicle getins;
	
	public  static typeOfVehicle getins() {
		return PageFactory.initElements(nidriver.getDriver(),typeOfVehicle.class);
	}
	

	@FindBy(xpath="//h3[text()='TWO WHEELER']")
	WebElement twoWheeler;
	
	@FindBy(xpath="//h3[text()='PRIVATE CAR']")
	WebElement privateCar;
	
	@FindBy(xpath="//h3[text()='PASSENGER CARRYING VEHICLE']")
	WebElement PCV;
	
	@FindBy(xpath="//h3[text()='COMMERCIAL VEHICLE']")
	WebElement GCV;   
	
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement cancelBtn;
	
	
	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(WebElement cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public WebElement getTwoWheeler() {
		return twoWheeler;
	}

	public WebElement getPrivateCar() {
		return privateCar;
	}

	public WebElement getPCV() {
		return PCV;
	}

	public WebElement getGCV() {
		return GCV;
	}

}
