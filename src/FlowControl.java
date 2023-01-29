
public class FlowControl {

	public static void main(String[] args) {
		int a=40;
		int b=75;
		int c=15;
		
		if (a>=b && a>=c)
		{
			System.out.println("The largest of three number is a:" +a);
		}
		if (b>=a && b>=c)
		{
			System.out.println("The largest of three number is b:" +b);
		}
		if (c>=a && c>=b)
		{
			System.out.println("The largest of three number is c:" +c);
		}
	}

}
