package com.techstack.creational.singleTon;

/***
 *  This is Eagerly loaded approach, for some application this type of loading will 
 *  create potential slow due as instances are laoded at starup time.
 *   
 * @author prasadT
 * @version 1.0
 *
 */
public class DatabaseSingleTonEagerLoad {

	// Create Database object eagerly loaded
	private static DatabaseSingleTonEagerLoad dbInstance = new DatabaseSingleTonEagerLoad();

	// Marked constructor as private , so no one can create object for this class directly.
	private DatabaseSingleTonEagerLoad() {}

	/**
	 * Gets the single instance of DatabaseSingleTon.
	 *
	 * @return single instance of DatabaseSingleTon
	 */
	public static DatabaseSingleTonEagerLoad getInstance() {
		// Same object given every time.
		return dbInstance;
	}

}
