package vizza_insurence;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;

import POM_motor.CKYC;
import POM_motor.logInMotor;
import io.github.bonigarcia.wdm.WebDriverManager;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;




public class vizzaBase {
	public String propath= ".//src//main//resources//property.properties";
	public String browser = "browser";
	public String browsername1= "chrome";
	public String browsername2 = "firefox";
	public String chpath = "chromepath";
	public String ffpath = "ffpath";
	public String sspath = "screenshotpath";
	public String tdPath = "tdpath";
	public static WebDriver driver;
	public String url = "url";
	public String incourl = "incourl";
	public String min_wait = "min_wait";
	public ChromeOptions options = new ChromeOptions();
	public FirefoxOptions option = new FirefoxOptions();
	public String chromepath="chromepath";
	public FileInputStream fis;
	public ExtentReports report;
	public ExtentSparkReporter esr;
	public ExtentTest test;
	public static Robot r1;
	public BrowserMobProxy proxy;
	
	public String getProperty(String name) throws IOException {
		this.fis = new FileInputStream(this.propath);
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(name);	
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, AWTException {
		String browser = this.getProperty(this.browser);
	
	
	      
	     
	     
		this.options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe" );
		 */
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options); 

		driver.get(getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(this.getProperty(this.min_wait)), TimeUnit.SECONDS);
		/*
		 * Robot r1=new Robot(); r1.keyPress(KeyEvent.VK_WINDOWS);
		 * r1.keyPress(KeyEvent.VK_F12); r1.keyRelease(KeyEvent.VK_F);
		 * r1.keyRelease(KeyEvent.VK_F12);
		 */


		        //create a empty html file
				 esr = new ExtentSparkReporter("./testReport.html");
				//Actual report generate this
				 report = new ExtentReports();
				// attach the report and file
				report.attachReporter(esr);
				
				
				
			
	}

	@AfterMethod
	public void afterMethod() {
		
		
		
		report.flush();
		driver.quit();
	}

	public void takeScreenshot(String name) throws IOException {
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		File f1 = ef.getScreenshotAs(OutputType.FILE);
		File f2 = new File(this.getProperty(this.sspath)+name+".png");
		FileUtils.copyFile(f1, f2);
	}
	public String getData(String sheetname, int r, int c) throws IOException, IOException {
		this.fis= new FileInputStream(this.getProperty(this.tdPath));
		//this.fis= new FileInputStream("C:\\Users\\Tec Data\\eclipse-workspace\\vizza_insurence\\testdata\\data\\Book1.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=	wb.getSheet(sheetname);
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);
		String value = cell.getStringCellValue();
		return value;
	}
	public static String date(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(date);  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now);
	}
	public static void enter() throws AWTException {
	    r1=new Robot(); 
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void window(int window) {
		Set<String> all =driver.getWindowHandles();
		List<String> all_window=new ArrayList(all);
		driver.switchTo().window(all_window.get(window));
	}
	public void waiting(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void list( WebElement ele,String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);

	}
	public void scroll(int no)  {
		Robot r1 = null;
		try {
			r1 = new Robot();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		r1.keyPress(KeyEvent.VK_ALT);
		for(int i = 0;i<=no;++i) {
			driver.findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
		}
		r1.keyRelease(KeyEvent.VK_ALT);
	}


	public void select(WebElement w ,String value) throws InterruptedException {
		w.click();
		WebElement search =driver.findElement(By.xpath("//input[@name='search-text']"));
		search.click();
		Thread.sleep(1000);
		search.sendKeys(value);
		driver.findElement(By.xpath("//ul[@class='available-items']/child::li")).click();

	}

	public void highlighert(WebElement element) {
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].setAttribute('style','border: 3px solid red');", element);
	}
	public static void pri(Object a) {
		System.out.println(a);
	}
	protected static void until(long a) {
		try {
			Thread.sleep(a*1000);
		}
		catch(Exception e) {

		}	    	  
	}

public static void payload() {
	   BrowserMobProxy proxy = new BrowserMobProxyServer();
       proxy.start(0);

       // Configure Selenium proxy
       Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
       ChromeOptions options = new ChromeOptions();
       options.setProxy(seleniumProxy);

       // Start ChromeDriver
       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
       ChromeDriver driver = new ChromeDriver(options);

       // Start capturing traffic
       proxy.newHar("CapturePayload");

       // Open a webpage
       driver.get("https://example.com");

       // Print captured requests
       proxy.getHar().getLog().getEntries().forEach(entry -> {
           System.out.println("Request: " + entry.getRequest().getUrl());
           System.out.println("Payload: " + entry.getRequest().getPostData());
       });

      
       proxy.stop();
}


}


