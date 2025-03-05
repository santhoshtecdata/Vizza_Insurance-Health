package testSatr;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import vizza_insurence.vizzaBase;



public class starFlow extends vizzaBase{
	@Test
	public void makePolicy() throws InterruptedException, IOException, AWTException {
		test = report.createTest("verify proposal is created or not");
		test.pass("chrome browser opened");
		test.pass("login successfully");
		TestStar ts = new TestStar();
		ts.assure() ;
		test.pass("Assure plan proposal is created");
		until(30);
		ts.copy();
		driver.get("https://vizzainsurance.com/home");
		until(3);
		ts.logout();until(2);
		test.pass("logout successfully");
		ts.com();
		test.pass("Comprehensive plan proposal is created");
		until(10);
		ts.copy();
		test.pass("star produts verifiyed");
		
			}
	
	/*public static void report() {
		
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
		
	}*/

	
}


