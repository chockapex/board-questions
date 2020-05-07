package ISC2016;

public class Bank {
	String name, accno;
	double p;
	public Bank(String name, String accno, double p) {
		this.name = name;
		this.accno = accno;
		this.p = p;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Acc.no: " + accno);
		System.out.println("Principal amount: " + p);
	}
}
