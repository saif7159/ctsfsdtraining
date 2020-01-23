package com.jdbclayers.jdbctest;

import java.sql.SQLException;
import java.util.List;

public interface Service {
	public List<Players> getAllPlayers() throws SQLException;
}
