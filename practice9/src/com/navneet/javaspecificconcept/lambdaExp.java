package com.navneet.javaspecificconcept;

//Single Method Interface : Functional Interface
interface Shape{
	void show();
}

//Method with inputs and ack
interface Shape1{
	int add(int a,int b);
	//void add(int a,int b);
}
public class lambdaExp {

	public static void main(String[] args) {
		/*Shape i1=new Shape(){
			public void show(){
				System.out.println("This is oval shape");
			}
		};
		i1.show();*/
		System.out.println();
		
		// Lambda Expression is just another syntax to write Functional Interfaces
		/*Shape i1=()->{
			(System.out.println("This is oval shape");
		};*/
		
		//i1.show();
		
		Shape1 i1=(a,b)->{
			System.out.println("sum is: "+(a+b));
			return (a + b);
			
		};
		
		i1.add(3, 4);
		
		/*Shape1 i1=(a,b)->{
			System.out.println("sum is: "+(a+b));
			};
		
		i1.add(3, 4);*/
		
	}

}
