
public class Trycatchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data = 50/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide by zero");
			)
		}
		System.out.println("Rest of the code");
	}

}
