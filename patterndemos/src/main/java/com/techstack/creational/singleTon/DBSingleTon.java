package com.techstack.creational.singleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***
 * This is to show if there are any changes in JVM instance should remain stable
 * 
 * @author prasadT
 * @version 1.0
 *
 */
public class DBSingleTon {

	// adding volatile will help the instance with no changes irrespective of JVM
	// changes.
	private static volatile Connection conn = null;
	private static String dbURL = "jdbc:mysql://localhost:3306/mydb";
	private static String user = "root";
	private static String password = "toor";

	// Protecting from reflection API ( no one use Reflection on our code)
	private DBSingleTon() {

		if (conn != null) {
			throw new RuntimeException("Please use getConnection() to create instance !!!");
		}
	}

	// For Thead Safe if we put synchronized block on entire method there will be
	// more performance hit

	public static Connection getConnection() {
		if (conn == null) {
			synchronized (DBSingleTon.class) {
				// double checking.
				if (conn == null) {
					try {
						conn = DriverManager.getConnection(dbURL, user, password);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}

}
