package arrayConcept;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		
		String[] name = {"BMW","Unicorn","Splender","Honda","KTM","R15","YamahaFz",
				"Appache","Hybuja","Dexter","Ninja","Pulsure220"};
		
		int count =name.length;
		System.out.println(count);
		
		System.out.println("print using for loop");

		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("\nprint using for each loop");
		
		for(String i:name) {
			System.out.println(i);
		}
		
	}
		
}
