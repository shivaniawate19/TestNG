package para;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromefireClass {
  @Test
  public void chromemethod() {
	  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
  }
  
  @Test
  public void firefoxmethod() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
  }
  
  
}
