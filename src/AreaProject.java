import java.util.*;
public class AreaProject
{

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
        // Calling function
        obj.Area(30, 20);
        
        Circle obj1 = new Circle();
        // Calling function
        obj1.Area(3);
        
        Square obj2 = new Square();
        // Calling function
        obj2.Area(20);
        
        //array list to capture all areas
        HashSet<Double> set=new HashSet<Double>();
        double rectarea;
        double squarearea;
        double circlearea;
        rectarea = 0.0;
        squarearea = 0.0;
        circlearea = 0.0;
        
	       set.add(rectarea);  
	       set.add(squarearea);  
	       set.add(circlearea);
	       
	       System.out.println(set);
	}
}
//Class Rectangle
class Rectangle 
{
	// Overloaded function to
    // calculate the area of the rectangle
    // It takes two double parameters
	void Area(double l, double b)
	{
		double rectarea;
		rectarea = 0.0;
		rectarea = l * b;
		System.out.println(rectarea);
	}
}
//Class Square
class Square 
{
    // Overloaded function to
    // calculate the area of the square
    // It takes one double parameter
    void Area(double side)
    {
    	double squarearea = side * side;
    	System.out.println(squarearea);
    }
}
//Class Circle
class Circle
{
	static final double PI = Math.PI;
	// Overloaded function to
    // calculate the area of the circle.
    // It takes one double parameter
	
	void Area(double r)
	{
		double circlearea = PI * r * r;
		System.out.println(circlearea);
	}
}




