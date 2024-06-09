package runtimepolymorphism;

public class Main {

	public static void main(String[] args) {
		A Wanda = new A();
		Wanda.method1();
		Wanda.method2("Stephan");
		Wanda.method3("Tony Stark", 100);
		//on the basis of object we are going to override method
		//but static method dont need object to call it
		//thats why static method is not method overriding
		A.method4();
		B.method4();
		
		B Wanda1 = new B();
		Wanda1.method1();
		Wanda1.method2("Master");
		Wanda1.method3("Iron Man", 100);
		
		
		C Wanda2 = new C();
		Wanda2.method1();
		Wanda2.method2(null);
		Wanda2.method3("Robert Dr.JR", 100);
		
		
	}
}
