package abstractionbyinterfacevariable;

public class B implements A {
    int a=21;
	@Override
	public void method() {
		System.out.println("but if the same variable is present in implemented class also inteface");
		System.out.println("that time jvm get confused so we can call inteface variable");
		System.out.println("by InterfaceName.Refvariable");
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		System.out.println(A.a);
		
	}

	
}
