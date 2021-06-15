package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass {
	WebDriver Driver;
	
	 @Test(priority = 0)
	  public void validlogin() {
		    WebElement username = Driver.findElement(By.xpath("//input[@name='txtUsername']"));
			username.sendKeys("Admin");
			WebElement password = Driver.findElement(By.xpath("//input[@name='txtPassword']"));
			password.sendKeys("admin123");
			WebElement loginbutton = Driver.findElement(By.xpath("//input[@id='btnLogin']"));
			loginbutton.click();
			String expectedTitle = "OrangeHRM";
			String actualTitle = Driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
			
			
	  }
	 
	 @Test(priority = 1)
	  public void invalidlogin() {
		    WebElement username = Driver.findElement(By.xpath("//input[@name='txtUsername']"));
			username.sendKeys("Admin");
			WebElement password = Driver.findElement(By.xpath("//input[@name='txtPassword']"));
			password.sendKeys("admin1234556");
			WebElement loginbutton = Driver.findElement(By.xpath("//input[@id='btnLogin']"));
			loginbutton.click();
			String expectedTitle = "Invalid credentials";
			String actualTitle = Driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			Assert.assertEquals(expectedTitle, actualTitle);
	  }
	 
	 @Test(priority = 2)
	  public void invalidblank() {
		    WebElement username = Driver.findElement(By.xpath("//input[@name='txtUsername']"));
			username.sendKeys("");
			WebElement password = Driver.findElement(By.xpath("//input[@name='txtPassword']"));
			password.sendKeys("admin123");
			WebElement loginbutton = Driver.findElement(By.xpath("//input[@id='btnLogin']"));
			loginbutton.click();
			String expectedTitle = "Username cannot be empty";
			String actualTitle =Driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			Assert.assertEquals(expectedTitle, actualTitle);
	  }
	
	
	
	
	 @BeforeMethod
	  public void setup() {
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		    Driver = new ChromeDriver();
			Driver.get("https://opensource-demo.orangehrmlive.com/");
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			
		  
	  }

	  @AfterMethod
	  public void teardown() {
		  Driver.quit();
		  
		   
	  }

}
