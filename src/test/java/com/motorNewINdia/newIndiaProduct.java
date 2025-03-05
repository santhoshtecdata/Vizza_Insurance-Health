package com.motorNewINdia;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.new_india_POM.typeOfVehicle;

import driverManager.nidriver;


public class newIndiaProduct extends commonMethods  {


	@Test
	public void verifyTheAllKindOfVehiclesAreClickable() {
	
		nidriver.getDriver().get("https://uat.vizzainsurance.com/#/motor");

		nidriver.getDriver().manage().window().maximize();
		commonMethods.wait(2);
		List<WebElement> elementsList = new ArrayList<>();


		elementsList.add(typeOfVehicle.getins().getTwoWheeler());
		elementsList.add(typeOfVehicle.getins().getPrivateCar());
		elementsList.add(typeOfVehicle.getins().getPCV());
		elementsList.add(typeOfVehicle.getins().getGCV());
		for(int i =0;i<elementsList.size();i++) {
			elementsList.get(i).click();
			if(true) {
			System.out.println(	nidriver.getDriver().getTitle());
			}
			commonMethods.wait(1);
			typeOfVehicle.getins().getCancelBtn().click();
			commonMethods.	wait(1);
		}
		nidriver.getDriver().quit();

	}
	
	
}
