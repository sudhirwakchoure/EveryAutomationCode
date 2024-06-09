package breakcontinue;

public class Break {

	//break will break the for loop directly
	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("END");
	}
}
