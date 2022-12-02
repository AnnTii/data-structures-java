package com.altafjava.recursion.programs;

/**
 * Program for Tower of Hanoi problem using recursion
 * 
 */

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;
		ncr(n, 'A', 'B', 'C');
	}

	static void ncr(int n, char a, char b, char c) {
		if (n > 0) {
			ncr(n - 1, a, c, b);
			System.out.println(a + " -> " + c);
			ncr(n - 1, b, a, c);
		}
	}
}

/**
 * Output:
 * 
 * A -> C
 * 
 * A -> B
 * 
 * C -> B
 * 
 * A -> C
 * 
 * B -> A
 * 
 * B -> C
 * 
 * A -> C
 * 
 * To find the no of calls you need to make recursion tree
 * 
 * for n=1, calls=3 = 2^2-1
 * 
 * for n=2, calls=7 = 2^3-1
 * 
 * for n=3, calls=15 = 2^4-1
 * 
 * for n=n, calls= 2^(n-1)-1 = O(2^n-1) = O(2^n)
 * 
 * Time Complexity: O(2^n) [2 to the power n]
 * 
 * Space Complexity: O(n)
 */
