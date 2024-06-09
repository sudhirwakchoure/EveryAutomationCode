package testNG1;

import org.testng.annotations.Test;

@Test(groups= {"Meta group"})
public class GroupClass_B {
  
	@Test(groups= {"sanity"})
	  public void b1() {
	  
	  System.out.println("b1 of groupClass_B is running for sanity");
	  
	  }
	  
	  @Test(groups= {"Sanity","Functional"})
	  public void b2() {
	  System.out.println("b2 of groupClass_B is running for sanity or functional");	  
	  }
	  
	  @Test(groups= {"Regression"})
	  public void b3() {
	  System.out.println("b3 of groupClass_B is running for regression");	  
	  }
	  
	  @Test(groups= {"Functional"})
	  public void b4() {
	  System.out.println("b4 of groupClass_B is running for functional");	  
	  }
	  
	  @Test
	  public void b5() {
	  System.out.println("b5 of groupClass_B is running for asach");	  
	  }
	  
}
