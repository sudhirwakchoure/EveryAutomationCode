package jan10;

public class Recharge implements Airtel,Idea,Jio,BSNL {
	
	@Override
	public void bsnl() {
		System.out.println("BSNL recharge is of 299");
	 }

	@Override
	public void jio() {
	System.out.println("Jio recharge is of 399");
		
	}

	@Override
	public void idea() {
    System.out.println("idea recharge is of 499");
		
	}

	@Override
	public void airtel() {
    System.out.println("airtel recharge is of 549");
		
	}
}