package ISC2015;
import java.util.Scanner;
public class Admission {
	int adno[];
	static Scanner sc = new Scanner(System.in);
	public Admission() {
		adno = new int[100];
	}
	
	public void fillArray() {
		System.out.println("Enter 100 elements in ascending order:");
		for(int i = 0; i < 100; i++) {
			adno[i] = sc.nextInt();
		}
	}
	
	public int binSearch(int l, int u, int v) {
		int m = (int)Math.floor((l + u)/2.0);
		if(v == adno[m]) {
			return 1;
		}
		else if(v > adno[m] && l != u) {
			return binSearch(m + 1, u, v);
		}
		else if(v < adno[m] && l != u){
			return binSearch(l, m - 1, v);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Admission obj = new Admission();
		obj.fillArray();
		System.out.print("Enter the number to be searched: ");
		int num = sc.nextInt();
		System.out.println(obj.binSearch(0, obj.adno.length - 1, num));
	}
}