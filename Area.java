
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius = 9.8f;
		final float Pi = 3.14f;
		double area = Pi * radius * radius;
		String area_circle = String.format("% .3f", area);
		System.out.print("Area of the circle is :" +area_circle );

	}

}
