package ISC2016;
import java.util.Scanner;
public class Shift {
	private int mat[][], m, n;
	
	public Shift(int mm, int nn) {
		m = mm;
		n = nn;
		mat = new int[m][n];
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void cyclic(Shift P) {
		int i;
		for(i = 0; i < P.m - 1; i++) {
			mat[i] = P.mat[i + 1];
		}
		mat[i] = P.mat[0];
	}
	
	public void display() {
		System.out.println("Shifted matrix: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Shift obj1 = new Shift(5, 5);
		obj1.input();
		Shift obj2 = new Shift(5, 5);
		obj2.cyclic(obj1);
		obj2.display();
	}
}
