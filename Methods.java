import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Methods {
	
	static Random rand = new Random();
	
//	Item item = new Item();
//	Buyer buyer = new Buyer();
	
	public static double setDollarValue() {
		double price = Math.random();
		return round(price * 100, 2);
	}
	
	private static double round(double price, int places) {
		BigDecimal bd = new BigDecimal(Double.toString(price));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public static void setBoxType(Item item) {
		int boxType = rand.nextInt(3);
		switch (boxType) {
			case 0:
				item.box = BoxType.HALF_BUSHEL;
				break;
			case 1:
				item.box = BoxType.TOMATO;
				break;
			case 2:
				item.box = BoxType.TWO_BUSHEL;
				break;
		}	
	}
	
	public static void initializeBuyerArray(Buyer[] buyArr, Buyer b) {
		for (int i = 0; i < buyArr.length; i++) {
			buyArr[i] = new Buyer();
		}
	}
	
	public static void initializeAuctionArray(Item[] itemArr) {
		for (int i = 0; i < itemArr.length; i++) {
			itemArr[i] = new Item();
		}
	}
	
	

}
