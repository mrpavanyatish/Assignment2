
public class TestGetClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//load the class explicity
		Class class1 = Class.forName("com.java.Item");
		
		//creating a object and instantiating
		Item item = (Item)class1.newInstance();
		
	}
}
