package abstractionusinginterface;

public class D implements C{

	@Override
	public void method1() {
	System.out.println("1 from D");	
	}

	@Override
	public void method2() {
	System.out.println("2 from D");	
	}

	@Override
	public void method3() {
	System.out.println("3 from D");	
	}

	@Override
	public void method4() {
	System.out.println("4 from D");	
	}

	@Override
	public void method6() {
	System.out.println("6 from D");	
	}

	@Override
	public void method7() {
	System.out.println("7 from D");
	}

	@Override
	public void method8() {
	System.out.println("8 from D");
	}
	
	public static void main(String[] args) {
		D obj = new D();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method6();
		obj.method7();
		obj.method8();
		System.out.println(C.a);
		System.out.println(A.a);
		
	}

}
