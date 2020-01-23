package com.example.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {
	private Connection con;
	private static ConnectionFactory confactory= null;
	private ConnectionFactory()
	{
		
	}
	public static ConnectionFactory generateConnection(){
		if(confactory!=null)
		{
			return confactory;
		}
		else {
			return new ConnectionFactory();
		}
	}
	public Connection getConnection()
	{
		try {
			
			FileInputStream fi = new FileInputStream("Customer.properties");
			Properties prop = new Properties();
			prop.load(fi);
			String url = prop.getProperty("connection.url");
			String username = prop.getProperty("connection.user");
			String password = prop.getProperty("connection.password");
			con = DriverManager.getConnection(url,username,password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		catch(SQLException sp)
		{
			sp.printStackTrace();
		}
		return con;
	}
}
