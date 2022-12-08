package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration_form { 
	
	public void RegistrationDetails() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Name");
		String userName=sc.next();
		
		System.out.println("Enter EmailId ");
		String Email=sc.next();
		
		System.out.println("Enter your mobile number ");
		String mobNumber=sc.next();
		 
		System.out.println("Enter your Password");
		String Password=sc.next();
	
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root"); 
				PreparedStatement sta1=con1.prepareStatement("insert into registration(user_name, EmailId , mobile_num , password)values(?,?,?,?)");
				
				sta1.setString(1, userName); //1st parameter in query
				sta1.setString(2,Email); //2nd parameter in query
				sta1.setString(3,mobNumber); //2nd parameter in query
				sta1.setString(4,Password); //2nd parameter in query
				
				sta1.execute();
				System.out.println("your Registration has been completed sucessfully");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			 
	}
	}
	

	


