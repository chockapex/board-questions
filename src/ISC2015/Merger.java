package ISC2015;
import java.util.Scanner;
public class Merger {
	private long n1, n2, mergNum;
	
	public Merger() {
		n1 = 0;
		n2 = 0;
	}
	
	public void readNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive integers:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
	}
	
	public void joinNum() {
		mergNum = Long.parseLong(n1 + "" + n2);
	}
	
	public void show() {
		System.out.println("Original numbers: " + n1 + ", " + n2);
		System.out.println("Merged number: " + mergNum);
	}
	
	public static void main(String[] args) {
		Merger obj = new Merger();
		obj.readNum();
		obj.joinNum();
		obj.show();
	}
}
