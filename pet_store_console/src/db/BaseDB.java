package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDB {
	
	protected Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/petstore";
		String username = "pet_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, pwd);
		return conn;
	}

}

