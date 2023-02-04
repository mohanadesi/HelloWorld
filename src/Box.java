
public class Box {
	double length;
	double width;
	double height;
	// instance variables
	// state- identify object - date
	//behavious - actions which we perform on this data(methods)
	// a class is a user defined data type, it is used to create objects
	Box(double length,double width,double height)
	{
		System.out.println("Constructing a Box");
		this.length = length;
		this.width = width;
		this.height = height;
	}
		
	double volume() 
	{
		/*System.out.print("Volume is "); 
		System.out.println(length*width*height);
		*/
		return length*width*height;
	}
	
	/* void setDimension(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
	*/
	
}
// main class is in MyBox.java
