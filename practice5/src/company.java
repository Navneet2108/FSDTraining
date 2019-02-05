

public class company {
String compname;
String branch;
int departmentno;
Address[] employees;
hiring[] fields;

void setCompanyDetails(String compname,String branch,int departmentno,Address[] employees,hiring[] fields)
{
	this.compname=compname;
	this.branch=branch;
	this.departmentno=departmentno;
	this.employees=employees;
	this.fields=fields;
}

void showCompanyDetails(){
	System.out.println("###########COMPANY DETAILS############");
	System.out.println("Company branch:"+branch);
	System.out.println("DepartmentNo:"+departmentno);
	
	System.out.println("@@@@@@@@@@@EMPLOYEE DETAILS@@@@@@@@@@@");
	/*for(int i=0;i<employees.length;i++)
	{
		employees[i].showEmpDetails();
	}*/
	for(Address aRef:employees){
		aRef.showEmpDetails();
	}
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    
    System.out.println("$$$$$$$$$ HIRING FIELD DETAILS $$$$$$$$$");
	/*for(int i=0;i<fields.length;i++)
	{
		fields[i].showHiringDetails();
	}*/
	for(hiring oRef:fields){
		oRef.showHiringDetails();
	}
    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

	}

	double totalkamaye(){
		double total=0;
		for(hiring oRef:fields){
			total=total+oRef.salary;
		}
		return total;
	}
}