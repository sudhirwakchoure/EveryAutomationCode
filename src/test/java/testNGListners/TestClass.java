package testNGListners;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//this is one way n second way is in xml file we have to add listner
//@Listeners(testNGListners.ImplementListner.class)

public class TestClass {

	@Test
	public void test1() {
		System.out.println("test1 is running now");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 is running now");
	    Assert.fail();
	}
	
	@Test
	public void test3() {
		System.out.println("test3 is running now");
		Assert.assertEquals("HEMANT", "hemant");
	}
	
	@Test
	public void test4() {
		System.out.println("test4 is running now");
	    Assert.assertTrue(25>2);
	}
	
	@Test(dependsOnMethods="test3")
	public void test5() {
		System.out.println("test5 is running now");
		
	}
	
	@Test
	public void test6() {
		System.out.println("test6 is running now");
	}
}
