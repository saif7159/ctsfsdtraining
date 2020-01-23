package com.jdbclayers.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionGenerator {
private Connection connection;
static MySQLConnectionGenerator mscg;
//trying to ensure singleton pattern
private MySQLConnectionGenerator()
{
	
}
public static MySQLConnectionGenerator getConnectionObject()
{
	if(mscg == null)
	{
		return new MySQLConnectionGenerator();
	}
	else
	{
		return mscg;
	}
}
public Connection getConnection() throws SQLException
{	
	
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","welcome");
	return connection;	
}
}
