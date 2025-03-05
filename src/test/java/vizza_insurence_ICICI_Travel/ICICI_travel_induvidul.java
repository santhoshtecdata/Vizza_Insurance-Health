package vizza_insurence_ICICI_Travel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Quotepage;
import POM.login;
import testSatr.TestStar;
import vizza_insurence.vizzaBase;

public class ICICI_travel_induvidul extends vizzaBase{
	
	
	@Test
	public void loginWithValidCredentials1() throws InterruptedException, IOException {
		
	options.addArguments("--incognito");
	driver.get(getProperty(incourl));
	login lg= PageFactory.initElements(driver,login.class);
	lg.getLoginBtn().click();
	lg.getPosLink().click();
	lg.getMobileNumper().sendKeys("9962907312");
	lg.getPassword().sendKeys("admin1");
	lg.getSupmitBtn().click();
	Thread.sleep(3000);
	boolean loginHomePage=lg.getLogOutBtn().isDisplayed();
	Thread.sleep(3000);
    Assert.assertTrue(loginHomePage);
}
	
	
	public String name() {
		return "status";
	}
	
	
	
	
	@Test
	public void quotePage() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestStar testStar = new TestStar();
		//loginWithValidCredentials();
		testStar.loginWithValidCredentials("9962907312","admin1");
		Quotepage qp=PageFactory.initElements(driver,Quotepage.class);
		qp.getOnLineInsurence().click();
		qp.getTravelInsuernce().click();
		qp.getSumAmount().click();
		qp.getSumAmount500000().click();
		qp.getSelfCheckBox().click();
		qp.getDob().sendKeys("06/06/2002");
		qp.getPassPortNumper().sendKeys("A784736365");
		qp.getStartDate().sendKeys(String.valueOf((Integer.parseInt( date("dd"))+1))+"/"+date("MM/yyyy"));
		qp.getEndDate().sendKeys(String.valueOf((Integer.parseInt( date("dd"))+5))+"/"+date("MM/yyyy"));
		Thread.sleep(5000);
		qp.getTravelPlan().click();
		qp.getCountry().click();
		WebElement html= driver.findElement(By.xpath("html"));
		html.click();
		qp.getTripType().click();	
		qp.getHolidayTripyype().click();
		html.click();
	    qp.getAnyMedicalContionsNo().click();
		qp.getPincode().sendKeys("600018");
		Thread.sleep(2000);
		qp.getProceedBtn().click();
		Thread.sleep(2000);
		boolean premiumQuotePage = qp.getTravelInsuernce().isDisplayed();
		Assert.assertTrue(premiumQuotePage);
		
		}
	@Test
	public void s() {
		
		
	}
	
}