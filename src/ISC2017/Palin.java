package ISC2017;
import java.util.Scanner;
public class Palin {
	private int num, revnum;
	
	public Palin() {
		num = 0;
		revnum = 0;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = sc.nextInt();
		sc.close();
	}
	
	public int reverse(int y) {
		if(y == 0) {
			return revnum;
		}
		int r = y % 10;
		revnum = revnum * 10 + r;
		return reverse(y / 10);
	}
	
	public void result() {
		if(num == reverse(num)) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome anumber");
		}
	}
	
	public static void main(String[] args) {
		Palin obj = new Palin();
		obj.accept();
		obj.result();
	}
}
