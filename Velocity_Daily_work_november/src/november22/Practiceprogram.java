package november22;

public class Practiceprogram {
	
	
	static int a,b,c,d,e;
	

	public static void main(String [] args) {
			
		a= 50;
		b= 25;
		
	System.out.print("value of a = ");
	System.out.println(a);
	System.out.print("value of b = ");
	System.out.println(b);
	System.out.print("addition of a and b = ");
	System.out.println(a+b);
	sub();
	mul();
	div();
		
	}
	
	static void sub() {
		
	c= a-b;
	System.out.print("Subtraction of a and b = ");
	System.out.println(c);
	
	}
	
	static void mul() {
	
	d = a * b;
	System.out.print("Multiplication of a and b = ");
	System.out.println(d);
		
		
	}
	
	static void div() {
		
	e = a / b ;
	System.out.print("Division of a and b = ");
	System.out.println(e);
		
	}
}
