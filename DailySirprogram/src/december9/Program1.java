package december9;

public class Program1 {

}
package basicJavaProgram;

public class ThisWord {

	int a = 12;
	int b = 13;
	
	public void pp() {
		int a = 22;
		int b = 33;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		ThisWord r = new ThisWord();
		r.pp();
	}
}