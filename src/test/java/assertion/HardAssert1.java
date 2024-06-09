package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {

	@Test(priority=1)
	public void test1() {
		String kiss = "puppy";
		String slap = "thapad";
		Assert.assertEquals(kiss, slap);
		//expecting equal but getting not equal so test case fail
	}
	
	@Test(priority=2)
	public void test2() {
        String kiss = "puppy";
        String dete = "puppy";
        Assert.assertEquals(kiss, dete);
        //expecting equals and condition also equal so test case pass
	}
	
	@Test(priority=3)
	public void test3() {
		String exp = "Ye samay chala jayenga";
		String act = "Ye samay badme nhi aayenga";
		
		Assert.assertNotEquals(exp, act);
		//expecting not equal and condition is not equal so test case pass

	}
	
	@Test(priority=4)
	public void test4() {
		String exp = "waqt kisi ke liye nhi rukta";
		String act = "waqt kisi ke liye nhi rukta";
		Assert.assertNotEquals(exp, act);
		//expectin not equalt but condition equal so test case fail 
	}
	
	@Test(priority=5)
	public void test5() {
		String name = "Hemant";
		Assert.assertTrue(true ,(name.equals("hemant"))+ "Not matched");
		//expected true kahi pn result asu de true kel he tar true ch bhetnar ani pass honar
	}
	
	@Test(priority=6)
	public void test6() {
		String name = "Hemant";
		
		Assert.assertTrue(false, name.equals("Hemant")+" Not matched");
		//expected true answer kahi hi asu de false jar lihla tr fail ch honar
	}
	
	@Test(priority=7)
	public void test7() {
		String name1= "Hemant";
		String name2= "hemya";
		
		Assert.assertFalse(true, name1.equals(name2)+ "Not match");
		//expected false but get true because true lihla he result kahi pn aso true ch bhetnar
	}
	
	@Test(priority=8)
	public void test8() {
		String name1="Hemant";
		String name2="hemya";
		
		Assert.assertFalse(false, name1.equals(name2)+" Not matched");
	    //expected false ani false lihla he tar result kahi pn asu de false ch bhetnar mhnun pass hoil test case
	}
	
	@Test(priority=9)
	public void test9() {
		String name1="hemant";
		String name2="Hemant";
		Assert.assertFalse(name1.equals(name2));
		//expected false he ani result pn false bhet to he mg test case pass
	}
	
	@Test(priority=10)
	public void test10() {
		String name1="hemant";
		String name2="hemant";
		Assert.assertTrue(name1.equals(name2));
		//expecting true result result true ch he mg pass hoil test case
	}
	
	@Test(priority=11)
	public void test11() {
		String name1 ="Hemant";
		String name2 ="hemant";
		Assert.assertTrue(name1.equals(name2));
		//expected true pn result false aala tar fail ch hoil
	}
	
	@Test(priority=12)
	public void test12() {
		String name ="Hemant";
		String name2 ="Hemant";
		Assert.assertFalse(name.equals(name2));
		//expected false but value true bhet te he test case will fail
	}
	
	@Test(priority=13)
	public void test13() {
		Assert.assertTrue(26>12);
		//expected true and condition also true test case will pass 
	}
	
	@Test(priority=14)
	public void test14() {
		Assert.assertTrue(26<12);
		//expecting true but getting false result Test case will fail
	}
	
	@Test(priority=15)
	public void test15() {
		Assert.assertFalse(26<12);
		//expecting false and getting false condition the test case will pass
	}
	
	@Test(priority=16)
	public void test16() {
		Assert.assertFalse(26>12);
		//expecting false but condition is true the test case will fail
	}
	
	
	@Test(priority=17)
	public void test17() {
		Assert.assertNull(null);
		//expecting nill and also getting null so test case pass
	}
	
	@Test(priority=18)
	public void test18() {
		Assert.assertNull("Hemant");
		//expecting null but result getting some value test case fail
	}
	
	@Test(priority=19)
	public void test19() {
		Assert.assertNotNull("Hemant");
		//expecting not null and getting value so it is not null thats why test case pass
	}
	
	@Test(priority=20)
	public void test20() {
		Assert.assertNotNull(null);
		//expecting not null but getting null so that time test case fail
	}
	
	@Test(priority=21)
	public void test21(){
		Assert.assertEquals(true, 5== 10 );
		Assert.assertEquals(5, 10 + "");
	}
}

