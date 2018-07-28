import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
public class mech extends JFrame implements ActionListener
{	Connection con;
Statement st;
ResultSet rs;
	JLabel l1=new JLabel("MECH DEPARTMENT ISSUES ");
	JLabel l2=new JLabel("TYPE ISSUE");
	JComboBox c1=new JComboBox ();
	JLabel l3=new JLabel("Teacher Related");
	JLabel l4=new JLabel(" Complainted before");
	JLabel l5=new JLabel("Give Here Details");
	JLabel l6=new JLabel("USER ID");
	JTextArea a1=new 	JTextArea();
	JTextField f1=new JTextField();
	JComboBox cb=new JComboBox();
	JButton b1=new JButton("submit");
	JTextField f2=new JTextField();
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
public mech()
{
	this.setVisible(true);
	this.setSize(500,500);
	add(background);
	background.add(l1);	background.add(l2);	background.add(l4);	background.add(a1);	background.add(f1);
	background.add(l3);	background.add(c1);	background.add(l5);	background.add(cb);	background.add(b1);	background.add(l6);	background.add(f2);
	l1.setFont(new Font("Arial",Font.BOLD,50));
	l2.setFont(new Font("Arial",Font.BOLD,15));
	l3.setFont(new Font("Arial",Font.BOLD,15));
	l4.setFont(new Font("Arial",Font.BOLD,15));
	l6.setFont(new Font("Arial",Font.BOLD,15));
	l5.setFont(new Font("Arial",Font.BOLD,15));
	l1.setForeground(Color.CYAN);
	l1.setBounds(400,0,900,50);
	l6.setBounds(30,80,140,30);
	f2.setBounds(200,80,100,30);
	l2.setBounds(30,120,140,30);
	l3.setBounds(30,170,140,30);
	c1.setBounds(200,120,150,30);
	l4.setBounds(30,570,340,30);
	l5.setBounds(30,220,140,30);
	a1.setBounds(200,220,500,300);
	b1.setBounds(200,620,100,30);
	f1.setBounds(200,170,100,30);
	cb.setBounds(200,570,80,30);
cb.addItem("Yes");
cb.addItem("No");
	c1.addItem("class");
	c1.addItem("timetable");
	c1.addItem("teacher");
	c1.addItem("lab");
	c1.addItem("class representer");
	c1.addItem("other");
	b1.addActionListener(this);
	c1.setFont(new Font("Arial",Font.BOLD,15));
	cb.setFont(new Font("Arial",Font.BOLD,15));
	f1.setFont(new Font("Arial",Font.BOLD,15));
	f2.setFont(new Font("Arial",Font.BOLD,15));
	a1.setFont(new Font("Arial",Font.BOLD,15));
	 l4.setForeground(Color.CYAN);
	 l5.setForeground(Color.CYAN);
	 l6.setForeground(Color.CYAN);
	 l3.setForeground(Color.CYAN);
	 l2.setForeground(Color.CYAN);
	 l1.setForeground(Color.CYAN);
	 b1.setForeground(Color.CYAN);
	 b1.setForeground(Color.CYAN);
	 b1.setBackground(Color.BLUE);
	 b1.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 
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
}

	public static void main(String[] args) 
	{
		  new mech();
	}
	public void actionPerformed(ActionEvent arg)
	{
		if(arg.getSource().equals(b1))
		{		
		     try
		     {
		    	 st.executeUpdate("insert into mech values(' "+f2.getText()+" ' ,' "+c1.getSelectedItem()+" ',  ' "+cb.getSelectedItem()+" ' ,' "+a1.getText()+" ',' "+f1.getText()+" ' )" );
		   JOptionPane.showMessageDialog(null, "one  complaint added");
		     
		     }
		     catch(Exception ex)
		     {
		    	 JOptionPane.showMessageDialog(null, ex.getMessage());
		     }
		
		
		
		
		
		
		
		
		
	}
}
}
