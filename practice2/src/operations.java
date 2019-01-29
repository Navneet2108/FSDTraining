
public class operations {

	public static void main(String[] args) {
		//Arithmetic operators +,-,/,%,*
		int num1=10;
		int num2=12;
		int num3=num1+num2;
		System.out.println("num3 is :"+num3);
		System.out.println("result is :"+(num1+num2));
		
		int num4=num2%3;
		System.out.println("num4 is :"+num4);
		
		int num5=num1/5;
		System.out.println("num5 is :"+num5);
		
		//Arithmetic unary operators ++,--
		int num=100;
		num++;
		++num;
		num--;
		--num;
		num=123;
		System.out.println("num is :"+num);
		
		int x=10;
		int y=x++;
		//y=++x;
		System.out.println("x is: "+x+" and y is: "+y);
		
		//Assignment Operators
		// =, +=, -=, *=, /=, %=
		int p=1;
		p+=3;								//p=p+3
		System.out.println("p is :"+p);
		p%=3;								//p=p%3
		System.out.println("p is :"+p);
		
		// Bitwise Operators
				int a = 8;		// 1 0 0 0
				int b = 12; 	// 1 1 0 0
				int c = a & b;	// 1 0 0 0
				int d = a | b;  // 1 1 0 0
				int e = a ^ b;  // 0 1 0 0
				System.out.println("c is "+c);
				System.out.println("d is "+d);
				System.out.println("e is "+e);


				// Conditional Operators -> Result in either true or false
				// >, <, >=, <=, ==, !=

				int johnsAge = 22;
				int jenniesAge = 52;
				int jacksAge = 32;

				System.out.println("Is John's Age Equal to Jennies Age? "+(johnsAge == jenniesAge));

				// Logical Operators
				// &&, ||
				System.out.println("Is Jack the Oldest? "+( (jacksAge>johnsAge) && (jacksAge < jenniesAge)));

				// Shift Operators
	}

}
