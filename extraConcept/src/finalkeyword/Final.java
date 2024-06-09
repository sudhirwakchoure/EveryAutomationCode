package finalkeyword;

public class Final {

	final int a=20;
	final float b=10.5f;
	double c;
	
	public void method1() {
		//a=b; a=21; we cannot change final value  it is fixed
		//b=a+b;
		c=a+b;
		System.out.println(c);
	}
	
	final public void method2() {
		c=b-a;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		Final obj = new Final();
		obj.method1();
	}
}
