/**
 * This is to test plain JDBC test ( for mysql and MS SQL , for runing MSSQL enable pom adn dbURL)
 */
package com.techstack.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	/**
	 * @author prasadT
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String args[]) {
		Connection conn;
		// For mySQL
		String dbURL = "jdbc:mysql://localhost:3306/mydb";

		// This is for SQL server
		// String dbURL = "jdbc:sqlserver://localhost:1433;databasename=mydb;";

		String user = "root";
		String password = "toor";
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			conn = DriverManager.getConnection(dbURL, user, password);
			if (conn != null) {
				System.out.println("**** Connected Database Successfully ****\n");
			}

			statement = conn.createStatement();
			String sqlQuery = "select * from Customer";
			resultSet = statement.executeQuery(sqlQuery);

			// To Display all values in the tables
			while (resultSet.next()) {

				System.out.print("\n" + resultSet.getInt("id") + "\t\t");
				System.out.print(resultSet.getString("name"));
				System.out.println();
			}
			System.out.println("\n **** End of the Data ****\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (resultSet != null && statement != null) {
				try {
					resultSet.close();
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
