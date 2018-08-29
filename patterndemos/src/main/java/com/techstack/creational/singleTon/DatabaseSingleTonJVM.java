package com.techstack.creational.singleTon;

/***
 * This is to show if there are any changes in JVM instance should remain stable
 * 
 * @author prasadT
 * @version 1.0
 *
 */
public class DatabaseSingleTonJVM {

	// adding volatile will help the instance with no changes irrespective of JVM
	// changes.
	private static volatile DatabaseSingleTonJVM dbInstance = null;

	// Protecting from reflection API ( no one use Reflection on our code)
	private DatabaseSingleTonJVM() {
		if (dbInstance != null) {
			throw new RuntimeException("Please use getInstance() to create instance !!!");
		}
	}

	// For Thead Safe if we put synchronized block on entire method there will be
	// more performance hit

	public static DatabaseSingleTonJVM getInstance() {
		if (dbInstance == null) {
			synchronized (DatabaseSingleTonJVM.class) {
				// double checking.
				if (dbInstance == null) {
					dbInstance = new DatabaseSingleTonJVM();
				}
			}
		}
		return dbInstance;
	}

}
