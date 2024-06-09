package jan13;

public class Executionclass {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setmethod(353);
		double balance=obj.getmethod();
		System.out.println(obj.getmethod());
		System.out.println(balance);
	}
}
