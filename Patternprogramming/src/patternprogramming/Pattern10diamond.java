package patternprogramming;

public class Pattern10diamond {

	public void method1() {
		int n=8;
		for(int i=1;i<=n;i++){
			
		    for(int j=n-1;j>=i;j--) {
				   System.out.print(" ");
			}
		
	        for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
	    
		System.out.println();
	    }
		
	}	
	
	public void method2() {
		int n=8;
		for(int i =1;i<=n;i++) {
		    for(int j=1;j<=i-1;j++) {
		    	System.out.print(" ");
		    }
			for(int k=n;k>=i;k--) {
				System.out.print("* ");
			}
			
			System.out.println();	
		}
		
		
		
		
		
	}
	public static void main(String [] args) {
		Pattern10diamond object = new Pattern10diamond();
		object.method1();
		object.method2();
	}
	
}
