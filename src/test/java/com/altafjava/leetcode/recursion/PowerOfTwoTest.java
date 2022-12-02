package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

	int n = 16;
	PowerOfTwo powerOfTwo = new PowerOfTwo();

	@Test
	void testIsPowerOfTwo() {
		boolean isPowerOftwo = powerOfTwo.isPowerOfTwo(n);
		assertTrue(isPowerOftwo);
	}

	@Test
	void testIsPowerOfTwoUsingLoop() {
		boolean isPowerOftwo = powerOfTwo.isPowerOfTwoUsingLoop(n);
		assertTrue(isPowerOftwo);
	}

	@Test
	void testIsPowerOfTwoRecursion() {
		boolean isPowerOftwo = powerOfTwo.isPowerOfTwoRecursion(n);
		assertTrue(isPowerOftwo);
	}

}
