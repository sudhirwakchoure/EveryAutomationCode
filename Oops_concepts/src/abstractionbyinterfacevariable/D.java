package abstractionbyinterfacevariable;

public class D implements A {

	@Override
	public void method() {
		System.out.println("if same variable is not present in our implemented class ");
		System.out.println("then we can acess the interface variable directly");
	    System.out.println("because jvm will first check in implemented class and if it is not there"+" \nthen it will go to interface class");
	}

}
