package abstractionusinginterface;

public class G implements F {

	@Override
	public void method6() {
    System.out.println("6 from G");		
	}

	@Override
	public void method1() {
	System.out.println("1 from G");	
	}

	@Override
	public void method2() {
	System.out.println("2 from G");	
	}

	@Override
	public void method3() {
	System.out.println("3 from G");	
	}

	@Override
	public void method4() {
	System.out.println("4 from G");	
	}

	@Override
	public void method7() {
	System.out.println("7 from G");	
	}

	@Override
	public void method7(int a) {
	System.out.println("7 with parameter from G");	
	}
	
	public static void main(String[] args) {
		G obj = new G();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method6();
		obj.method7();
		obj.method7(143);
	}
}
