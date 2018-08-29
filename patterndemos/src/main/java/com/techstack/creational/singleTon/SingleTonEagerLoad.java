package com.techstack.creational.singleTon;

/***
 *  This is Eagerly loaded approach, for some application this type of loading will 
 *  create potential slow due as instances are laoded at starup time.
 *   
 * @author prasadT
 * @version 1.0
 *
 */
public class SingleTonEagerLoad {

	// Eagerly loaded
	private static SingleTonEagerLoad singleTonInstance = new SingleTonEagerLoad();

	// Marked constructor as private , so no one can create object for this class directly.
	private SingleTonEagerLoad() {}

	
	public static SingleTonEagerLoad getInstance() {
		// Same object will be returned every time.
		return singleTonInstance;
	}

}
