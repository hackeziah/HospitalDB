import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class subAd extends JFrame implements ActionListener {
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private JButton ne,sa,de,up,gt;
	private JTextField t1,t2,t3,t4,t5,t6,t8,t9;
   private JTextArea tar;
	private JComboBox rn ;
	private JTable tab1,tab2;
    private JPanel p1,p2;
	Font f1 = new Font("Aharoni", Font.BOLD,14); 
	Font f2 = new Font("Aharoni", Font.BOLD,12); 
	DefaultTableModel m1,m2;




	public subAd() {

Container c=getContentPane();


		c.setLayout(null);
		c.add(l1= new JLabel("Patient ID: "));
		 l1.setBounds(20,10,150,50);
         l1.setFont(f1);
	 
		c.add(t1= new JTextField(20));
		t1.setBounds(120,20,125,25);
		
		c.add(l2= new JLabel("Patienr Name:"));
		c.add(t2= new JTextField(20));
		l2.setBounds(20,45,150,50);
        l2.setFont(f1);
        t2.setBounds(120,55,200,25);
		c.add(l3= new JLabel("Gender: "));
		c.add(t3= new JTextField(20));
		l3.setBounds(20,80,150,50);
        l3.setFont(f1);
        t3.setBounds(120,90,200,25);
        
		c.add(l4= new JLabel("Blood Group: "));
		c.add(t4= new JTextField(20));
		l4.setBounds(20,115,200,50);
        l4.setFont(f1);
       t4.setBounds(120,125,200,25);
        
		c.add(l5= new JLabel("Diseases "));
		c.add(t5= new JTextField(20));
		l5.setBounds(20,150,150,50);
        l5.setFont(f1);
        t5.setBounds(120,160,200,25); 
		c.add(l6= new JLabel("Admit Date: "));
		c.add(t6= new JTextField(20));
		l6.setBounds(20,185,150,50);
        l6.setFont(f1);
       t6.setBounds(120,195,200,25);
		c.add(l7= new JLabel("Room No. "));
		l7.setBounds(20,220,125,50);
        l7.setFont(f1);

        String[] gen = {" ","1","2","3","4","5","6","7","9",
        		          "10","11","12","13","14","15","16"};
        c.add(rn= new JComboBox(gen));
        rn.setBounds(120,230,75,25);
		c.add(l8= new JLabel("Doctor ID "));
		l8.setBounds(20,255,125,50);
        l8.setFont(f1);
		c.add(t9= new JTextField(20));
        t9.setBounds(120,265,125,25);
    
      
		c.add(l9= new JLabel("Doctor Name:"));
		l9.setBounds(20,290,125,50);
        l9.setFont(f1);
		c.add(t8= new JTextField(20));
        t8.setBounds(120,300,200,25);
    
        
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
         
		
		ne.setFont(f2);
		sa.setFont(f2);
		de.setFont(f2);
		up.setFont(f2);
		gt.setFont(f2);
		
		ne.addActionListener(this);
		
		sa.addActionListener(this);
		de.addActionListener(this);
	    up.addActionListener(this);
		gt.addActionListener(this);
		ne.setBounds(400,10,150,35);
		sa.setBounds(400,55,150,35);
		de.setBounds(400,100,150,35);
	    up.setBounds(400,145,150,35);
	    gt.setBounds(400,190,150,35);
	
	    up.setEnabled(false);
	    de.setEnabled(false);

 Object [] col1 = {"Doctor ID","Doctor Name"};
tab1 = new JTable ();
m1 = new DefaultTableModel();
m1.setColumnIdentifiers(col1);
tab1.setModel(m1);

tab1.setRowHeight(20);
tab1.setFont(f2);
JScrollPane jp1 =new JScrollPane(tab1);
jp1.setBounds(570,10,270,450);  
jp1.setVisible(true);
c.add(jp1);

Object [] col2 = {"Patient ID","Patient Name"};

 tab2 = new JTable ();
m2 = new DefaultTableModel();
m2.setColumnIdentifiers(col2);
tab2.setModel(m2);

tab2.setRowHeight(20);
tab2.setFont(f2);
JScrollPane jp2 =new JScrollPane(tab2);
jp2.setBounds(850,10,270,450);  
jp2.setVisible(true);
c.add(jp2);
	
tab1.setBackground(Color.gray);
tab1.setForeground(Color.white);
tab2.setBackground(Color.gray);
tab2.setForeground(Color.white);

	}

	public void actionPerformed(ActionEvent o) {
		
	
if (o.getSource()==gt){
	
	Object []ro1 = new Object[2];	
	ro1[0]=t9 .getText();
	ro1[1]= t8.getText();
	m1.addRow(ro1);
	
Object []ro2 = new Object[2];	
	ro2[0]= t1.getText();
	ro2[1]= t2.getText();
	m2.addRow(ro2);
	
	
		}
if(o.getSource()==ne){
    t1.setText(null);
   t2.setText(null);
	t3.setText(null);
	t4.setText(null);
	t5.setText(null);
	t6.setText(null);
	t8.setText(null);
   t9.setText(null);
   tar.setText(null);

}
		
	if(o.getSource()==de){
		int a = tab1.getSelectedRow();
		int b = tab2.getSelectedRow();

	if (a>=0){
		
		m1.removeRow(a);

	}
	else if(b>0){
		m2.removeRow(b);
	}
	else {
		JOptionPane.showMessageDialog(null,"Cannot be delete","ERROR FOUND",JOptionPane.ERROR_MESSAGE);
		}
	
	
}

	/*int p =tab1.getSelectedRow();
	int s =tab2.getSelectedRow();
	t9.setText((String) m1.getValueAt(s,0));
    t8.setText((String) m1.getValueAt(s,1));
    t1.setText((String) m2.getValueAt(p,0));
     t2.setText((String) m2.getValueAt(p,1));
*/
	
	 if(o.getSource()==up){
			int b = tab2.getSelectedRow();
			
		int a = tab1.getSelectedRow();
		m1.setValueAt(t8.getText(),a,0);
		m1.setValueAt(t8.getText(),a,1);
		m2.setValueAt(t8.getText(),b,0);
		m2.setValueAt(t8.getText(),b,1);
	}
	}

}
