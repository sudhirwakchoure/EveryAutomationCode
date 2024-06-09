package patternprogramming;

public class Pattern9tree {

	int n;
	
	public Pattern9tree(int n) {
	this.n=n;	
	}
	
	public void method1() {
		
		        
	    for(int i=1;i<+n;i++) {
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
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
			System.out.print(" ");	
		}
			 System.out.println("| |");
		}
		
		System.out.println("\nThis Christmas,"+"\ni wish that you get everything you wanted. ");
		System.out.println("This is the wish from my heart,"+"\ni wish you have a brand new start.");
		System.out.println("it is occasion of faith,"+"\nit is occasion of fun.");
		System.out.println("\nMerry Christmas Everyone");
		
		
	}
	
	public static void main(String [] args) {
		Pattern9tree object =new Pattern9tree(9);
	    object.method1();
	 
	    object.method1();
	    object.method2();
	    
	   
	
	
	}
	
}
