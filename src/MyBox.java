
public class MyBox {

	public static void main(String[] args) {
		double volume;
		
		Box b1 = new Box(10,20,30);
		//b1.setDimension(10,20,30);
		volume = b1.volume();
		System.out.println("Volume of my box B1 " +volume);
		
		Box b2 = new Box(10,5,300);
		//b2.setDimension(10,5,30);
		//volume = (b2.length * b2.width * b2.height);
		volume = b2.volume();
		System.out.println("Volume of my box B2 " +volume);
	
	}

}
//called from class Box