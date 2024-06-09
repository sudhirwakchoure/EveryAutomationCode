package abstractionusinginterface;
//without inheritance
public class B implements A {

	int a=2000;
	
	@Override
	public void method1() {
		System.out.println("1 from B");		
	}

	@Override
	public void method2() {
		System.out.println("2 from B");	
	}

	@Override
	public void method3() {
		System.out.println("3 from B");
	}

	@Override
	public void method4() {
		System.out.println("4 from B");	
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		A.method5();
		System.out.println(A.a); 
		System.out.println(obj.a);
		
		//giving reference of interface and creating object of B
		//method presents in B we can call
		A obj1 = new B();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		
		
	}
}
