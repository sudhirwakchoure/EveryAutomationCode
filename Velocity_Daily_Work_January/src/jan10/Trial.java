package jan10;

public interface Trial {

	int a = 10;
	int b = 20;
	int c = 30;
	static void method1() {
		System.out.println("hi");
	}
	
	
	
	public static void main(String [] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		method1();
	}
}
