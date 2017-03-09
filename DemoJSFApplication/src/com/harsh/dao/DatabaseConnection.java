package com.harsh.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.*;

class DatabaseConnection 
{
	private static final String username="demojsfapp";
	private static final String password="oracledb";
	private static HikariDataSource dataSource;
	
	private static void initializeDataSource()
	{
		Properties props = new Properties();
		props.setProperty("dataSourceClassName", "oracle.jdbc.pool.OracleDataSource");
		props.setProperty("dataSource.user", username);
		props.setProperty("dataSource.password", password);
		props.setProperty("dataSource.databaseName", "XE");
		props.setProperty("dataSource.portNumber", "1521");
		props.setProperty("dataSource.serverName", "localhost");
		props.setProperty("dataSource.driverType", "thin");
		props.put("dataSource.logWriter", new PrintWriter(System.out));

		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);
		
		dataSource = ds;
	}
	
	public static Connection getConnection() throws SQLException
	{
		if(dataSource==null)
		{
			initializeDataSource();
		}
		
		return dataSource.getConnection();
	}
}
