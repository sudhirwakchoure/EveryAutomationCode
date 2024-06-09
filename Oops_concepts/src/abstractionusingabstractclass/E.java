package abstractionusingabstractclass;
//upcasting and downcasting 
public class E extends A {

	int a=20;
	@Override
	public void method1() {
		System.out.println("1 from class E");
	}

	@Override
	public void method2() {
		System.out.println("2 from class E");	
	}

	@Override
	public void method3() {
		System.out.println("3 from class E");
	}

	@Override
	public void method4() {
		System.out.println("4 from class E");	
	}
	
	public void method6() {
		System.out.println("6 from class E");
	
	}
	
	public static void main(String [] args) {
		E obj = new E();
		obj.method6();
		method5();
		obj.method4();
		obj.method3();
		obj.method2();
		obj.method1();
		
		System.out.println(obj.a);
		
		
		System.out.println();
		//upcasting
		A obj1 = new E();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		method5();
		obj1.method6();
		System.out.println(obj1.a);
		
		
		System.out.println();
		//downcasting
		E obj2=(E)obj1;
		obj2.method1();
		obj2.method2();
		obj2.method3();
		obj2.method4();
		method5();
		obj2.method6();
		System.out.println(obj2.a);
	}
}
