package ISC2010;
import java.util.Scanner;
public class Repeat {
	Scanner sc = new Scanner(System.in);
	int st[], cap, f, r;
	public Repeat(int m) {
		cap = m;
		st = new int[m];
		f = 0;
		r = 0;
	}
	
	public void pushvalue(int v) {
		if(r != cap) {
			st[r++] = v;
		}
		else {
			System.out.println("OVERFLOW");
		}
	}
	
	public int popvalue() {
		if(f != r) {
			return st[f++];
		}
		return -9999;
	}
	
	public void display() {
		for(int i = f ; i < r ; i++) {
			System.out.print(st[i] + " ");
		}
	}
}
