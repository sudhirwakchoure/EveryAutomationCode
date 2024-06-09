package testClass;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PomTestClass {

	@BeforeTest
	public void method1() {
		System.out.println("Method1");
	}
	
	@BeforeSuite
	public void method2() {

		System.out.println("Method2");
	}
	
	@BeforeClass
	public void method3() {

		System.out.println("Method3");
	}
	
	@BeforeMethod
	public void method4() {

		System.out.println("Method4");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void method5() {

		System.out.println("Method5");
	}
	
	@AfterClass
	public void method6() {

		System.out.println("Method6");
	}
	
	@AfterTest
	public void method7() {

		System.out.println("Method7");
	}
	
	@AfterSuite
	public void method8() {

		System.out.println("Method8");
	}
	
	
	
	
}
