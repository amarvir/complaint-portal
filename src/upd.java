import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
public class upd extends JFrame implements ActionListener 

{
	Connection con;
Statement st;
ResultSet rs;
JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
JLabel l1=new JLabel("STREAM ");
JLabel l2=new JLabel("USERID");
JLabel l3=new JLabel("PASSWORD");
JLabel l4=new JLabel("NAME");
JLabel l5=new JLabel("ROLL NO.");
JLabel l6=new JLabel("USERID");
JTextField f1=new JTextField();
JComboBox c2=new JComboBox();
JTextField f3=new JTextField();
JTextField f4=new JTextField();
JTextField f5=new JTextField();
JTextField f6=new JTextField();
JButton b1= new JButton("update");
JLabel l7=new JLabel("UPDATE DETAILS OF STUDENTS ");
//JButton b2= new JButton("registeration");
//JButton b3= new JButton("delete");
JButton b4= new JButton("select");
{
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://Localhost/project","root","1234");
	st=con.createStatement();
}
catch(Exception ex)
{
	JOptionPane.showMessageDialog(null,ex.getMessage());	
}
try
{
	rs=st.executeQuery("SELECT*From student");
	while(rs.next())
	{
	c2.addItem(rs.getString(1));
}
}
catch(Exception ex)
{
	JOptionPane.showMessageDialog(null,ex.getMessage());	
}

}
JComboBox c1=new JComboBox ();

public upd()
{
	
	this.setVisible(true);
	this.setSize(500,500);background.add(b4);add(background);background.add(l7);
	background.add(l1);background.add(l2);background.add(l3);background.add(f1);background.add(f3);background.add(c1);background.add(b1);/*background.add(b2);background.add(b3);*/background.add(l4);background.add(l4);background.add(f4);background.add(f5);background.add(l5);background.add(c2);background.add(l6);background.add(f6);
	this.setVisible(true);
	l1.setBounds(20,100,100,40);
	c1.addItem("cse");
	c1.addItem("mech");
	c1.addItem("civil");
	c1.addItem("elect");
	l2.setFont(new Font("Arial",Font.BOLD,15));
	l3.setFont(new Font("Arial",Font.BOLD,15));
	l4.setFont(new Font("Arial",Font.BOLD,15));
	l5.setFont(new Font("Arial",Font.BOLD,15));
	l6.setFont(new Font("Arial",Font.BOLD,15));
	b1.setFont(new Font("Arial",Font.BOLD,15));
	l1.setFont(new Font("Arial",Font.BOLD,15));
	b4.setFont(new Font("Arial",Font.BOLD,15));
	l1.setForeground(Color.cyan);
	l2.setForeground(Color.cyan);
	l3.setForeground(Color.cyan);
	l4.setForeground(Color.cyan);
	l5.setForeground(Color.cyan);
	l6.setForeground(Color.cyan);
	l7.setForeground(Color.cyan);
	
	c1.setBounds(150,100,100,40);
	l2.setBounds(20,150,100,40);
	//f2.setBounds(150,150,100,40);
	l6.setBounds(20,200,100,40);
	f6.setBounds(150,200,100,40);
	l3.setBounds(20,250,100,40);
	f3.setBounds(150,250,100,40);
	//l4.setBounds(20,250,100,40);
f4.setBounds(150,300,100,40);
f5.setBounds(150,350,100,40);
	b1.setBounds(300,200,130,40);
//	b2.setBounds(300,150,130,40);
//	b3.setBounds(300,200,130,40);
	b4.setBounds(300,250,130,40);
	b4.addActionListener(this);
	l4.setBounds(20,300,100,40);
	l5.setBounds(20,350,100,40);
	c2.setBounds(150,150,100,40);
//	b2.addActionListener(this);
	b1.addActionListener(this);
//	b3.addActionListener(this);

	l7.setBounds(200,5,1000,100);
	l7.setFont(new Font("Arial",Font.BOLD,50));
	b4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	b4.setBackground(Color.blue);
	b4.setForeground(Color.cyan);
	b1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	b1.setBackground(Color.blue);
	b1.setForeground(Color.cyan);
}
	public static void main(String[] args)
	{
		
new upd();
	}

	
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource().equals(b4))
	    {

		try
		{
			rs=st.executeQuery("SELECT*FROM student where userid='"+c2.getSelectedItem()+"'");
		
			if(rs.next())
			{
				f3.setText(rs.getString(2));
				f4.setText(rs.getString(3));
				f5.setText(rs.getString(5));
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		
	}
	
/*	
	if(arg0.getSource().equals(b2))
	{		
	     try
	     {
	    	 st.executeUpdate("insert into student values('"+f6.getText()+"','"+f3.getText()+"',' "+f4.getText()+" ' ,'"+c1.getSelectedItem()+"','"+f5.getText()+"')" );
	   JOptionPane.showMessageDialog(null, "your id is registered");
	     
	     }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	
		
	}*/
	if(arg0.getSource().equals(b1))
	{		
	     try
	     {
	    	 st.executeUpdate("update  student set password='"+f3.getText()+"',name='"+f4.getText()+"' ,roll='"+f5.getText()+"'");
	   JOptionPane.showMessageDialog(null, " selected record is updated");
	     
	     }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	

}
	/*if(arg0.getSource().equals(b3))
	{		
		
	     try
	     {
	    st.executeUpdate("delete from student where userid='"+c2.getSelectedItem()+"'");
	   JOptionPane.showMessageDialog(null, " selected record is deleted");
	    }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	

}
*/
}
}
