package genericUtilities;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver=null;
	public WebdriverUtilities wu=new WebdriverUtilities();
	@BeforeSuite
	public void beforesuite() 
	{
		System.out.println("data base connection established");
		
	}
	@BeforeClass
	public void beforeclass() 
	{
	  driver=new ChromeDriver();
		wu.maximize(driver);
		wu.implicitWait(driver, 10);
		 
	}
	@AfterClass
	public void afterclass() 
	{
		driver.quit();
	}
	@AfterSuite
	public void aftersuite() 
	{
		System.out.println("data base connection closed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
