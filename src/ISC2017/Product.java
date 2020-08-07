package ISC2017;

public class Product {
	String name;
	int code;
	double amount;
	public Product(String n, int c, double p) {
		name = n;
		code = c;
		amount = p;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Code: " + code);
		System.out.println("Amount: " + amount);
	}
}
