package para;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxClass {

//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//	    WebDriver driver = new FirefoxDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.quit();
//	 
//
//	}
	
	 @Test
	  public void firefoxmethod() {
		  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.quit();
	  }
	  

}
