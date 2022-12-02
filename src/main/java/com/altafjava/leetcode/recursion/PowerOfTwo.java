package com.altafjava.leetcode.recursion;

/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Input: n = 1
Output: true
Explanation: 20 = 1

Input: n = 16
Output: true
Explanation: 24 = 16

Input: n = 3
Output: false

Constraints: -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?
*/
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

	public boolean isPowerOfTwoUsingLoop(int n) {
		if (n <= 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public boolean isPowerOfTwoRecursion(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		return (n % 2 == 0) && isPowerOfTwoRecursion(n / 2);
	}

}
