package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Login {

	public void getLoginDetails() throws SQLException {
		// ResultSet rs;
		// boolean EmailId=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailId ");
		String EmailId = sc.next();

		System.out.println("Enter your Password");
		String password = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			PreparedStatement sta2 = con1
					.prepareStatement("select * from registration where  EmailId=? and  password=?");
			sta2.setString(1, EmailId);
			sta2.setString(2, password);
			ResultSet rs = sta2.executeQuery();

			if (rs.next()) {

				rs.getString("EmailId");
				rs.getString("password");

				System.out.println("login successfull.." );

			} 
			else {
				System.out.println("login  IS NOT successfull.. WRONG USERNAME & PASSWORD");
				System.out.println("register if you have not at first");
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter Y IF YOU ALREDY RGT and N  TO REGT AND PROCEED");
				String Y=sc2.next();
				String N=sc2.next();
				String choice=Y;
				//String choice=N;
				if(choice!=N) {
					System.out.println("please try login again");
					Login obj1 = new Login();
					obj1.getLoginDetails();	
				}
				else {
					System.out.println("please registrer here");
					Registration_form nmn=new Registration_form();
					nmn.RegistrationDetails();
				}
			}
			//System.out.println("DATA RECORDED SUCESSFULLY");
			con1.close();
			sta2.close();
			rs.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}public static void main(String[] args) throws SQLException {
		Login obj1=new Login();
		obj1.getLoginDetails();
	}
}
