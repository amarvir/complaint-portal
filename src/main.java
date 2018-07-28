 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
class main extends JFrame  implements ActionListener,ItemListener
{
     Connection con;
     Statement st;
     ResultSet rs;
     JLabel l1=new JLabel("PUNJABI UNIVERSITY PATIALA");
	JLabel l2=new JLabel("COMPLINT PORTAL");
	JLabel l3=new JLabel("This is Portal for Ucoe Department For Register Your Complaints For Problems or About Specific Issues  ");
	JLabel l33=new JLabel("Here You Can Give Sugesstions For The Betterment Of Department ");
	JLabel l34=new JLabel("Please Login To Submit Your Complaint ");
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
	JLabel c1=new JLabel("SELECT TYPE ");
    JComboBox cb1=new JComboBox();
	JButton b3=new JButton("admin login");
	JComboBox c2=new JComboBox();
	JButton b4=new JButton(" login");
	JLabel l4=new JLabel("USER ID");
	JLabel l5=new JLabel("PASSWORD");
	JTextField f1=new JTextField();
    JPasswordField f2=new JPasswordField();
    //JLabel l7=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\sharon-mccutcheon-522447-unsplash.jpg"));
	ImageIcon i= new  ImageIcon("C:\\Users\\Ramandeep Singh\\Downloads\\pb.png");
	JLabel l6=new JLabel(i);
	//ImageIcon water = new ImageIcon(" C:\\Users\\Ramandeep Singh\\Pictures\\download (1).jpg");
	//JButton b5=new JButton();
	//JButton b5=new JButton(new ImageIcon(" C:\\Users\\Ramandeep Singh\\Pictures\\download (1).jpg"));
	//b5.setIcon(new ImageIcon(this.getClass().getResource("imagename")));
	//b5.setIcon(new ImageIcon(Class.class.getResource(" C:\\\\Users\\\\Ramandeep Singh\\\\Pictures\\\\download (1).jpg"))));
	ImageIcon image = new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\images.png");
	JButton b5 = new JButton(image);
	JButton b6=new JButton(" login");
	JButton b7=new JButton(" login");
    public main()
    {
    //  setTitle("Background Color for JFrame");
    
    //setLocationRelativeTo(null);
 
     setVisible(true);
     this.setSize(1650,1080);
     add(background);background.add(l33);background.add(l34);background.add(b5);
     background.add(l1);background.add(l2);background.add(l3);background.add(l4);background.add(l5);background.add(l6);background.add(f1);background.add(f2);
     //   b1.setBounds(100,100,100,40);
    // l1.setBounds(140,150,100,40);
	 l1.setBackground(Color.CYAN);
	 l1.setForeground(Color.WHITE);
	 l1.setBounds(300,20,1000,200);background.add(c2);background.add(c1);background.add(b4);background.add(b5);
	 l1.setFont(new Font ("Arial",Font.BOLD,60));
	 l3.setFont(new Font ("Arial",Font.BOLD,15));
	 l33.setFont(new Font ("Arial",Font.BOLD,15));
	 l2.setFont(new Font ("Arial",Font.BOLD,30));
	 l34.setFont(new Font ("Arial",Font.BOLD,15));
	 l4.setForeground(Color.CYAN);
	 l5.setForeground(Color.CYAN);
	 c1.setForeground(Color.CYAN);
	 l33.setForeground(Color.CYAN);
	 l33.setForeground(Color.CYAN);
	 l2.setForeground(Color.CYAN);
	 l34.setForeground(Color.CYAN);
	 l3.setForeground(Color.CYAN);
	 c1.setBackground(Color.CYAN);
	 l2.setBounds(600,197,550,30);
	 l3.setBounds(300,300,900,30);
	 l33.setBounds(400,320,700,30);
	 l34.setBounds(530,340,700,30);
	 l4.setBounds(100,500,150,30);
	 l5.setBounds(100,550,150,30);
	 c1.setBounds(100,450,150,30);
	 c2.setBounds(300,450,250,25);
	 b3.setBounds(460,400,120,30);
	 f1.setBounds(300,500,100,30);
	 f2.setBounds(300,550,100,30);
	 l6.setBounds(50,50,205,155);
	 f1.setBackground(Color.WHITE);
	 f2.setBackground(Color.WHITE);l6.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	 //background.setLayout(new FlowLayout());
	 b4.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	 //Image img=background.getImage();
	 background.add(cb1);
	 cb1.setVisible(false);
	 b5.setBounds(1100,700,70,40);
	 cb1.setBounds(650,450,250,25);
	 cb1.addItem("cse");
	 cb1.addItem("mech");
	 cb1.addItem("civil");
	 cb1.addItem("elect");
	 cb1.setFont(new Font ("Arial",Font.BOLD,15));
     b4.setBounds(298,600,100,30);
	 c1.setFont(new Font ("Arial",Font.BOLD,20));
	 l4.setFont(new Font ("Arial",Font.BOLD,20));
	 l5.setFont(new Font ("Arial",Font.BOLD,20));
	 c2.setFont(new Font ("Arial",Font.BOLD,15));
	c2.addItem("STUDENT");
	c2.addItem("HOD");
	c2.addItem("ADMIN");
	c2.addItemListener(this);
	b4.setBackground(Color.BLUE);
	b4.setForeground(Color.white);
	b4.setFont( new Font("Gill sans",Font.BOLD,20));
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


    
    public static void main(String args[])
    {
    new main();
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
			JOptionPane.showMessageDialog(null,"PASSWORD OR USERID MAY BE WRONG"); 
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
			new stu();
		        }
		  else
		       {
			JOptionPane.showMessageDialog(null,"PASSWORD OR USERID MAY BE WRONG"); 
		       }}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
			
		}
	
			}
			if(c2.getSelectedIndex()==1)
			{
			try {
				rs=st.executeQuery("select * from hodreg where userid='"+f1.getText()+"'and password='"+f2.getText()+"'and stream='"+cb1.getSelectedItem().toString()+"'");

				
			
		if(rs.next())
		        {
		JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL");
		String ch=cb1.getSelectedItem().toString();
		 if(cb1.getSelectedIndex()==0)
		 {
		new hod(ch);
		 }
		 if(cb1.getSelectedIndex()==1)
		 {
		new hdmc(ch);
		 }
		 if(cb1.getSelectedIndex()==2)
		 {
		new hdcv(ch);
		 }
		 if(cb1.getSelectedIndex()==3)
		 {
		new hdec(ch);
		
		 }
		 }
	  else
	  {
	  JOptionPane.showMessageDialog(null,"PASSWORD OR USERID MAY BE WRONG"); 
	  }}
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
	  if(c2.getSelectedIndex()==1)
	  {
	  cb1.setVisible(true);	
	  }
      }
    		
	}}



 