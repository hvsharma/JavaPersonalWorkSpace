package com.harsh.sampleJavaApp.daoManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnectionManager {
	
	private static Connection connection;

	static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		if(connection != null) {
			return connection;
		} else {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Neutronx-PC:1521:xe", "hvsharma", "Oracle99$");
			return connection;
		}
	}
	
	

}
