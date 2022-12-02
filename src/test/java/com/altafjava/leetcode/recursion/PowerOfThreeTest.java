package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PowerOfThreeTest {

	int n = 27;
	PowerOfThree powerOfThree = new PowerOfThree();

	@Test
	public void isPowerOfThree() {
		boolean isPowerOf3 = powerOfThree.isPowerOfThree(n);
		assertTrue(isPowerOf3);
	}

	@Test
	public void isPowerOfThreeUsingLoop() {
		boolean isPowerOf3 = powerOfThree.isPowerOfThreeUsingLoop(n);
		assertTrue(isPowerOf3);
	}

	@Test
	public void isPowerOfThreeRecursion() {
		boolean isPowerOf3 = powerOfThree.isPowerOfThreeRecursion(n);
		assertTrue(isPowerOf3);
	}
}
