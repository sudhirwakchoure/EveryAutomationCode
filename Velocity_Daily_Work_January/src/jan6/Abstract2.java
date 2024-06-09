package jan6;

public class Abstract2 extends Abstraction{

	public void method1() {
		System.out.println("i am from abstrat2 class");
	}
	
	public static void main(String[] args) {
		Abstract2 obj = new Abstract2();
		obj.method2();
		obj.method1();
	}
}
