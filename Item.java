
public class Item {
	
	protected double price;
	protected double maxPrice;
	protected BoxType box;
	protected int itemAmount;
	protected double lotTotal;
	
	
	
	public Item() {
		this.price = Methods.setDollarValue();
		Methods.setBoxType(this);
		this.maxPrice = Methods.setDollarValue() * 2;
	}
	
	public Item(double price, BoxType box) {
		this.price = price;
		this.box = box;
	}
	
	public String toString() {
		return this.price + " " + this.box;
	}
	
	
}
