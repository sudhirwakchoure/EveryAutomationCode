package abstractionusingabstractclass;
//hierachical inheritance
public class D extends A{

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

	public static void main(String[] args) {
		D obj = new D();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		method5();
		obj.method6();
	}
}
