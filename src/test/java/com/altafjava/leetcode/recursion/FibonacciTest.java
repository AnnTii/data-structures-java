package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FibonacciTest {

	int[] fibs = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418,
			317811, 514229, 832040 };
	Fibonacci fibonacci = new Fibonacci();

	@Test
	void testFibMemoization() {
		for (int i = 0; i < fibs.length; i++) {
			int expected = fibs[i];
			int fibResult = fibonacci.fibMemoization(i);
			assertEquals(expected, fibResult);
		}
	}

	@Test
	void testFibRecursion() {
		for (int i = 0; i < fibs.length; i++) {
			int expected = fibs[i];
			int fibResult = fibonacci.fibRecursion(i);
			assertEquals(expected, fibResult);
		}
	}

	@Test
	void testFibUsingLoop() {
		for (int i = 0; i < fibs.length; i++) {
			int expected = fibs[i];
			int fibResult = fibonacci.fibUsingLoop(i);
			assertEquals(expected, fibResult);
		}
	}

	@Test
	void testFibInConstantTime() {
		for (int i = 0; i < fibs.length; i++) {
			int expected = fibs[i];
			int fibResult = fibonacci.fibInConstantTime(i);
			assertEquals(expected, fibResult);
		}
	}
}
