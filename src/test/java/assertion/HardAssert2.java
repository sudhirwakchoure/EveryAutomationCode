package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert2 {

	@Test(priority=1)
	public void test1() {
		System.out.println("test scenario a is executing");
		String name1="Hemant";
		String name2="Hemant";
		Assert.assertEquals(name1,name2);
		System.out.println("test scenario a exercution done");
		System.out.println("test scenario b execution start");
		String name3="omkar";
		String name4="Omkar";
		Assert.assertNotEquals(name3,name4);
		System.out.println("test scenario b executin done");
		
		
	}
	
	
	@Test(priority=2,timeOut=90000)
	public void test2() {
		System.out.println("test scenario c execution start");
		String name1="Hemant";
		String name2="hemant";
		Assert.assertTrue(name1.equals(name2));
		System.out.println("test scenario c execution end");
		
		System.out.println("test scenario d execution start");
		String name3="omkar";
		String name4="Omkar";
        Assert.assertFalse(name3.equals(name4));	
		System.out.println("test scenario d execution end");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("test scenario e executin start");
		Assert.assertTrue(26>2);
		System.out.println("test scenario e execution end");
		System.out.println("test scenario f execution start");
		Assert.assertFalse(26<2);
		System.out.println("test scenario f execution end");
		System.out.println("test scenario g execution start");
		Assert.assertFalse(26>2);
		System.out.println("test scenario g execution end");
		}
	
	
}
