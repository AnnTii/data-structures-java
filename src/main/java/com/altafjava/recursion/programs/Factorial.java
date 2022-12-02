package com.altafjava.recursion.programs;

/**
 * Program to find the factorial of a number using recursion
 * 
 */

public class Factorial {

	public static void main(String[] args) {
		int result = fact(5);
		System.out.println(result);
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return fact(n - 1) * n;
		}
	}
}

/**
 * Output: 120
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */
