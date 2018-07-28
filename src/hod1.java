import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;

public class hod1 extends JFrame implements ActionListener 

{
	Connection con;
Statement st;
ResultSet rs;
JLabel l0=new JLabel("DETAILS OF HOD REGISTERED ");
JLabel l1=new JLabel("STREAM ");
JLabel l2=new JLabel("USERID");
JLabel l3=new JLabel("PASSWORD");
JLabel l4=new JLabel("NAME");

JLabel l6=new JLabel("USERID");
JTextField f1=new JTextField();
JComboBox c2=new JComboBox();
JTextField f3=new JTextField();
JTextField f4=new JTextField();
JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
JTextField f6=new JTextField();
JButton b1= new JButton("UPDATE");
JButton b2= new JButton("REGISTER");
JButton b3= new JButton("DELETE");
JButton b4= new JButton("SELECT");
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
	rs=st.executeQuery("SELECT * From hodreg");
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

public hod1()
{
	
	this.setVisible(true);
	this.setSize(500,500);add(b4);add(background);
	background.add(l1);background.add(l2);background.add(l3);background.add(f1);background.add(f3);background.add(c1);background.add(b1);background.add(b2);background.add(b3);background.add(l4);background.add(l4);background.add(f4);background.add(c2);background.add(l6);background.add(f6);background.add(l0);
	this.setVisible(true);
	l0.setBounds(20,10,700,50);
	l0.setFont(new Font("Arial",Font.BOLD,30));
	l1.setBounds(20,100,100,40);
	c1.addItem("cse");
	c1.addItem("mech");
	c1.addItem("civil");
	c1.addItem("elect");
	l1.setFont(new Font("Arial",Font.BOLD,15));
	l2.setFont(new Font("Arial",Font.BOLD,15));
	l3.setFont(new Font("Arial",Font.BOLD,15));
	l4.setFont(new Font("Arial",Font.BOLD,15));
	b1.setFont(new Font("Arial",Font.BOLD,15));
	b2.setFont(new Font("Arial",Font.BOLD,15));
	b3.setFont(new Font("Arial",Font.BOLD,15));
	b4.setFont(new Font("Arial",Font.BOLD,15));
	l6.setFont(new Font("Arial",Font.BOLD,15));
	c1.setBounds(150,100,100,40);
	l2.setBounds(20,150,100,40);
	//f2.setBounds(150,150,100,40);
	l6.setBounds(20,200,100,40);
	f6.setBounds(150,200,100,40);
	l3.setBounds(20,250,100,40);
	f3.setBounds(150,250,100,40);
	//l4.setBounds(20,250,100,40);
f4.setBounds(150,300,100,40);
//f5.setBounds(150,350,100,40);
	b1.setBounds(300,100,130,40);
	b2.setBounds(300,150,130,40);
	b3.setBounds(300,200,130,40);
	b4.setBounds(300,250,130,40);
	b4.addActionListener(this);
	l4.setBounds(20,300,100,40);
	//l5.setBounds(20,350,100,40);
	c2.setBounds(150,150,100,40);
	b2.addActionListener(this);
	b1.addActionListener(this);
	b3.addActionListener(this);
	 l4.setForeground(Color.CYAN);
	 l0.setForeground(Color.CYAN);
	 l6.setForeground(Color.CYAN);
	 l3.setForeground(Color.CYAN);
	 l2.setForeground(Color.CYAN);
	 l1.setForeground(Color.CYAN);
	 b1.setForeground(Color.CYAN);
	 l4.setForeground(Color.CYAN);
	 
	 b1.setBackground(Color.BLUE);
	 b1.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 b2.setBackground(Color.BLUE);
	 b2.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 b3.setBackground(Color.BLUE);
	 b3.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 b4.setBackground(Color.BLUE);
	 b4.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	
}
	public static void main(String[] args)
	{
		
new hod1();
	}

	
	public void actionPerformed(ActionEvent arg0)
	{if(arg0.getSource().equals(b4))
	{

		try
		{
			rs=st.executeQuery("SELECT * FROM hodreg where userid='"+c2.getSelectedItem()+"'");
		
			{if(rs.next())
			{
				f3.setText(rs.getString(2));
				f4.setText(rs.getString(3));
				//f5.setText(rs.getString(5));
			}
			
		}}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		
	}
	
	
	if(arg0.getSource().equals(b2))
	{		
	     try
	     {
	    	 st.executeUpdate("insert into hodreg values('"+f6.getText()+"','"+f3.getText()+"',' "+f4.getText()+" ' ,'"+c1.getSelectedItem()+"')" );
	   JOptionPane.showMessageDialog(null, "your id is registered");
	     
	     }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	
		
	}
	if(arg0.getSource().equals(b1))
	{		
	     try
	     {
	    	 st.executeUpdate("update  hodreg set password='"+f3.getText()+"',name='"+f4.getText()+"'");
	   JOptionPane.showMessageDialog(null, "record is updated");
	     
	     }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	

}
	if(arg0.getSource().equals(b3))
	{		
	     try
	     {
	    st.executeUpdate("delete from hodreg where userid='"+c2.getSelectedItem()+"'");
	   JOptionPane.showMessageDialog(null, "record is deleted");
	    }
	     catch(Exception ex)
	     {
	    	 JOptionPane.showMessageDialog(null, ex.getMessage());
	     }
	

}
}
}
