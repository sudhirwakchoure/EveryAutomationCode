package patternprogramming;

public class Pattern7Butterfly {
//for one side
	
	public void method1() {
		int n= 6;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=n-1;k>=i;k--) {
				System.out.print("  ");
				
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	
	//for second side

	public void method2() {
		int n= 5;
		for(int i =1;i<=n;i++) {
			
			for(int j =n;j>=i;j--) {
			    System.out.print("*");	
			}
			System.out.print("  ");
			for(int k=1;k<=i-1;k++) {
				System.out.print("  ");
				
			}
			for(int l=5;l>=i;l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void main(String [] args) {
		Pattern7Butterfly object = new Pattern7Butterfly();
		object.method1();
		object.method2();
	}
}
