package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
	private Customer cust = null;
	private Connection con = null;
	private ConnectionFactory factory = null;
	private PreparedStatement pstmt = null;
	private Statement stmt;
	
	{
		factory = ConnectionFactory.generateConnection();
		con = factory.getConnection();
		
		
	}
	@Override
	public Customer createCustomer(String firstname, String lastname, String email) {
		Customer cust = new Customer(firstname, lastname, email);
		try {
			pstmt = con.prepareStatement("Insert into Customer(CUST_FIRST,CUST_LAST,CUST_EMAIL) values(?,?,?)");
			pstmt.setString(1, cust.getFirstname());
			pstmt.setString(2, cust.getLastname());
			pstmt.setString(3, cust.getEmail());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cust;
	}
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select CUST_FIRST, CUST_LAST, CUST_EMAIL from Customer;");
			while(rs.next())
			{
				String first = rs.getString("CUST_FIRST");
				String last = rs.getString("CUST_LAST");
				String email = rs.getString("CUST_EMAIL");
				list.add(new Customer(first, last, email));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	@Override
	public Customer findCustomerById(int id) {
		Customer cust = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select CUST_FIRST, CUST_LAST, CUST_EMAIL from Customer where CUST_ID="+id+";");
			while(rs.next()) {
			cust = new Customer(rs.getString("CUST_FIRST"), rs.getString("CUST_LAST"), rs.getString("CUST_EMAIL"));}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cust;
	}
	@Override
	public void updateCustomer(int id, String name, String lastname, String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
