
public class IfelseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		if (a==12 ||(a>=1 && a<=2)){
			System.out.println("Winter season");
		}
		else if (a>2 && a<=5){
			System.out.println("Summer season");
		}
		else if (a>5 && a<=8){
			System.out.println("Autumn season");
		}
		else if (a>8 && a<=12){
			System.out.println("Spring season");
		}
		else if (a>2 && a<=5){
			System.out.println("Summer season");
		}
		else
			System.out.println("Not valid");

	}

}
