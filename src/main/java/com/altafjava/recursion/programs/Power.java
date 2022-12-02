package com.altafjava.recursion.programs;

/**
 * Program to find the power of a number using recursion
 * 
 */

public class Power {

	public static void main(String[] args) {
		int result = powerOptimized(2, 5);
		System.out.println(result);
	}

	static int power(int base, int pow) {
		if (pow == 1) {
			return base;
		} else {
			return power(base, pow - 1) * base;
		}
	}

	static int powerOptimized(int base, int pow) {
		if (pow == 1) {
			return base;
		}
		if (pow % 2 == 0) {
			return power(base * base, pow / 2);
		} else {
			return power(base * base, (pow - 1) / 2) * base;
		}
	}
}
/**
 * Output: 32
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */