package ISC2010;
import java.util.Scanner;
public class Point {
	Scanner sc = new Scanner(System.in);
	int x, y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public void readPoint() {
		System.out.println("Enter the co-ordinates X and Y");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public Point midpoint(Point A, Point B) {
		Point mid = new Point();
		mid.x = (A.x + B.x)/2;
		mid.y = (A.y + B.y)/2;
		return mid;
	}
	
	public void displaypoint() {
		System.out.println("X co-ordinate: " + x);
		System.out.println("Y co-ordinate: " + y);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.readPoint();
		Point p2 = new Point();
		p2.readPoint();
		Point mid = p1.midpoint(p1, p2);
		p1.displaypoint();
		p2.displaypoint();
		mid.displaypoint();
	}
}