package ISC2016;

public class Book {
	private String name[];
	private int point, max;
	
	public Book(int cap) {
		max = cap;
		point = -1;
		name = new String[max];
	}
	
	public void add(String v) {
		if(point < max - 1) {
			name[++point] = v;
		}
		else {
			System.out.println("SHELFF FULL");
		}
	}
	
	public void pop() {
		if(point >= 0) {
			System.out.println(name[point--]);
		}
		else {
			System.out.println("SHELF EMPTY");
		}
	}
	
	public void display() {
		for(int i = 0; i <= point; i++) {
			System.out.println(name[i]);
		}
	}
}
