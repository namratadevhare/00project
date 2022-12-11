package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EcartShoppingList {
public void ShoppingListDetails() throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement p=con1.prepareStatement("select * from product");
		ResultSet rs=p.executeQuery();
		System.out.println("prod_id \t prod_name \t \tprod_discripation \t\t prod_price" );
		while(rs.next()) {
			
			
			System.out.println(rs.getInt(1)+"\t\t "+rs.getString(2)+" \t \t \t"+rs.getString(3)+" \t "+ rs.getInt(4)+"rs");
			System.out.println();
		}
	}	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
/*
 * public void getProductDetails() throws SQLException { try {
 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con2 =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
 * "root"); PreparedStatement
 * p=con2.prepareStatement("select * from product where prod_id=1"); ResultSet
 * rs1=p.executeQuery(); } catch (ClassNotFoundException e1) { // TODO
 * Auto-generated catch block e1.printStackTrace(); }}
 */
	



public static void main(String[] args) throws SQLException {
	EcartShoppingList nmn1=new EcartShoppingList();
	nmn1.ShoppingListDetails();
	
}
}
