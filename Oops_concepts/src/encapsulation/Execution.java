package encapsulation;

public class Execution {

	public static void main(String[] args) {
		A obj = new A();
		obj.setA(20);
		int a=obj.getA();
		System.out.println(a);
		
		obj.setB(50);
		int b=obj.getB();
		System.out.println(b);
	}
}
