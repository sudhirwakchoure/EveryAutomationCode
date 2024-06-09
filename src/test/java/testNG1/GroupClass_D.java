package testNG1;
import org.testng.annotations.Test;

@Test(groups={"Meta verse group"})
public class GroupClass_D {
	
  @Test(groups= {"edge.Sanity"})
  public void d1() {
  
  System.out.println("D1 of groupClass_D is running for sanity");
  
  }
  
  
  @Test(groups= {"firefox.Functional","firefox.Sanity"})
  public void d2() {
  System.out.println("D2 of groupClass_D is running for sanity or functinal");	  
  }
  
  
  @Test(groups= {"chrome.Regression"})
  public void d3() {
  System.out.println("D3 of groupClass_D is running for regression");	  
  }
  
  
  @Test(groups= {"chrome.Functional"})
  public void d4() {
  System.out.println("D4 of groupClass_D is running for functinal");	  
  }
  
  
  @Test
  public void d5() {
  System.out.println("D5 of groupClass_D is running for asach");	  
  }

}
