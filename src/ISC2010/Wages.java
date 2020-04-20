package ISC2010;

public class Wages extends Worker{
	int hrs;
	double rate, wage;
	
	public Wages(String name, float basic, int hrs, double rate) {
		super(name, basic);
		this.hrs = hrs;
		this.rate = rate;
		wage = 0;
	}
	
	public double overtime() {
		return hrs*rate;
	}
	
	public void display() {
		wage = overtime() + super.basic;
		super.display();
		System.out.println("Hours:" + hrs);
		System.out.println("Rate:" + rate);
		System.out.println("Wage:" + wage);
	}
}