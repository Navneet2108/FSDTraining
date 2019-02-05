
public class shiftOperators {

	public static void main(String[] args) {
		int x=8;				//1000
		int y=x<<2;				//100000 or 8*2pow2
		int z=x>>2;				//0010 or 8/2pow2
		System.out.println("x is:"+x);
		System.out.println("y is:"+y);
		System.out.println("z is:"+z);
		int p=z<<2;
		System.out.println("p is:"+p);
		
		int n=11;				//1011
		int m=n>>2;				//0010
		System.out.println("m is:"+m);
		
		int num=-11;
		//1011    1's comp
		//0100
		//   +1
		//0101    2's comp
		//1101		shifting
		//0010	  1's comp
		//  +1
		//0011    2's comp  ->-3
		
		int r=num>>2;
		System.out.println("r is:"+r);
		int s = -13;
		int q = s >> 2;
		System.out.println("q is:"+q);
		
		r=num<<2;
		System.out.println("r is:"+r);
	}

}
