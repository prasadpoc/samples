package com.techstack.creational.singleTon;

/***
 * 
 * @author prasadT
 * @version 1.0
 */
public class SingleTonTest {

	public static void main(String... args) {

		// both Sys outs print single database.
		SingleTonEagerLoad instance1 = SingleTonEagerLoad.getInstance();
		System.out.println(instance1);

		SingleTonEagerLoad instance2 = SingleTonEagerLoad.getInstance();
		System.out.println(instance2);
		
		
		// both Sys outs print single database.
		SingleTonLasyLoad instance3 = SingleTonLasyLoad.getInstance();
		System.out.println(instance3);

		SingleTonLasyLoad instance4 = SingleTonLasyLoad.getInstance();
		System.out.println(instance4);
		
		SingleTonThreadSafteJVM instance5 = SingleTonThreadSafteJVM.getInstance();
		System.out.println(instance5);

		SingleTonThreadSafteJVM instance6 = SingleTonThreadSafteJVM.getInstance();
		System.out.println(instance6);
		
	}
}
