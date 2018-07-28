import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;

public class hod extends JFrame 
{Connection con;
Statement st;
ResultSet rs;
DefaultTableModel model=new DefaultTableModel();
Container cnt=this.getContentPane();
JTable jt=new JTable(model);
//JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ramandeep Singh\\Pictures\\old_apple_music_gradient-wallpaper-2560x1440 (2).jpg"));
public hod(String c)
	{
//add(background);
this.setLayout(null);
		this.setSize(700,600);
		this.setVisible(true);
		cnt.getMaximumSize();
		cnt.setBackground(Color.GRAY);
		cnt.setBounds(20,50,1500,1000);
		jt.setRowHeight(100);
		jt.setRowMargin(50);
		jt.setRowMargin(20);
	
	cnt.setLayout(new FlowLayout(FlowLayout.CENTER));
		model.addColumn("userid");
		model.addColumn("type");
		model.addColumn("teacher related");
		model.addColumn("earlier compalinted");
		model.addColumn("complaint details ");
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
			rs=st.executeQuery("SELECT * FROM  cse");
			while(rs.next())
			{
				model.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(3),rs.getString(4)});
		}}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	JScrollPane pg=new JScrollPane(jt);
		cnt.add(pg);
		this.setTitle("coplaints of your department cse ");
		this.setLocationRelativeTo(null);
		}
public static void main(String[] args)
	{
		new hod(null);
	}}
 