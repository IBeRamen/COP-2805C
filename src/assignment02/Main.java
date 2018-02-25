package assignment02;

/*
 * Class: COP 2805C (CRN: 25886)
 * Date: January 21st, 2018
 * Author: Omar Rahman
 * Assignment: Assignment 02
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		System.out.println("Enter ten integers: ");
		
		// Ask the user for 10 integers and add them to an array
		for (int i = 0; i < 10; i++) {
			myList.add(in.nextInt());
		}
		
		// Print before list
		System.out.println("Before array list: " + myList);
		
		// Remove duplicates
		removeDuplicate(myList);
		
		// Print distinct integers
		System.out.println("Distinct array list: " + myList);

	}
	
	public static void removeDuplicate(ArrayList list) {
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j) && i != j) {
					list.remove(i);
				}
			}
		}
		
	}

}
