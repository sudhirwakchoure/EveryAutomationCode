package abstractionusinginterface;

public class J implements I{

	@Override
	public void method1() {
	System.out.println("1 from I");
	}

	@Override
	public void method2() {
	System.out.println("2 from I");	
	}

	@Override
	public void method3() {
	System.out.println("3 from I");	
	}

	@Override
	public void method4() {
	System.out.println("4 from I");	
	}

	@Override
	public void method6() {
	System.out.println("6 from I");	
	}

	@Override
	public void method7() {
	System.out.println("7 from I");	
	}

	@Override
	public void method8() {
	System.out.println("8 from I");	
	}
	
	public static void main(String[] args) {
		J obj = new J();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method6();
		obj.method7();
		obj.method8();
		
		//give reference of interface we can create object
		I obj1 = new J();
		

}
}