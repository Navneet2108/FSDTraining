
public class Address {
	String fresname;
	String qualification;
	String address;
	String label;
	int zipcode;
	String mobileno;
	
	void setEmpDetails(String fresname,String qualification,String address,String label,int zipcode,String mobileno){
		this.fresname=fresname;
		this.qualification=qualification;
		this.address=address;
		this.label=label;
		this.zipcode=zipcode;
		this.mobileno=mobileno;
	}
	void showEmpDetails(){
		System.out.println("^^^^^^^^^^EMPLOYEE DETAILS^^^^^^^^^^");
		System.out.println("Fresher name :"+fresname);
		System.out.println("qualification : "+qualification);
		System.out.println("address : "+address);
		System.out.println("Address label  : "+label);
		System.out.println("Address zipcode : "+zipcode);
		System.out.println("MobileNo : "+zipcode);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
	}

}
