
public class Trycatch {
	
	public static void main(String args[]) {
		try {
			int i=10/0;
			System.out.println(i);
		}
		catch(ArithmeticException ex) {
			System.err.println("Error : " +ex.getMessage());
			
		}
	}

}
