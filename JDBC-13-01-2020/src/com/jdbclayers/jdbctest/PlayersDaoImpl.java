package com.jdbclayers.jdbctest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayersDaoImpl implements PlayersDao {
	private List<Players> list;
	private MySQLConnectionGenerator mscg;
	private Connection con;
	private Statement stmt;
	{
		list = new ArrayList<Players>();
		mscg = MySQLConnectionGenerator.getConnectionObject();
		try {
			con = mscg.getConnection();
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Players> getAllPlayers() throws SQLException {
		// TODO Auto-generated method stub
		//stmt.addBatch("create database football;");
		stmt.addBatch("use football;");
		stmt.addBatch("create table records(name varchar(20), goals int(2), assists int(2));");
		stmt.addBatch("insert into records values('Cristiano',30,2),('Messi',28,6),('Harry Kane',20,3);");
		stmt.executeBatch();
		ResultSet rs = stmt.executeQuery("Select * from records; ");
		while(rs.next())
		{
			list.add(new Players(rs.getString("name"), rs.getInt("goals"), rs.getInt("assists")));
			
		}
		return list;
	}


}
