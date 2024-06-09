package abcd;

public class B {

	public static void main(String[] args) {
		String s = "we like test Automation";
		
		String s1 = s.toLowerCase();
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		
		for(int i=0;i<s.length();i++) {
			if(s1.charAt(i)=='a') {
				count1++;
		
			}
			else if( s.charAt(i)=='e') {
				count2++;
			}
			else if(s.charAt(i)=='o') {
				count3++;
			}
			else if(s.charAt(i)=='u') {
				count4++;
			}
			else if(s.charAt(i)=='i') {
				count5++;
			}
		}
		System.out.println("the ocurrance of a "+ count1);
		System.out.println("the ocurrance of e "+ count2);
		System.out.println("the ocurrance of o "+ count3);
		System.out.println("the ocurrance of u "+ count4);
		System.out.println("the ocurrance of i "+ count5);

	}
	
	
	
	
	
}
