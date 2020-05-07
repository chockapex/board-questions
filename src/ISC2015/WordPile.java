package ISC2015;

public class WordPile {
	private char ch[];
	private int capacity, top;
	
	public WordPile(int cap) {
		capacity = cap;
		top = -1;
		ch = new char[capacity];
	}
	
	public void pushChar(char v) {
		if(top < capacity - 1) {
			ch[++top] = v;
		}
		else {
			System.out.println("WordPile is full.");
		}
	}
	
	public char popchar() {
		if(top >= 0) {
			return ch[top--];
		}
		else {
			return '\\';
		}
	}
}
