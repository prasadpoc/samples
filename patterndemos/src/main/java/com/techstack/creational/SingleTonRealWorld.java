// SingleTon in realTime usuage 

package com.techstack.creational;

/**
 * 
 * @author tulasiprasad
 *
 */
public class SingleTonRealWorld {

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
