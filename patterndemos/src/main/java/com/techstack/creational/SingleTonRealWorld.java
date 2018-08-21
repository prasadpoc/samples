// SingleTon in realTime usage 
 
package com.techstack.creational;

/**
 * 
 * The main objective of this code is to show at any given point we could see only one Runtime instance .
 * 
 * @author tulasiprasad
 * @version 1.0
 *
 */

public class SingleTonRealWorld {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args) {
		
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		System.out.println(runtime);

		Runtime runtime2 = Runtime.getRuntime();
		runtime2.gc();
		System.out.println(runtime2);

		if (runtime == runtime2) {
			System.out.println("Same instance");
		} else {
			System.out.println("Not Same Instance");
		}

	}
}
