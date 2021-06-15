package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IfElseBrowserClass {
	WebDriver Driver;
	//String browser = "firefox";
	
	@Parameters({"browser"})
  @Test
  public void testcase(String browser) {
	  if (browser.equals("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		    Driver = new ChromeDriver();
		
	} else if (browser.equals("firefox"))  {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	    Driver = new FirefoxDriver();
		}
	  
	  Driver.get("https://opensource-demo.orangehrmlive.com/");
	  Driver.quit();
	  
	 
  } 
  
}
