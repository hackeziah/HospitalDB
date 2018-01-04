import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import javax.swing.*;

import 	java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class subReg extends JFrame implements ActionListener {
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private JButton ne,sa,de,up,gt;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
   private JTextArea tar;
	private JComboBox gn,bg ;
	Font f1 = new Font("Aharoni", Font.BOLD,14); 
	
	public subReg() {

Container c=getContentPane();
		
		c.setLayout(null);
		c.add(l1= new JLabel("Patient ID: "));
		 l1.setBounds(20,10,150,50);
         l1.setFont(f1);

		c.add(t1= new JTextField(20));
	
		t1.setBounds(120,20,125,25);
		
		c.add(l2= new JLabel("Name:"));
		c.add(t2= new JTextField(20));
		l2.setBounds(20,45,150,50);
        l2.setFont(f1);
        t2.setBounds(120,55,200,25);
		c.add(l3= new JLabel("Fathers Name: "));
		c.add(t3= new JTextField(20));
		l3.setBounds(20,80,150,50);
        l3.setFont(f1);
        t3.setBounds(120,90,200,25);
        
		c.add(l4= new JLabel("Address: "));
		c.add(t4= new JTextField(20));
		l4.setBounds(20,115,200,50);
        l4.setFont(f1);
       t4.setBounds(120,125,200,25);
        
		c.add(l5= new JLabel("Contact No. "));
		c.add(t5= new JTextField(20));
		l5.setBounds(20,150,150,50);
        l5.setFont(f1);
        t5.setBounds(120,160,200,25);
		c.add(l6= new JLabel("Email ID: "));
		c.add(t6= new JTextField(20));
		l6.setBounds(20,185,150,50);
        l6.setFont(f1);
        t6.setBounds(120,195,200,25);
		c.add(l7= new JLabel("Age: "));
		
		c.add(t7= new JTextField(20));
		
		l7.setBounds(20,220,125,50);
        l7.setFont(f1);
        t7.setBounds(120,230,90,25);
        
		c.add(l8= new JLabel("Gender: "));
		l8.setBounds(20,255,125,50);
        l8.setFont(f1);
        String[] gen = {" ","Male","Female"};
        c.add(gn= new JComboBox(gen));
        gn.setBounds(120,265,125,25);
        gn.addActionListener(this);
        gn.setFont(f1);
		c.add(l9= new JLabel("Blood Group: "));
		l9.setBounds(20,290,125,50);
        l9.setFont(f1);
        String[] beg = {" ","A","B","AB","O"};
        c.add(bg= new JComboBox(beg));
       bg.setFont(f1);
        bg.setBounds(120,300,125,25);
        bg.addActionListener(this);
		c.add(l9= new JLabel("Remarks: "));
		l9.setBounds(20,325,125,50);
        l9.setFont(f1);
        
		c.add(tar= new JTextArea());
		tar.setBounds(120,360,350,100);
		
		c.add(ne= new JButton("NEW"));
		c.add(sa= new JButton("SAVE"));
		c.add(de= new JButton("DELETE"));
		c.add(up= new JButton("UPDATE"));
		c.add(gt= new JButton("GET DATA"));

		
		ne.setFont(f1);
		sa.setFont(f1);
		de.setFont(f1);
		up.setFont(f1);
		gt.setFont(f1);
		
		ne.addActionListener(this);
		sa.addActionListener(this);
		de.addActionListener(this);
	    up.addActionListener(this);
		gt.addActionListener(this);
		ne.setBounds(425,10,150,35);
		sa.setBounds(425,55,150,35);
		de.setBounds(425,100,150,35);
	    up.setBounds(425,145,150,35);
	    gt.setBounds(425,190,150,35);
	    de.setEnabled(false);
	     up.setEnabled(false);
	  
		
	}
public void myQuery(String qry){
		
	Connection con = null;
		Statement sta = null;
		try{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
			sta = (Statement) con.createStatement();
			sta.executeUpdate(qry);
			JOptionPane.showMessageDialog(null,"DATA WAS SAVE");
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,"Must enter a Number Only !!\n"+"FOR CONTACT NO\n"+"AGE\n","ERROR FOUND", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	public void actionPerformed(ActionEvent exp) {
		if (exp.getSource()==sa){
		try{
			
			 myQuery("INSERT INTO ``(`PatientID`, `Name`, `FatherName`, `Address`, `ContactNumbers`, `EmailID`, `Age`, `Gender`, `BloodGroup`, `Remarks`)VALUE('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+gn.getSelectedItem().toString()+"','"+bg.getSelectedItem().toString()+"','"+tar.getText()+"')");
		
			 
		}
		catch(Exception ex){
			
		}
		
		}
		if (exp.getSource()==ne){
			
		    t1.setText(null);
		    t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
		    tar.setText(null);
				
			}
	}

}
