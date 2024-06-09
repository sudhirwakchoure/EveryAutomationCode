package nonprimitivedowncasting;

public class Main {

	public static void main(String[] args) {
		//upcasting
		System.out.println("Upcasting:\n");
		Father f = new Son();
		f.business();
		f.car();
		f.farm();
		f.home();
		
		//after up casting we can perform downcasting
		//explicitely(Forcefully) done
		//to take back properties of father class in son class
		//Downcasting
		System.out.println("\nDowncasting:\n");
		Son s=(Son)f;
		
		s.business();
		s.car();
		s.farm();
		s.home();
		s.job();
		s.bike();
		
	}
}
