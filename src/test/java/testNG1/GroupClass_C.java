package testNG1;

import org.testng.annotations.Test;

@Test(groups= {"Meta verse group"})
public class GroupClass_C {
  
	@Test(groups={"chrome.Sanity"})
	  public void c1() {
	  
	  System.out.println("c1 of groupClass_c is running for sanity");
	  
	  }
	  
	  @Test(groups= {"chrome.Sanity","chrome.Functional"})
	  public void c2() {
	  System.out.println("C2 of groupClass_C is running for sanity or functional");	  
	  }
	  
	  @Test(groups= {"firefox.Regression"})
	  public void c3() {
	  System.out.println("C3 of groupClass_C is running for regression");	  
	  }
	  
	  @Test(groups= {"edge.Functional"})
	  public void c4() {
	  System.out.println("c4 of groupClass_C is running for functional");	  
	  }
	  
	  @Test
	  public void c5() {
	  System.out.println("c5 of groupClass_C is running for asach");	  
	  }

}
