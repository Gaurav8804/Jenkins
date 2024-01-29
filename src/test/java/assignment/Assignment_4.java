package assignment;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class Assignment_4 extends BaseClass{
@Test
	 public void assignmentTest() {
		
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		 
	}

}
