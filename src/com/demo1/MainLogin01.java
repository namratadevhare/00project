package com.demo1;

import java.sql.SQLException;
import java.util.Scanner;

public class MainLogin01 {
	public void loginDetails001() throws SQLException {
		System.out.println("<<<Welcome to E-CART SHOPPING>>....");
		System.out.println("PRESS 2 FOR login");
		System.out.println("PRESS 1 to REGISTERED AND PROCEED TO LOGIN");

		Scanner sc1 = new Scanner(System.in);

		// System.out.println("enter your prod choice");
		int choice = sc1.nextInt();
		switch (choice) {
		case 2:
			Login obj1 = new Login();
			obj1.getLoginDetails();
			break;

		case 1:
			System.out.println("Register first");
			Registration_form nmn=new Registration_form();
			nmn.RegistrationDetails();
			break;
			
		case 3:
		}
	}public static void main(String[] args) throws SQLException {
		MainLogin01 obj2=new MainLogin01();
		obj2.loginDetails001();
		
		
	}
}






