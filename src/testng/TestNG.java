package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {
	//testcase
  @Test
  public void testcase() {
	  System.out.println("testcase");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2");
  }
  //run before each testcase
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");  
  }
//run after all testcase
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");  
  }
   //before the 1st test method in current class
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");  
  }
   //after all the  test method in current class
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass"); 
  }
   //<test> before the test method but within the <tag>
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest"); 
  }
  //<test> after all the test method but within the <tag>
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest"); 
  }
  //before all tests in this suit
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite"); 
  }
  //after all tests in this suit
  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite"); 
  }

}
