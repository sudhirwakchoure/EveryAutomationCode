package abstractionbyinterfacevariable;

public class C extends B {


	public static void main(String[] args) {
		B ob = new B();
		
		ob.method();

		System.out.println("bt if you want variable from implemented class");
		System.out.println("then we can call it by object");
		
		//also like this
		System.out.println(ob.a);
	}
}
