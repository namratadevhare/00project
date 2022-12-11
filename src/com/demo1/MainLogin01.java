package com.demo1;

import java.sql.SQLException;
import java.util.Scanner;

public class MainLogin01 {
	public void loginDetails001() throws SQLException {

		System.out.println("PRESS 2 FOR login");
		System.out.println("PRESS 1 to REGISTERED AND PROCEED TO LOGIN");

		Scanner sc1 = new Scanner(System.in);

		
		int choice = sc1.nextInt();
		switch (choice) {
		case 2:
			Login obj1 = new Login();
			obj1.getLoginDetails();
			break;

		case 1:
			System.out.println("Register first");
			Registration_form nmn = new Registration_form();
			nmn.RegistrationDetails();

			//System.out.println("<<<Congratulations>>>>" + " Now you can login here using ID PASS");
			Login obj2 = new Login();
			obj2.getLoginDetails();

			break;

		}
	}

	public static void main(String[] args) throws SQLException, InterruptedException {
		MainLogin01 obj2 = new MainLogin01();
		obj2.loginDetails001();

		System.out.println("<<<Welcome to E-CART SHOPPING>>....");
		Thread.sleep(5000);
		System.out.println("list of your product is given below");
		System.out.println("   ");
		EcartShoppingList nmn1 = new EcartShoppingList();
		nmn1.ShoppingListDetails();

		System.out.println("now you can add your choice product by enterning product id from 1 to 10");
		CartDetails ob1 = new CartDetails();
		ob1.getProductDetails();
	}
}
