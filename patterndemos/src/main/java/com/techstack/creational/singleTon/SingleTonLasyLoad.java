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
public class SingleTonLasyLoad {

	/** The instance. */
	// Create Database object once (LAZY LOADING)
	private static SingleTonLasyLoad instance = null;

	/**
	 * Instantiates a new single ton lasy load.
	 */
	// Marked constructor as private , so no one can create object for this class directly.
	private SingleTonLasyLoad() {}

	
	/**
	 * Gets the single instance of SingleTonLasyLoad.
	 *
	 * @return single instance of SingleTonLasyLoad
	 */
	public static SingleTonLasyLoad getInstance() {
		if(instance== null) {
			instance = new SingleTonLasyLoad();
		}
		return instance;
	}

}
