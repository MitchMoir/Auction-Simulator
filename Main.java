import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Item> a = new ArrayList<>();
		ArrayList<Buyer> b = new ArrayList<>();
		
		Item item1 = new Item(); 
		Item item2 = new Item();
		Item item3 = new Item();
		
		a.add(item1);
		a.add(item2);
		a.add(item3);
		
		Buyer buyer1 = new Buyer("510"); 
		Buyer buyer2 = new Buyer("444");
		
		b.add(buyer1);
		b.add(buyer2);
		
		Buyer[] buyers = new Buyer[2];
		
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		

		
		System.out.println(buyer1.ceiling);
		System.out.println(buyer2.ceiling);
		
		if (a.get(0).price < buyer1.ceiling) {
			buyer1.bid(.25, a.get(0));
			System.out.println(a.get(0).price);
			if(a.get(0).price < buyer2.ceiling) {
				buyer2.bid(.25,a.get(0));
				System.out.println(a.get(0).price);
			}
		}
		
		/*if item price is < b1 ceiling
		 * buyer1 bids
		 * if item price + buyer1.bid < b2 ceiling
		 * buyer2 bids
		 * if item price + buyer2.bid is < b1 ceiling
		 * buyer1 bids
		 * if item price + lastbid is < 
		*/
	}
}
