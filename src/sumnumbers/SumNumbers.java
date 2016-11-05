package sumnumbers;

import java.util.*;

/**
 * Sums integers from 1 to n. Uses long for calculation and
 * casts result as an integer. Solved result = (x*(x+1))/2
 * formula to derive that 65,535 is the max value of x that
 * can return a result within java int max value of
 * 2,147,483,647. -2,147,483,647 is min, but negative integers
 * are prohibited in this program.
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
			System.out.print("Enter whole number [0, 65535]: ");
			if (input.hasNextLong()) {
				long number = input.nextLong();
				
				if (0 <= number && number <= 65535) {
					long result = (number*(number+1)) / 2;
					System.out.println("Answer: "+(int)result);
					break;
				}
				else {
					System.out.println("Number outside of range");
					continue;
				}
			}
			else {
				System.out.println("Try again");
				input.next();
			}
		}
		
		input.close();
	}
	
}
