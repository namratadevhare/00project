package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CartDetails {
	int choice;
	int prod_id;
	//int prod_price;

	public void getProductDetails() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

			Scanner sc2 = new Scanner(System.in);
			// int num=sc2.nextInt();
			int temp = 0;
			int sum = 0;
			int result = 0;
			System.out.println("Enter how many product you wannt to purchase");
			int ttl = sc2.nextInt();
			for (int i = 1; i <= ttl; i++) {

				System.out.println("eneter product id");
				prod_id = sc2.nextInt();
				PreparedStatement p = con2.prepareStatement("select * from product where prod_id=? ");
				p.setInt(1, prod_id);
				// p.setInt(1, prod_price);
				ResultSet rs1 = p.executeQuery();
				while (rs1.next()) {

					System.out.print("product id=  ");
					System.out.println(rs1.getInt("prod_id") + "             ");

					System.out.print("prod_name  = ");
					System.out.println(rs1.getString("prod_name") + "                  ");

					System.out.print("prod_description  =  ");
					System.out.println(rs1.getString("prod_description") + "                   ");

					System.out.print("prod_price = ");
					System.out.println(rs1.getInt("prod_price") + "                              ");

					int j = rs1.getInt("prod_price");

					System.out.println("YOUR ADD TOTAL IS ");
					for (int k = 1; k <= ttl; k++) {
						sum = j;
						temp = sum;
					}
					result = result + temp;
				}
			}
			System.out.println("your cart total amount is" + result);
		}

		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		CartDetails ob1 = new CartDetails();
		ob1.getProductDetails();

	}
}
