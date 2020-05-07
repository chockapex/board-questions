package ISC2016;

public class Account extends Bank{
	double amt;
	public Account(String name, String accno, double p, double amt) {
		super(name, accno, p);
		this.amt = amt;
	}
	
	public void deposit() {
		p += amt;
	}
	
	public void withdraw() {
		if(amt > p) {
			System.out.println("INSUFFICIENT BALANCE");
		}
		else{
			p -= amt;
			if(p < 500) {
				p -= (500 - p) / 10;
			}
		}
	}
	
	public void display() {
		super.display();
	}
}
