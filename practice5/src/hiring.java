
public class hiring {
	int fieldid;
	String fieldname;
	String date;
	double salary;
	
	void setHiringDetails(int fieldid,String fieldname,String date,double salary)
	{
		this.fieldid=fieldid;
		this.fieldname=fieldname;
		this.date=date;
		this.salary=salary;
		
	}

	void showHiringDetails()
	{
		System.out.println("*******HIRING FIELD DETAILS********");
		System.out.println("fieldid of hiring:"+fieldid);
		System.out.println("fieldname of hiring:"+fieldname);
		System.out.println("date of hiring:"+date);
		System.out.println("salary :"+salary);
		System.out.println("***********************************");
	}
}
