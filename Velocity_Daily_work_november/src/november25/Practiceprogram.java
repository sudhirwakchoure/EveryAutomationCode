package november25;

public class Practiceprogram {

 public static void main(String [] args) {
	 // main method
	 Practiceprogram a = new Practiceprogram();
	 // object declared
	 
	 System.out.println("This is main method");
	 test1(); //call static method
	 a.test2(); //call non static method using object
 }
	
  public static void test1() {
	  // static method
	System.out.println("This is static method");  
	  
  }
  public void test2() {
	// non static method
	  
	  
    System.out.println("This is non static method ");
	  
  }
}
