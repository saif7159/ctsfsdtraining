package com.jdbclayers.jdbctest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tester {
public static void main(String[] args)
{
	Service s = new ServiceImpl();
	List<Players> players = new ArrayList<Players>();
	try {
		 players = s.getAllPlayers();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(players);
}
}
