package com.carePOM;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class ProposerPageElements {

	    @FindBy(xpath = "//input[@data-placeholder='Title']")
	      WebElement titleDropdown;

	    @FindBy(xpath = "//input[@data-placeholder='First Name']")
	      WebElement firstNameInput;

	    @FindBy(xpath = "//input[@data-placeholder='Last Name']")
	      WebElement lastNameInput;

	    @FindBy(xpath = "//input[@data-placeholder='Gender']")
	      WebElement genderDropdown;

	    @FindBy(xpath = "//input[@data-placeholder='DOB (DD/MM/YYYY)']")
	      WebElement dobInput;

	    @FindBy(xpath = "//input[@data-placeholder='Aadhar Number']")
	      WebElement aadharNumberInput;

	    @FindBy(xpath = "//input[@data-placeholder='PAN Number']")
	      WebElement panNumberInput;

	    @FindBy(xpath = "//input[@data-placeholder='GST Number']")
	      WebElement gstNumberInput;

	    @FindBy(xpath = "//input[@data-placeholder='Email ID']")
	      WebElement emailInput;

	    @FindBy(xpath = "//input[@data-placeholder='Mobile Number']")
	      WebElement mobileNumberInput;

	    @FindBy(xpath = "//input[@data-placeholder='Alternate Number']")
	      WebElement alternateNumberInput;

	    @FindBy(xpath = "//input[@data-placeholder='Address 2']")
	      WebElement address2Input;

	    @FindBy(xpath = "//input[@data-placeholder='PIN Code']")
	      WebElement pinCodeInput;

	    @FindBy(xpath = "//input[@data-placeholder='City']")
	      WebElement cityDropdown;

	    @FindBy(xpath = "//input[@data-placeholder='State']")
	      WebElement stateInput;

	    @FindBy(xpath = "//input[@type='checkbox' and @data-placeholder='Same As Communication Address']")
	     WebElement sameAsCommunicationAddressCheckbox;

	    @FindBy(xpath = "//button[text()='Next']")
	      WebElement nextButton;

	    // Add-on checkboxes
	    @FindBy(xpath = "//label[contains(text(),'Unlimited Recharge')]/preceding-sibling::input[@type='checkbox']")
	      WebElement unlimitedRechargeCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'NCB Super')]/preceding-sibling::input[@type='checkbox']")
	      WebElement ncbSuperCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'Everyday Care')]/preceding-sibling::input[@type='checkbox']")
	      WebElement everydayCareCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'Air Ambulance')]/preceding-sibling::input[@type='checkbox']")
	      WebElement airAmbulanceCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'Care Shield')]/preceding-sibling::input[@type='checkbox']")
	      WebElement careShieldCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'Reduction In PED Waiting period')]/preceding-sibling::input[@type='checkbox']")
	      WebElement reductionInPEDWaitingPeriodCheckbox;

	    @FindBy(xpath = "//label[contains(text(),'OPD Care')]/preceding-sibling::input[@type='checkbox']")
	      WebElement opdCareCheckbox;

	    // Getter Methods

	    public WebElement getTitleDropdown() {
	        return titleDropdown;
	    }

	    public WebElement getFirstNameInput() {
	        return firstNameInput;
	    }

	    public WebElement getLastNameInput() {
	        return lastNameInput;
	    }

	    public WebElement getGenderDropdown() {
	        return genderDropdown;
	    }

	    public WebElement getDobInput() {
	        return dobInput;
	    }

	    public WebElement getAadharNumberInput() {
	        return aadharNumberInput;
	    }

	    public WebElement getPanNumberInput() {
	        return panNumberInput;
	    }

	    public WebElement getGstNumberInput() {
	        return gstNumberInput;
	    }

	    public WebElement getEmailInput() {
	        return emailInput;
	    }

	    public WebElement getMobileNumberInput() {
	        return mobileNumberInput;
	    }

	    public WebElement getAlternateNumberInput() {
	        return alternateNumberInput;
	    }

	    public WebElement getAddress2Input() {
	        return address2Input;
	    }

	    public WebElement getPinCodeInput() {
	        return pinCodeInput;
	    }

	    public WebElement getCityDropdown() {
	        return cityDropdown;
	    }

	    public WebElement getStateInput() {
	        return stateInput;
	    }

	    public WebElement getSameAsCommunicationAddressCheckbox() {
	        return sameAsCommunicationAddressCheckbox;
	    }

	    public WebElement getNextButton() {
	        return nextButton;
	    }

	    // Getter Methods for Add-ons

	    public WebElement getUnlimitedRechargeCheckbox() {
	        return unlimitedRechargeCheckbox;
	    }

	    public WebElement getNcbSuperCheckbox() {
	        return ncbSuperCheckbox;
	    }

	    public WebElement getEverydayCareCheckbox() {
	        return everydayCareCheckbox;
	    }

	    public WebElement getAirAmbulanceCheckbox() {
	        return airAmbulanceCheckbox;
	    }

	    public WebElement getCareShieldCheckbox() {
	        return careShieldCheckbox;
	    }

	    public WebElement getReductionInPEDWaitingPeriodCheckbox() {
	        return reductionInPEDWaitingPeriodCheckbox;
	    }

	    public WebElement getOpdCareCheckbox() {
	        return opdCareCheckbox;
	    }
	}



