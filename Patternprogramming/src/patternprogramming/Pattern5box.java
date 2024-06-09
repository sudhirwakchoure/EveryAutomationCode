package patternprogramming;

public class Pattern5box {

	//star box
	public void method1() {
	for(int i=1;i<=10;i++) {
		for(int j =1;j<=10;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();	
	}
	//$box
	public void method2() {
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=10;j++) {
			System.out.print("$ ");
		}
		System.out.println();
	}
	System.out.println();
		
	}
	
	public void method3() {
		for(int i=1;i<=10;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int k=1;k<=8;k++) {
		for(int j=1;j<=10;j++) {
			if(j==1 || j==10) {
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
             System.out.println();
		}
		for(int l=1;l<=10;l++) {
			System.out.print("* ");
		}
		System.out.println();
		System.out.println();
		
	}
	
	public void method4() {
		int n=11;
	for(int i =1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||i==11||j==1||j==11||i==j||j==n-i+1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
		
	}
	
	public static void main(String [] args) {
	Pattern5box object = new Pattern5box();
	object.method1();
	object.method2();
	object.method3();
	object.method4();	
		
	}

}
