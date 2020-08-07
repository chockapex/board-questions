package ISC2018;

public class Number {
	int n;
	
	public Number(int nn) {
		n = nn;
	}
	
	public int factorial(int a) {
		if(a == 1) {
			return 1;
		}
		return a * factorial(a - 1);
	}
	
	public void display() {
		System.out.println("Number: " + n);
	}
}
