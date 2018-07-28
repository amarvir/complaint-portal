import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class student extends JFrame implements ActionListener
{
	JLabel l4=new JLabel("WELCOME STUDENTS ENTER  DETAILS FOR COMPLAINT REGISTERATION");
    JLabel l1=new JLabel("NAME");
	JLabel l2=new JLabel("STREAM");
	JLabel l3=new JLabel("NAME OF HOD");
	JTextField f1=new JTextField();
	JTextField f2=new JTextField();
	JComboBox c1=new JComboBox();
	JButton b1=new JButton(" select");
	JButton b2=new JButton(" submit");
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\foto-garage-ag-161525-unsplash (4123).jpg"));
	public student()
	
	{
	this.setVisible(true);
	this.setSize(500,500);
	this.setVisible(true);
	add(background);
	background.add(l1);background.add(l2);background.add(l3);background.add(l4);background.add(l1);
	background.add(f1);background.add(f2);background.add(c1);background.add(b2);
	//add(l1);add(l2);add(l3);add(l4);add(f1);add(c1);add(b2);
	l1.setBounds(30,150,200,30);
	l4.setFont(new Font("Arial",Font.BOLD,35));
	l1.setFont(new Font("Arial",Font.BOLD,15));
	l2.setFont(new Font("Arial",Font.BOLD,15));
	l3.setFont(new Font("Arial",Font.BOLD,15));
	l4.setForeground(Color.blue);
	f1.setBounds(240,150,170,30);
	l2.setBounds(30,110,200,30);	
	c1.setBounds(240,110,250,20);
	l3.setBounds(30,200,200,30);	
	f2.setBounds(240,200,170,30);
	l4.setBounds(10,10,1800,100);	
	b1.setBounds(50,250,100,30);
	b2.setBounds(240,300,100,30);
	c1.addItem("cse");
	c1.addItem("mech");
	c1.addItem("civil");
	c1.addItem("elect");
	c1.setFont(new Font("Arial",Font.BOLD,15));
	f1.setFont(new Font("Arial",Font.BOLD,15));
	f1.setForeground(Color.CYAN);
	l4.setForeground(Color.CYAN);
	l1.setForeground(Color.CYAN);
	l2.setForeground(Color.CYAN);
	l3.setForeground(Color.CYAN);
	b2.setForeground(Color.CYAN);
	b2.setBackground(Color.BLUE);
	f2.setFont(new Font("Arial",Font.BOLD,15));
	b2.addActionListener(this);	
	 b2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	 
	 
	}
	
	public static void main(String[] args)
	{
       new student();
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

