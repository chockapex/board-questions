package ISC2015;

public class Plane {
	float x1, y1;
	
	public Plane(float nx, float ny) {
		x1 = nx;
		y1 = ny;
	}
	
	public void show() {
		System.out.println("Coordinates of the first endpoint are: " + x1 + ", " + y1);
	}
}
