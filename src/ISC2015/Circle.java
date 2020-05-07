package ISC2015;

public class Circle extends Plane{
	
	private float x2, y2;
	private double radius, area;
	
	public Circle(float x1, float y1, float x2, float y2) {
		super(x1, y1);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void findRadius() {
		radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2))/2;
	}
	
	public void findArea() {
		area = 3.14 * Math.pow(radius, 2);
	}
	
	public void show() {
		super.show();
		System.out.println("Coordinates of the second endpoint are: " + x2 + ", " + y2);
		System.out.println("Radius of the circle: " + radius);
		System.out.println("Area of the circle: " + area);
	}
}