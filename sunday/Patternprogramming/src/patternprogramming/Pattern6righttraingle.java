package patternprogramming;

public class Pattern6righttraingle {
//right angle traingle
	
	public void method1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	public void method2()
	{
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		
	}
	
	//inverse right angle
	public void method3() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {	  
			      System.out.print(" ");
			}
	        for(int k =1;k<=i;k++) {
			System.out.print("*");
			
		}
	    	System.out.println();
		}		
	
		System.out.println();
	}
	
	
	public void method4() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
	      	for(int k=n;k>=i;k-- ) {
			    System.out.print("*");
		}
	      	System.out.println();
		}
		
	}
	
	
	public static void main(String [] args) {
	
		Pattern6righttraingle object = new Pattern6righttraingle();
		object.method1();
		object.method2();
		object.method3();
		object.method4();
	}


}
