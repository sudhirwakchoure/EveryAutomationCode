package ascii;

public class Ascii1 {

	public static void main(String[] args) {
		
		//A-Z=65-90
		//a-z=97-122
		//{=123
		
		
		//we have to do typecasting(Explicite casting)
		char ch='A';
		int a= (int) ch;
		System.out.println(a);
		
		//specially A-Z
		for(int i=65;i<=90;i++) {
			
			System.out.println((char)i);
			
		}
		
		//specially all
		for(int i=0;i<=128;i++) {
			
			System.out.println((char)i);
			
		}
		
		
	}
}
