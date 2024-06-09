package jan10;

public class Interface2 implements Interface,Interface3 {
	
	public void method1() {
		System.out.println("i am from interface2");
	}

	
	public void method2() {
		System.out.println("i am from interface2");
		
	
	}
	public static void main(String [] args) {
		Interface2 obj1 = new Interface2();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		
	}


	@Override
	public void method3() {
		System.out.println("i am from interface3");
		
	}


	@Override
	public void method4() {
		System.out.println("I am from interface 3");
		
	}

}
