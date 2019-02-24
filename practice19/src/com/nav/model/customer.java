package com.nav.model;

import javax.swing.table.TableModel;

public class customer {
	
	public String cid;
	public String name;
	public String phone;
	public String email;
	
	
	public customer() {
	}


	public customer(String cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}


	@Override
	public String toString() {
		return "customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" +  email + "]";
	}


	public static void setModel(TableModel resultSetToTableModel) {
		// TODO Auto-generated method stub
		
	}
	
	

}
