import java.lang.reflect.Method;

public class TestGetClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//load the class explicity
		Class class1 = Class.forName("com.java.Item");
		
		//creating a object and instantiating
		Item item = (Item)class1.newInstance();
		
		
		Item item1 = new Item(101,"iphone",200);
		
		Class class11 = item1.getClass();
		
		System.out.println("Class Name : " + class11.getName());
		System.out.println();
		System.out.println("Method List : ");
		
		Method[] methodArr = class11.getMethods();
		
		for(Method s : methodArr)
		{
			System.out.println(s.getName());
		}
		
		
		
		
	}
}
