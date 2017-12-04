
public class Test {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();

	//	bicycle.printDetails();
		
		bicycle.changeGear(2);
		bicycle.changeCadence(10);
		bicycle.name = "Hero";
		
		bicycle.printDetails();
	}

}
