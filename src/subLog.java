import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class subLog extends JFrame implements ActionListener{

	private JButton b1,b2;
	private JLabel l1,l2,l3;
	private JTextField t1;
	 private JPasswordField p1;
	 Font f = new Font("Britannic Bold", Font.BOLD,19); 
	 
public subLog(){
	Container c = getContentPane();
	c.setLayout(null);
		JPanel p = new JPanel();
		c.add( b1 = new JButton("LOGIN"));
		c.add( b2 = new JButton("CANCEL"));
		c.add( l1 = new JLabel("USER NAME: "));
		c.add( l2 = new JLabel("PASSWORD:" ));
		c.add( l3 = new JLabel(""));
		
		Image pic = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
		l3.setIcon(new ImageIcon(pic));
		l3.setBounds(30,15,120,120);
		c.add( t1 = new JTextField(20));
		c.add( p1 = new JPasswordField(20));
		

		
	    l1.setFont(f);
		l1.setBounds(180,30,200,50);
		l2.setFont(f);
		l2.setBounds(180,80,200,50);
		t1.setBounds(300,37,150,35);
		
		p1.setBounds(300,87,150,35);
		b1.setBounds(80,145,150,50);
		b2.setBounds(250,145,150,50);
		b2.setFont(f);
		b1.setFont(f);
    b1.addActionListener(this);
    b2.addActionListener(this);
         add(p);
	
	}

public void actionPerformed(ActionEvent e) { 
	if (e.getSource() == b1){

		Connection con;
		PreparedStatement st;
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
	    	st = con.prepareStatement("SELECT `username`, `password` FROM `login` WHERE `username` = ? AND`password` = ?");
			st.setString(1,t1.getText());
			st.setString(2,String.valueOf(p1.getPassword()));
			ResultSet result = st.executeQuery();
			if(result.next()){
				JFrame w = new subFrame ();
				w.setVisible(true);
				w.setSize(1366,768);
			    w.setTitle("Hopital Database");
				w.setLocationRelativeTo(null);
				w.setResizable(false);
			}
			else 
			JOptionPane.showMessageDialog(null,"WRONG USER OR PASSWORD","ERROR FOUND",JOptionPane.ERROR_MESSAGE);
			t1.setText(null);
			p1.setText(null);
		}
	catch(SQLException ex){
	
		JOptionPane.showMessageDialog(null,"WRONG USER OR PASSWORD","ERROR FOUND",JOptionPane.ERROR_MESSAGE);

	}
	}
	
	if (e.getSource ()==b2){
		t1.setText(null);
		p1.setText(null);
		
		
	}
	
	
}
	

}
