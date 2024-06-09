package jan4;

public class PrimitiveCasting {

	
	

	public void implicity() {
		//implicity we can convert our data from small to high
		byte a =1;
		short b=a;
		System.out.println(b);
		
		int c=43;
	    long	d=c;
	    System.out.println(c);
	    System.out.println(d);
	    
	    float e= 2.2345454f;
	    double f=e;
	    System.out.println(f);
	    c=b;
	    d=a;
	    e=c;
	    f=d;
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);
	    
	}
	
	public void explicity(){
	    //explicity casting or conversion done Higher to smaller
		
		long a=12345678910l;
		int b=(int)a;
		System.out.println(a);
		System.out.println(b);
		short c=(short)b;
		System.out.println(c);
		byte d=(byte)c;
		System.out.println(d);
		
		//floating point
		double e= 12.3231212121212d;
		System.out.println(e);
		float f=(float)e;
		System.out.println(f);
		int g=(int)e;
        System.out.println(g);
		short h=(short)e;
		System.out.println(h);
		byte i=(byte)e;
		System.out.println(i);	
	}
	
	
	public static void main(String [] args) {
		PrimitiveCasting obj = new PrimitiveCasting();
		obj.implicity();
		obj.explicity();
	}
}
