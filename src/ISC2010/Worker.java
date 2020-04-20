package ISC2010;
public class Worker {
	String name;
	float basic;
	
	public Worker(String name, float basic) {
		this.name = name;
		this.basic = basic;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Basic pay: " + basic);
	}
}
