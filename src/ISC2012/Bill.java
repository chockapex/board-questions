package ISC2012;
public class Bill extends Detail{
	private int n;
	private float amt;
	
	public Bill(String name, String address, long telno, float rent, int n) {
		super(name, address, telno, rent);
		this.n = n;
		amt = 0;
	}
	
	public void cal() {
		if(n >= 1 && n <= 100) {
			amt = super.rent;
		}
		else if(n >= 101 && n <= 200) {
			amt = super.rent + (float)((n - 100) * 0.6);
		}
		else if(n >= 201 && n <= 300) {
			amt = super.rent + (float)(100 * 0.6) + (float)((n - 200) * 0.8);
		}
		else if(n >= 301) {
			amt = super.rent + (float)(100 * 0.6) + (float)(100 * 0.8) + (n - 300);
		}
	}
	
	public void show() {
		super.show();
		System.out.println("NO. OF CALLS: " + n);
		System.out.println("AMOUNT: " + amt);
	}
}
