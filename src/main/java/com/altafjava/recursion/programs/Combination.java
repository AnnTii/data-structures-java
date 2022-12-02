package com.altafjava.recursion.programs;

/**
 * Program to find the combination using recursion
 * 
 */

public class Combination {

	public static void main(String[] args) {
		int result = ncr(4, 2);
		System.out.println(result);
	}

	static int ncr(int n, int r) {
		if (r == 0 || n == r) {
			return 1;
		} else {
			return ncr(n - 1, r - 1) + ncr(n - 1, r);
		}
	}
}

/**
 * Output: 6
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */
