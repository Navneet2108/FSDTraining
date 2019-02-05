class User{
	//Attributes 
	//property of object and not of class
	int imgid;
	String imgname;
    int imgsize;
    String location;
    String color;
    
}

public class OOPS {

	public static void main(String[] args) {
		int a=10;						//SVC
		int[] arr={10,20,30,40,50};		//MVC
		User uref1=new User();			//MVC
		User uref2=new User();
		User uref3=uref1;
		System.out.println("a is :"+a);
		System.out.println("arr is :"+arr);
		uref1.imgid=102;
		uref1.imgname="SHEENA";
		uref1.imgsize=12;
		uref1.location="ludhiana";
		uref1.color="pink";
		
		uref2.imgid=105;
		uref2.imgname="SHAZAM";
		uref2.imgsize=14;
		uref2.location="amritsar";
		uref2.color="blue";
		
		uref3.imgname="PREETI";
		System.out.println("The location of "+uref1.imgname+" is "+uref3.location);
		System.out.println("The location of "+uref2.imgname+" is "+uref2.location);
	}

}
