package com.techstack.creational.singleTon;

/***
 * To over come Eagerly loading we can improve the code by adding instance to null 
 * and create object when needed. 
 * 
 * 
 * @author prasadT
 * @version 1.0
 *
 */
public class DatabaseSingleTonLasyLoad {

	// Create Database object once (LAZY LOADING)
	private static DatabaseSingleTonLasyLoad dbInstance = null;

	// Marked constructor as private , so no one can create object for this class directly.
	private DatabaseSingleTonLasyLoad() {}

	/**
	 * Gets the single instance of DatabaseSingleTon.
	 *
	 * @return single instance of DatabaseSingleTon
	 */
	public static DatabaseSingleTonLasyLoad getInstance() {
		if(dbInstance== null) {
			dbInstance = new DatabaseSingleTonLasyLoad();
		}
		return dbInstance;
	}

}
