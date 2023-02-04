import java.util.*;



public class HashSetExample {
	public static void main(String args[]) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Mango");
		hset.add("Apple");
		hset.add("Guava");
		hset.add("Mango");
		hset.add("Apple");
		hset.add(null);
		hset.add(null);
		System.out.println(hset);
		
}

}
