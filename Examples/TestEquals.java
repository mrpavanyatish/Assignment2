
public class TestEquals {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		//it gives false
		System.out.println("s1 == s2" + s1 == s2);
		System.out.println("s1.equals(s2)" + s1.equals(s2));
		
		Item item1=new Item(1001,"iphone",200);
		Item item2=new Item(1001,"iphone",200);
		Item item3=new Item(1001,"iphone",200);
		
		System.out.println(item1.equals(item2));
		System.out.println(item2.equals(item3));
		

	}


}


