package ISC2017;
import java.util.Scanner;
public class Adder {
	int a[] = new int[2];
	Scanner sc = new Scanner(System.in);
	
	public Adder() {
		a[0] = 0;
		a[1] = 0;
	}
	
	public void readTime() {
		System.out.println("Enter hours and minutes:");
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
	}
	
	public void addTime(Adder X, Adder Y) {
		this.a[0] = X.a[0] + Y.a[0];
		if(X.a[1] + Y.a[1] >= 60) {
			this.a[0] += 1;
			this.a[1] = (X.a[1] + Y.a[1]) - 60;
		}
		else {
			this.a[1] = X.a[1] + Y.a[1];
		}
	}
	
	public void dispTime() {
		System.out.println("Hours: " + this.a[0]);
		System.out.println("Minutes: " + this.a[1]);
	}
	
	public static void main(String[] args) {
		Adder obj = new Adder();
		Adder t1 = new Adder();
		Adder t2 = new Adder();
		t1.readTime();
		t2.readTime();
		obj.addTime(t1, t2);
		obj.dispTime();
	}
}
