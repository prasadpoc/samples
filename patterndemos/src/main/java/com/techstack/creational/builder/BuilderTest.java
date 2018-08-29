package com.techstack.creational.builder;

public class BuilderTest {

	/**
	 * The main method.
	 * 
	 * @author prasadT
	 * 
	 * @param args the arguments
	 */
	public static void main(String...args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("honey oats").dressing("hot").meat("chicken Breast");
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
		//Randomly we can choose what we want. 
		LunchOrder.Builder builder1 = new LunchOrder.Builder();
		builder1.bread("honey oats").meat("chicken Breast");
		LunchOrder lunchOrder1 = builder1.build();
		System.out.println(lunchOrder1.getBread());
		System.out.println(lunchOrder1.getDressing());
		System.out.println(lunchOrder1.getMeat());
		
		
	}
}
