package com.techstack.creational.singleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author prasadt
 * @version 1.0
 */
public class SingleTonReflection {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String... args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Crack singleTon with Reflection on non patched scenario
		SingleTonEagerLoad singleTon = SingleTonEagerLoad.getInstance();
		System.out.println(singleTon);

		SingleTonEagerLoad singleTon1 = SingleTonEagerLoad.getInstance();
		System.out.println(singleTon1);

		Constructor[] declaredConstructors = SingleTonEagerLoad.class.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			constructor.setAccessible(true);
			SingleTonEagerLoad singleTonEagerLoad = (SingleTonEagerLoad) constructor.newInstance();
			System.out.println(singleTonEagerLoad);
		}

		// Testing Reflection on patched scenario
		// This give run time exception while access private constructor
		SingleTonThreadSafteJVM s = SingleTonThreadSafteJVM.getInstance();
		SingleTonThreadSafteJVM s1 = SingleTonThreadSafteJVM.getInstance();

		Constructor[] declaredConstructors2 = SingleTonThreadSafteJVM.class.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors2) {
			constructor.setAccessible(true);
			SingleTonThreadSafteJVM s3;
			s3 = (SingleTonThreadSafteJVM) constructor.newInstance();
			System.out.println(s3);
		}
	}

}
