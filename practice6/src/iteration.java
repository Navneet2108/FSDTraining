
public class iteration {

	public static void main(String[] args) {
		int num1=7;
		int i=1;
		/*System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;
		System.out.println(num1+" "+i+"'s are "+(num1*i));
		i++;*/
		
		
		while (i <= 10){
			System.out.println(num1+" "+i+"'s are "+(num1*i));     
			i++;
		}
		
		System.out.println();

		  num1 = 7;
		i = 1;
		do{
			System.out.println(num1+" "+i+"'s are "+(num1*i));
			i++;
		}while(i<=10);										
		
		System.out.println();
	//num = 3;
		i = 1;
		
		for(num1=3,i=1;i<=10;i++){
			System.out.println(num1+" "+i+"'s are "+(num1*i));
		}
		
		for(int n=5,j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		
		
	}

}
