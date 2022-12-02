package com.altafjava.recursion.programs;

/**
 * Program to find the factorial of a number using recursion
 * 
 */

public class Fibonacci {

	static int n = 7;

	public static void main(String[] args) {
		fibonacciSeriesUsingLoop(n);
		int result = fibonacciSeriesMemoization(n);
		System.out.println("Result: " + result);
	}

	static int fibonacciSeries(int n) {
		if (n <= 1) {
			return n;
		}
		int f = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
		return f;
	}

	static int arr[] = new int[n];

	static int fibonacciSeriesMemoization(int n) {
		if (n <= 1) {
			arr[n] = n;
			return n;
		} else {
			if (arr[n - 2] == 0) {
				arr[n - 2] = fibonacciSeriesMemoization(n - 2);
			}
			if (arr[n - 1] == 0) {
				arr[n - 1] = fibonacciSeriesMemoization(n - 1);
			}
			int f = arr[n - 2] + arr[n - 1];
			return f;
		}
	}

	public static void fibonacciSeriesUsingLoop(int n) {
		int p = 0, c = 1;
		for (int i = 0; i <= n; i++) {
			System.out.print(p + " ");
			int next = p + c;
			p = c;
			c = next;
		}
		System.out.println();
	}
}

/**
 * Output: 13
 * 
 * Loop Time Complexity: O(n)
 * 
 * Recursion Time Complexity: O(2n) [2 to the power N]
 * 
 * Recursion Memoization Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */
