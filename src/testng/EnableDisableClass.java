package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableDisableClass {
  @Test (enabled = true)
  public void testcase1() {
	  System.out.println("testcase1");
  }
  
  @Test (enabled = false)
  public void testcase2() {
	  System.out.println("testcase2");
  }
  
  @Test (enabled = true)
  public void testcase3() {
	  System.out.println("testcase3");
  }
  
  @Test (enabled = false)
  public void testcase4() {
	  System.out.println("testcase4");
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
