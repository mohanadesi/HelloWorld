
public class Dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declaring and initializing integer values
        int x = 21, sum = 0;
 
        // Do-while loop
        do {
 
            // Execution statements(Body of loop)
 
            // Here, the line will be printed even
            // if the condition is false
        	System.out.println(x);
            sum += x;
            System.out.println(sum);
            x--;
            System.out.println(x);
        }
     // Now checking condition
        while (x > 10);
        
        // Summing up
        System.out.println("Summation: " + sum);
       
	}

}
