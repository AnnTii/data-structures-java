package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PowerOfFourTest {

	int n = 64;
	PowerOfFour powerOfFour = new PowerOfFour();

	@Test
	public void testIsPowerOfFour() {
		boolean isPowerOf4 = powerOfFour.isPowerOfFour(n);
		assertTrue(isPowerOf4);
	}

	@Test
	public void testIsPowerOf4() {
		boolean isPowerOf4 = powerOfFour.isPowerOfFour(n);
		assertTrue(isPowerOf4);
	}

	@Test
	public void testIPowerOfFourUsingMethod() {
		boolean isPowerOf4 = powerOfFour.isPowerOfFour(n);
		assertTrue(isPowerOf4);
	}

	@Test
	public void testIsPowerOfFourUsingLoop() {
		boolean isPowerOf4 = powerOfFour.isPowerOfFour(n);
		assertTrue(isPowerOf4);
	}

	@Test
	public void testIsPowerOfFourUsingRecursion() {
		boolean isPowerOf4 = powerOfFour.isPowerOfFour(n);
		assertTrue(isPowerOf4);
	}
}
