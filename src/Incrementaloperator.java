
public class Incrementaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = i++; // j ka value is used as the pre value of i and then i is incremented by 1
		System.out.println(i);
		System.out.println(j);
		System.out.println(++i + j); // i ka value is first incremented, and then it is used in this statement
		System.out.println(i);
		System.out.println(j);
		
		
	}

}
