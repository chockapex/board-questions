package ISC2011;
import java.util.Scanner;
public class Frequency {
	String text;
	int countand, countan, len;
	
	public Frequency() {
		text = null;
		countand = 0;
		countan = 0;
		len = 0;
	}
	
	public void accept(String n) {
		text = n.toLowerCase();
		len = text.length();
		System.out.println(text);
	}
	
	public void checkandfreq() {
		int i = 0;
		for(int j = 0 ; j < len ; j++) {
			char ch = text.charAt(j);
			if(Character.isWhitespace(ch) || ch == ',' || ch == '.' || ch == '?') {
				if(text.substring(i, j).equals("and")) {
					countand++;
				}
				i = j + 1;
			}
		}
	}
	
	public void checkanfreq() {
		int i = 0;
		for(int j = 0 ; j < len ; j++) {
			char ch = text.charAt(j);
			if(Character.isWhitespace(ch) || ch == ',' || ch == '.' || ch == '?') {
				if(text.substring(i, j).equals("an")) {
					countan++;
				}
				i = j + 1;
			}
		}
	}
	
	public void display() {
		System.out.println("AND frequency: " + countand);
		System.out.println("AN frequncy: " + countan);
	}
	
	public static void main(String[] args) {
		Frequency obj = new Frequency();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		obj.accept(sc.nextLine());
		sc.close();
		obj.checkandfreq();
		obj.checkanfreq();
		obj.display();
	}
}