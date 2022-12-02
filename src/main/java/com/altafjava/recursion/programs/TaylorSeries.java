package com.altafjava.recursion.programs;

/**
 * Program to find the Taylor's series to the N term using recursion
 * 
 */

public class TaylorSeries {

	public static void main(String[] args) {
		int x = 2;
		int n = 10;
		double result = taylorSeries(x, n);
		System.out.println(result);
	}

	static double pow = 1;
	static double fact = 1;

	static double taylorSeries(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			double res = taylorSeries(x, n - 1);
			pow = pow * x;
			fact = fact * n;
			return res + pow / fact;
		}
	}

}
/**
 * Output: 7.388994708994708
 * 
 * Time Complexity: O(n2) [N Square]
 * 
 * Space Complexity: O(n)
 */