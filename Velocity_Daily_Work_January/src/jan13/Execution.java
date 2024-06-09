package jan13;

public class Execution {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.setName("Hemant");
		String Name=obj.getName();
		System.out.println("Your Name: "+Name);
		
		
		obj.setAddress("Aurangabad");
		String Address=obj.getAddress();
		System.out.println("Address: "+Address);
		
		
		obj.setAge(24);
		int Age=obj.getAge();
		System.out.println("Age:" + Age);
		
		
		obj.setMobileNumber(9975001109l);
		long MobileNumber=obj.getMobileNumber();
		System.out.println("Mobile No.: "+MobileNumber);
	}
}
