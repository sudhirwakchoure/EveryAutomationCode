package arrayConcept;

public class Example1 {

	public static void main(String[] args) {
		
		String[] name;
		name = new String[5];
		
		name[0]="Omkar";
		name[1]="Hemant";
		name[2]="Aniket";
		name[3]="Niraj";
		name[4]="Sudhir";
		
		System.out.println(name[3]);
		System.out.println(name[2]);
		//System.out.println(name[5]);
		
		for(int i =0;i<=4;i++) {
			System.out.println(name[i]);
		}
		
		
		int[] age = new int[10];
		
		age[0]=24;
		age[1]=23;
		age[2]=21;
		age[3]=22;
		age[4]=20;
		age[5]=23;
		age[6]=23;
		age[7]=24;
		age[8]=21;
		age[9]=20;
				
		
		System.out.println(age[2]);
		System.out.println(age[9]);
		
		for(int i=0;i<=9;i++) {
			System.out.println(age[i]);
		}
		
	}
}
