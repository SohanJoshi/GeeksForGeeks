
package com.jdbc.mysql.example;

import java.sql.*;

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


public class JdbcMySQLConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		String connectionUrl = "jdbc:mysql://localhost/my_database";
		String username = "root";
		String password = "root";
		String sql = "select * from Movie";
		ResultSet rs = null;
		//Class.forName("com.mysql.jdbc.Driver");
		try (Connection conn = getConnection(connectionUrl,username, password);
				
				Statement stat = conn.createStatement();
				ResultSet rs1 = stat.executeQuery(sql);){
			while(rs1.next()) {
				System.out.println(rs1.getInt(1) + " " +
						rs1.getString(2) );
			}
			
		} catch (SQLException e) {
			System.out.println("Exception occured during first query : " + e.getMessage());
		}
		
		System.out.println();
		System.out.println();
		
		sql = "select * from Movie where Mid > ?";
		
		try (Connection conn = getConnection(connectionUrl,username, password);
				PreparedStatement stat = conn.prepareStatement(sql);){
			stat.setInt(1, 2);
			rs = stat.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " +
						rs.getString(2) );
			}
		} catch (SQLException e) {
			System.out.println("Exception occured during first query : " + e.getMessage());
		}finally {
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private static Connection getConnection(String url, String username, String password) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	private static void loadDriver(String driverUrl) throws ClassNotFoundException {
		Class.forName(driverUrl);
		
	}
	
}
