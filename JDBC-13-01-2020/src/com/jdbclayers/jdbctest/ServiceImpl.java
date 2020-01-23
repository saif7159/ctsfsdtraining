package com.jdbclayers.jdbctest;

import java.sql.SQLException;
import java.util.List;

public class ServiceImpl implements Service {
	PlayersDao pdi;
	{
		pdi = new PlayersDaoImpl();
	}
	
	@Override
	public List<Players> getAllPlayers() throws SQLException {
		return pdi.getAllPlayers();
	}

}
