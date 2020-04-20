package ISC2010;
import java.util.Scanner;
public class Rearrange {
	Scanner sc = new Scanner(System.in);
	private String txt, cxt;
	private int len;
	
	public Rearrange(){
		txt = null;
		cxt = null;
		len = 0;
	}
	
	public void readWord() {
		System.out.print("Enter the word in Uppercase: ");
		txt = sc.next();
		len = txt.length();
	}
	
	public void convert() {
		String vowels = "AEIOU";
		if(vowels.contains(Character.toString(txt.charAt(0)))){
			cxt = txt + "Y";
		}
		else {
			for(int i = 1 ; i < len ; i++) {
				if(vowels.contains(Character.toString(txt.charAt(i)))){
					cxt = txt.substring(i) + txt.substring(0, i);
					break;
				}
			}
			if(cxt == "") {
				cxt = txt + "N";
			}
		}
	}
	
	public void display() {
		System.out.println("Original word: " + txt);
		System.out.println("Replaced word: " + cxt);
	}
	
	public static void main(String[] args) {
		Rearrange obj = new Rearrange();
		obj.readWord();
		obj.convert();
		obj.display();
	}
}