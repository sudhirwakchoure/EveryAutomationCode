package nonprimitiveupcasting;

public class Mainmethod {

	public static void main(String[] args) {
		System.out.println("after inheritance son has properties of father");	
		System.out.println();
		Son s = new Son();
		s.bike();
		s.job();
		s.business();
		s.car();
		s.home();
		s.farm();
		
		System.out.println("\nUp casting");
		System.out.println("we will take back properties of father from son by object of son");
		System.out.println();
		
		//upcasting we performed
		Father f = new Son();//by giving refference father and creating constructor of son
		f.business();
		f.car();
		f.farm();
		f.home();
		
	}
}
