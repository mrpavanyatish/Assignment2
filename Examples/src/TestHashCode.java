
public class TestHashCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println("String s1 hashCode :" + s1.hashCode());
		System.out.println("String s2 hashCode :" + s2.hashCode());
		
		
		Item item1=new Item(1001,"iphone",200);
		Item item2=new Item(1001,"iphone",200);
		Item item3=new Item(1001,"iphone",200);
		
		System.out.println("item object item1 :"+ item1.hashCode());
		System.out.println("item object item2 :"+item2.hashCode());
		System.out.println("item object item3 :"+item3.hashCode());
	}

}
