package jan15;

public class B extends ASuper {

	int a=20;
	int b=40;
	
	public void method2() {
		System.out.println(a+b);
		System.out.println(super.a+super.b);
		
	}
	public static void main(String[] args) {
		B obj= new B();
		obj.method2();
		
	}
}
