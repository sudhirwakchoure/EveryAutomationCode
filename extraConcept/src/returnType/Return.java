
package returnType;

public class Return {

	int r=2;
	final float pie=3.14f;
	static float area;
	
	public float area() {
		
		return pie*r*r;
	}
	public static void main(String[] args) {
		Return A = new Return();
	    area=A.area();
	    System.out.println(area);
		
	}
}
