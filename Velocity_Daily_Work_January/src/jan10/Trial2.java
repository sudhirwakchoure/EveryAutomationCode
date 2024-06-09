package jan10;

public interface Trial2 extends Trial {

	int a = 100;
	int b = 200;
	int c = 300;
	
	public static void main(String [] args) {
		System.out.println(a+b+c);
		System.out.println(Trial.a+Trial.b+Trial.c);
	}
}
