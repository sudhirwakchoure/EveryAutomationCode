package testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("by1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("by2");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("by3");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("by4");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("by5");

  }

}
