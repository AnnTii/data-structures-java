package com.altafjava.recursion.programs;

/**
 * Program to find the sum of N natural numbers using recursion
 * 
 */

public class SumNatural {

	public static void main(String[] args) {
		int result = sum(5);
		System.out.println(result);
	}

	static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return sum(n - 1) + n;
		}
	}
}
/**
 * Output: 15
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */