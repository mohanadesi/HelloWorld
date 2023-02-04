import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		List<String> nameList=Arrays.asList("Sachin","Samuel","Dhoni","Virat");
		System.out.println("Printing all the names starting with S");
		checkString(nameList, (name->name.startsWith("S")));
		System.out.println("Printing all the names starting with D");
		checkString(nameList, (name->name.startsWith("D")));
	}
	public static void checkString(List<String> nameList, Predicate<String> p) {
		for(String s:nameList) {
			if(p.test(s)) {
				System.out.print("");
			}
		}
		System.out.println();
	}
}
