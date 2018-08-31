package com.techstack.creational.singleTon;

import java.io.Serializable;

/**
 * The Class SingleTonSerializable.
 * 
 * @author prasadt
 * @version 1.0
 */
public class SingleTonSerializable implements Serializable {

	/** The instance. */
	private static volatile SingleTonSerializable instance = null;

	/**
	 * Instantiates a new single ton serializable.
	 */
	private SingleTonSerializable() {
		if (instance != null) {
			throw new RuntimeException("Please use getInstance() to create instance !!!");
		}
	}

	/**
	 * Gets the single instance of SingleTonSerializable.
	 *
	 * @return single instance of SingleTonSerializable
	 */

	public static SingleTonSerializable getInstance() {
		if (instance == null) {
			synchronized (SingleTonSerializable.class) {
				if (instance == null) {
					instance = new SingleTonSerializable();
				}
			}
		}
		return instance;
	}
	
	// Enable readResolve to protect Serializable
	/*	
	protected Object readResolve() {
			return instance;
		}
	*/
	
}
