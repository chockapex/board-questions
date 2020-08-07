package ISC2018;
import java.util.Scanner;

public class EqMat {
	private int a[][], m, n;
	
	public EqMat(int mm, int nn) {
		m = mm;
		n = nn;
		a = new int[m][n];
	}
	
	public void readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	
	public int check(EqMat P, EqMat Q) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(P.a[i][j] != Q.a[i][j]) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	public void print() {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		EqMat A = new EqMat(2, 2);
		EqMat B = new EqMat(2, 2);
		A.readArray();
		B.readArray();
		EqMat obj = new EqMat(2, 2);
		if(obj.check(A, B) == 1) {
			System.out.println("The matrices are equal");
		}
		else {
			System.out.println("The matrices are not equal");
		}
		System.out.println("First Matrix : ");
		A.print();
		System.out.println("Second Matrix : ");
		B.print();
	}
}
