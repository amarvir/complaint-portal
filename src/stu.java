
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
class stu extends JFrame  implements ActionListener
{
    
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\old_apple_music_gradient-wallpaper-2560x1440 (2).jpg"));
	JLabel l4=new JLabel("WELCOME STUDENTS ENTER  DETAILS FOR COMPLAINT REGISTERATION");
    JLabel l1=new JLabel("NAME");
	JLabel l2=new JLabel("STREAM");
	JLabel l3=new JLabel("NAME OF HOD");
	JTextField f1=new JTextField();
	JTextField f2=new JTextField();
	JComboBox c1=new JComboBox();
	JButton b1=new JButton(" select");
	JButton b2=new JButton(" submit");
    public stu()
    {
    //  setTitle("Background Color for JFrame");
    
    //setLocationRelativeTo(null);
 
     setVisible(true);
     this.setSize(600,600);
     add(background);
   
     background.add(l1);background.add(l2);background.add(l3);background.add(l4);background.add(l1);
 	background.add(f1);background.add(f2);background.add(c1);background.add(b2);
     l1.setBounds(30,150,200,40);
	 l1.setBackground(Color.CYAN);
	 l1.setForeground(Color.black);

	 l1.setFont(new Font ("Arial",Font.BOLD,15));
		f1.setBounds(240,150,100,30);
		l2.setBounds(30,100,200,30);	
		c1.setBounds(240,110,250,20);
		l3.setBounds(30,200,200,30);	
		f2.setBounds(240,200,100,30);
		l4.setBounds(10,10,1800,100);	
		b1.setBounds(50,250,100,30);
		b2.setBounds(50,300,100,30);
		c1.addItem("cse");
		c1.addItem("mech");
		c1.addItem("elect");
		b2.addActionListener(this);	

    } 
    public static void main(String args[])
    {
    new stu();
    }
    
 	public void actionPerformed(ActionEvent arg) 
	{
		
 		if(arg.getSource().equals(b2))
		{
			 if(c1.getSelectedIndex()==0)
			 {
			new cse();
			 }}
		{
			 if(c1.getSelectedIndex()==1)
			 {
			new mech();
			 }}
				
		{
			 if(c1.getSelectedIndex()==2)
			 {
			new civil();
			 }}
		{
			 if(c1.getSelectedIndex()==3)
			 {
			new elect();
			 }
		}}



	
	}


 