package ISC2016;
import java.util.Scanner;
public class ConsChange {
	private String word;
	private int len;
	
	public ConsChange() {
		word = "";
		len = 0;
	}
	
	public void readWord() {
		System.out.print("Enter word in lowercase: ");
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		sc.close();
		System.out.println("Original word: " + word);
	}
	
	public void shiftcons() {
		String ns= "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(!"a".equals(ch + "") && !"e".equals(ch + "") && !"i".equals(ch + "") && !"o".equals(ch + "") && !"u".equals(ch + "")) {
				ns += ch;
			}
		}
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if("a".equals(ch + "") || "e".equals(ch + "") || "i".equals(ch + "") || "o".equals(ch + "") || "u".equals(ch + "")) {
				ns += ch;
			}
		}
		System.out.println("Shifted word: " + ns);
		word = ns;
	}
	
	public void changeWord() {
		String ns = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if("a".equals(ch + "") || "e".equals(ch + "") || "i".equals(ch + "") || "o".equals(ch + "") || "u".equals(ch + "")) {
				ns += word.substring(i);
				break;
			}
			else {
				ns += Character.toUpperCase(ch);
			}
		}
		System.out.println("Changed word: " + ns);
	}
	
	public void show() {
		readWord();
		shiftcons();
		changeWord();
	}
	
	public static void main(String[] args) {
		ConsChange obj = new ConsChange();
		obj.show();
	}
}