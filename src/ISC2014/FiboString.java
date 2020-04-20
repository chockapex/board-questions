package ISC2014;
import java.util.Scanner;
public class FiboString {
	String x, y, z;
	int n;
	
	public FiboString() {
		x = "a";
		y = "b";
		z = "ba";
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		n = sc.nextInt();
		sc.close();
	}
	
	public void generate() {
		if(n >= 1) {
			System.out.print(x + " ");
		}
		if(n >= 2) {
			System.out.print(y + " ");
		}
		for(int i = 3; i <= n; i++) {
			System.out.print(z + " ");
			x = y;
			y = z;
			z = y + x;
		}
	}
	
	public static void main(String[] args) {
		FiboString obj = new FiboString();
		obj.accept();
		obj.generate();
	}
}
