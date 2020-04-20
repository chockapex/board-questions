package ISC2011;
import java.util.Scanner;
public class DeciOct {
	Scanner sc = new Scanner(System.in);
	int n, oct;
	
	public DeciOct() {
		n = 0;
		oct = 0;
	}
	
	public void getnum(int nn) {
		n = nn;
	}
	
	public void deci_oct() {
		if(n < 8) {
			oct = Integer.parseInt(n + "" + oct);
		}
		else {
			if(oct == 0) {
				oct = Integer.parseInt((n % 8) + "");
			}
			else {
				oct = Integer.parseInt((n % 8) + "" + oct);
			}
			n /= 8;
			deci_oct();
		}
	}
	
	public void show() {
		System.out.println("Decimal number: " + n);
		deci_oct();
		System.out.println("Octal number: " + oct);
	}
	
	public static void main(String[] args) {
		DeciOct obj = new DeciOct();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		obj.getnum(sc.nextInt());
		sc.close();
		obj.show();
	}
}