package com.techstack.creational.singleTon;

/***
 * 
 * @author prasadT
 * @version 1.0
 *
 */
public class DatabaseSingleTon {

	// Create Database object once
	private static DatabaseSingleTon dbInstance = new DatabaseSingleTon();

	// Marked constructor as private , so no one can create object for this class directly.
	private DatabaseSingleTon() {}

	/**
	 * Gets the single instance of DatabaseSingleTon.
	 *
	 * @return single instance of DatabaseSingleTon
	 */
	public static DatabaseSingleTon getInstance() {
		// Same object given every time.
		return dbInstance;
	}

}
