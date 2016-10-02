package sumnumbers;

import java.util.*;

/**
 * Sums integers from 1 to n.
 * 
 * @author	Aaron
 * @date	2016.04.18
 */
public class SumNumbers {
	
	/**
	 * Calls summation.
	 * @param args	Arguments.
	 */
	public static void main(String[] args) {
		summation();
	}
	
	/**
	 * Sums all numbers from 1 to n.
	 */
	public static void summation() {
		// Create scanner for user input
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter integer: ");
			if (input.hasNextInt()) {
				int number = input.nextInt();
				int result = (number*(number+1)) / 2;
				System.out.println("Answer: "+result);
				break;
			}
			else {
				input.next();
				System.out.println("Try again");
			}
		}
		input.close();
	}
	
}
