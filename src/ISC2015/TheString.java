package ISC2015;
import java.util.Scanner;
public class TheString {
	private String str;
	private int len, wordcount, cons;
	
	public TheString() {
		str = "";
		len = 100;
		wordcount = 0;
		cons = 0;
	}
	
	public TheString(String ds) {
		str = ds;
		len = str.length();
	}
	
	public void countFreq() {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isWhitespace(ch)) {
				wordcount++;
			}
			else if((!"a".equalsIgnoreCase(ch + "") || !"e".equalsIgnoreCase(ch + "") || !"i".equalsIgnoreCase(ch + "") || !"o".equalsIgnoreCase(ch + "") || !"u".equalsIgnoreCase(ch + "") && (Character.isLetter(ch)))) {
				cons++;
			}
		}
	}
	
	public void display() {
		System.out.println("Original String: " + str);
		System.out.println("Words: " + (wordcount + 1));
		System.out.println("Consonants: "+ cons);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		TheString obj = new TheString(sc.nextLine());
		sc.close();
		obj.countFreq();
		obj.display();
	}
}
