package ISC2012;
public class Link {
	private int lnk[] = new int[100], max, begin, end;
	
	public Link(int mm) {
		max = mm;
		lnk = new int[max];
		begin = 0;
		end = 0;
	}
	
	public void addlink(int v) {
		if(end == max) {
			System.out.println("OUT OF SIZE");
		}
		else {
			lnk[end++] = v;
		}
	}
	
	public int dellink() {
		if(begin == end) {
			System.out.println("EMPTY");
			return -99;
		}
		else {
			return lnk[begin++];
		}
	}
	
	public void display() {
		for(int i = begin ; i < end ; i++) {
			System.out.print(lnk[i] + " ");
		}
	}
}
