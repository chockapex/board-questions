package ISC2017;

public class Queue {
	private int que[];
	private int size, front, rear;
	public Queue(int mm) {
		size = mm;
		front = rear = 0;
		que = new int[size];
	}
	
	public void addEle(int v) {
		if(rear < size) {
			que[rear++] = v;
		}
		else {
			System.out.println("Overflow");
		}
	}
	
	public int delEle() {
		if(front <= rear) {
			return que[front++];
		}
		else {
			System.out.println("Underflow");
			return -9999;
		}
	}
	
	public void display() {
		for(int i = front; i <= rear; i++) {
			System.out.println(que[i]);
		}
	}
}
