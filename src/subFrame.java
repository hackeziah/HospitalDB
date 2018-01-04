import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class subFrame extends JFrame implements ActionListener{
	Font f1 = new Font("Aharoni", Font.BOLD,15);
	Font f4= new Font("Aharoni",Font.BOLD,20); 
private JMenuBar mbar;
private JMenu pat,us,doc,me,hel;
private JLabel l1; 
private JMenuItem reg,amp,ext,chp,pe,ab,cl;

	public  subFrame() {
		Container c = getContentPane();
		c.add(mbar= new JMenuBar());
		mbar.setBackground(Color.GRAY);
	
		setJMenuBar(mbar);
		
		c.add(me= new JMenu("MASTERY ENTRY"));
		mbar.add(me);
	
		
		c.add(us= new JMenu("USERS"));
		mbar.add(us);
		us.addActionListener(this);
		c.add(chp= new JMenuItem("Change Password"));
	    us.add(chp);
		chp.addActionListener(this);
		
		
		c.add(doc= new JMenu("DOCTOR"));
		mbar.add(doc);
	    doc.addActionListener(this);
	    
		c.add(pe= new JMenuItem("Profile Entry"));
     	doc.add(pe);
		pe.addActionListener(this);
		
		c.add(pat= new JMenu("PATIENT"));
		mbar.add(pat);
		c.add(reg= new JMenuItem("Registration"));
		pat.add(reg);
		reg.addActionListener(this);
		pat.addActionListener(this);
		c.add(amp= new JMenuItem("Admin Patient"));
	    pat.add(amp);
		amp.addActionListener(this);
		c.add(ext= new JMenuItem("Exit"));
	    pat.add(ext);
		ext.addActionListener(this);
		
		c.add(hel= new JMenu("HELP"));
		mbar.add(hel);
		c.add(ab= new JMenuItem("About"));
	   hel.add(ab);
		ab.addActionListener(this);
		c.add(cl= new JMenuItem("Close"));
		   hel.add(cl);
			cl.addActionListener(this);
			pat.setForeground(Color.WHITE);
			us.setForeground(Color.WHITE);
			doc.setForeground(Color.WHITE);
			me.setForeground(Color.WHITE);
			hel.setForeground(Color.WHITE);
		c.add(l1= new JLabel(""));
		Image io = new ImageIcon(this.getClass().getResource("/mainwall.png")).getImage();
		
		l1.setIcon(new ImageIcon(io));
		l1.setBounds(0,0,1366,768);
		
		me.setFont(f4);
		pat.setFont(f4);
		us.setFont(f4);
		doc.setFont(f4);
		hel.setFont(f4);
		
		reg.setFont(f1);
		amp.setFont(f1);
		ext.setFont(f1);
		pe.setFont(f1);
		chp.setFont(f1);
		ab.setFont(f1);
		cl.setFont(f1);

		
		
		
	}

	
	public void actionPerformed(ActionEvent o) {
		JFrame af=null,bf = null,cf=null;
	
		if (o.getSource()==pe){
               af = new subDoc();
				af.setTitle("Doctor");
				af.setVisible(true);
				af.setSize(600,450);
				af.setLocationRelativeTo(null);
			    af.setResizable(false);
			     bf.setVisible(false);
			     cf.setVisible(false);
		} 
		
		if (o.getSource()==amp){
			
			 bf = new subAd();
			bf.setTitle("Admit Patient");
			 bf.setVisible(true);
			  bf.setSize(1150,550);
				bf.setLocationRelativeTo(null);
				bf.setResizable(false);
				af.setVisible(false);
				cf.setVisible(false);
		}
		
		if (o.getSource()==	reg){
	
		 cf= new subReg ();
			cf.setTitle("Patient Registration Form");
			  cf.setVisible(true);
			  cf.setSize(750,550);
				cf.setLocationRelativeTo(null);
				cf.setResizable(false);
				bf.setVisible(false);
				af.setVisible(false);

			
		}
		
		if (o.getSource()==ext){
			System.exit(0);
			
		}
		if (o.getSource ()==cl){
			System.exit(0);
		}
	}

}

