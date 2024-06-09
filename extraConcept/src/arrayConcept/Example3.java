package arrayConcept;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		int[] Number = new int[10];
		
		Number[0]=2000;
		Number[1]=5000;
		Number[2]=600;
		Number[3]=10000;
		Number[4]=100;
		Number[5]=700;
		Number[6]=2000;
		Number[7]=123;
		Number[8]=143;
		Number[9]=999;
		
		Arrays.sort(Number);
		System.out.println("\nPrint Number in ascending order");
		for(int i =0;i<=9;i++) {
			System.out.println(Number[i]);
		}
		
		//no need to give Arrays.sort method again
		System.out.println("\nPrint Number in descending order");
		for(int j = 9;j>=0;j--) {
			System.out.println(Number[j]);
		}
		
		
		String[] Name = new String[10];
		
		Name[0]="Hemant";
		Name[1]="Aniket";
		Name[2]="Vishal";
		Name[3]="omkar";
		Name[4]="Niraj";
		Name[5]="Aaditya";
		Name[6]="sudhir";
		Name[7]="gokul";
		Name[8]="Hemant";
		Name[9]="Rupesh";
		
		System.out.println("\nPrint name by ascending order");
		
		Arrays.sort(Name);
		for(int k=0;k<=9;k++) {
			System.out.println(Name[k]);
		}
		
		System.out.println("\nPrint name by descending order");
		
		for(int l = 9; l>=0;l--){
			System.out.println(Name[l]);
		}
	}
}
