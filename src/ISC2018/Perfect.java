package ISC2018;
import java.util.Scanner;

public class Perfect {
	private int num;
	
	public Perfect(int nn) {
		num = nn;
	}
	
	int sum_of_factors(int i) {
		if(i == num) {
			return 0;
		}
		if(num % i == 0) {
			return i + sum_of_factors(i + 1);
		}
		else {
			return sum_of_factors(i + 1);
		}
	}
	
	public void check() {
		if(num == sum_of_factors(1)) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		Perfect obj = new Perfect(num);
		obj.check();
	}
}
