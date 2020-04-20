package ISC2012;
import java.util.Scanner;
public class Combine {
	int com[], size;
	
	public Combine(int nn) {
		size = nn;
	}
	
	public void inputarray() {
		Scanner sc = new Scanner(System.in);
		com = new int[size];
		System.out.println("Enter " + size + " elements: ");
		for(int i = 0 ; i < size ; i++) {
			com[i] = sc.nextInt();
		}
	}
	
	public void sort() {
		int temp;
		for(int i = 0 ; i < size - 1 ; i++) {
			for(int j = i + 1 ; j < size ; j++) {
				if(com[j] < com[i]) {
					temp = com[i];
					com[i] = com[j];
					com[j] = temp;
				}
			}
		}
	}
	
	public void mix(Combine A, Combine B) {
		com = new int[A.com.length + B.com.length];
		System.arraycopy(A.com, 0, com, 0, A.com.length);
		System.arraycopy(B.com, 0, com, A.com.length, B.com.length);
	}
	
	public void display() {
		for(int i = 0 ; i < com.length ; i++) {
			System.out.print(com[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Combine obj1 = new Combine(5);
		Combine obj2 = new Combine(4);
		obj1.inputarray();
		obj2.inputarray();
		Combine obj = new Combine(9);
		obj.mix(obj1, obj2);
		obj.sort();
		obj.display();
	}
}
