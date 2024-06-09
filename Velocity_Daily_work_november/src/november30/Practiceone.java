package november30;

public class Practiceone { // class

	//main method
	public static void main(String [] args) { 
		// object creation
		Practiceone b = new Practiceone();
		 
	method1();	   // call static method
	b.method2();  // call non static method
		
		
	}
	
	// static method
	public static void method1() {
		
	   System.out.println("This is static method"); //printing statement
		
	}
	
	// non static method
	public void method2() {
	   
		System.out.println("This is non static method"); //printing statement
		System.out.println("to call this method"+"\nwe have to declare object first");
	
	}
}
