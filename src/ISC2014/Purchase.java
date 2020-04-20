package ISC2014;

public class Purchase extends Stock {
	private int pqty;
	private float prate;
	
	public Purchase(String item, int qty, float rate, int pqty, float prate) {
		super(item, qty, rate);
		this.pqty = pqty;
		this.prate = prate;
	}
	
	public void update() {
		qty += pqty;
		if(rate != prate) {
			rate = prate;
		}
		amt = qty * rate;
	}
	
	public void display() {
		super.display();
		update();
		super.display();
	}
}
