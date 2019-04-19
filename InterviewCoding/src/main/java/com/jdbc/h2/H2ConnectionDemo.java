package com.jdbc.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.Driver;

public class H2ConnectionDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(Driver.class.getName());
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		String sql = "SELECT * FROM MY_ONLINE_SHOPPING.EMPLOYEE ";
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2));
		}
		stat.close();
		conn.close();
	}

}
