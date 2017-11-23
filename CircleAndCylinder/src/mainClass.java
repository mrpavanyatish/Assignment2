
public class mainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//rectangle object
		rectangle r1 = new rectangle(5,6);
		System.out.println("Area of a Rectangle : " + r1.calculateArea());
		
		//circle object
		circle c1=new circle();
		c1.setRadius(6);
		System.out.println("Area of a Circle : " + c1.calculateArea());
		System.out.println("Circumference of a circle : "+ c1.calculateCircumference());
		
		//cylinder object
		cylinder cy = new cylinder();
		cy.calculateArea();
	}

}
