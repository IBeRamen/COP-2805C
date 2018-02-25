package assignment01;

/*
 * Class: COP 2805C (CRN: 25886)
 * Date: January 14th, 2018
 * Author: Omar Rahman
 * Assignment: Assignment 01
 * 
 * Grade: A
 * Graded Notes: Good, but next time show previous array before printing
 */

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Initiate Random
		Random rand = new Random();
		
		// Create a String array
		String[] colorsList = { "Red", "Green", "Blue" };
		
		// Create an Integer array of 10
		Integer[] integerList = new Integer[10];
		
		// Fill each index with a random integer between 1 - 100
		for (int i = 0; i < integerList.length; i++) {
			
			integerList[i] = rand.nextInt(100) + 1;
			
		}
		
		// Create a Double array of 10
		Double[] doubleList = new Double[10];
		
		// Fill each index with a random double
		for (int i = 0; i < doubleList.length; i++) {
			
			doubleList[i] = rand.nextDouble();
			
		}
		
		// Print output
		System.out.println("Max:\n"
				+ "Colors: " + max(colorsList)
				+ "\nIntegers: " + max(integerList)
				+ "\nDoubles: " + max(doubleList));

	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		
		E max = list[0];
		
		for (int i = 0; i < list.length; i++ ) {
			E element = list[i];
			
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		
		return max;
	}

}
