
public class circle extends abstractMethodClass{

	private int radius;
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	//calculate the area of a rectangle method
	public float calculateArea() {
		
		float area = (float) (3.14*radius*radius);
		return area;	
	}
	//calculate circumference of a circle method
	public float calculateCircumference()
	{
		float circumOfCircle = (float) (2*3.14*radius);
		return circumOfCircle;
		
	}

}
