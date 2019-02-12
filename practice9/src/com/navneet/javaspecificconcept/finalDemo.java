package com.navneet.javaspecificconcept;

//final method cannot be inherited
 final class A{
	 
	//final method cannot be overrided
	final void sample(){
		System.out.println("This is sample");
	}
		void sample1(){
			System.out.println("This is sample class");
	}
	
}


/*class B extends A{
	/*void sample(){
		System.out.println("This is sample");
	}*/
	/*void sample1(){
		System.out.println("This is sample class");
}
}
*/

public class finalDemo {

	public static void main(String[] args) {
		int x=10;
		x=100;// update operation allowed


		System.out.println("x is: "+x);
		
		// Behaves like constant. y is IMMUTABLE
				// final variable
		//final int y=2;
		//y=4;// update operation is not allowed
		
		//final int p;// Blank final variable
		//p=200;		//only once we can assign value which is initially n this becomes its final fixed value n hence p is not changed further
		//p=300;//error

	}

}
