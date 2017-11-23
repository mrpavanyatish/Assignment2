
public class rectangle extends abstractMethodClass {

	private float height;
	private float width;
	
	//constructor
	public rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	//getters and setters
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	//method to create a area of a rectangleS
	@Override
	public float calculateArea() {
		
		float rectangleArea = 2*this.height*this.width; 
		return rectangleArea;
	}

}
