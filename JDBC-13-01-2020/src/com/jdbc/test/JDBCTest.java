package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
public static void main(String[] args)
{
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("show databases;");
		while(rs.next()) {
		System.out.println(rs.getString(1));
	
		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
