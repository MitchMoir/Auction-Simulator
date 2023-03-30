import java.util.ArrayList;
public class Buyer {
	
	String id = "";
	ArrayList<Item> itemsBought;
	double ceiling;
	
	
	
	public Buyer() {
		itemsBought = new ArrayList<>();
		id = null;
	}
	
	public Buyer(String id) {
		ceiling = Methods.setDollarValue();
		itemsBought = new ArrayList<>();
		this.id = id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void addToList(ArrayList<Item> list, Item item) {
		list.add(item);
	}
	
	/*public boolean addToPrice(double increase, Item item) {
		if(item.price < ceiling) {
			item.price = item.price + increase;
			return true;
		}
		else
			return false;
	*/}
	
	/*public boolean bid(double increase, Item item) {
		while (ceiling <= item.price) {
			item.price += increase;
			System.out.println("Buyer " + this.id + "placed a bid");
			return true;
			if (ceiling >=
		else {
			System.out.println("Buyer " + this.id + "stopped bidding");
			return false;
		}
	}*/
	
	
	
}
