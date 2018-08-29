package com.techstack.creational.singleTon;

/***
 * 
 * @author prasadT
 * @version 1.0
 */
public class Test {

	public static void main(String... args) {

		// both Sys outs print single database.
		DatabaseSingleTon databaseInstance1 = DatabaseSingleTon.getInstance();
		System.out.println(databaseInstance1);

		DatabaseSingleTon databaseInstance2 = DatabaseSingleTon.getInstance();
		System.out.println(databaseInstance2);
		
	}
}
