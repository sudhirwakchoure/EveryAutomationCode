package breakcontinue;

public class Continue {

	/*when loop find continue keyword it will not iterate current loop
	it will iterate next loop
	*/
	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			if(i==5||i==9) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("EnD");
	}
}
