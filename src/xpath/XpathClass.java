package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
			
			
			//css = tagname[attributename='value']
			//driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("ABC");
			
			//Dynamic xpath
			WebElement loginpanel= driver.findElement(By.xpath("//*[text()='LOGIN Panel']"));
			loginpanel.getText();
			System.out.println("loginpanel");
			driver.findElement(By.xpath(" //input[@id='btnLogin']//preceding::input[2]")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@id='btnLogin']//preceding::input[1]")).sendKeys("123");
			driver.findElement(By.xpath("//*[text()='LOGIN Panel']//following::input[3]")).click();
			//login button =//*[text()='LOGIN Panel']//following::input[3]
			//usename= //input[@id='btnLogin']//preceding::input[2]
			//password= //input[@id='btnLogin']//preceding::input[1]
			//login panel= //*[contains(text(),'LOGIN Panel')]
			//login panel =//div[starts-with(text(),'LOGIN Panel')]
			//login panel = //*[text()='LOGIN Panel']
			
			
			
			
			
	  }
	

}
