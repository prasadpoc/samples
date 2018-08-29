package com.techstack.creational.singleTon;

/***
 * 
 * @author prasadT
 * @version 1.0
 */
public class Test {

	public static void main(String... args) {

		// both Sys outs print single database.
		DatabaseSingleTonEagerLoad databaseInstance1 = DatabaseSingleTonEagerLoad.getInstance();
		System.out.println(databaseInstance1);

		DatabaseSingleTonEagerLoad databaseInstance2 = DatabaseSingleTonEagerLoad.getInstance();
		System.out.println(databaseInstance2);
		
		
		// both Sys outs print single database.
		DatabaseSingleTonLasyLoad databaseInstance3 = DatabaseSingleTonLasyLoad.getInstance();
		System.out.println(databaseInstance3);

		DatabaseSingleTonLasyLoad databaseInstance4 = DatabaseSingleTonLasyLoad.getInstance();
		System.out.println(databaseInstance4);
		
	}
}
