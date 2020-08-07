package ISC2018;
import java.util.Scanner;
import static java.lang.System.out;;

public class Capital {
	private String sent;
	private int freq;
	
	public Capital() {
		sent = "";
		freq = 0;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		out.print("Enter a sentence: ");
		sent = sc.nextLine();
	}
	
	public boolean isCap(String w) {
		char ch = w.charAt(0);
		if(Character.isWhitespace(ch)) {
			ch = w.charAt(1);
		}
		if((Character.isLetter(ch) && Character.isUpperCase(ch))){
			freq++;
			return true;
		}
		return false;
	}
	
	public void display() {
		String words[] = sent.split(" ");
		for(int i = 0; i < words.length; i++) {
			isCap(words[i]);
		}
		out.println("Input: " + sent);
		out.println("Frequency: " + freq);
	}
	
	public static void main(String[] args) {
		Capital obj = new Capital();
		obj.input();
		obj.display();
	}
}
