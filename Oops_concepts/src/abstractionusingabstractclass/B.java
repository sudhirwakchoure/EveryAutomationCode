package abstractionusingabstractclass;
//concrete class (Single level inheritance)
public class B extends A{

	
	@Override
	public void method1() {
		System.out.println("I am method1 from class B");
		
	}

	@Override
	public void method2() {
		System.out.println("I am method2 from class B");
		
	}

	@Override
	public void method3() {
	    System.out.println("I am method3 from class B");
		
	}

	@Override
	public void method4() {
		System.out.println("I am method4 from class B");
		
	}
	
	public static void main(String[] args) {
		//when we create object of B class A constructor by default call
		B obj= new B();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		method5();
		obj.method6();
		
		//we cannot call constructor A directly but by default B constructor 
		//will call A Constructor
		//new A();
		
	}

	
}
