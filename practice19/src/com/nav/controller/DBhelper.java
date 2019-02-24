package com.nav.controller;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.nav.model.customer;


import net.proteanit.sql.DbUtils;
import com.nav.show.ShowCustomerDetails;


public class DBhelper {
	
	
		Connection con;
		//Statement stmt;
		PreparedStatement pstmt;
		
		
		public DBhelper(){
			try {
				
				// 2. Load the Driver:
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				
			} catch (Exception e) {
			      e.printStackTrace();
			}
		}
		
		public void createConnection(){
			try {
					String url="jdbc:mysql://localhost/Training1";
					String user="root";
					String password="";
					
					// 3. Create Connection:
					 con=DriverManager.getConnection(url, user,password);
					System.out.println("Connection Created");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			

		public int addCustomerInDB(customer sRef){
			int i=0;
			try {
				// 4. Write SQL Statement to insert data in database
					
				      String sql="insert into customer values(?,?,?,?)";
				      
				// 5. Execute SQL Statement
				
							 //stmt=con.createStatement();
							//int i=stmt.executeUpdate(sql);
				            pstmt=con.prepareStatement(sql);
				           // pstmt.setInt(1,sRef.cid);
				            pstmt.setString(1,sRef.cid);
				            pstmt.setString(2,sRef.name);
				            pstmt.setString(3,sRef.phone);
				            pstmt.setString(4,sRef.email);
				            
				            
				 			
							i = pstmt.executeUpdate();
							
							} catch (Exception e) {
							e.printStackTrace();
							}
							
							return i;
							}
		
		
		/*public ArrayList<customer> fetchCustomersFromDB(){
			ArrayList<customer> customerList=new ArrayList<>();
			try{
			String query="select * from customer";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			customer cust;
			while(rs.next()){
				cust=new customer(rs.getInt("cid"),rs.getString("name"),rs.getString("phone"),rs.getString("email"));
				customerList.add(cust);
			
			}
			}catch (Exception e) {
				e.printStackTrace();
				}
			return customerList;
			}*/
				
		public int deleteCustomerFromDB(customer sRef){
			int i=0;
			try {

				// 4. Create SQL Statement
				String sql = "delete from customer where cid = ? ";

				// 5. Execute SQL Statement

				PreparedStatement pStmt = con.prepareStatement(sql);
				// Substitute the data in SQL Statement
				pStmt.setString(1,sRef.cid);

			 i = pStmt.executeUpdate();

				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			return i;
		}
		
		
		public int updateStudentInDB(customer sRef){
			int i=0;
			try {

				// 4. Create SQL Statement
				String sql = "update customer set name = ?, phone = ?, email = ? where cid = ? ";

				// 5. Execute SQL Statement

				PreparedStatement pStmt = con.prepareStatement(sql);
				// Substitute the data in SQL Statement
				pStmt.setString(1, sRef.name);
				pStmt.setString(2, sRef.phone);
				pStmt.setString(3, sRef.email);
				pStmt.setString(4, sRef.cid);

				 i = pStmt.executeUpdate();

				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return i;
		}
		
		
		
		
	

		public void connectionClose() {
			try {
				// 6. Close the Connection
				con.close();
				System.out.println("Connection is Closed now");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}


}