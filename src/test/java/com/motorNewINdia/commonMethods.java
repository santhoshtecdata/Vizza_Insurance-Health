package com.motorNewINdia;


import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonMethods {
	public static void wait(int a) {
		try {
			long time = a*1000;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		
	}
}
