package com.nav.show;

/*import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.nav.controller.DBhelper;*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.nav.view.AddCustomerWindow;

import java.sql.*;
//import java.util.ArrayList;

//import com.nav.controller.DBhelper;
//import com.nav.model.customer;

public class ShowCustomerDetails extends JFrame{
	
	    DefaultTableModel model = new DefaultTableModel();
	    Container cnt = this.getContentPane();
	    JTable custtbl = new JTable(model);
	    public ShowCustomerDetails() {
	    	GridLayout layout=new GridLayout();
	        //cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
	        cnt.setLayout(layout);
	        cnt.setBackground(Color.white);
	        cnt.setForeground(Color.blue);
	        model.addColumn("CustomerID");
	        model.addColumn("Name");
	        model.addColumn("Phone No");
	        model.addColumn("Email");
	        
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String url="jdbc:mysql://localhost/Training1";
				String user="root";
				String password="";
				Connection con=DriverManager.getConnection(url, user,password);
	            PreparedStatement pstm = con.prepareStatement("SELECT * FROM customer");
	            ResultSet Rs = pstm.executeQuery();
	            while(Rs.next()){
	                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2),Rs.getString(3),Rs.getString(4)});
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        custtbl.getTableHeader().setFont(new Font("Calibri",Font.BOLD,16));
	        custtbl.getTableHeader().setBackground(Color.lightGray);
	        custtbl.setFont(new Font("Calibri",Font.PLAIN,16));
	        custtbl.setBackground(Color.white);
	        //custtbl.setSize(700, 800);
	        //custtbl.setBounds(100, 100, 200, 300);
	        JScrollPane pg = new JScrollPane(custtbl);
	        cnt.add(pg);
	        this.pack();
	    }
	    
	    public void displayCustDetails(){
	    	JFrame frame = new ShowCustomerDetails();
	        frame.setTitle("Show Customers Details");
	        frame.setSize(700, 700);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    
	   /* public void MouseClickEvent(){
	    	
			
	    	custtbl.addMouseListener(new MouseAdapter(){
	    		
	  		  
	 	       @Override
	 		   public void mouseClicked(MouseEvent e){
	 	    	  AddCustomerWindow a=new AddCustomerWindow();
	 			  
	 			   int i = custtbl.getSelectedRow();
	 			  
	 			   
	 			 /* a.txtID.setText(model.getValueAt(i, 0).toString());
	 			  a.txtName.setText(model.getValueAt(i, 1).toString());
	 			  a.txtPhn.setText(model.getValueAt(i, 2).toString());
	 			  a.txtEmail.setText(model.getValueAt(i, 3).toString());
	 			  
	 			         //  a.setVisible(true);
	 			           //a.pack();
	 			          // a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 			           
	 			         
	 			/* }
	 	    });
	    }
	    
	    public void DeleteCustDetails(){
	    	
              int i=custtbl.getSelectedRow();
   	          if(i>=0){
   		          model.removeRow(custtbl.getSelectedRow());
   	          }
   	    }*/
}

