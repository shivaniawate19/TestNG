package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathClass {
	WebDriver driver;
	
	@Test
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			
			
			
			
			
			
			
			
			
	  }
	

}
