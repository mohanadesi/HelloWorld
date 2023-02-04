import java.util.*;

public class AreaProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle1 r = new Rectangle1(10, 4);
	        Square1 s = new Square1(7);
	        Circle1 c = new Circle1(3.5);
	        
	        System.out.println("Rectangle Area : " + r.getArea());
	        System.out.println("Square Area : " + s.getArea());
	        System.out.println("Circle Area : " + c.getArea());
	        HashSet<Double> set=new HashSet<Double>();
	        set.add(r.getArea());  
		    set.add(s.getArea());  
		    set.add(c.getArea());
		       Iterator<Double> itr = set.iterator();
		       while (itr.hasNext())
				{
				System.out.println(itr.next());
				}
		       
		       HashMap<Double, String> hmap = new HashMap<>();
				hmap.put(r.getArea(), "Area of the REctangle"); 
				hmap.put(s.getArea(), "Area of Square");
				hmap.put(c.getArea(), "Area of Circle");
				while(hmap.hasNext()) {
					Map.Entry<Double, String> e = hmap.next();
					System.out.print("key is : "+e.getKey() +" & Value is: ");
					System.out.println(e.getValue());
					
				}
	        
	}
}
class Rectangle1
{
    double length;
    double breadth;

    Rectangle1(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}
class Square1
{
    double side;

    Square1(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle1
{
    double radius;

    Circle1(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}







