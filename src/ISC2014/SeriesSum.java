package ISC2014;
import java.util.Scanner;
public class SeriesSum {
	int x, n;
	double sum;
	public SeriesSum(int xx, int nn) {
		x = xx;
		n = nn;
		sum = 0;
	}
	
	public double findFact(int m) {
		if(m <= 1) {
			return 1;
		}
		else {
			return m * findFact(m - 1);
		}
	}
	
	public double findPower(int x, int y) {
		if(y == 0) {
			return 1;
		}
		else {
			return x * findPower(x, y - 1);
		}
	}
	
	public void calculate() {
		for(int i = 2; i <= n; i+=2) {
			sum += findPower(x, i) / findFact(i - 1);
		}
	}
	
	public void display() {
		System.out.println("Sum: " + sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and n");
		int x = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		SeriesSum obj = new SeriesSum(x, n);
		obj.calculate();
		obj.display();
	}
}
