package ISC2017;
import java.util.Scanner;
public class SwapSort {
	private String wrd, swapwrd, sortwrd;
	int len;
	
	public SwapSort() {
		wrd = "";
		sortwrd = "";
		len = 0;
	}
	
	public void readWord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word in UPPERCASE: ");
		wrd = sc.next();
		len = wrd.length();
		sc.close();
	}
	
	public void swapChar() {
		swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
	}
	
	public void sortWord() {
		sortwrd = wrd.charAt(0) + "";
		for(int i = 1; i < len; i++) {
			char c = wrd.charAt(i);
			for(int j = 0; j < sortwrd.length(); j++) {
				if(c <= sortwrd.charAt(0)) {
					sortwrd = c + sortwrd;
					break;
				}
				else if(c >= sortwrd.charAt(sortwrd.length() - 1)) {
					sortwrd = sortwrd + c;
					break;
				}
				else {
					if((c - sortwrd.charAt(j)) >= 0 && (c - sortwrd.charAt(j + 1)) <= 0) {
						sortwrd = sortwrd.substring(0, j + 1) + c + sortwrd.substring(j + 1);
						break;
					}
				}
			}
		}
	}
	
	public void display() {
		System.out.println("Original word: " + wrd);
		System.out.println("Swapped word: " + swapwrd);
		System.out.println("Sorted word: " + sortwrd);
	}
	
	public static void main(String[] args) {
		SwapSort obj = new SwapSort();
		obj.readWord();
		obj.swapChar();
		obj.sortWord();
		obj.display();
	}
}
