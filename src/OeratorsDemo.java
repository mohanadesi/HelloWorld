
public class OeratorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relational_operators();
		increment_operators();
		concatination();
		logical_operators(); 
		
	}
	public static void increment_operators() {
		int a = 5;
		System.out.println(++a);
		
		int b=8;
		System.out.println(b++);
		int c = b;
		System.out.println(c);

	}
	public static void concatination() {
		System.out.println(10+20);
		System.out.println(10+"20");
		
	}
	public static void relational_operators() {
		int a=10;
		int b = 15;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
	public static void logical_operators() {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
	}

}
