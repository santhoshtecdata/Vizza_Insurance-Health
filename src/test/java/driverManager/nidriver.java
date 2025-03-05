package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nidriver {
	
    

	private static ChromeDriver driver;
  
	public static void setDriver(ChromeDriver driver) {
		
	}
	public static  WebDriver getDriver() {
		if(driver==null) {
		nidriver.driver = new ChromeDriver();
		}
		return driver;
		
	}
	
}
