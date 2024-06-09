package singleInheritance;

public class MainFatherSon {

	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
		s.job();
		s.mobile();
		s.car();
		s.farm();
		s.home();
	
		Father f = new Father();
		f.car();
		f.farm();
		f.home();
		
		
	}
	
}
