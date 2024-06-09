package primitivecasting;

public class ImpliciteCasting {
//automatic casting
	//lower to higher
	byte a=122;
	public void method1() {
	System.out.println("a value is "+a);
	short b=a;
	System.out.println("b value is "+b);
	int c=b;
	System.out.println("c value is "+c);
	long d=c;
	System.out.println("d value is "+d);
	float e=d;
	System.out.println("e value is "+e);
	double f=e;
	System.out.println("f value is "+f);
	}
	
	
	public void method2() {
	byte a=12;
	System.out.println("a value is "+a);
	float b=a;
	System.out.println("b value is "+b);
	}
	
	
	public void method3() {
	int a =1456899;
	System.out.println("a value is "+a);
	float b= a;
	System.out.println("b value is "+b);
	}
	
	
	
	public static void main(String[] args) {
		ImpliciteCasting obj = new ImpliciteCasting();
		obj.method1();
		obj.method2();
		
	}
	
	
}
