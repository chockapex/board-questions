package ISC2017;

public class Sales extends Product{
	private int day;
	private double tax, totamt;
	public Sales(String name, int code, double amount, int day) {
		super(name, code, amount);
		this.day = day;
	}
	
	public void compute() {
		tax = 0.124 * super.amount;
		double fine = 0;
		if(day > 30) {
			fine = 0.025 * super.amount;
		}
		totamt = super.amount + tax + fine;
	}
	
	public void show() {
		super.display();
		System.out.println("Days: " + day);
		System.out.println("Sales tax: " + tax);
		System.out.println("Total amount: " + totamt);
	}
}
