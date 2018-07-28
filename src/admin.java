import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;

public class admin  extends JFrame implements ActionListener,ItemListener
{
	Connection con;
	Statement st;
	ResultSet rs;
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
	JLabel l1=new JLabel("DETAIL OF STUDENT COMPLAINTS ");
	
MenuBar mb=new MenuBar();
Menu m1=new Menu("home");
MenuItem ab=new MenuItem("home");
Menu m2=new Menu("add users");
MenuItem a1= new MenuItem("student");
MenuItem b1= new MenuItem("hod");
Menu m3=new Menu("processes");
MenuItem a= new MenuItem("delete");
MenuItem b= new MenuItem("update");
MenuItem c= new MenuItem("insert");
Menu m4=new Menu("Exit");
MenuItem d= new MenuItem("exit");
JLabel l=new JLabel("USERID");
JLabel l2=new JLabel("STREAM");
JLabel l3=new JLabel("NAME");
JLabel l4=new JLabel("comlainted before");
JLabel l5=new JLabel("COMPLAINT DETAILS"); 
JButton b2=new JButton(" submit");
JTextField f1=new JTextField();
JTextField f2=new JTextField();
JTextField f3=new JTextField();
JTextArea f4=new JTextArea();
JComboBox c2=new JComboBox();
//JTextField f5=new JTextField();0
JComboBox f5=new JComboBox();
JButton b4=new JButton("SELECT");

public admin() 
{
	this.setVisible(true);
	this.setSize(500,500);
	 add(background);
	this.setMenuBar(mb);background.add(l2);background.add(l3);background.add(l4);background.add(l5);background.add(l);background.add(f5);background.add(l1);
	mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);background.add(b4);background.add(l1);
	m3.add(a);m3.add(b);m3.add(c);m2.add(a1);m2.add(b1);m1.add(ab);background.add(c2);background.add(f2);background.add(f3);background.add(f4);
	m4.add(d);background.add(c2);
	l1.setBounds(200,15,1200,40);
	l.setBounds(20,80,100,30);
	f5.setBounds(200,80,100,30);
     l2.setBounds(20,130,100,30);
     c2.setBounds(200,130,100,30);
     l3.setBounds(20,180,100,40);
     f2.setBounds(200,180,100,30);
     l4.setBounds(20,230,140,40);
     f3.setBounds(200,230,100,30);
     l5.setBounds(20,280,300,40);
     f4.setBounds(200,280,300,200);
     a.addActionListener(this);
     b.addActionListener(this);
     c.addActionListener(this);
     m1.addActionListener(this);
     b4.setBounds(350,200,100,30);
 	b4.addActionListener(this);
 	b1.addActionListener(this);
 	m1.addActionListener(this);
 	a1.addActionListener(this);
 	d.addActionListener(this);
 	ab.addActionListener(this);
 	f4.setBackground(Color.WHITE);
 	 l4.setForeground(Color.CYAN);
	 l5.setForeground(Color.CYAN);
	 l.setForeground(Color.CYAN);
	 l3.setForeground(Color.CYAN);
	 l2.setForeground(Color.CYAN);
	 l1.setForeground(Color.CYAN);
	 //l34.setForeground(Color.WHITE);
	 l3.setForeground(Color.CYAN);
	 l4.setFont(new Font ("Arial",Font.BOLD,15));
	 l5.setFont(new Font ("Arial",Font.BOLD,15));
	 l3.setFont(new Font ("Arial",Font.BOLD,15));
	 l4.setFont(new Font ("Arial",Font.BOLD,15));
	 l.setFont(new Font ("Arial",Font.BOLD,15));
	 l2.setFont(new Font ("Arial",Font.BOLD,15));
	 l3.setFont(new Font ("Arial",Font.BOLD,15));
	 l1.setFont(new Font ("Arial",Font.BOLD,50));

	 b4.setFont(new Font ("Arial",Font.BOLD,15));
	 c2.addItem("cse");
	 c2.addItem("mech");
	 c2.addItem("civil");
	 c2.addItem("elect");
	 c2.addItemListener(this);
	 b4.setBackground(Color.BLUE);
	 b4.setForeground(Color.cyan);
	// l6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //background.setLayout(new FlowLayout());
	 b4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 //c1.setBackground(Color.WHITE);
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
 	/*
 		try
 		{
 			rs=st.executeQuery("SELECT*From student");
 			while(rs.next())
 			{
 			f5.addItem(rs.getString(1));
 		}
 		}
 		catch(Exception ex)
 		{
 			JOptionPane.showMessageDialog(null,ex.getMessage());
 			
 		}
 		                                                                         
}*/

}
	public static void main(String[] args)
	{
	new 	admin();
	}

	
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource().equals(a))
		{
			new del();
		}
	

		if(arg0.getSource().equals(b))
		{
			new upd();
		}

		if(arg0.getSource().equals(c))
		{
			new ad();
		}
		if(arg0.getSource().equals(a1))
		{
			new ad();
		}
		if(arg0.getSource().equals(ab))
		{
			new main();
		}
		if(arg0.getSource().equals(b1))
		{
			new hod1();
		}
		if(arg0.getSource().equals(a1))
		{
			new ad();
			
		}
		if(arg0.getSource().equals(d))
		{
			new main();
			//System.exit(0);
			
		}

		if(arg0.getSource().equals(b4))
	    {

		try
		{
			rs=st.executeQuery("SELECT * FROM "+c2.getSelectedItem()+" where userid= '"+f5.getSelectedItem()+"'");
		
			if(rs.next())
			{
				f3.setText(rs.getString(2));
				f4.setText(rs.getString(3));
		     }
			 }
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		}
		}
	public void itemStateChanged(ItemEvent ar) 
	  {
        if(ar.getSource().equals(c2))
        {
	    if(c2.getSelectedIndex()==0)
	    {
		  try
		  {
		  	rs=st.executeQuery("SELECT*From cse");
		  	while(rs.next())
		  	{
		  	f5.addItem(rs.getString(1));
		  }
		  }
		  catch(Exception ex)
		  {
		  	JOptionPane.showMessageDialog(null,ex.getMessage());
		  	
		  }
	  }

	  if(c2.getSelectedIndex()==1)
	  {
		  try
		  {
		  	rs=st.executeQuery("SELECT*From mech");
		  	while(rs.next())
		  	{
		  	f5.addItem(rs.getString(1));
		  }
		  }
		  catch(Exception ex)
		  {
		  	JOptionPane.showMessageDialog(null,ex.getMessage());
		  	
		  }
	  }
    

	  if(c2.getSelectedIndex()==2)
	  {
		  try
		  {
		  	rs=st.executeQuery("SELECT*From civil");
		  	while(rs.next())
		  	{
		  	f5.addItem(rs.getString(1));
		  }
		  }
		  catch(Exception ex)
		  {
		  	JOptionPane.showMessageDialog(null,ex.getMessage());
		  	
		  }
	  }
    

	  if(c2.getSelectedIndex()==3)
	  {
		  try
		  {
		  	rs=st.executeQuery("SELECT*From elect");
		  	while(rs.next())
		  	{
		  	f5.addItem(rs.getString(1));
		  }
		  }
		  catch(Exception ex)
		  {
		  	JOptionPane.showMessageDialog(null,ex.getMessage());
		  	
		  }
	  }
    
    }
  		
	}

}
