package ISC2014;

import java.util.Scanner;

public class Array_to_Stack {
	private int m[], st[], cap, top;
	
	public Array_to_Stack(int n) {
		cap = n;
		top = -1;
		m = new int[n];
		st = new int[n];	
	}
	
	public void input_marks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + cap + " marks in ascending order: ");
		for(int i = 0; i < cap; i++) {
			m[i] = sc.nextInt();
			pushmarks(m[i]);
		}
	}
	
	public void pushmarks(int v) {
		if(top == cap) {
			System.out.println("not possible");
		}
		else {
			st[++top] = v;
		}
	}
	
	public int popmarks() {
		if(top == -1) {
			return -9999;
		}
		else {
			return st[top--];
		}
	}
	
	public void display() {
		for(int i = top; i >= 0; i--) {
			System.out.println(st[i]);
		}
	}
}
