package superkeyword;

public class B extends A {
  int a=500;
  int b=1000;


  public  void method() {
	
	  System.out.println(a);
	  System.out.println(b);
	  
	  System.out.println(super.a);
	  System.out.println(super.b);
 }

  public static void main(String[] args) {
	B obj = new B();
	obj.method();
	
}
 }
