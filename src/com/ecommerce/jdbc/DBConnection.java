package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public Connection connection;
	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	
	public DBConnection (String url, String username, String password) throws Exception {
		Class.forName(JDBC_DRIVER);
		
		this.connection = DriverManager.getConnection(url,username,password);
	}
	public Connection getConnection() {
		return this.connection;
	}
	public void closeconnection() throws SQLException {
		if(this.connection != null) {
			this.connection.close();
		}
	}

}
