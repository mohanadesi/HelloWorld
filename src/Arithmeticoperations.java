import java.util.Scanner;
public class Arithmeticoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.print( "Enter first integer: " );
		float a = myInput.nextInt();
		System.out.print( "Enter second integer: " );
		float b = myInput.nextInt();
		
		float c = a+b;
		double d = a*b;
		float e = a-b;
		float f = a / b;
		
		System.out.println("The sum of two variable a and b is :" +c);
		System.out.println("The multiplication of two variable a and b is :" +d);
		System.out.println("The subtraction of two variable a and b is :" +e);
		System.out.println("The division of two variable a and b is :" +f);
		
	}

}
