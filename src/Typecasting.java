
public class Typecasting {

	public static void main(String[] args) {
		// Imnplicit type casting
		System.out.println("Implicit type casting");
		char a = 'A';
		System.out.println("Value of character a: " +a);
		
		int b=a;
		System.out.println("Value of integer b: " +b);
		
		float c = a;
		System.out.println("Value of float c: " +c);
		
		long d=a;
		System.out.println("Value of long d: " +d);
		
		double e =a;
		System.out.println("Value of double e: " +e);
		
		System.out.println("Implicit type casting");
		
		double x=99.9;
		int y = (int)x;
		System.out.println("value of x: " +x);
		
		System.out.println("Value of y: " +y);
	}

}
