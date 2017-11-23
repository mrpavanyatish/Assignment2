
public class cylinder extends circle{
	
	//method to calculate area of a cylinder
	// over riding concept
	public float calculateArea()
	{
		rectangle r1 = new rectangle(6,2);
		r1.calculateArea();
		
		circle c1 = new circle();
		c1.setRadius(2);
		
		//width of a rectangle should be equal to the circle radius
		if(r1.getWidth() == c1.getRadius())
		{
			float cylinderArea = (float) (2*c1.calculateArea() + 3.14 * r1.calculateArea());
			System.out.println("Area of a Cylinder : " + cylinderArea);
		}
		
		return 0;
	}

}
