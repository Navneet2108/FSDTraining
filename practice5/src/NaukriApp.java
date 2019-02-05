
public class NaukriApp {

	public static void main(String[] args) {
		Address[] arr=new  Address[3];
		for(int i=0;i<arr.length;i++){
			arr[i] =new Address();
		}
		hiring[] arr1 = new  hiring[4];
		for(int i=0;i<arr1.length;i++){
			arr1[i] =new hiring();
		}
		
		arr[0].setEmpDetails("Sheena","MBA","Redwood Shores","home",141005,"+91 99999 88888");
		arr[1].setEmpDetails("Meeta","MBA-MCA","Kesar Ganj","uncle",141006,"+91 99999 77777");
		arr[2].setEmpDetails("Shinam","MBA","Redwood Shores","home",141005,"+91 99999 66666");
		
		arr1[0].setHiringDetails(23,"Web Development","30/04/2019",14500);
		arr1[1].setHiringDetails(19,"Software Development","23/05/2015",150000);
		arr1[2].setHiringDetails(24,"Data Analysis","09/04/2003",15000);
		arr1[3].setHiringDetails(25,"System Engineer","06/07/2002",145000);
		
		company c1=new company();
		c1.setCompanyDetails("Hytech","A",3, arr, arr1);
		c1.showCompanyDetails();
		
		
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println(c1.compname+" Gives \u20b9"+c1.totalkamaye());
		System.out.println(">>>>>>>>>>>>>>>>>");
	}

}
