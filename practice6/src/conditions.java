
public class conditions {

	public static void main(String[] args) {
		//if else
		boolean isInternetConnected=true;
		boolean isGpsConnected=false;
		if(isInternetConnected){
			System.out.println("you can browse");
			if(isGpsConnected){
				System.out.println("you can browse google maps");
			}else{
				System.out.println("please check your GPS first");
			}
		}else{
			System.out.println("please check your internet connection first");
		}
		
		System.out.println();
		if(isInternetConnected && isGpsConnected){
			System.out.println("You can browse Internet and Use Maps to Navigate");
		}else{
			System.out.println("Please check you Internet or GPS and Try Again");
		}
		
		
		int num1=12;
		int num2=14;
		int num3=13;
		
		if(num1>num2){
			if(num1>num3){
			System.out.println("num1 is greater");
		}else{
			System.out.println("num3 is greater");
		}
		}else{
			if(num2>num3){
				System.out.println("num2 is greater");
			}else{
				System.out.println("num3 is greater");
			}
		}
		
		System.out.println();
		if(num1>num3){
			if(num1>num2){
			System.out.println("num1 is greater");
		}else{
			System.out.println("num2 is greater");
		}
		}else{
			if(num3>num2){
				System.out.println("num3 is greater");
			}else{
				System.out.println("num2 is greater");
			}

	}
		
		System.out.println();
		if(num3>num1){
			if(num3>num2){
			System.out.println("num3 is greater");
		}else{
			System.out.println("num2 is greater");
		}
		}else{
			if(num1>num2){
				System.out.println("num1 is greater");
			}else{
				System.out.println("num2 is greater");
			}
		}
		System.out.println();
		if(num2>num1){
			if(num2>num3){
			System.out.println("num2 is greater");
		}else{
			System.out.println("num3 is greater");
		}
		}else{
			if(num1>num3){
				System.out.println("num1 is greater");
			}else{
				System.out.println("num3 is greater");
			}
		}
		System.out.println();
		//ifelse ladder
		int microCab = 1;
		int miniCab = 2;
		int luxuryCab = 3;
		int bike = 4;
		int auto = 5;

		int userChoice = 4;
		if(userChoice == microCab){
			System.out.println("microcab is booked ,Arrived soon!!");
		}else if(userChoice == miniCab){
			System.out.println("minicab is booked ,Arrived soon!!");
		}else if(userChoice == luxuryCab){
			System.out.println("luxurycab is booked ,Arrived soon!!");
		}else if(userChoice == bike){
			System.out.println("bike is booked ,Arrived soon!!");
		}else if(userChoice == auto){
			System.out.println("auto is booked ,Arrived soon!!");
		}else{
			System.out.println("please choose valid cab");
		}
		//switch statement
		System.out.println();
		switch(userChoice){
		case 1:
			System.out.println("microcab is booked ,Arrived soon!!");
		    break;
		case 2:
			System.out.println("minicab is booked ,Arrived soon!!");
			break;
		case 3:
			System.out.println("luxurycab is booked ,Arrived soon!!");
			break;
		case 4:
			System.out.println("bike is booked ,Arrived soon!!");
			break;
		case 5:
			System.out.println("auto is booked ,Arrived soon!!");
			break;
		default:
			System.out.println("please choose valid cab");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
