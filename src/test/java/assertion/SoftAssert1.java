package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

	@Test(priority = 1)
	public void test1() {
		SoftAssert sa = new SoftAssert();

		System.out.println("test scenario a execution started");
		sa.assertTrue(26 > 2);
		System.out.println("test scenario a execution end");

		System.out.println("test scenario b execution started");
		String name1 = "hemant";
		String name2 = "hemant";
		sa.assertFalse(name1.equals(name2));
		System.out.println("test scenario b execution end");

		System.out.println("test scenario c execution start");
		sa.assertTrue(28 < 12);
		System.out.println("test scenario c execution end");

		System.out.println("test scenario d execution start");
		String name3 = "Hemant";
		String name4 = "Hemant";
		sa.assertEquals(name3, name4);
		System.out.println("test scenario d execution end");

		System.out.println("test scenario e execution start");
		String name5 = "Hemant";
		String name6 = "hemant";
		sa.assertEquals(name5, name6);
		System.out.println("test scenario e execution end");

		sa.assertAll();

	}

	@Test(priority = 2)
	public void test2() {
		SoftAssert sa2 = new SoftAssert();
		System.out.println("test scenario f execution started");
		sa2.assertNull(null);
		System.out.println("test scenario f execution end");
		System.out.println("test scenario g execution started");
		sa2.assertNotNull("Hemant");
		System.out.println("test scenario g execution end");
		sa2.assertAll();
	}

	@Test(priority = 3)
	public void test3() {
		SoftAssert sa3 = new SoftAssert();
		System.out.println("test scenario h execution start");
		sa3.assertNotEquals("Henant", "Hemant");
		System.out.println("test scenario h execution end");
		// pass
		System.out.println("test scenario i execution start");
		String name1 = "Hemant";
		String name2 = "Hemant";
		sa3.assertEquals(name1, name2);
		System.out.println("test scenario i execution end");
		// pass
		System.out.println("test scenario j executin start");
		sa3.assertFalse(name1.equals(name2));
		System.out.println("test scenario j execution end");
		// fail
		System.out.println("test scenario k execution start");
		sa3.assertNotNull(null);
		System.out.println("test scenario k execution end");
		// fail
		System.out.println("test scenario l execution start");
		sa3.assertNull(null);
		System.out.println("test scenario l execution end");
		// pass
		sa3.assertAll();
		// total fail
	}
}
