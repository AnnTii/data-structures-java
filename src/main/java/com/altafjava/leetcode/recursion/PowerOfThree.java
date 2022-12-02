package com.altafjava.leetcode.recursion;

/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x

Input: n = 27
Output: true

Input: n = 0
Output: false

Input: n = 9
Output: true

Constraints: -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?
*/
public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
		// 1162261467 is 3^19, 3^20 is bigger than int
		return n > 0 && 1162261467 % n == 0;
	}

	public boolean isPowerOfThreeUsingLoop(int n) {
		if (n <= 0)
			return false;
		while (n != 1) {
			if (n % 3 != 0)
				return false;
			n /= 3;
		}
		return true;
	}

	public boolean isPowerOfThreeRecursion(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		return n % 3 == 0 && isPowerOfThreeRecursion(n / 3);
	}

}
