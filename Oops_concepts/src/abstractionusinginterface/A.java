package abstractionusinginterface;

public interface A {

	int a=1000;//by default public static final variable
	
	void method1();//By default public non static method abstract
	void method2();
	void method3();
	void method4();
	
    public static void method5() {
		System.out.println("5 from interface A");
	}
	
	
	
	
}
