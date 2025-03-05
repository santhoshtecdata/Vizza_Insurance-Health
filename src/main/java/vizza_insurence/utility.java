package vizza_insurence;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_motor.product_Name;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class utility extends vizzaBase {
	
	
	

	public void selectProtect(String CompanyName) throws InterruptedException{
		product_Name pn = PageFactory.initElements(driver, product_Name.class);
		Actions ac = new Actions(driver);
		String companyName = CompanyName;
		
	
			
			
		if("ICICI".equals(companyName)) {

			ac.moveToElement( pn.getICICI()).click();
			System.out.println("ICICI");
		}
		else if("NewIndia".equals(companyName)) {
			System.out.println("New India"); 
		}
		else  if("GoDigit".equals(companyName)) {
			for(int i = 0;i<=10;++i) {
				driver.findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
			}

			ac.moveToElement( pn.getGoDigit()).click(); 


			WebElement amount  =driver.findElement(By.xpath("//button[@class='btn btn-outline-info']/parent::div"));
			Thread.sleep(2000); for(int i = 0;i<=10;++i) {
				driver.findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
			}
			amount.click();
			System.out.println("GoDigit");	
			
		}
		
		else if("chola".equals(companyName)) {
			System.out.println("CHOLAA"); 
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.elementToBeClickable(pn.getChola()));
			pn.getChola().click();
			System.out.println("CHOLAA end"); 
		}
		else if("UniversalSompo".equals(companyName)) {
			Thread.sleep(2000);
			  WebDriverWait wait = new WebDriverWait(driver, 30);
			  
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
			 scroll(10);
             ac.moveToElement(pn.getUniversal()).build().perform();
			System.out.println("Universal shampo start"); 
		    Thread.sleep(2000); 
		//	scroll(10);
			driver.findElement(By.xpath("//div[@class='pcc-details']//parent::button[@class='btn btn-outline-info']")).click();
			System.out.println("Universal shampo end");  
		}
		else if ("RSA".equals(companyName)) {
		    	scroll(9);
	    	// ac.moveToElement(pn.getRoyal_sundaram()).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();
			
		}


	}
	
	
	

	public void goDigitPersonalDetails() throws InterruptedException {
		POM_motor.personalDetails pd = PageFactory.initElements(driver,POM_motor.personalDetails.class);
		Thread.sleep(1000);
		list(pd.getTittle(),"MR");
		pd.getLastName().sendKeys("ANANTHAKRISHNAN");
		scroll(10);
	//	pd.getCity().sendKeys("CHENNAI");
	//	pd.getPicode().sendKeys("600018");
	//	pd.getPannumber().sendKeys("GLBPB9031Q");
		list(pd.getOccupation(),"IT Profession");
		pd.getSameAsAbove().click();
		pd.getSubmitBtn().click();
	}
	public void me() {
		ExtentSparkReporter re = new ExtentSparkReporter("./");
	}
	
	
	
	
	
	

}



