package com.jdbclayers.jdbctest;

import java.sql.SQLException;
import java.util.List;

public interface PlayersDao {
	public List<Players> getAllPlayers() throws SQLException;
}

