package patternprogramming;

public class Pattern8Traingle {

	public void method1(){
		
		int n =6;
		for(int i =1;i<=n;i++) {
			
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1 ;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	public void method2() {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=n;k>=i;k--){
				System.out.print("* ");
				
			}
			System.out.println();
		}
		}
	
	
	public static void main(String [] args) {
		Pattern8Traingle object = new Pattern8Traingle();
		object.method1();
		object.method2();
	}
}
