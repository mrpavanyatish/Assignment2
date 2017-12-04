
public class Bicycle {
	
	//fields or instance variable or non-static variables
	int gear;
	int speed;
	int cadence;
	String name;
	
	void changeCadence(int newValue)
	{
		cadence = newValue;
		speed = speed+1;
	}
	
	void changeGear(int newValue)
	{
		gear = newValue;
	}
	
	void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	
	void printDetails()
	{
		System.out.println("Name : " +name);
		System.out.println("Speed : " + speed);
		System.out.println("Cadence : " + cadence);
		System.out.println("Gear : " + gear);
	}

}
