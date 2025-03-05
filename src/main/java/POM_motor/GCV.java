package POM_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GCV {
	
	@FindBy(xpath="//img[@alt='COMMERCIAL VEHICLE']")
	WebElement gcvHome;

	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/mat-radio-group/mat-radio-button[1]/label/div[1]/div[1]")
	WebElement newBussiness;

	@FindBy(xpath="//select[@formcontrolname='CustomerType']")
	WebElement customer  ;
	
	@FindBy(xpath="//input[@placeholder='AA']")
	WebElement registerNumperState;
	
	public WebElement getRollOver() {
		return rollOver;
	}

	public WebElement getChr() {
		return chr;
	}

	public WebElement getFourDigit() {
		return fourDigit;
	}

	public WebElement getPriviousPolicyType() {
		return priviousPolicyType;
	}

	public WebElement getPriviousInsurer() {
		return priviousInsurer;
	}

	public WebElement getPriviousPolicyExpDate() {
		return priviousPolicyExpDate;
	}

	@FindBy(xpath="//input[@id='myTextField']")
	WebElement registernumper ;
	
	@FindBy(xpath="//select[@formcontrolname='Sub_Category']")
	WebElement subCategory;
	
	@FindBy(xpath="//input[@formcontrolname='CustomerName']")
	WebElement  customerName;
	
	@FindBy(xpath="//input[@formcontrolname='PhoneNo']")
	WebElement phoneNumper ;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement  email;
	
	@FindBy(xpath="//select[@formcontrolname='ManufacturingYear']")
	WebElement manufacturingYear;
	
	@FindBy(xpath="//select[@formcontrolname='Make']")
	WebElement make;
	
	@FindBy(xpath="//select[@formcontrolname='Model']")
	WebElement model;
	
	@FindBy(xpath="//select [@formcontrolname='SubModel']")
	WebElement subModel;
	
	@FindBy(xpath="//input[@type='date'][@formcontrolname='RegistrationDate']")
	WebElement registrationDate;
	
	@FindBy(xpath="//*[@id=\"agree\"]/label/div")
	WebElement agreeCheckBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//h5[text()=' Showing Results For: ']")
	WebElement PremiumQuotePage;

	public WebElement getGcvHome() {
		return gcvHome;
	}

	public WebElement getNewBussiness() {
		return newBussiness;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getRegisterNumperState() {
		return registerNumperState;
	}

	public WebElement getRegisternumper() {
		return registernumper;
	}

	public WebElement getSubCategory() {
		return subCategory;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getPhoneNumper() {
		return phoneNumper;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getManufacturingYear() {
		return manufacturingYear;
	}

	public WebElement getMake() {
		return make;
	}

	public WebElement getModel() {
		return model;
	}

	public WebElement getSubModel() {
		return subModel;
	}

	public WebElement getRegistrationDate() {
		return registrationDate;
	}

	public WebElement getAgreeCheckBox() {
		return agreeCheckBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getPremiumQuotePage() {
		return PremiumQuotePage;
	}
	
			@FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[7]")
			WebElement rollOver;
	
			@FindBy(xpath="(//input[@placeholder='AA'])[2]")
			WebElement chr; 
			
			
			@FindBy(xpath="//input[@placeholder='0000']")
			WebElement fourDigit;
			
			@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-gcvpccv/div[2]/mat-card/mat-card-content/div/form/div[1]/div[19]/div/select")
			WebElement priviousPolicyType;
			
			@FindBy(xpath="//select[@formcontrolname='Previous_Insurance_Company_Name']")
			WebElement priviousInsurer;
			
			@FindBy(xpath="//select[@formcontrolname='NCB']")
			WebElement NCBamount;
			
			public WebElement getNCBamount() {
				return NCBamount;
			}

			public void setNCBamount(WebElement nCBamount) {
				NCBamount = nCBamount;
			}

			@FindBy(xpath="//input[@formcontrolname='Previous_Policy_Expiry_Date']")
			WebElement priviousPolicyExpDate;
			
			
			
			@FindBy(xpath="//div[@class='container pcc-features-ls ng-star-inserted']")
			WebElement failurepopup;
			
			public WebElement getVahanOk() {
				return vahanOk;
			}

			public void setVahanOk(WebElement vahanOk) {
				this.vahanOk = vahanOk;
			}

			public WebElement getFailurepopup() {
				return failurepopup;
			}

			@FindBy(xpath="//button[text()='Ok']")
			WebElement vahanOk;
			
			@FindBy(xpath="//input[@formcontrolname='address1']")
			WebElement address1;
			
			@FindBy(xpath="//input[@formcontrolname='address2']")
			WebElement address2;
			
			@FindBy(xpath="(//button[@type='button'])[2]")
			WebElement city;
			
			@FindBy(xpath="(//button[@type='button'])[3]")
			WebElement pincode;

			public WebElement getAddress1() {
				return address1;
			}

			public WebElement getAddress2() {
				return address2;
			}

			public WebElement getCity() {
				return city;
			}

			public WebElement getPincode() {
				return pincode;
			}
			
}
