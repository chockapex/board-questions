package ISC2014;

public class Stock {
	String item;
	int qty;
	float rate, amt;
	
	public Stock(String item, int qty, float rate) {
		this.item = item;
		this.qty = qty;
		this.rate = rate;
		amt = qty * rate;
	}
	
	public void display() {
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Rate: " + rate);
		System.out.println("Amount: " + amt);
	}
}
