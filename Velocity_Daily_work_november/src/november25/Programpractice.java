package november25;

public class Programpractice {
 public static void main(String [] args ) {
	 
	 Programpractice h = new Programpractice();
	 
	 System.out.println("This is main method");
	 test1();
	 h.test2();
 }
	
	public static void test1() {
		
		System.out.println("this is static method");
		
	}
	
	public void test2() {
		
		System.out.println("This is non static method");
	}
	
	
}
