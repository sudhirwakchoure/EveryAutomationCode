package jan4;

public class MainFatherSon {

	public static void main(String[] args) {
		//by creating sub class object and giving refference of sub class we can acquire both properties
		Son s = new Son();
		s.bike();
		s.job();
		s.mobile();
		s.business();
		s.farm();
		s.car();
		s.home();
		
		//by creating object of sub class and giving refference of Super class we can aquire father properties
		// upcasting
		Father f=new Son();
		f.business();
		f.car();
		f.home();
		f.farm();
		
		//
		//downcasting
		Father FS = new Son();
		Son p = (Son)FS;
		p.bike();
		p.business();
		p.car();
		p.farm();
		p.home();
		p.job();
		p.mobile();
		
	}
}
