package ISC2016;

public class Disarium {
	private int num, size;
	
	public Disarium(int nn) {
		num = nn;
		size = 0;
	}
	
	public void countDigit() {
		int n = num;
		while(n > 0) {
			size++;
			n /= 10;
		}
	}
	
	public int sumOfDigits(int n, int p) {
		if(p == 1) {
			return n;
		}
		else {
			return (int)Math.pow(n % 10, p) + sumOfDigits(n / 10, --p);
		}
	}
	
	public void check() {
		if(sumOfDigits(num, size) == num) {
			System.out.println("Disarium number");
		}
		else {
			System.out.println("Not a disarium number");
		}
	}
	
	public static void main(String[] args) {
		Disarium obj = new Disarium(135);
		obj.countDigit();
		obj.check();
	}
}