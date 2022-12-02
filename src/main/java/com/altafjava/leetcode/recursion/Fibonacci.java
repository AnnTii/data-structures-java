package com.altafjava.leetcode.recursion;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the
two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3
*/
public class Fibonacci {

	int[] cache = new int[31];

	public int fibMemoization(int n) {
		if (n <= 1)
			return n;
		if (cache[n] != 0)
			return cache[n];
		return cache[n] = fibMemoization(n - 2) + fibMemoization(n - 1);
	}

	public int fibRecursion(int n) {
		if (n <= 1)
			return n;
		return fibRecursion(n - 2) + fibRecursion(n - 1);
	}

	public int fibUsingLoop(int n) {
		if (n <= 1)
			return n;
		int a = 0, b = 1;
		while (n-- > 1) {
			b = a + b;
			a = b - a;
		}
		return b;
	}

	public int fibInConstantTime(int n) {
		int[] fibs = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393,
				196418, 317811, 514229, 832040 };
		return fibs[n];
	}

}
