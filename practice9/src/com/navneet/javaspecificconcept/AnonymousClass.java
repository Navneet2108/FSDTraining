package com.navneet.javaspecificconcept;

interface Inf{
	void show();//public abstract void show()
	void hello();//public abstract void hello()
	
}

interface Inf1{
	void show();//public abstract void show()
	void hello1();//public abstract void hello()
	
}

/*class derived implements Inf{
	 public void show(){
		System.out.println("This is show");
	}
	public void hello(){
		System.out.println("This is hello");
	}
	
}*/

public class AnonymousClass {

	public static void main(String[] args) {
		
		// Ref Var of Interface is pointing to the object which implements it !!
		//Inf d1=new derived();
		//d1.show();
		//d1.hello();
		
		System.out.println();
		
		
		// Anonymous Class in JAVA
				// Object of Anonymous class is created automatically and its HashCode is shared in ref var of interface
				// They can have only 1 single object 
				// We cannot have constructors here
				// We can have blocks !!
		Inf i1=new Inf(){
			{
				System.out.println("This is fun");
			}
			 public void show(){
					System.out.println("This is show");
				}
				public void hello(){
					System.out.println("This is hello");
				}
		};
		i1.show();
		i1.hello();
		
		Inf1 i2=new Inf1(){
			{
				System.out.println("This is fun");
			}
			 public void show(){
					System.out.println("This is show");
				}
				public void hello1(){
					System.out.println("This is hello1");
				}
		};
		i2.show();
		i2.hello1();
	}

}


//for each interface there exists only one specific anonymous class

//=>we can create more than one anonymous class using different refvar of interface only
