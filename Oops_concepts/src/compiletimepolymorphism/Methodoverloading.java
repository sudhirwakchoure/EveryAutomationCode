package compiletimepolymorphism;

public class Methodoverloading {
//method overloading is an best example of compile time polymorphism

	public void method1() {
	    System.out.println("Hello peter");	
	}
	
	public void method1(int a) {
		System.out.println(a);	
	}
	
	public void method1(int a,int b) {
	    System.out.print(a + " + "+ b + " is ");
	    System.out.println(a+b);
	    
	}
	
	public void method1(String Name) {
		System.out.println(Name);
	}
	
	public static void main(String[] args) {
	Methodoverloading obj = new Methodoverloading();
	obj.method1();
	obj.method1(1);
	obj.method1(1, 1);
	obj.method1("\"Doc Octo Octaviouis\"");
	}


}
