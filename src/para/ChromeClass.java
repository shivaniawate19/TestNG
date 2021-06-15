package para;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeClass {

//	public static void main(String[] args) {
//		
//		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		    WebDriver driver = new ChromeDriver();
//			driver.get("https://opensource-demo.orangehrmlive.com/");
//			driver.quit();
//
//	}
	 @Test
	  public void chromemethod() {
		  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.quit();
	  }

}
