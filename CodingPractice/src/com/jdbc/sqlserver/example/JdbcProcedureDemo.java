package com.jdbc.sqlserver.example;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * 1. import java.sql.*;
 * 2. Load and register the driver
 * 3. Create connection
 * 4. Create statement
 * 5. Execute statement
 * 6. Process the results
 * 7. Close the connection
 * @author sohan.joshi
 *
 */


public class JdbcProcedureDemo {

	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://localhost;database=MovieRating;password=root";
			//jdbc:sqlserver://localhost;user=Portal_User;password=password123;database=BP_LOCAL_PORTAL
		String username = "Movie_User";
		String password = "root";
		String sp = "{call sp_MovieWithID(?,?)}";
		ResultSet rs = null;
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try (Connection conn = getConnection(connectionUrl,username, password))
		{
				CallableStatement cs = conn.prepareCall(sp);
				cs.setInt(1, 2);
				cs.registerOutParameter(2, Types.BIGINT);
				rs = cs.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		System.out.println();
		System.out.println();
		
		
	}

	private static Connection getConnection(String url, String username, String password) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	private static void loadDriver(String driverUrl) throws ClassNotFoundException {
		Class.forName(driverUrl);
		
	}
	
}
