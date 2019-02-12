package com.navneet.javaspecificconcept;

public class Exceptions {

	public static void main(String[] args) {
		 final boolean debug=false;
	System.out.println("Main started");
	int a=10,b=0,c=0;
	
	int[] arr={10,20,30,40,50};
	
	System.out.println("arr is : "+arr);
	
	// Whenever we detect a crash program stops working
			// Application stops working
			// Application Crashes
			// Abnormal termination of program/process -> Bad for OS !!
			// -> can be changed to normal with try and catch !!
	try{
		c=a/b;
		System.out.println("arr[30] is : "+arr[30]);
	}/*catch(ArithmeticException aRef){
		System.out.println("Some Exception:"+aRef);
	}catch(ArrayIndexOutOfBoundsException bRef){
		
		//System.out.println("Some Exception:"+bRef);
		System.out.println("Some Exception:");
	}*/
	
	catch(Exception cRef){
		if(debug){
			
			// for developers, for debugging
			cRef.printStackTrace();
		}else{
			//For Customers
			System.out.println("Some Exception:"+cRef);
		}
	}finally{
		System.out.println("This is my program");
	}
	System.out.println("c is : "+c);
	System.out.println("Main finished");

	}

}
