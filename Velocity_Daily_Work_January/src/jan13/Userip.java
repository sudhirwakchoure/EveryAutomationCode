package jan13;
import java.util.Scanner;
public class Userip {

	public static void main(String[] args) {
		System.out.println("Your personal information");
		A a=new A();
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Enter Your Name");
	    a.setName(s.nextLine());
	    String Name=a.getName();
	    
	    
	    System.out.println("Enter Your Age");
	    a.setAge(s.nextInt());
	    int Age =a.getAge();
	    
	    
	    System.out.println("Enter your ID");
	    a.setID(s.nextInt());
	    int ID =a.getID();
	    
	    
	    
	    System.out.println("Enter your address");
	    a.setAddress(s.next());
	    String Address=a.getAddress();
	    
	    
	    System.out.println("Enter your mobile number");
	    a.setMobileNumber(s.nextLong());
	    long MobileNumber=a.getMobileNumber();
	  
	    System.out.println("Your Name: "+Name);
	    System.out.println("Your Age: "+Age);
        System.out.println("Your ID: "+ID);	  
	    System.out.println("Your Address: "+Address);
	    System.out.println("Your Mobile Number:"+MobileNumber);
	    s.close();
		
	}
}
