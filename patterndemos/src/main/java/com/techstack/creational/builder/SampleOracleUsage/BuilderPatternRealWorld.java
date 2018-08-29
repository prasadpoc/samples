package com.techstack.creational.builder.SampleOracleUsage;

/**
 * The Class BuilderPatternRealWorld.
 */
public class BuilderPatternRealWorld {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String...args) {
		
		StringBuilder builder  = new StringBuilder();
		builder.append("first Line with String");
		builder.append(10);
		builder.append(true);
		builder.append(10L);
		
		System.out.println(builder);
	}

}
