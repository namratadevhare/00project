package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main01 {
public void getConnection() throws SQLException {

	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root"); 
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
	// return connection();
}}