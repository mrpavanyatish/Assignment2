
public class Item {

	private int id;
	private String name;
	private float price;
	
	
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Item i = (Item)obj;
		//if(obj instancOf Item)
		if( obj!=null)
		{
			if(this.id == i.id && this.name.equals(i.name) && this.price == i.price)
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return (id+name+price).hashCode();
	}
	
	
}
