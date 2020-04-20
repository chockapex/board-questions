package ISC2014;
import java.util.Scanner;
public class Mixer {
	int arr[], n;
	public Mixer(int nn) {
		n = nn;
		arr = new int[n];
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements in ascending order without duplicates: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public Mixer mix(Mixer A) {
		Mixer res = new Mixer(n + A.n);
		int i = 0, j = 0, k = 0;
		while(i < n && j < A.n) {
			if(arr[i] < A.arr[j]) {
				res.arr[k++] = arr[i++];
			}
			else {
				res.arr[k++] = A.arr[j++];
			}
		}
		while(i < n) {
			res.arr[k++] = arr[i++];
		}
		while(j < A.n) {
			res.arr[k++] = A.arr[j++];
		}
		return res;
	}
	
	public void display() {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Mixer obj1 = new Mixer(5);
		Mixer obj2 = new Mixer(3);
		obj1.accept();
		obj2.accept();
		Mixer out = obj1.mix(obj2);
		out.display();
	}
}
