import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;

import javax.swing.*;

public class p1 extends JFrame implements ActionListener,ItemListener




{
	Connection con;
Statement st;
ResultSet rs;


	JLabel l1=new JLabel("PUNJABI UNIVERSITY PATIALA");
	JLabel l2=new JLabel("COMPLINT PORTAL");
	JLabel l3=new JLabel("Now you Can Complaint ,Give Views And Suggestions To Make Department More Effective");
	
	JLabel c1=new JLabel("SELECT TYPE ");

	JComboBox cb1=new JComboBox();
	JButton b3=new JButton("admin login");
	JComboBox c2=new JComboBox();
	JButton b4=new JButton(" login");
	JLabel l4=new JLabel("USER ID");
	JLabel l5=new JLabel("PASSWORD");
	JTextField f1=new JTextField();
JPasswordField f2=new JPasswordField();
JLabel l7=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\sharon-mccutcheon-522447-unsplash.jpg"));
	ImageIcon i= new  ImageIcon("C:\\Users\\Ramandeep Singh\\Downloads\\pb.png");
	JLabel l6=new JLabel(i);

	
	public p1()  
	{
	//	setTitle("Background Color for JFrame");
	  //  setVisible(true);  
	   // l7.setLayout(new FlowLayout());
		this.setVisible(true);this.setLayout(null);
		this.setSize(500,500);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(f1);add(f2);add(l6);
		l1.setBackground(Color.CYAN);
		l1.setForeground(Color.CYAN);
		l1.setBounds(250,20,1000,200);add(c2);add(c1);add(b4);
		l1.setFont(new Font ("Arial",Font.BOLD,60));
		l3.setFont(new Font ("Arial",Font.BOLD,15));
		l2.setFont(new Font ("Arial",Font.BOLD,30));
		l3.setForeground(Color.red);
		c1.setBackground(Color.darkGray);
		l2.setBounds(500,197,500,30);
		l3.setBounds(300,340,700,30);
		l4.setBounds(100,500,150,30);
		l5.setBounds(100,550,150,30);
		c1.setBounds(100,450,150,30);
		c2.setBounds(300,450,250,25);
		b3.setBounds(460,400,120,30);
		f1.setBounds(300,500,100,30);
		f2.setBounds(300,550,100,30);
		l6.setBounds(1,1,250,200);
		f1.setBackground(Color.CYAN);
		f2.setBackground(Color.cyan);
		//setLayout(new FlowLayout());
		
		
		add(cb1);
		cb1.setVisible(false);
		cb1.setBounds(650,450,250,25);
		cb1.addItem("cse");
		cb1.addItem("mech");
		cb1.addItem("civil");
		cb1.addItem("elect");
	b4.setBounds(320,640,120,40);
		c1.setFont(new Font ("Arial",Font.BOLD,20));
		l4.setFont(new Font ("Arial",Font.BOLD,20));
		l5.setFont(new Font ("Arial",Font.BOLD,20));
		c2.addItem("student");
		c2.addItem("hod");
		c2.addItem("admin");
		c2.addItemListener(this);
		b4.addActionListener(this);
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
		
		new p1();

	}


	public void actionPerformed(ActionEvent arg) 
	{
		if(arg.getSource().equals(b4))
		{
			
			
				if(c2.getSelectedIndex()==2)
				
			try {
				rs=st.executeQuery("select * from admin where username='"+f1.getText()+"' and password='"+f2.getText()+"'");
				if(rs.next())
		        {
			JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL");
			new admin();
		        }
		           else
		       {
			JOptionPane.showMessageDialog(null,"LOGIN UN SUCCESFULL"); 
		       }}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
			
		}
	
			}

				if(c2.getSelectedIndex()==0)
				{
			try {
				rs=st.executeQuery("select * from student where userid='"+f1.getText()+"' and password='"+f2.getText()+"'");

			if(rs.next())
		        {
			JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL");
			new student();
		        }
		else
		       {
			JOptionPane.showMessageDialog(null,"LOGIN UN SUCCESFULL"); 
		       }}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
			
		}
	
			}
			if(c2.getSelectedIndex()==1)
			{
			try {
				rs=st.executeQuery("select * from hod where userid='"+f1.getText()+"'and password='"+f2.getText()+"'");

				
			
		if(rs.next())
		        {
			JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL");
			String ch=cb1.getSelectedItem().toString();
			new hod(ch);
		        }
		else
		       {
			JOptionPane.showMessageDialog(null,"LOGIN UNSUCCESFULL"); 
		       }}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
			
		}
	
			}

}	
	public void itemStateChanged(ItemEvent ar) {
if(ar.getSource().equals(c2))
{
	if(c2.getSelectedIndex()==1)
	{
	cb1.setVisible(true);	
	}
}
		
	}}


