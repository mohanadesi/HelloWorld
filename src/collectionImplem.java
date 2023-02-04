import java.util.*;

public class collectionImplem {

	public static void main(String[] args) {
		// creating arraylist
		System.out.println("Arraylist");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Chennai");
		System.out.println(city);
		
		// creating linkedlist
		System.out.println("\n");
		System.out.println("Linkedlist");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Kavin");
		names.add("Mohana");
		names.add("Desi");
		System.out.println(names);
		// Iterator<String> itr = names.iterator();
		// while (itr.hasNext())
		// {
		//	System.out.println(itr.next());
		// }
		//creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Double> set=new HashSet<Double>();  
	       set.add(101.0);  
	       set.add(103.0);  
	       set.add(102.0);
	       set.add(104.0);
	       System.out.println(set);

		
	}

}
