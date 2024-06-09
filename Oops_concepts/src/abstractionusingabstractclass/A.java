package abstractionusingabstractclass;

public abstract class A {

	int a=10;
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	protected  abstract void method4();// protected,default ,public allowed but private no
	
	public static void method5() {
		System.out.println("I am method5 from abstract class A");
	}
	//non static method allowed to give body (as compare to interface)
	public void method6() {
		System.out.println("I am method6 from abstract Class A");
	}
	
	
	
    public A() {
		System.out.println("Hello");
	}
	
	
	//we cannot create object of abstract class 
	//so we cannot call the constructor
	/*
	
	
	
	public static void main(String[] args) {
		A obj = new A();
	}
	*/
}
