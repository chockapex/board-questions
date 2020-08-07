package ISC2018;

public class Series extends Number{
	int sum;
	
	public Series(int n) {
		super(n);
		sum = 0;
	}
	
	public void calSum() {
		for(int i = 1; i <= n; i++) {
			sum += factorial(i);
		}
	}
	
	public void display() {
		super.display();
		System.out.println("Sum of the series: " + sum);
	}
}
