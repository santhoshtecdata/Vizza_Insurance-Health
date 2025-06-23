package testSatr;

import java.awt.AWTException;

import java.io.IOException;

import org.testng.annotations.Test;

import vizza_insurence.vizzaBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class starFlow extends vizzaBase{
	
	
	
	@Test
	
	public void makePolicy() throws InterruptedException, IOException, AWTException {
		test = report.createTest("verify proposal is created or not");
		test.pass("chrome browser opened");
		test.pass("login successfully");
		TestStar ts = new TestStar();
		ts.assure();
		test.pass("Assure plan proposal is created");
		until(10);
        ts.copy();
		until(3);
		driver.get("https://vizzainsurance.com/home");
		until(3);
		ts.logout();until(2);
		test.pass("logout successfully");
		ts.com();
		test.pass("Comprehensive plan proposal is created");
		until(10);
		ts.copy();
		until(2);
		ts.verifyCopyLink();
		until(15);
		test.pass("star produts verifiyed");
		}
	/*
	@Test
	public void chat() {
		driver.get("https://chatgpt.com/");}
	*/
	
	/*
	
	public static void report() {
		
		//create a empty html file
				ExtentSparkReporter esr = new ExtentSparkReporter("./testReport.html");
				//Actual report generate this
				ExtentReports report = new ExtentReports();
				// attach the report and file
				report.attachReporter(esr);
		
				ExtentTest test = report.createTest("test case 1");
		test.pass("click the button");
		test.pass("success");	
	
		report.flush();
		pri("done");
		
	}
	
*/	}
	



