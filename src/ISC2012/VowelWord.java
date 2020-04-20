package ISC2012;
import java.util.Scanner;
public class VowelWord {
	private int freq;
	private String str;
	
	public VowelWord() {
		str = "";
		freq = 0;
	}
	
	public void readstr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		str = sc.nextLine();
		sc.close();
	}
	
	public void freq_vowel() {
		int j = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(Character.isWhitespace(str.charAt(i)) || str.charAt(i) == '.') {
				char ch = Character.toLowerCase(str.charAt(j));
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					freq++;
				}
				j = i + 1;
			}
		}
	}
	
	public void display() {
		System.out.println("Original string: " + str);
		System.out.println("Frequency: " + freq);
	}
	
	public static void main(String[] args) {
		VowelWord obj = new VowelWord();
		obj.readstr();
		obj.freq_vowel();
		obj.display();
	}
}
