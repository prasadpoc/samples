package com.techstack.creational.singleTon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/***
 * 
 * @author prasadT
 * @version 1.0
 */
public class SingleTonTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args) {

		// both Sys outs print single database.
		SingleTonEagerLoad instance1 = SingleTonEagerLoad.getInstance();
		System.out.println(instance1);

		SingleTonEagerLoad instance2 = SingleTonEagerLoad.getInstance();
		System.out.println(instance2);

		// both Sys outs print single database.
		SingleTonLasyLoad instance3 = SingleTonLasyLoad.getInstance();
		System.out.println(instance3);

		SingleTonLasyLoad instance4 = SingleTonLasyLoad.getInstance();
		System.out.println(instance4);

		SingleTonThreadSafteJVM instance5 = SingleTonThreadSafteJVM.getInstance();
		System.out.println(instance5);

		SingleTonThreadSafteJVM instance6 = SingleTonThreadSafteJVM.getInstance();
		System.out.println(instance6);

		long before = System.currentTimeMillis();
		Connection connection = DBSingleTon.getConnection();
		long after = System.currentTimeMillis();
		System.out.println("Total time taken First time :" + (after - before));
		extractDetailsFromDatabase(connection);

		// Checking the performance with Single ton by repeating above steps 
		// with single thread to finding difference in time. 
		before = System.currentTimeMillis();
		connection = DBSingleTon.getConnection();
		after = System.currentTimeMillis();
		System.out.println("Total time taken 2nd  time :" + (after - before));

	}
	
	
	/***
	 * Separated into different method as I am going to call exact method twices to see 
	 * the performance. 
	 *  
	 * @param connection
	 */
	private static void extractDetailsFromDatabase(Connection connection) {
		Statement statement;
		try {
			statement = connection.createStatement();

			ResultSet resultSet = null;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
