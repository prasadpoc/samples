package com.techstack.creational.singleTon;

/***
 * This is to show if there are any changes in JVM instance should remain stable
 * 
 * @author prasadT
 * @version 1.0
 *
 */
public class SingleTonThreadSafteJVM {

	// adding volatile will help the instance with no changes irrespective of JVM
	// changes.
	private static volatile SingleTonThreadSafteJVM instance = null;

	// Protecting from reflection API ( no one use Reflection on our code)
	private SingleTonThreadSafteJVM() {
		if (instance != null) {
			throw new RuntimeException("Please use getInstance() to create instance !!!");
		}
	}

	// For Thead Safe if we put synchronized block on entire method there will be
	// more performance hit

	public static SingleTonThreadSafteJVM getInstance() {
		if (instance == null) {
			synchronized (SingleTonThreadSafteJVM.class) {
				// double checking.
				if (instance == null) {
					instance = new SingleTonThreadSafteJVM();
				}
			}
		}
		return instance;
	}

}
