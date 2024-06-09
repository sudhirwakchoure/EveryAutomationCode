package finalkeyword;
//if class declared as a final then we cannot inherited it
//if class declared as a final then we cannot inherited it

public final class Final2 extends Final {

	public void method1(int a) {
	
		System.out.println("Hemant");
	}
	
	public static void main(String[] args) {
		Final2 obj = new Final2();
		obj.method1();
	}
}
