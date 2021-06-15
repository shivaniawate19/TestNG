package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingClass {
  
  
  @Test (groups = {"walk"})
  public void testcase1() {
	  System.out.println("testcase walk");
  }
  
  @Test (groups = {"run"})
  public void testcase2() {
	  System.out.println("testcase run");
  }
  
  @Test (groups = {"walk"})
  public void testcase3() {
	  System.out.println("testcase walk");
  }
  
  @Test (groups = {"run"})
  public void testcase4() {
	  System.out.println("testcase run");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");  
  }
}
