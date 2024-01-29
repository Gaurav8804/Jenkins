package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {

	
	public void maximize(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver , int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public Select select(WebElement ele) 
	{
		Select sel=new Select(ele);
		return sel;
	}
	
	public void selectOptions(WebElement ele,String value) 
	{
		select(ele).selectByValue(value);
	}
	
	public void selectOptions(String text, WebElement ele) 
	{
		select(ele).selectByVisibleText(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
