
import java.util.List;
import java.util.Arrays;

public class ChildMain {
	public static void main(String[] args) {
		Child child1 = new Child(3);
		Child child2 = new Child(9);
		Child child3 = new Child(8);
		Child child4 = new Child(10);
		
		List<Child> childs = Arrays.asList(new Child[] { child1, child2, child3, child4});
		List<Child> filtered = ChildPredicates.filterChilds(childs,ChildPredicates.filterByAge(8));
		
		for(Child child : filtered) {
			System.out.println(child.getAge());
			
		}
		
	}

}
