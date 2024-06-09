package arrayConcept;

import java.util.Arrays;

public class MultiDimensionArray1 {

	public static void main(String[] args) {
		
		int array[][]= new int[3][4];
		
		array[0][0]=12;
		array[0][1]=2113;
		array[0][2]=2223;
		
		array[1][0]=22423;
		array[1][1]=2543;
		array[1][2]=231;
		array[2][0]=223;
		array[2][1]=234;
		array[2][2]=223;
//		array[3][0]=223;
//		array[3][1]=323;
//		array[3][2]=3;
//		
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
	        System.out.println(array[i][j]);	
			}
		}
		
		
		
		
		
		
		System.out.println(array[0][0]);
		
		
		
	}
	
	
}