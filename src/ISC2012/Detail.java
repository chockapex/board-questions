package ISC2012;

public class Detail {
	private String name, address;
	private long telno;
	float rent;
	
	public Detail(String name, String address, long telno, float rent) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.rent = rent;
	}
	
	public void show() {
		System.out.println("NAME: " + name);
		System.out.println("ADDRESS: " + address);
		System.out.println("TEL NO: " + telno);
		System.out.println("RENT: " + rent);
	}
}
