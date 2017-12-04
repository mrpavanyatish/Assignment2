
public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Item itemOriginal = new Item(101,"iphone",200);
		
		Item itemClone = (Item)itemOriginal.clone();
		
		
		System.out.println(itemOriginal == itemClone);
		System.out.println(itemOriginal.equals(itemClone));
		System.out.println(itemOriginal.hashCode());
		System.out.println(itemClone.hashCode());

	}

}
