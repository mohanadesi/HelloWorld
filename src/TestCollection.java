import java.util.*;

public class TestCollection {
 	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("John");
		list.add("James");
		list.add("Johnny");
		list.add("Janardhan");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
