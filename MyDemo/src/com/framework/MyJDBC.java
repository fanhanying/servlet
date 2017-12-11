package com.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyJDBC {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet res = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test1", "root", "admin");
			statement = conn.prepareStatement("select name from table1 where id = ?");
			statement.setInt(1, 1);
			res = statement.executeQuery();
			while (res.next()) {
				String name = res.getString(1);
				System.out.println(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(res != null) {
					res.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
