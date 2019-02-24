package com.nav.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.nav.controller.DBhelper;
import com.nav.model.customer;
import com.nav.show.ShowCustomerDetails;



public class AddCustomerWindow implements ActionListener{
     public	JFrame fr;
	public JLabel lblTitle,lblID,lblName,lblPhn,lblEmail;
     public	JTextField txtID,txtName,txtPhn,txtEmail;
	public JButton btnAddCustomer,btnShowCustomer,btnUpdateCust,btnDeleteCust;
	public JPanel pnlTitle,pnlID,pnlName,pnlPhn,pnlEmail,pnlBtn,pnlAll;
	
	public AddCustomerWindow(){
		
		fr=new JFrame();
		fr.setTitle("Add Customer");
		
		lblTitle=new JLabel("Enter Customer Details");
		lblID=new JLabel("Enter Customer ID");
		lblName=new JLabel("Enter Customer Name");
		lblPhn=new JLabel("Enter Customer Phone");
		
		lblEmail=new JLabel();
		lblEmail.setText("Enter Customer Email");
		
		txtID=new JTextField(16);
		txtName=new JTextField(16);
		txtPhn=new JTextField(16);
		txtEmail=new JTextField(16);
		
		btnAddCustomer=new JButton();
		btnAddCustomer.setText("Add Customer");
		
		//btnAddCustomer.addActionListener(this);
		btnAddCustomer.addActionListener(this);
			
	
		btnShowCustomer=new JButton("Show Details");
		btnShowCustomer.addActionListener(this);
		
		btnUpdateCust=new JButton("Update");
		btnUpdateCust.addActionListener(this);
		
		btnDeleteCust=new JButton("Delete");
		btnDeleteCust.addActionListener(this);

			
			
			
		pnlTitle=new JPanel();
		pnlID=new JPanel();
		pnlName=new JPanel();
		pnlPhn=new JPanel();
		pnlEmail=new JPanel();
		pnlBtn=new JPanel();
		pnlAll=new JPanel();
		
	}
	
	public void showWindow(){
		pnlTitle.add(lblTitle);
		
		pnlID.add(lblID);
		pnlID.add(txtID);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlPhn.add(lblPhn);
		pnlPhn.add(txtPhn);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlBtn.add(btnAddCustomer);
		pnlBtn.add(btnShowCustomer);
		pnlBtn.add(btnUpdateCust);
		pnlBtn.add(btnDeleteCust);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlID);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhn);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlBtn);
		
		GridLayout layout=new GridLayout(6,1);
		pnlAll.setLayout(layout);
		
		
		fr.add(pnlAll);
		fr.setSize(500,500);
		fr.setVisible(true);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAddCustomer){
			customer sRef = new customer();
			//sRef.cid = txtID.getText();
			sRef.name = txtName.getText();
			sRef.phone = txtPhn.getText();
			sRef.email = txtEmail.getText();
			System.out.println(sRef);
			
			DBhelper db = new DBhelper();
			db.createConnection();
			int i = db.addCustomerInDB(sRef);
			db.connectionClose();
			
			if(i>0){
			System.out.println(">> "+sRef.name+" Added");
			JOptionPane.showMessageDialog(null,"Data Inserted");
			txtID.setText("");
			txtName.setText("");
			txtPhn.setText("");
			txtEmail.setText("");
			}else{
			System.out.println(">> "+sRef.name+" Not Added");
			JOptionPane.showMessageDialog(null,"Data Not Inserted");
			}
			
		}else if(e.getSource() == btnShowCustomer){
					ShowCustomerDetails s1=new ShowCustomerDetails();
					//s1.displayDetails();
					s1.displayCustDetails();
				}
		
		else if(e.getSource() == btnDeleteCust){
			//ShowCustomerDetails s1=new ShowCustomerDetails();
			//s1.MouseClickEvent();
			//s1.DeleteCustDetails();
			customer sRef = new customer();
			sRef.cid = txtID.getText();
			DBhelper db = new DBhelper();
			db.createConnection();
			int i = db.deleteCustomerFromDB(sRef);
			db.connectionClose();
			if(i>0){
				System.out.println(">> "+sRef.cid+" Deleted");
				JOptionPane.showMessageDialog(null,"Data Deleted");
				txtID.setText("");
			}else{
				System.out.println(">> "+sRef.cid+" Not Deleted");
				JOptionPane.showMessageDialog(null,"Data Not Deleted");
				}
			
		}else{
			customer sRef = new customer();
			sRef.cid = txtID.getText();
			sRef.name = txtName.getText();
			sRef.phone = txtPhn.getText();
			sRef.email = txtEmail.getText();
			System.out.println(sRef);
			DBhelper db = new DBhelper();
			db.createConnection();
			int i = db.updateStudentInDB(sRef);
			db.connectionClose();
			
			
			if(i>0){
			System.out.println(">> "+sRef.cid+" Updated");
			JOptionPane.showMessageDialog(null,"Data Updated");
			txtID.setText("");
			txtName.setText("");
			txtPhn.setText("");
			txtEmail.setText("");
			}else{
			System.out.println(">> "+sRef.cid+" Not Updated");
			JOptionPane.showMessageDialog(null,"Data Not Updated");

			}
			
		}

	}	
		
		}
	
	
		
	
	
	


