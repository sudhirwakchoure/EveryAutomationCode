package methodcallinginmethod;

public class Method {

	public void method1() {
		System.out.println("Hi hemant");
	}
	
	public void method2() {
		for(int i=1;i<=10;i++) {
		method1();//non static method thats why we can call it non static method
	}
	}
	public static void main(String[] args) {
		Method obj = new Method();
		obj.method2();
	}
}
