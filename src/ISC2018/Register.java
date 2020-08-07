package ISC2018;
import java.util.Scanner;

public class Register {
	private String stud[];
	private int cap, top;
	
	public Register(int max){
		top = -1;
		cap = max;
		stud = new String[cap];
	}
	
	public void push(String n) {
		if(top == cap - 1) {
			System.out.println("OVERFLOW");
		}
		else {
			stud[++top] = n;
		}
	}
	
	public String pop() {
		if(top < 0) {
			return "$$";
		}
		else {
			return stud[top--];
		}
	}
	
	public void display() {
		for(int i = 0; i < top; i++) {
			System.out.println(stud[i]);
		}
	}
}
