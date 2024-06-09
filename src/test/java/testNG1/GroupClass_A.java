package testNG1;

import org.testng.annotations.Test;

@Test(groups={"Meta group"})
public class GroupClass_A {
	
  @Test(groups= {"Sanity"})
  public void a1() {
  
  System.out.println("a1 of groupClass_A is running for sanity");
  
  }
  
  
  @Test(groups= {"Functional","Sanity"})
  public void a2() {
  System.out.println("a2 of groupClass_A is running for sanity or functinal");	  
  }
  
  
  @Test(groups= {"Regression"})
  public void a3() {
  System.out.println("a3 of groupClass_A is running for regression");	  
  }
  
  
  @Test(groups= {"Functional"})
  public void a4() {
  System.out.println("a4 of groupClass_A is running for functinal");	  
  }
  
  
  @Test
  public void a5() {
  System.out.println("a5 of groupClass_A is running for asach");	  
  }
  
}
