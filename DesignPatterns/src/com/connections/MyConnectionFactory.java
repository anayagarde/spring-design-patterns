package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

	private Connection connection = null;
	private static int num_of_connections = 0;

	public MyConnectionFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citi", "root", "anaya@1995");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		if (num_of_connections < 4) {
			new MyConnectionFactory();
			num_of_connections++;
			return connection;
		}
		return connection;
	}

	public void closeConnection() {

		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
