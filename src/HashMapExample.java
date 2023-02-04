import java.util.*;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Sam"); 
		hmap.put(5, "Sathya");
		hmap.put(9, "Singer");
		hmap.put(10, "Sunder");
		hmap.put(15, "Sapota");
		Iterator<HashMap.Entry<Integer,String>> it = hmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> e = it.next();
			System.out.print("key is : "+e.getKey() +" & Value is: ");
			System.out.println(e.getValue());
			
		}
		
	}

}
