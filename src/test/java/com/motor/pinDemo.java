package com.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import vizza_insurence.vizzaBase;

public class pinDemo extends vizzaBase {
	
	
	@DataProvider(name = "pincode")
	public Object[][] makeDataProvider() {

	  return new Object[][]{
	    {"800001"},{"411032"},{"110045"},{"400008"},{"160101"},{"834005"},{"500020"},{"413001"},{"396421"},{"416001"},{"625002"},{"518001"},{"140301"},
	    {"524001"},{"631027"},{"570001"},{"503001"},{"505001"},{"160001"},{"490042"},{"342005"},{"800002"},{"221005"},{"211001"} ,
	    {"440001"},{"462001"},{"600001"},{"226001"},{"700001"},{"302001"} ,
	    {"110093"},{"111045"},{"500001"},{"530068"},{"110038"},{"400001"},{"400080"}
	   
	  };
	     
	}
	@Test(dataProvider="pincode")

	public void pincodeTest (String no) throws InterruptedException {
		driver.get("http://13.127.24.123/vizzawebnew/#/health-insurance/hdfc-ergo-health-proposal");Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div")).click();
		Thread.sleep(000);

		driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[1]/div/div[1]/div[1]/div[1]/div[3]/mat-form-field/div/div[1]/div/input")).sendKeys("22");
		scroll(10);
		driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-form-field/div/div[1]/div[1]/input")).sendKeys(no);
		
		driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div/mat-tab-group/div/mat-tab-body[1]/div/div[2]/button[1]/span[1]")).click();
		Thread.sleep(2000);
	   driver.navigate().refresh();
	   Thread.sleep(5000);
	  // 
       driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
	    scroll(10);
	
					   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[24]")).click();   Thread.sleep(3000);
					 //
					   driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/mat-select-trigger/span")).click();
					   Thread.sleep(2000);scroll(4);
					   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[5]/mat-pseudo-checkbox")).click();
				      	Thread.sleep(10000); 
					   
					   driver.navigate().refresh();		   
		driver.findElement(By.xpath("/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[3]/div/div[1]/div[4]/div/button/span[2]")).click();
	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input")).sendKeys("9887897678");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[1]/div[3]/mat-form-field/div/div[1]/div/input")).sendKeys("XIRPN7365T");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[1]/div[4]/mat-form-field/div/div[1]/div[1]/input")).sendKeys("17/05/1998");Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[2]/button/span[1]")).click();
	
		scroll(20);
		boolean it=false;
		
		it=driver.findElement(By.xpath("(//span[text()='OptimaWellbeing'])[1]")).isDisplayed();
		
		if (it) {
		 Assert.assertTrue(it);
		driver.quit();}
		else {
			driver.quit();
		}
		System.out.println(no +" "+it);	
	}
	

	

	
}
