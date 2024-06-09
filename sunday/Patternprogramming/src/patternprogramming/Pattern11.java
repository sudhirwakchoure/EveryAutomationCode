package patternprogramming;

public class Pattern11 {
		
		public static void main(String[] args) {
			
			for(int i=0 ; i<=4 ; i++) {
				for(int j=i ; j<=4 ; j++) {
					System.out.print(" ");
				}
				
				
				for(int k=i ; k>=1 ; k--) {
 
					System.out.print(k);
				}
				
				
				for(int l=0 ; l<=i ; l++) {
					System.out.print(l);
				}
				
				System.out.println();
		}

	}
}
