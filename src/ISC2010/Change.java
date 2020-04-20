package ISC2010;
import java.util.Scanner;
public class Change {
	Scanner sc = new Scanner(System.in);
	private String str, newstr;
	private int len;
	
	public Change() {
		str = null;
		newstr = null;
		len = 0;
	}
	
	public void inputWord() {
		System.out.print("Enter the word: ");
		str = sc.next();
		len = str.length();
		newstr = "";
	}
	
	public char caseConvert(char ch) {
		if(Character.isLowerCase(ch)) {
			return Character.toUpperCase(ch);
		}
		return Character.toLowerCase(ch);
	}
	
	public void recchange(int index) {
		if(index == len) {
			newstr += "";
		}
		else {
			newstr += caseConvert(str.charAt(index));
			recchange(index + 1);
		}
	}
	
	public void display() {
		System.out.println("Original word: " + str);
		System.out.println("Replaced word: " + newstr);
	}
	
	public static void main(String[] args) {
		Change obj = new Change();
		obj.inputWord();
		obj.recchange(0);
		obj.display();
	}
}