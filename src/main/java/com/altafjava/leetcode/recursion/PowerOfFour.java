package com.altafjava.leetcode.recursion;

/*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Input: n = 16
Output: true

Input: n = 5
Output: false

Input: n = 1
Output: true

Constraints: -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?
*/
public class PowerOfFour {

	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
	}

	public boolean isPowerOf4(int n) {
		return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
	}

	public boolean isPowerOfFourUsingMethod(int n) {
		return Integer.toString(n, 4).matches("10*");
	}

	public boolean isPowerOfFourUsingLoop(int n) {
		if (n <= 0)
			return false;
		while (n != 1) {
			if (n % 4 != 0)
				return false;
			n = n / 4;
		}
		return true;
	}

	public boolean isPowerOfFourUsingRecursion(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		return n % 4 == 0 && isPowerOfFourUsingRecursion(n / 4);
	}

}
