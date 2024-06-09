package primitivecasting;

public class ExpliciteCasting {
//higher to lower
	
	public void method1() {
	long a=123456789100000l;
	System.out.println("the value of a is "+a);
	//int b=a; cant possible direct
	int b=(int)a;
	System.out.println("the value of b is "+b);
	//we will loss our data
	short c =(short)b;
	System.out.println("the value of c is "+c);
	byte d=(byte)c;
	System.out.println("the value of d is "+d);
	
	
	double e=1212.212121212121212d;
	System.out.println("the value of e is "+e);
	float f=(float)e;
	System.out.println("the value of f is "+f);
	long g=(long)f;
	System.out.println("the value of g is "+g);
	int h =(int)g;
	System.out.println("the value of h is "+h);
	short i =(short)h;
	System.out.println("the value of i is "+i);
	byte j =(byte)i;
	System.out.println("the value of j is "+j);
	}
	public static void main(String[] args) {
		ExpliciteCasting obj = new ExpliciteCasting();
		obj.method1();
	}
}
