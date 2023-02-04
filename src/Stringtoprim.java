
public class Stringtoprim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = '1';
		int b = Character.getNumericValue(a);
		long c = b;
		float d = c;
		
		System.out.println("character value is " +a);
		System.out.println("integer value is " +b);
		System.out.println("long value is " +c);
		System.out.println("float value is " +d);
	}

}
