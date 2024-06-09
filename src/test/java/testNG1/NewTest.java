package testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f3() {
	  System.out.println("hi");
  }
  
  @Test
  public void f4() {
	  System.out.println("hi");
  }
  
  @Test
  public void f5() {
	  System.out.println("hi");
  }
  
  @Test
  public void f6() {
	  System.out.println("hi");
  }
  
  @Test
  public void f7() {
	  System.out.println("hi");
  }
  
  @Test
  public void f8() {
	  System.out.println("hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hi2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("hi3");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("hi4");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("hi5");
  }

}
