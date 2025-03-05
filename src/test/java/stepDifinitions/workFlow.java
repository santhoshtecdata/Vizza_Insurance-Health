package stepDifinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import vizza_insurence.vizzaBase;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.motor.logInMotorTest;

import POM_motor.GCV;
import POM_motor.logInMotor;

public class workFlow extends vizzaBase{
	
      logInMotorTest h = new logInMotorTest();
      logInMotorTest lt = PageFactory.initElements( driver,logInMotorTest.class);
      GCV gcv = PageFactory.initElements(driver, GCV.class);	  
	@Given("I want to write a step with precondition")
	public void open() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				 "E:\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe" );
		    ChromeDriver driver = new  ChromeDriver();
            driver.get("http://13.202.66.31:8083/#/home");
            
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     		logInMotor lm = PageFactory.initElements(driver, logInMotor.class);
     		Actions ac = new Actions(driver);
     		ac.moveToElement(lm.getCommercial_Vehicle()).perform();
     		
     		lm.getCommercial_Vehicle().click();
     		Thread.sleep(2000);     	
     		lm.getUserName().sendKeys("TESTING1");//getData("USERNAME",1,0)
     		lm.getPassword().sendKeys("2");//String.valueOf(getData("USERNAME",1,1).toString())
     		for(int i = 0;i<=6;++i) {
				driver.findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
			}
     		lm.getSupmitBtn().click();
     		Thread.sleep(3000);
     		AssertJUnit.assertTrue(lm.getWelCome().isDisplayed());
	}
	@Given("some other precondition")
	public void some_other_precondition() throws InterruptedException, AWTException, IOException {
		GCV gcv = PageFactory.initElements(driver, GCV.class);
		
		Thread.sleep(2000);
		gcv.getGcvHome().click();
		gcv.getNewBussiness().click();
         String make,model,sm;
         make ="TATA";
         model ="ACE";
         sm="EX";
		System.out.println(make);
		System.out.println(model);
		System.out.println(sm);
	
		
		list(gcv.getCustomer(), "INDIVIDUAL");
		gcv.getRegisterNumperState().sendKeys("TN");
		gcv.getRegisternumper().sendKeys("57");
		list(gcv.getSubCategory(), "PUBLIC");
		gcv.getCustomerName().sendKeys("test");
		gcv.getPhoneNumper().sendKeys("9025939106");
		gcv.getEmail().sendKeys("santhoshtest@gmail.com");
		list(gcv.getManufacturingYear(),"2024");
		gcv.getMake().sendKeys(" BAXY");
		
		gcv.getModel().click();
		list(gcv.getModel(),"SUPER KING");
		list(gcv.getMake(), make);
		list(gcv.getModel(),model);
		Actions ac = new Actions(driver);
		ac.moveToElement(gcv.getRegistrationDate()).perform();
		
		list(gcv.getSubModel(),sm);//1613  EX
		ac.moveToElement(gcv.getAgreeCheckBox()).perform();scroll(10);
		gcv.getAddress1().sendKeys("kovil st");Thread.sleep(1000);
		gcv.getAddress2().sendKeys("north street");Thread.sleep(1000);
		select(gcv.getCity(),"MADURAI");
		select(gcv.getPincode(),"624202");
		
		gcv.getAgreeCheckBox().click();
		gcv.getSubmitBtn().click();
		Assert.assertTrue(gcv.getPremiumQuotePage().isDisplayed());


	}
	@When("I complete action")
	public void i_complete_action() throws InterruptedException, AWTException, IOException {
	    lt.KYCverificationPage();
	}
	@When("some other action")
	public void some_other_action() throws InterruptedException, AWTException, IOException {
	    lt.personalDetails();
	}
	@When("yet another action")
	public void yet_another_action() {
	   lt.vehicleDetailsPage();
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    lt.nomineePage();
	}
	@Then("check more outcomes")
	public void check_more_outcomes() throws AWTException, InterruptedException, IOException {
	   lt.fileUpload();
	}
}
